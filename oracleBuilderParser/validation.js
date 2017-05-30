

function ApplyGoodDataCase(champ){
  
  if(champ.getAttribute("Case")==="Upper"){
    
    champ.value=champ.value.toUpperCase();

  }else if(champ.getAttribute("Case")==="Lower"){
    champ.value=champ.value.toLowerCase()
  }
}

function onBlur(champ){
  console.log("Passage dans la méthode OnBlur de l'objet "+champ.getAttribute("name")+" : "+champ.getAttribute("dataBlur"))
  if(champ.getAttribute("type")==="text"){
    checkTextItem(champ);
  }
}

function onClick(champ){
  console.log("Passage dans la méthode OnClick de l'objet "+champ.getAttribute("name")+" : "+champ.getAttribute("dataOnclick"))
}

function onFocus(champ){
  console.log("Passage dans la méthode Onfocus de l'objet "+champ.getAttribute("name")+" : "+champ.getAttribute("dataOnfocus"))
}


function checkTextItem(champ){
 
  if(!(checkItemMinValue(champ))){
    if(!(checkItemMaxValue(champ))){
      if(!(checkItemRequired(champ))){
        CheckItemDataType(champ);
}}}}

function surligne(champ, erreur)
{
   if(erreur){
      champ.style.borderTop = "2px solid red";
    champ.style.borderBottom = "2px solid red";
    champ.style.borderLeft = "2px solid red";
    champ.style.borderRight = "2px solid red";}
   else{
       champ.style.borderTop = "2px solid ";
    champ.style.borderBottom = "2px solid ";
    champ.style.borderLeft = "2px solid";
    champ.style.borderRight = "2px solid ";
}}

function checkItemMinValue(champ){
  var v_min=parseFloat(champ.getAttribute("MinValue"));
  var v_value=parseFloat(champ.value);
  if(v_value<v_min){
    surligne(champ,true);
    return true;
  }else{
    surligne(champ,false);
    return false;
  }
}

function checkItemMaxValue(champ){
  var v_max=parseFloat(champ.getAttribute("maxValue"));
  var v_value=parseFloat(champ.value);
  if(v_value>v_max){
    surligne(champ,true);
    return true;
  }else{
    surligne(champ,false);
    return false;
  }
}

function checkItemRequired(champ){
  if(champ.getAttribute("required")==="Yes"){
    if(champ.value===""){
      surligne(champ,true);
      return true;
    }else{
      surligne(champ,false);
      return false;
    }
  }
}

function CheckItemDataType(champ){
  var v_dateRegex=/^[0-9]{2}\/[0-9]{2}\/[0-9]{4}$/;
  if(champ.getAttribute("TypeData")==="Char"){
    surligne(champ,false);
    return false;
  }else if(champ.getAttribute("TypeData")==="Number"){
    if(isNaN(champ.value)){
      surligne(champ,true);
      return true;
    }else{
      surligne(champ,false);
      return false;
    }
  }else if(champ.getAttribute("TypeData")==="Date"){
    if(v_dateRegex.test(champ.value)){
      surligne(champ,false);
      return false;
    }else{
      surligne(champ,true);
      return true;
    }
  }
}