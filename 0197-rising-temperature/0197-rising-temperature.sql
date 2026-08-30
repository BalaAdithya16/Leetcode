SELECT c.id
FROM Weather p
JOIN Weather c
ON DATE_ADD(p.recordDate, INTERVAL 1 DAY) = c.recordDate
WHERE c.temperature > p.temperature;
