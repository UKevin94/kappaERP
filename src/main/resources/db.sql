CREATE TABLE `orders` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `users_id` int(11) NOT NULL
 `customer` varchar(60) NOT NULL,
 `order_products` varchar(60) NOT NULL,
 `order_date` date NOT NULL,
 `order_price` int(11) NOT NULL,
 PRIMARY KEY (`id`),
 FOREIGN KEY (users_id)
    REFERENCES users(id)
    ON DELETE CASCADE
)

CREATE TABLE `users` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `login` varchar(60) NOT NULL UNIQUE,
 `password` varchar(60) NOT NULL,
 `mail` varchar(60) NOT NULL,
 `admin` BIT(1) NOT NULL,
 PRIMARY KEY (`id`)
)