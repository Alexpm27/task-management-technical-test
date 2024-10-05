package com.example.rocketcode_test.persistence.repository;

import com.example.rocketcode_test.persistence.model.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ITaskRepository {
    @Insert("INSERT INTO Task(id, name, description, start_date) VALUES (#{id}, #{name}, #{description}, #{startDate})")
    int save(Task task);

    @Update("UPDATE Task SET name=#{name}, description=#{description}, start_date=#{startDate} WHERE id=#{id}")
    int update(Task task);

    @Select("SELECT * FROM Task")
    @Result(property = "startDate", column = "start_date")
    List<Task> findAll();

    @Select("SELECT * FROM Task WHERE id = #{id}")
    @Result(property = "startDate", column = "start_date")
    Task findById(@Param("id") Long id);

    @Delete("DELETE FROM Task WHERE id = #{id}")
    int deleteById(@Param("id") Long id);
}
