package com.lyricchan.osu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.lyricchan.osu.entity.QQqun;
import com.lyricchan.osu.mapper.QQqunMapper;

/**
 * @author Lyric
 * @since 20170906
 */
@Service
public class QQqunService extends AbstractService {

    // private static final Logger LOGGER = LoggerFactory.getLogger(QQqunService.class);

    @Autowired
    private QQqunMapper qqqunMapper;

    public QQqun findQQqunByNumber(String number) {
        Assert.notNull(number, "群号在业务层为空");
        final QQqun record = new QQqun();
        record.setNumber(number);
        return qqqunMapper.selectOne(record);
    }
}
