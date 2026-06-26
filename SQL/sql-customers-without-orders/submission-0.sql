-- Write your query below
Select name from customers 
where id Not in (select customer_id from orders);