package com.example.aluvery.sampleData

import com.example.aluvery.R
import com.example.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Pizza",
        price = BigDecimal("31.99"),
        image = R.drawable.pizza
    ),
    Product(
        name = "Hamburguer",
        price = BigDecimal("17.90"),
        image = R.drawable.hamburguer
    ),
    Product(
        name = "Coca-Cola",
        price = BigDecimal("5.90"),
        image = R.drawable.coca_cola
    )
)