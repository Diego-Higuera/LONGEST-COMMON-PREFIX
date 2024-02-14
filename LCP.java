public class LCP{
    public String longestCommonPrefix(String[] str){
       int n = str.length;
       // take temp_prefix string and assign first element of arr : a.
       String resultado = str[0];
       
       // Iterate for rest of element in string.
       for(int i = 1; i < n; i++){
            // .indexOf() return index of that substring from string.
            while(str[i].indexOf(resultado) != 0){
               
                // update matched substring prefx
                resultado = resultado.substring(0, resultado.length()-1);
               
                // check for empty case. direct return if true..
                if(resultado.isEmpty()){
                    return "-1";
                }
            }
        }
        return resultado;
    }
}
 
   