package kz.tokarev.myapplication

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_fragment.*

class DialogFragment1 : DialogFragment() {

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_fragment, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Привязываем кнопки
        btn_y.setOnClickListener {
            Toast.makeText(view.context, "Yes", Toast.LENGTH_SHORT).show()
        }
        btn_n.setOnClickListener {
            Toast.makeText(view.context, "No", Toast.LENGTH_SHORT).show()
        }

    }
    //Этот выполняется, когда диалог закрывается
    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
    }

    //Этот метод срабатывает когда мы отменяем диалог кнопкой назад или нажатием вне области
    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
    }

}