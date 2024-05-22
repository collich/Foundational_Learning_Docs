# Sorting

`ORDER BY` is the keyword to sort the entries in SQL.

- [`Descending`](#decending): From highest to lowest, we use the `DESC` keyword.
- [`Ascending`](#ascending): From lowest to highest, we use the `ASC` keyword.

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
