package com.xiaojianma.carconsumptionmanager.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xiaojianma.carconsumptionmanager.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 总消费
     */
    private TextView totalConsume;

    /**
     * 总消费详情
     */
    private TextView totalConsumeDetail;

    /**
     * 首付
     */
    private TextView downPayments;

    /**
     * 首付详情
     */
    private TextView downPaymentsDetail;

    /**
     * 月供
     */
    private TextView monthlyPayment;

    /**
     * 月供详情
     */
    private TextView monthlyPaymentDetail;

    /**
     * 加油
     */
    private TextView oil;

    /**
     * 加油详情
     */
    private TextView oilDetail;

    /**
     * 充电
     */
    private TextView charge;

    /**
     * 充电详情
     */
    private TextView chargeDetail;

    /**
     * 高速通行费
     */
    private TextView tollFee;

    /**
     * 高速通行费详情
     */
    private TextView tollFeeDetail;

    /**
     * 停车费
     */
    private TextView park;

    /**
     * 停车费详情
     */
    private TextView parkDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initActionBar();
        initView();
        initData();
        initEvents();
    }

    private void initEvents() {
        totalConsumeDetail.setOnClickListener(this);
        downPaymentsDetail.setOnClickListener(this);
        monthlyPaymentDetail.setOnClickListener(this);
        oilDetail.setOnClickListener(this);
        chargeDetail.setOnClickListener(this);
        tollFeeDetail.setOnClickListener(this);
        parkDetail.setOnClickListener(this);
    }

    private void initData() {
        totalConsume.setText("65100");
        downPayments.setText("60000");
        monthlyPayment.setText("4000");
        oil.setText("550");
        charge.setText("50");
        tollFee.setText("200");
        park.setText("300");
    }

    private void initView() {
        totalConsume = findViewById(R.id.total_consume);
        totalConsumeDetail = findViewById(R.id.total_consume_detail);
        downPayments = findViewById(R.id.down_payments);
        downPaymentsDetail = findViewById(R.id.down_payments_detail);
        monthlyPayment = findViewById(R.id.monthly_payment);
        monthlyPaymentDetail = findViewById(R.id.monthly_payment_detail);
        oil = findViewById(R.id.oil);
        oilDetail = findViewById(R.id.oil_detail);
        charge = findViewById(R.id.charge);
        chargeDetail = findViewById(R.id.charge_detail);
        tollFee = findViewById(R.id.toll_fee);
        tollFeeDetail = findViewById(R.id.toll_fee_details);
        park = findViewById(R.id.park);
        parkDetail = findViewById(R.id.park_detail);
    }

    private void initActionBar() {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.total_consume_detail);
            actionBar.show();
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, ConsumeCreateActivity.class);
        startActivity(intent);
    }
}