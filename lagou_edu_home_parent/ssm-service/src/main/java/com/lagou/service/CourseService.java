package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author LH
 * @date 2020/12/29 23:08
 * @description
 */
public interface CourseService {

    /*
        多条件课程列表查询
     */
    public List<Course> findCourseByCondition(CourseVO courseVO);

    /*
        添加课程及讲师信息
     */
    public void saveCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    /*
        回显课程信息（根据ID查询对应的课程信息及关联的讲师信息）
     */
    public CourseVO findCourseById(Integer id);

    /*
        更新课程及讲师信息
     */
    public void updateCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    /*
        课程状态变更
     */
    public void updateCourseStatus(int courseId, int status);

}
