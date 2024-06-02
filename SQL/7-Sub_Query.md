# Sub-Query

We would write a subquery in a query using `parenthesis`.

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

## Different Locations

![subquery example](images/subquery.png)
