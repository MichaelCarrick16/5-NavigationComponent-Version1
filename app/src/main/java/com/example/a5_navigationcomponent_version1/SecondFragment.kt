package com.example.a5_navigationcomponent_version1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.a5_navigationcomponent_version1.model.UserModel
import kotlinx.android.synthetic.main.frag_second.*

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_second,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var controller = findNavController()

        var showUser : UserModel = arguments?.getSerializable(FirstFragment.KEY_BUNDLE) as UserModel
        Toast.makeText(context,showUser.name+"/"+showUser.age,Toast.LENGTH_SHORT).show()

        bt_frag_third_2.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                controller.navigate(R.id.thirdFragment)
            }

        })
    }
}