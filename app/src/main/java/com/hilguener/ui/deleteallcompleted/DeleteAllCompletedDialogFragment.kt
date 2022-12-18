package com.hilguener.ui.deleteallcompleted

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hilguener.todolist.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DeleteAllCompletedDialogFragment : DialogFragment() {

    private val viewModel : DeleteAllCompletedViewModel by viewModels()
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setTitle("EXCLUIR")
            .setMessage("Você quer deletar todas as tarefas completadas? ")
            .setNegativeButton("Cancelar", null)
            .setPositiveButton("Sim"){_, _, ->
                viewModel.onConfirmClick()
            }.create()
    }
