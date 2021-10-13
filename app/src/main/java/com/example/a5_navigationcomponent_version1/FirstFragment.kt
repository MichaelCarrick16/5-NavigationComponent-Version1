package com.example.a5_navigationcomponent_version1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.a5_navigationcomponent_version1.model.UserModel
import kotlinx.android.synthetic.main.frag_first.*

class FirstFragment : Fragment() {

    companion object{
        var KEY_BUNDLE = "KEY_BUNDLE"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_first,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var controller = findNavController()


        bt_frag_second_1.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var bundle : Bundle = Bundle()
                bundle.putSerializable(KEY_BUNDLE,UserModel("Pham Dinh Hiep",24))


                controller.navigate(R.id.secondFragment,bundle)
            }

        })

        bt_frag_third_1.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                controller.navigate(R.id.thirdFragment)
            }

        })



    }
}