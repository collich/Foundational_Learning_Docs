# Sorting

- `ORDER BY` is the keyword to sort the entries in SQL:
  - [`Descending`](#decending): From highest to lowest, we use the `DESC` keyword.
  - [`Ascending`](#ascending): From lowest to highest, we use the `ASC` keyword.

- [`OFFSET`](#offset): Skip the first `n` number of rows of the result set.
- [`LIMIT`](#limit): Only give the first `n` number of rows of the result set.

## The two variations

### Decending

We use the `DESC`:

`Example`:

```SQL
SELECT *
FROM products
ORDER BY price DESC;
```

### Ascending

We use the `ASC`:

`Example`:

```SQL
SELECT *
FROM products
ORDER BY price ASC;
```

### Using a second column to sort

We can use a second column to determine the sort order.

`Example`:

- `DESC`

```SQL
SELECT *
FROM products
ORDER BY price, weight DESC;
```

- `ASC`

```SQL
SELECT *
FROM products
ORDER BY price ASC, weight ASC;
```

> **In this example**, we want to sort the products from the price as our first criteria. But if there are entries that are of same `price` by `ascending` order, we use the `weight` as the next factor by sorting in a `descending` order.

## OFFSET

We can use `OFFSET` to skip the first few rows by adding a number in front of the keyword.

`Format`:

```SQL
SELECT <column>
FROM <table>
OFFSET <number>;
```

`Example`:

```SQL
SELECT *
FROM users
OFFSET 40;
```

> **This example shows** us rows 41 and beyond.

## LIMIT

We can use `LIMIT` to select the first few rows by adding a number in front of the keyword.

`Format`:

```SQL
SELECT <column>
FROM <table>
LIMIT <number>;
```

`Example`:

```SQL
SELECT *
FROM users
LIMIT 5;
```

> **This example shows** only the first `5 rows` from our `users` table.
