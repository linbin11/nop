package source.mybateis.demo.pojo;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GoodsDocuHead Pojo对象.
 * 
 * 记录出入库的主体信息，出、入标志、收发机构、人员等信息.
 */
public class UdmUserPojo implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    /** 出入库单据. */
    private String m_inoutNumber;

    /** 执行药库、药房. */
    private String m_deptCode;

    /** 1-入库单据，0-出库单据. */
    private String m_goodsIoSign;

    /** 入库单或出库，调价，采购，科室领退,. */
    private String m_goodsIoSort;
    private String m_goodsIoSortName;

    /** 发货方机构ID. */
    private String m_receiver;
    private String m_receiverName;

    /** 收货方机构ID. */
    private String m_deliverer;
    private String m_delivererName;

    /** 出入库日期. */
    private Date m_goodsIoDate;

    /** 库单上账人. */
    private String m_empIdOperator;
    private String m_empIdOperatorName;

    /** 库单审核人. */
    private String m_empIdCheck;
    private String m_empIdCheckName;

    /** 库单经办人. */
    private String m_empIdInver;
    private String m_empIdInverName;

    /** 应付款数. */
    private Double m_payAmount;

    /** 已付款数. */
    private Double m_payFinishedAmount;

    /** 0-未上帐 1-已上帐 2-作废. */
    private String m_accountSign;

    /** 计划单据号. */
    private String m_docuOrderNumber;

    /** 付款通知单据号. */
    private Long m_payNoticeNo;

    /** 调价ID. */
    private Long m_priceAdjustmentId;

    /** 供货商ID. */
    private Long m_supplierSerialNo;

    /** 名称. */
    private String m_supplier;

    /** 创建时间. */
    private Date m_createTime;

    /** 提交时间. */
    private Date m_submitTime;

    /** 上账时间. */
    private Date m_accountTime;

    /** 备注. */
    private String m_note;

    /**
     * 入库状态 0:保存状态 1:提交状态（已经真正加减库存）.
     */
    private String m_inoutStatus;

    /** 直接入出库标识. */
    private String m_directInoutSign;

    /** 申请经费卡号. */
    private String m_accountNo;

    /** 申请卡子序号. */
    private String m_accountSubNo;

    /** 付款方式(0:无需付款，1：科室自付款，2：医院付款). */
    private String m_payType;

    /** 库管分类 */
    private String m_managerTypeCode;
    private String m_managerTypeCodeName;

    /** 课题编号 */
    private String m_classNo;

    private String m_purchaseSupplySerialNo;

    /**
     * 默认构造器 .
     */
    public UdmUserPojo ()
    {
    }

    /**
     * 获取出入库单据属性.
     * 
     */
    public String getInoutNumber ()
    {
        return m_inoutNumber;
    }

    /**
     * 设置出入库单据属性.
     * 
     * @param inoutNumber.
     */
    public void setInoutNumber (String inoutNumber)
    {
        m_inoutNumber = inoutNumber;
    }

    /**
     * 获取执行药库、药房属性.
     * 
     */
    public String getDeptCode ()
    {
        return m_deptCode;
    }

    /**
     * 设置执行药库、药房属性.
     * 
     * @param deptCode.
     */
    public void setDeptCode (String deptCode)
    {
        m_deptCode = deptCode;
    }

    /**
     * 获取1-入库单据，0-出库单据属性.
     * 
     */
    public String getGoodsIoSign ()
    {
        return m_goodsIoSign;
    }

    /**
     * 设置1-入库单据，0-出库单据属性.
     * 
     * @param goodsIoSign.
     */
    public void setGoodsIoSign (String goodsIoSign)
    {
        m_goodsIoSign = goodsIoSign;
    }

    /**
     * 获取入库单或出库，调价，采购，科室领退,属性.
     * 
     */
    public String getGoodsIoSort ()
    {
        return m_goodsIoSort;
    }

    /**
     * 设置入库单或出库，调价，采购，科室领退,属性.
     * 
     * @param goodsIoSort.
     */
    public void setGoodsIoSort (String goodsIoSort)
    {
        m_goodsIoSort = goodsIoSort;
    }

    /**
     * 获取发货方机构ID属性.
     * 
     */
    public String getReceiver ()
    {
        return m_receiver;
    }

    /**
     * 设置发货方机构ID属性.
     * 
     * @param receiver.
     */
    public void setReceiver (String receiver)
    {
        m_receiver = receiver;
    }

    /**
     * 获取收货方机构ID属性.
     * 
     */
    public String getDeliverer ()
    {
        return m_deliverer;
    }

    /**
     * 设置收货方机构ID属性.
     * 
     * @param deliverer.
     */
    public void setDeliverer (String deliverer)
    {
        m_deliverer = deliverer;
    }

    /**
     * 获取出入库日期属性.
     * 
     */
    public Date getGoodsIoDate ()
    {
        if (m_goodsIoDate == null)
        {
            return null;
        }
        return (Date) m_goodsIoDate.clone ();
    }

    /**
     * 设置出入库日期属性.
     * 
     * @param goodsIoDate.
     */
    public void setGoodsIoDate (Date goodsIoDate)
    {
        if (goodsIoDate == null)
        {
            m_goodsIoDate = null;
        }
        else
        {
            m_goodsIoDate = (Date) goodsIoDate.clone ();
        }
    }

    /**
     * 获取库单上账人属性.
     * 
     */
    public String getEmpIdOperator ()
    {
        return m_empIdOperator;
    }

    /**
     * 设置库单上账人属性.
     * 
     * @param empIdOperator.
     */
    public void setEmpIdOperator (String empIdOperator)
    {
        m_empIdOperator = empIdOperator;
    }

    /**
     * 获取库单审核人属性.
     * 
     */
    public String getEmpIdCheck ()
    {
        return m_empIdCheck;
    }

    /**
     * 设置库单审核人属性.
     * 
     * @param empIdCheck.
     */
    public void setEmpIdCheck (String empIdCheck)
    {
        m_empIdCheck = empIdCheck;
    }

    /**
     * 获取库单经办人属性.
     * 
     */
    public String getEmpIdInver ()
    {
        return m_empIdInver;
    }

    /**
     * 设置库单经办人属性.
     * 
     * @param empIdInver.
     */
    public void setEmpIdInver (String empIdInver)
    {
        m_empIdInver = empIdInver;
    }

    /**
     * 获取应付款数属性.
     * 
     */
    public Double getPayAmount ()
    {
        return m_payAmount;
    }

    /**
     * 设置应付款数属性.
     * 
     * @param payAmount.
     */
    public void setPayAmount (Double payAmount)
    {
        m_payAmount = payAmount;
    }

    /**
     * 获取已付款数属性.
     * 
     */
    public Double getPayFinishedAmount ()
    {
        return m_payFinishedAmount;
    }

    /**
     * 设置已付款数属性.
     * 
     * @param payFinishedAmount.
     */
    public void setPayFinishedAmount (Double payFinishedAmount)
    {
        m_payFinishedAmount = payFinishedAmount;
    }

    /**
     * 获取0-未上帐 1-已上帐 2-作废属性.
     * 
     */
    public String getAccountSign ()
    {
        return m_accountSign;
    }

    /**
     * 设置0-未上帐 1-已上帐 2-作废属性.
     * 
     * @param accountSign.
     */
    public void setAccountSign (String accountSign)
    {
        m_accountSign = accountSign;
    }

    /**
     * 获取计划单据号属性.
     * 
     */
    public String getDocuOrderNumber ()
    {
        return m_docuOrderNumber;
    }

    /**
     * 设置计划单据号属性.
     * 
     * @param docuOrderNumber.
     */
    public void setDocuOrderNumber (String docuOrderNumber)
    {
        m_docuOrderNumber = docuOrderNumber;
    }

    /**
     * 获取付款通知单据号属性.
     * 
     */
    public Long getPayNoticeNo ()
    {
        return m_payNoticeNo;
    }

    /**
     * 设置付款通知单据号属性.
     * 
     * @param payNoticeNo.
     */
    public void setPayNoticeNo (Long payNoticeNo)
    {
        m_payNoticeNo = payNoticeNo;
    }

    /**
     * 获取调价ID属性.
     * 
     */
    public Long getPriceAdjustmentId ()
    {
        return m_priceAdjustmentId;
    }

    /**
     * 设置调价ID属性.
     * 
     * @param priceAdjustmentId.
     */
    public void setPriceAdjustmentId (Long priceAdjustmentId)
    {
        m_priceAdjustmentId = priceAdjustmentId;
    }

    /**
     * 获取供货商ID属性.
     * 
     */
    public Long getSupplierSerialNo ()
    {
        return m_supplierSerialNo;
    }

    /**
     * 设置供货商ID属性.
     * 
     * @param supplierSerialNo.
     */
    public void setSupplierSerialNo (Long supplierSerialNo)
    {
        m_supplierSerialNo = supplierSerialNo;
    }

    /**
     * 获取名称属性.
     * 
     */
    public String getSupplier ()
    {
        return m_supplier;
    }

    /**
     * 设置名称属性.
     * 
     * @param supplier.
     */
    public void setSupplier (String supplier)
    {
        m_supplier = supplier;
    }

    /**
     * 获取创建时间属性.
     * 
     */
    public Date getCreateTime ()
    {
        if (m_createTime == null)
        {
            return null;
        }
        return (Date) m_createTime.clone ();
    }

    /**
     * 设置创建时间属性.
     * 
     * @param createTime.
     */
    public void setCreateTime (Date createTime)
    {
        if (createTime == null)
        {
            m_createTime = null;
        }
        else
        {
            m_createTime = (Date) createTime.clone ();
        }
    }

    /**
     * 获取提交时间属性.
     * 
     */
    public Date getSubmitTime ()
    {
        if (m_submitTime == null)
        {
            return null;
        }
        return (Date) m_submitTime.clone ();
    }

    /**
     * 设置提交时间属性.
     * 
     * @param submitTime.
     */
    public void setSubmitTime (Date submitTime)
    {
        if (submitTime == null)
        {
            m_submitTime = null;
        }
        else
        {
            m_submitTime = (Date) submitTime.clone ();
        }
    }

    /**
     * 获取上账时间属性.
     * 
     */
    public Date getAccountTime ()
    {
        if (m_accountTime == null)
        {
            return null;
        }
        return (Date) m_accountTime.clone ();
    }

    /**
     * 设置上账时间属性.
     * 
     * @param accountTime.
     */
    public void setAccountTime (Date accountTime)
    {
        if (accountTime == null)
        {
            m_accountTime = null;
        }
        else
        {
            m_accountTime = (Date) accountTime.clone ();
        }
    }

    /**
     * 获取备注属性.
     * 
     */
    public String getNote ()
    {
        return m_note;
    }

    /**
     * 设置备注属性.
     * 
     * @param note.
     */
    public void setNote (String note)
    {
        m_note = note;
    }

    /**
     * 获取入库状态 0:保存状态 1:提交状态（已经真正加减库存）属性.
     * 
     */
    public String getInoutStatus ()
    {
        return m_inoutStatus;
    }

    /**
     * 设置入库状态 0:保存状态 1:提交状态（已经真正加减库存）属性.
     * 
     * @param inoutStatus.
     */
    public void setInoutStatus (String inoutStatus)
    {
        m_inoutStatus = inoutStatus;
    }

    /**
     * 获取直接入出库标识属性.
     * 
     */
    public String getDirectInoutSign ()
    {
        return m_directInoutSign;
    }

    /**
     * 设置直接入出库标识属性.
     * 
     * @param directInoutSign.
     */
    public void setDirectInoutSign (String directInoutSign)
    {
        m_directInoutSign = directInoutSign;
    }

    /**
     * 获取申请经费卡号属性.
     * 
     */
    public String getAccountNo ()
    {
        return m_accountNo;
    }

    /**
     * 设置申请经费卡号属性.
     * 
     * @param accountNo.
     */
    public void setAccountNo (String accountNo)
    {
        m_accountNo = accountNo;
    }

    /**
     * 获取申请卡子序号属性.
     * 
     */
    public String getAccountSubNo ()
    {
        return m_accountSubNo;
    }

    /**
     * 设置申请卡子序号属性.
     * 
     * @param accountSubNo.
     */
    public void setAccountSubNo (String accountSubNo)
    {
        m_accountSubNo = accountSubNo;
    }

    /**
     * 获取付款方式(0:无需付款，1：科室自付款，2：医院付款)属性.
     * 
     */
    public String getPayType ()
    {
        return m_payType;
    }

    /**
     * 设置付款方式(0:无需付款，1：科室自付款，2：医院付款)属性.
     * 
     * @param payType.
     */
    public void setPayType (String payType)
    {
        m_payType = payType;
    }

    public String getGoodsIoSortName ()
    {
        return this.m_goodsIoSortName;
    }

    public void setGoodsIoSortName (String goodsIoSortName)
    {
        m_goodsIoSortName = goodsIoSortName;
    }

    public String getEmpIdOperatorName ()
    {
        return this.m_empIdOperatorName;
    }

    public void setEmpIdOperatorName (String empIdOperatorName)
    {
        m_empIdOperatorName = empIdOperatorName;
    }

    public String getEmpIdCheckName ()
    {
        return this.m_empIdCheckName;
    }

    public void setEmpIdCheckName (String empIdCheckName)
    {
        m_empIdCheckName = empIdCheckName;
    }

    public String getEmpIdInverName ()
    {
        return this.m_empIdInverName;
    }

    public void setEmpIdInverName (String empIdInverName)
    {
        m_empIdInverName = empIdInverName;
    }

    public String getReceiverName ()
    {
        return m_receiverName;
    }

    public void setReceiverName (String receiverName)
    {
        m_receiverName = receiverName;
    }

    public String getDelivererName ()
    {
        return m_delivererName;
    }

    public void setDelivererName (String delivererName)
    {
        m_delivererName = delivererName;
    }

    public String getManagerTypeCode ()
    {
        return m_managerTypeCode;
    }

    public void setManagerTypeCode (String managerTypeCode)
    {
        m_managerTypeCode = managerTypeCode;
    }

    public String getManagerTypeCodeName ()
    {
        return m_managerTypeCodeName;
    }

    public void setManagerTypeCodeName (String managerTypeCodeName)
    {
        m_managerTypeCodeName = managerTypeCodeName;
    }

    public String getClassNo ()
    {
        return m_classNo;
    }

    public void setClassNo (String classNo)
    {
        m_classNo = classNo;
    }

    public String getPurchaseSupplySerialNo ()
    {
        return m_purchaseSupplySerialNo;
    }

    public void setPurchaseSupplySerialNo (String purchaseSupplySerialNo)
    {
        m_purchaseSupplySerialNo = purchaseSupplySerialNo;
    }

    /**
     * 打印字符串.
     * 
     * @return 打印.
     */
    public String toString ()
    {
        StringBuffer sb = new StringBuffer (100);
        sb.append ("---------------------------------- start ----------------------------------");
        sb.append ("inoutNumber:" + m_inoutNumber + " deptCode:" + m_deptCode + " goodsIoSign:" + m_goodsIoSign);
        sb.append ("goodsIoSort:" + m_goodsIoSort + " receiver:" + m_receiver + " deliverer:" + m_deliverer);
        sb.append ("goodsIoDate:" + m_goodsIoDate + " empIdOperator:" + m_empIdOperator + " empIdCheck:" + m_empIdCheck);
        sb.append ("empIdInver:" + m_empIdInver + " payAmount:" + m_payAmount + " payFinishedAmount:" + m_payFinishedAmount);
        sb.append ("accountSign:" + m_accountSign + " docuOrderNumber:" + m_docuOrderNumber + " payNoticeNo:" + m_payNoticeNo);
        sb.append ("priceAdjustmentId:" + m_priceAdjustmentId + " supplierSerialNo:" + m_supplierSerialNo + " supplier:" + m_supplier);
        sb.append ("createTime:" + m_createTime + " submitTime:" + m_submitTime + " accountTime:" + m_accountTime);
        sb.append ("note:" + m_note + " inoutStatus:" + m_inoutStatus + " directInoutSign:" + m_directInoutSign);
        sb.append ("accountNo:" + m_accountNo + " accountSubNo:" + m_accountSubNo + " payType:" + m_payType);

        sb.append ("----------------------------------  end  ----------------------------------");
        return sb.toString ();
    }

    /** 日志记录器. */
    public static final Logger s_logger = LoggerFactory.getLogger (UdmUserPojo.class);

    /** 公司版权信息. */
    public static final String copyright = "Copyright 2014, TH Supcom Corporation";

    /** 提交路径. */
    public static final String SCC_BRANCH = "$URL$";

    /** 提交日期. */
    public static final String SCC_LAST_MODIFICATION_DATE = "$Date$";

    /** 最终修改人员. */
    public static final String SCC_LAST_MODIFIER_NAME = "$Author$";

    /** 最终版本号. */
    public static final String SCC_REVISION = "$Revision$";
}
