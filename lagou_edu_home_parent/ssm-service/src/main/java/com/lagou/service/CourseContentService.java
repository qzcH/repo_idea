package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/17 0:35
 * @description
 */
public interface CourseContentService {

    /*
        根据课程id查询关联的章节信息及章节信息关联的课时信息
     */
    public List<CourseSection> findSectionAndLessionByCourseId(Integer id);

    /*
        回显章节对应的课程信息
     */
    public Course findCourseByCourseId(int courseId);

    /*
        新增章节信息
     */
    public void saveSection(CourseSection courseSection);

    /*
        更新章节信息
     */
    public void updateSection(CourseSection courseSection);

    /*
        修改章节状态
     */
    public void updateSectionStatus(int id, int status);
}
