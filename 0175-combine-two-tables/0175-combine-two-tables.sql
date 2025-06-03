# Write your MySQL query statement below
select firstName,lastName,city,state 
from person p 
Left JOIN Address a ON p.PersonId=a.personId;