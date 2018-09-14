package com.demo.share.ssm.service;

import com.demo.share.ssm.dao.AppointmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-09-14 16:10
 * @since JDK1.7
 */
@Service
public class AppService {
    @Autowired
    AppointmentDao appointmentDao;

    public void insert() {
        appointmentDao.insertAppointment(1L,2L);
    }
}
