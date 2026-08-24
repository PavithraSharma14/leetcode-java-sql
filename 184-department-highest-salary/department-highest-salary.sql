select d.name as Department,e.name as Employee,e.salary as Salary
from Employee e
join Department d
on e.departmentId=d.id
join (
    select departmentId,max(salary) as maxSalary
    from Employee
    group by departmentId
) as m
on e.departmentId=m.departmentId
and e.salary=m.maxSalary;
