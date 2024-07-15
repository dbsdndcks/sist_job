procedure select_one_employee(i_empno number,
 cur_emp out sys_refcursor,err_msg out varchar2)
is

begin

	open cur_emp for
	 select  ename,job, sal, hiredate
	 from employee
	 where empno=i_empno;

exception
when others then
	err_msg := sqlerrm||'-'||sqlcode;
end;
