var _$authenticate_form =  $('#authenticate_form');
$("#sign_in").on('click',function(){
	if( _$authenticate_form.parsley().validate()){
		_$authenticate_form.submit();
	}
});

