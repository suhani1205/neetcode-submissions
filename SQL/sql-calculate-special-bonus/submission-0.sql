-- Write your query below
Select     
    employee_id,
    Case
        when employee_id % 2 =1 And name not like 'M%'
    Then salary
        Else 0 
        End as bonus
    from employees
    order by employee_id;
