var hour,minute,second;//时 分 秒
hour=minute=second=0;//初始化
var millisecond=0;//毫秒
var int;
function Reset()//重置
{
    window.clearInterval(int);
    millisecond=hour=minute=second=0;
    document.getElementById('u6_input').value='0时0分0秒';
}

function start()//开始
{
    int=setInterval(timer,50);
}

function timer()//计时
{
    millisecond=millisecond+50;
    if(millisecond>=1000)
    {
        millisecond=0;
        second=second+1;
    }
    if(second>=60)
    {
        second=0;
        minute=minute+1;
    }

    if(minute>=60)
    {
        minute=0;
        hour=hour+1;
    }
    document.getElementById('u6_input').value=hour+'时'+minute+'分'+second+'秒';

}

function stop()//暂停
{
    window.clearInterval(int);
}


function complete() {
    var study_time=document.getElementById('u6_input').value;
    var hour=study_time.split('时')[0];
    var minute=study_time.split('分')[0].split('时')[1];
    var second=study_time.split('秒')[0].split('分')[1];
    study_time=(hour.length>2?hour:'0'+hour)+':'+(minute.length>2?minute:'0'+minute)+':'+(second.length>2?second:'0'+second);
    var update_time=(new Date()).Format("yyyy-MM-dd hh:mm:ss");
    stop();
    $.ajax({
        url:"/sign",
        type:"post",
        data:JSON.stringify({
            "studyTime":study_time,
            "updateTime":update_time
        }),
        contentType:"application/json;charset=utf-8",
        dataType:"json",
        success:function (data) {
            if(data["code"]===200){
                alert("打卡成功，学习数据已记录～");
            }else{
                alert("打卡出现一丢丢小问题，请联系甘甘解决哦～")
            }

        },
        error:function (data) {
            alert("打卡出现一丢丢小问题，请联系甘甘解决哦～")

        }

    });
}

Date.prototype.Format = function (fmt) { // author: meizz
    var o = {
        "M+": this.getMonth() + 1, // 月份
        "d+": this.getDate(), // 日
        "h+": this.getHours(), // 小时
        "m+": this.getMinutes(), // 分
        "s+": this.getSeconds(), // 秒
        "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
        "S": this.getMilliseconds() // 毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}
