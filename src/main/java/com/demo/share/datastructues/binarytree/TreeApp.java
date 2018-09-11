package com.demo.share.datastructues.binarytree;

/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-09-10 10:11
 * @since JDK1.7
 */
public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(20, 2.3);
        tree.insert(31, 2.3);
        tree.insert(45, 2.3);
        tree.insert(10, 2.3);
        tree.insert(12, 2.3);
        tree.insert(13, 2.3);
        tree.insert(9, 2.3);
        ldrOrder(tree.root);
    }

    /**
     * @Description:  中序遍历，左根右规则，已根为核心
     * @Param: [localRoot]
     * @return: void
     * @Author: 杨华
     * @Date: 2018/9/10 11:07
     */
    public static void ldrOrder(Node localRoot) {
        if (localRoot != null) {
            ldrOrder(localRoot.leftChild);
            System.out.println(localRoot.iData);
            ldrOrder(localRoot.rightChild);
        }
    }
    
    /** 
     * @Description: 前序遍历，根左右 
     * @Param: [localRoot] 
     * @return: void 
     * @Author: 杨华
     * @Date: 2018/9/10 11:10 
     */ 
    public static void dlrOrder(Node localRoot) {
        
    }
    
    /** 
     * @Description: 后续遍历，左右根
     * @Param: [localRoot] 
     * @return: void 
     * @Author: 杨华
     * @Date: 2018/9/10 11:11 
     */ 
    public static void lrdOrder(Node localRoot) {
        
    }
}
