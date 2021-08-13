#language: es
Característica: SQA-MMR Automatizacion prueba de Sura
  Yo como usuario de saucedemo, quiero logearme en su
  página web, para agregar algunos productos al carrito y
  comprarlos.

  Escenario: Compra de producto extiosa con el usuario standard_user
    Dado que me encuentro en la pagina web https://www.saucedemo.com/
    Cuando agrego productos al carrito
    Entonces confirmo la compra de mis productos.