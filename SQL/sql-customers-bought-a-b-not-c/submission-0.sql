-- Write your query below
Select     
    customer_id, customer_name
    from customers c
    where c.customer_id IN (
        select customer_id from orders where product_name ='A'
    ) 
    And c.customer_id IN (
        select customer_id from orders where product_name ='B'
    ) 
    And c.customer_id Not IN (
        select customer_id from orders where product_name ='C'
    ) 
    order by c.customer_name;