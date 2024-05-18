# A Comprehensive Join Documentation

## Some Notes on Joins

![Some notes of join](images/notes_on_joins.png)

## Different Types of SQL Joining Table

Understanding the different joins would require `Set Theory` from Discrete Math. So it's highly recommended to understand `Set Theory` before trying to understand.

- **Intersect**: `INNER JOIN` [Jump to Section](#intersect-or-inner-join)
- **Primary Table Set with Intersect**: `LEFT JOIN` [Jump to Section](#primary-table-set-with-intersect-or-left-join)
- **Secondary Table Set with Intersect**: `RIGHT JOIN` [Jump to Section](#secondary-table-set-with-intersect-or-right-join)
- **Union**: `FULL JOIN` [Jump to Section](#union-or-full-join)

![W3 JOIN Tutorials](images/set_theory_join.png)
Diagram from [W3 SQL](https://www.w3schools.com/sql/sql_join.asp).

### `Intersect` OR `INNER JOIN`

By default, we're using `INNER JOIN` when using the keyword `JOIN`.

![Default Inner Join](images/Default_Join.png)
In this example, since the database can't find any `NULL` user on the users table; The Database would discard the photos entry with a `NULL` reference value.

### `Primary Table Set with Intersect` OR `LEFT JOIN`

It is when the database outputs all the entries from the Primary Table using `LEFT JOIN`

![Left Join](images/Left_Join.png)
In this example, the Primary table is the `photos` with an entry with a reference value of `NULL`. The database would not discard the value rather, it would "append" a `NULL` entry.

### `Secondary Table Set with Intersect` OR `RIGHT JOIN`

The database would output all the entries from the Secondary table even when it doesn't have any entries in the primary table.

![Right Join](images/Right_Join.png)
In this example, the database output would output all entries on the Secondary table, the `users` table, and entries without a link; they will have a `NULL` entry appended to them when `JOIN`.

### `UNION` OR `FULL JOIN`

A `FULL JOIN` outputs all entries from both Primary and Secondary Tables.

![Full Join](images/Full_Join.png)
In this example, you can see that an entry from the Primary Table, `photos`, and an entry from the Secondary Table, `users`, have `NULL` entry appended next to them.
