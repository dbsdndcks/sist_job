procedure select_all_employee(cur_emp out sys_refcursor)
is

begin

	open cur_emp for
	 select empno, ename,job, sal, hiredate
	 from employee;

end;
