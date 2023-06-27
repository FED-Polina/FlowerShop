// Создаем массив для хранения товаров в корзине
var cartItems = [];

// Функция для обработки нажатия на кнопку "Добавить в корзину"
function addToCart(event) {
    // Получаем информацию о товаре, на котором была нажата кнопка
    var product = event.target.parentNode;
    var title = product.querySelector('h3').textContent;
    var price = product.querySelector('p').textContent;

    // Создаем объект товара
    var item = {
        title: title,
        price: price
    };

    // Добавляем товар в массив корзины
    cartItems.push(item);

    // Обновляем количество товаров в корзине
    updateCartCount();

    // Выводим сообщение об успешном добавлении товара
    alert('Товар "' + title + '" добавлен в корзину.');
}

// Функция для обновления количества товаров в корзине
function updateCartCount() {
    var cartCountElement = document.getElementById('cart-count');
    cartCountElement.textContent = cartItems.length;
}

// Находим все кнопки "Добавить в корзину" на странице
var addToCartButtons = document.querySelectorAll('.product-list li button');

// Назначаем обработчик события для каждой кнопки
addToCartButtons.forEach(function(button) {
    button.addEventListener('click', addToCart);
});
