package com.example.e_commerce.data

import com.example.e_commerce.R

object DataProvider {
    val pants = listOf(
        Product(R.drawable.celana_1, "Pants 1", "$110", "$60"),
        Product(R.drawable.celana_2, "Pants 2", "$120", "$70"),
        Product(R.drawable.celana_3, "Pants 3", "$130", "$80"),
        Product(R.drawable.celana_4, "Pants 4", "$140", "$90"),
        Product(R.drawable.celana_5, "Pants 5", "$150", "$100")
    )
    val shoes = listOf(
        Product(R.drawable.sepatu_1, "Shoes 1", "$210", "$160"),
        Product(R.drawable.sepatu_2, "Shoes 2", "$220", "$170"),
        Product(R.drawable.sepatu_3, "Shoes 3", "$230", "$180"),
        Product(R.drawable.sepatu_4, "Shoes 4", "$240", "$190"),
        Product(R.drawable.sepatu_5, "Shoes 5", "$250", "$200")
    )
    val shirts = listOf(
        Product(R.drawable.baju_1, "Shirt 1", "$60", "$40"),
        Product(R.drawable.baju_2, "Shirt 2", "$70", "$50"),
        Product(R.drawable.baju_3, "Shirt 3", "$80", "$60"),
        Product(R.drawable.baju_4, "Shirt 4", "$90", "$70"),
        Product(R.drawable.baju_5, "Shirt 5", "$100", "$80")
    )
}