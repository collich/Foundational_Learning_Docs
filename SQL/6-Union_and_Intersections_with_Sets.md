# Union and Intersection

- [`UNION`](#union) - Set Theory of `Union`. Include the whole of two table.
- [`INTERSECT`](#intersect) - Set Theory of `Intersect`. Include only the same value between two table.

## UNION

We can get two results by using `UNION` keyword.

`Format`:

```SQL
(
SELECT <column>
FROM <table>
ORDER BY <column>
LIMIT <to_the_number_of_rows>
)
UNION
(
SELECT <column>
FROM <table>
ORDER BY <column>
LIMIT <to_the_number_of_rows>
)
```


`Example`:

```SQL
(
SELECT *
FROM products
ORDER BY price DESC
LIMIT 4
)
UNION
(
SELECT *
FROM products
ORDER BY price / weight DESC
LIMIT 4
)
```

> **In this example:** we're trying to find out the first four rows of the highest price **AND** the highest price per weight entries.

## INTERSECT
