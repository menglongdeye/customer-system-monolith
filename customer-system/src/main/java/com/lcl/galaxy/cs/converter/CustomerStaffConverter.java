package com.lcl.galaxy.cs.converter;

import com.lcl.galaxy.cs.controller.req.AddCustomerStaffReqVO;
import com.lcl.galaxy.cs.controller.req.UpdateCustomerStaffReqVO;
import com.lcl.galaxy.cs.controller.resp.CustomerStaffRespVO;
import com.lcl.galaxy.cs.entity.staff.CustomerStaff;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerStaffConverter {
    CustomerStaffConverter INSTANCE = Mappers.getMapper(CustomerStaffConverter.class);

    // VO -> Entity
    CustomerStaff convertCreateReq(AddCustomerStaffReqVO addCustomerStaffReqVO);
    CustomerStaff convertUpdateReq(UpdateCustomerStaffReqVO updateCustomerStaffReqVO);

    // Entity -> VO
    CustomerStaffRespVO convertResp(CustomerStaff entity);
    List<CustomerStaffRespVO> convertListResp(List<CustomerStaff> entities);
}
