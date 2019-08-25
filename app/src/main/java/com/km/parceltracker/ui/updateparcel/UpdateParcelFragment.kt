package com.km.parceltracker.ui.updateparcel

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.appbar.MaterialToolbar
import com.km.parceltracker.R
import com.km.parceltracker.base.BaseMVVMFragment
import com.km.parceltracker.databinding.FragmentUpdateParcelBinding
import com.km.parceltracker.enums.ParcelStatusEnum
import kotlinx.android.synthetic.main.form_parcel.*
import kotlinx.android.synthetic.main.fragment_register.lavSuccess
import kotlinx.android.synthetic.main.fragment_update_parcel.*
import kotlinx.android.synthetic.main.toolbar_default.*

class UpdateParcelFragment : BaseMVVMFragment<FragmentUpdateParcelBinding, UpdateParcelViewModel>() {

    private val args: UpdateParcelFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        initObservers()
    }

    private fun initViews() {
        // Set the parcel status dropdown values using ParcelStatusEnum.
        val parcelStatusList = ParcelStatusEnum.values().map { context!!.getString(it.stringResId) }
        val adapter = ArrayAdapter(context!!, R.layout.dropdown_menu_popup_item, parcelStatusList)
        dropdownStatus.setAdapter(adapter)
    }

    private fun initObservers() {
        // Populate the parcel form using the parcel retrieved from args
        viewModel.populateParcelForm(args.parcel)

        // When parcel is updated successfully then display a success animation and navigate to the previous fragment.
        viewModel.parcelUpdateSuccess.observe(this, Observer {
            btnUpdateParcel.isClickable = false
            lavSuccess.addAnimatorUpdateListener { animation ->
                if (animation.animatedFraction == 1F) findNavController().navigateUp()
            }
            lavSuccess.playAnimation()
        })
    }

    override fun initViewModelBinding() {
        binding.viewModel = viewModel
    }

    override fun getVMClass(): Class<UpdateParcelViewModel> = UpdateParcelViewModel::class.java

    override fun getLayoutId(): Int = R.layout.fragment_update_parcel

    override fun getToolbar(): MaterialToolbar? = defaultToolbar

}