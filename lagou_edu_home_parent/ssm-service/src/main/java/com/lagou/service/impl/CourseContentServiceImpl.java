package com.lagou.service.impl;

import com.lagou.dao.CourseContentMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.service.CourseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author LH
 * @date 2021/1/17 0:37
 * @description
 */
@Service
public class CourseContentServiceImpl implements CourseContentService {

    @Autowired
    private CourseContentMapper courseContentMapper;

    @Override
    public List<CourseSection> findSectionAndLessionByCourseId(Integer id) {

        List<CourseSection> list = courseContentMapper.findSectionAndLessonByCourseId(id);
        return list;

    }

    @Override
    public Course findCourseByCourseId(int courseId) {

        Course course = courseContentMapper.findCourseByCourseId(courseId);
        return course;

    }

    @Override
    public void saveSection(CourseSection courseSection) {

        Date date = new Date();
        courseSection.setCreateTime(date);
        courseSection.setUpdateTime(date);

        courseContentMapper.saveSection(courseSection);
    }

    @Override
    public void updateSection(CourseSection courseSection) {

        courseSection.setUpdateTime(new Date());

        courseContentMapper.updateSection(courseSection);

    }

    @Override
    public void updateSectionStatus(int id, int status) {

        CourseSection courseSection = new CourseSection();
        courseSection.setStatus(status);
        courseSection.setUpdateTime(new Date());
        courseSection.setId(id);

        courseContentMapper.updateSectionStatus(courseSection);

    }
}
