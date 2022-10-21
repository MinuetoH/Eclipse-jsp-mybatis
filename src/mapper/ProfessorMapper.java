package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import test1017.Professor;

public interface ProfessorMapper {

	@Select("select count(*) from professor")
	int count();

	@Select("select * from professor")
	List<Professor> select1();

	@Select("select * from professor where deptno=#{deptno}")
	List<Professor> select2(int deptno);

	@Select("select * from professor "
	+ " where name like '%${name}%' and position=#{position} ")
	List<Professor> select3(Map<String, Object> map);

	@Select("select * from professor "
	+ " where name like '%${name}%' and position=#{position} ")
	List<Professor> select4(@Param("name")String name, 
			                @Param("position")String position);
}
