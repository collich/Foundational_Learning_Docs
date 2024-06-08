# Sub-Query

- [`Introduction`](#introduction): Introduction to subquery in a query by using `parenthesis`.
- [`Structure of Data`](#structure-of-data): Imagining data as an object with attributes to figure out the output of data
- [`Different locations of subqueries`](#different-locations): Showing different locations that the subqueries can be written at.
  - [`SELECT`](#select)
  - [`FROM`](#from)
  - [`JOIN`](#join)
  - [`WHERE`](#where)

## Introduction

In this section, there will be examples on how to write subqueries.

`Format`:

```SQL
SELECT <column/s>
FROM <table>
WHERE <column> <operand> (
    SELECT <operand><column></operand>
    FROM <table>
    WHERE <column> <operand>
)
```

`Example`:

```SQL
SELECT name, price
FROM products
WHERE price > (
    SELECT MAX(price)
    FROM products
    WHERE department = 'Toys'
)
```

> We can use subqueries in different locations, not only in where keyword as shown in the example.

## Structure of Data

Here we will try to understand the `Shape of Data`.

- `SELECT *`: All rows and column
- `SELECT <column>`: Selected column and all rows.
- `SELECT COUNT(*)`: One row and column. *Scalar Query*

![Structure of Data](images/sql_structure_of_data.png)

## Different Locations

- [`SELECT`](#select)
- [`FROM`](#from)
- [`JOIN`](#join)
- [`WHERE`](#where)

![subquery example](images/subquery.png)

### SELECT

For subquery to be in `SELECT`, we have to ensure that the sub query only returns a *`Scalar Query(One value)`*.

*`Scalar Query`*:

`Sub Query`:

```SQL
SELECT MAX(price)
FROM products
```

`Full Query`

```SQL
SELECT name, price, (
    SELECT MAX(price)
    FROM products
    )
FROM products
WHERE price > 876
```

![select subquery](images/select_subquery.png)

### FROM

For subquery to be in `FROM`:

- Must have an alias applied to it.

`Sub Query`:

```SQL
SELECT name, price_weight_ratio
FROM products
```

`Full Query`:

```SQL
SELECT name, price_weight_ratio
FROM (
    SELECT name, price / weight AS price_weight_ratio
    FROM products
) AS p
WHERE price > 876
```

`Use Case` - Finding average per user:

```SQL
SELECT AVG(p.order_count)
FROM (
    SELECT user_id, COUNT(*) AS order_count
    FROM products
    GROUP BY user_id
) AS p
```

![from subquery](images/from_subquery.png)

### JOIN

For subquery to be in `JOIN`:

- Subquery must return data compatible with the `ON` clause.
- Not really useful

`Sub Query`:

```SQL
SELECT user_id
FROM orders
WHERE product_id = 3
```

`Full Query`:

```SQL
SELECT first_name
FROM users
JOIN (
    SELECT user_id
    FROM orders
    WHERE product_id = 3
) AS o
ON o.user_id = users.id
```

![join subquery](images/join_subquery.png)

### WHERE
