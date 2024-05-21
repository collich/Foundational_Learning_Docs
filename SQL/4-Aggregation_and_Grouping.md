# Aggregation and Grouping

- Aggregates:
  - Reduces many value down to one
  - Done by using `aggregate functions`

- Grouping:
  - Reduces many rows down to fewer rows.
  - Done by using the `GROUP BY` keyword.
  - Visualizing the result is key to use.

![aggregation and grouping](images/aggregation_and_grouping.png)

## Aggregation

## Grouping

`GROUP BY` finds all the set of `all unique entries in the queried columns` and then take each row and `assign it to a group` based on the column.

`Format`:

```SQL
SELECT <column>
FROM <table>
GROUP BY <column>;
```

`Example`:

```SQL
SELECT user_id
FROM comments
GROUP BY user_id;
-- GROUP BY <column> must be the same as the one in SELECT <column>
```

![group by](images/group_by.png)
`Visualisation`:
![group by example](images/group_by_example.png)
