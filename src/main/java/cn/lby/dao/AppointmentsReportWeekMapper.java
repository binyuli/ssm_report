package cn.lby.dao;

import cn.lby.entity.AppointmentsReportWeek;
import cn.lby.entity.AppointmentsReportWeekExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointmentsReportWeekMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointments_report_week
     *
     * @mbggenerated
     */
    int countByExample(AppointmentsReportWeekExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointments_report_week
     *
     * @mbggenerated
     */
    int deleteByExample(AppointmentsReportWeekExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointments_report_week
     *
     * @mbggenerated
     */
    int insert(AppointmentsReportWeek record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointments_report_week
     *
     * @mbggenerated
     */
    int insertSelective(AppointmentsReportWeek record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointments_report_week
     *
     * @mbggenerated
     */
    List<AppointmentsReportWeek> selectByExample(AppointmentsReportWeekExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointments_report_week
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AppointmentsReportWeek record, @Param("example") AppointmentsReportWeekExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointments_report_week
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AppointmentsReportWeek record, @Param("example") AppointmentsReportWeekExample example);
}