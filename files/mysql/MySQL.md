1.索引是如何存放上百万条数据的，B树的数据结构原理。



2.sql优化实例

| a1       | a2       | a3       | a4       |
| :------- | -------- | -------- | -------- |
| not null | not null | not null | not null |

复合索引为(a1,a2,a3,a4)

explain select * from tb2 where a1=1 and a2=2 and a3=3 and a4=4; 结果如下

| id   | select_type | table | type | poss_keys | key       | key_len | EXtra       |
| ---- | ----------- | ----- | ---- | --------- | --------- | ------- | ----------- |
| 1    | SAMPLE      | tb2   | ref  | all_index | all_index | 16      | using index |

explain select * from tb2 where a4=1 and a3=2 and a2=3 and a1=4;

 结果与上面一致，说与该语句被sql优化器优化过

explain select * from tb2 where a1=1 and a2=2  and a4=4 order by a3;

| id   | select_type | table | type | poss_keys | key       | key_len | EXtra                   |
| ---- | ----------- | ----- | ---- | --------- | --------- | ------- | ----------------------- |
| 1    | SAMPLE      | tb2   | ref  | all_index | all_index | 8       | using where，using index |

a4跨列导致a4索引失效，a4需要回表查询出现using where，

explain select * from tb2 where a1=1 and a4=4 order by a3;

| id   | select_type | table | type | poss_keys | key       | key_len | EXtra                                 |
| ---- | ----------- | ----- | ---- | --------- | --------- | ------- | ------------------------------------- |
| 1    | SAMPLE      | tb2   | ref  | all_index | all_index | 4       | using where，using index，usingfilesort |

where和order by 的条件跨列导致出现using filesort、

explain select * from tb2 where a1=1 and a4=4 order by a2,a3;、

| id   | select_type | table | type | poss_keys | key       | key_len | EXtra                   |
| ---- | ----------- | ----- | ---- | --------- | --------- | ------- | ----------------------- |
| 1    | SAMPLE      | tb2   | ref  | all_index | all_index | 4       | using where，using index |

总结：如果复合索引（a,b,c,d）和使用顺序全部一致，则复合索引全部使用（切不跨列使用），如果一部分顺序一致，则部分被使用（不能跨列）；where 和 order by 拼起来不要跨列使用。