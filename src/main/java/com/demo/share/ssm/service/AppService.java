package com.demo.share.ssm.service;

import com.demo.share.ssm.dao.AppointmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ..
 *
 * @author 杨华
 * @date 2018-09-14 16:10
 */
@Service
public class AppService {
    @Autowired
    AppointmentDao appointmentDao;

    public void insert() {
        appointmentDao.insertAppointment(1L,2L);
    }
}
