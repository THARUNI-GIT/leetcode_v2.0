class Solution {
    public boolean uniformArray(int[] arr) {
        if(checkAllEven(arr)) return true;
    else if(checkAllOdd(arr)) return true;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] % 2 == 0){
            int diff = 0;
            for(int j = 0; j < i; j++){
                if(arr[i]-arr[j] >= 1){
                    diff++;
                    break;
                }
            }
            if(diff < 1 && i < arr.length-1){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i]-arr[j] >= 1){
                        diff++;
                        break;
                    }
                }
            }
            if(diff < 1) return false;
        }
    }
    return true;
    }


public boolean checkAllEven(int[] arr){
    for(int i : arr){
        if(i % 2 != 0)return false;
    }
    return true;
}

public boolean checkAllOdd(int[] arr){
    for(int i : arr){
        if(i % 2 == 0) return false;
    }
    return true;
}

}