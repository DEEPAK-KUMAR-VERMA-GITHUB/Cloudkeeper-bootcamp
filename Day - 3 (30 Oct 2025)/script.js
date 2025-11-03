// Product constructor
function Product(product_name, product_price, product_category) {
  this.product_name = product_name;
  this.product_price = product_price;
  this.product_category = product_category;
}

Product.prototype.getDiscountedPrice = function (discount_percentage) {
  if (
    isNaN(discount_percentage) ||
    discount_percentage < 0 ||
    discount_percentage > 100
  ) {
    throw new Error("Invalid discount percentage");
  }

  return this.product_price - this.product_price * (discount_percentage / 100);
};

function getCostliestProduct(products) {
  var mostExpensiveProduct = products[0];
  products.forEach((product) => {
    if (product.product_price > mostExpensiveProduct.product_price) {
      mostExpensiveProduct = product;
    }
  });
  return mostExpensiveProduct;
}

// IIFE for rendering
(function () {
  var products = [
    new Product("Apple", 200, "Fruits"),
    new Product("Mango", 80, "Fruits"),
    new Product("Good to Great", 476, "Books"),
    new Product("Vivo T4", 22000, "Mobiles"),
  ];

  var productContainer = document.getElementById("products-container");
  var expensiveProductLabel = document.getElementById(
    "expensive-product-label"
  );

  products.forEach((product) => {
    var productCard = document.createElement("div");
    productCard.classList.add("product-card");

    // Product Name
    var productNameContainer = document.createElement("div");
    var productNameTag = document.createElement("h3");
    productNameTag.innerText = "Product Name:";
    var productName = document.createElement("span");
    productName.innerText = product.product_name;
    productNameContainer.append(productNameTag, productName);

    // Product Price
    var productPriceContainer = document.createElement("div");
    var productPriceTag = document.createElement("h3");
    productPriceTag.innerText = "Product Price:";
    var productPrice = document.createElement("span");
    productPrice.innerText = "Rs. " + product.product_price;
    productPriceContainer.append(productPriceTag, productPrice);

    // Product Category
    var productCategoryContainer = document.createElement("div");
    var productCategoryTag = document.createElement("h3");
    productCategoryTag.innerText = "Product Category:";
    var productCategory = document.createElement("span");
    productCategory.innerText = product.product_category;
    productCategoryContainer.append(productCategoryTag, productCategory);

    // Append all
    productCard.append(
      productNameContainer,
      productPriceContainer,
      productCategoryContainer
    );

    productCard.addEventListener("mouseover", function (e) {
      this.style.scale = 1.09;
      this.style.backgroundColor = "#e8af64";
    });

    productCard.addEventListener("mouseleave", function (e) {
      this.style.scale = 1;
      this.style.backgroundColor = "antiquewhite";
    });

    productContainer.append(productCard);
  });

  var expensiveProduct = getCostliestProduct.apply(null, [products]);

  expensiveProductLabel.innerText =
    "Our's most expensive product is : " +
    expensiveProduct.product_name +
    " (Rs. " +
    expensiveProduct.product_price +
    ")";

  console.log(products[0].getDiscountedPrice(20));
})();
