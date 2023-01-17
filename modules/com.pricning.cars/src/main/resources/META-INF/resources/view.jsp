<%@ include file="/init.jsp" %>
<portlet:resourceURL var="resourcePrincing"></portlet:resourceURL>
<script>
	function preventDefaultHOF(eventHandler){
		return function (event){
			event.preventDefault()
			eventHandler(event)
  	}		
	}
</script>

<style>
	.hidden{
		display: none;
	}

	.d-flex{
		gap: 1rem;
	}
</style>

<section>
	<form data-form="pricing" class="d-flex flex-column">
		<h2 class="text-center">Cotizador</h2>
		<%@ include file="./includes/productType.jsp" %>
		<%@ include file="./includes/productInfo.jsp" %>
		<%@ include file="./includes/clientInfo.jsp" %>
		<%@ include file="./includes/locationInfo.jsp" %>
		<%@ include file="./includes/clientContact.jsp" %>
		<button>Cotizar</button>
		<div class="hidden spinner-border text-primary" role="status">
			<span class="visually-hidden">Loading...</span>
		</div>
	</form>
</section>


<script>
	const portletNamespace = "<portlet:namespace />"
	$('[data-form="pricing"]')
		.on("submit",function(event){
			event.preventDefault()

			$(this)
				.find('option, select, input')
				.each((_, elem)=>{
					const { name } = elem
					elem.name = portletNamespace+name
				})

			const queryParams = $(this).serialize()

			function onLoading(){
				$(this)
				.find('button')
				.toggleClass('hidden')

				$(this)
					.find('.spinner-border')
					.toggleClass('hidden')
			}

			onLoading()
	
			$.ajax({
				url:"${resourcePrincing}",
				success:onLoading,
				error: onLoading,
				data: queryParams
			})
		})
		
		$('[data-form="pricing"]').validate()
</script>


