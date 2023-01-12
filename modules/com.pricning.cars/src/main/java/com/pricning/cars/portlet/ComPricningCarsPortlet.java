package com.pricning.cars.portlet;

import com.pricning.cars.constants.ComPricningCarsPortletKeys;
import com.pricning.serv.model.Pricing;
import com.pricning.serv.service.PricingLocalServiceUtil;

import dto.CarsResponseDTO;
import dto.LocationsResponseDTO;
import template.RestTemplateImplemetation;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.function.UnaryOperator;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.springframework.http.HttpMethod;

/**
 * @author piero
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Test",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ComPricningCarsPortletKeys.COMPRICNINGCARS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.portlet.header-portlet-javascript=/js/jquery.validate.min.js"
	},
	service = Portlet.class
)
public class ComPricningCarsPortlet extends MVCPortlet {

	private static final RestTemplateImplemetation restTemplate = new RestTemplateImplemetation();

	private CarsResponseDTO getCarsResponseDTO(){
		return restTemplate.serviceInvocation(
			"https://mocki.io/v1/2fb5307b-acc9-4ce9-9f4e-8b4a5005edea", 
			CarsResponseDTO.class, 
			null,
			HttpMethod.GET
		);
	}

	private LocationsResponseDTO getLocationsResponseDTO(){
		return restTemplate.serviceInvocation(
			"http://localhost:3000/location",
			LocationsResponseDTO.class, 
			null,
			HttpMethod.GET
		);
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		
		CarsResponseDTO carsInfo = this.getCarsResponseDTO();
		LocationsResponseDTO locationsInfo = this.getLocationsResponseDTO();

		renderRequest.setAttribute("modelsNames", carsInfo.getNombres());
		renderRequest.setAttribute("models", carsInfo.getModelos());
		renderRequest.setAttribute("departments", locationsInfo.getDepartamentos());

		super.render(renderRequest, renderResponse);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {

		PricingLocalServiceUtil.addPricing(this.parseParamstoPricing(resourceRequest));

		super.serveResource(resourceRequest, resourceResponse);
	}

	private Pricing parseParamstoPricing(ResourceRequest resourceRequest){
		UnaryOperator<String> savePrincing = param -> 
			ParamUtil.getString(resourceRequest, param);

		long id = CounterLocalServiceUtil.increment();
		Pricing pricing = PricingLocalServiceUtil.createPricing(id); 

		pricing.setCarModel(savePrincing.apply("carModel"));
		pricing.setFirstName(savePrincing.apply("firstName"));
		pricing.setLastName(savePrincing.apply("lastName"));
		pricing.setProdcutVersion(savePrincing.apply("productVersion"));
		pricing.setProductType(savePrincing.apply("productType"));
		pricing.setProductModel(savePrincing.apply("productModel"));
		pricing.setFirstName(savePrincing.apply("email"));
		pricing.setPhone(savePrincing.apply("phone"));
		pricing.setIdentityDocument(savePrincing.apply("identityDocument"));

		return pricing;
	}


}
