package wary.bhaskar.shoppinglist.ui.shoppinglist

import wary.bhaskar.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}