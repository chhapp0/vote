 $(document).ready(function() {
     var timer = null;
     var awardVm = avalon.define({
         $id: "award",
         list: [],
         campaignRule: ''
     });

     var awardOpt = (function() {
         var opt = {
             query: function() {
                 vote.loading.show();
                 vote.jqAjax('award', '', function(res) {
                     awardVm.list = res.data;
                     vote.loading.hide();
                 }, function(err) {
                     vote.loading.hide();
                     console.log(err)
                 }, 'GET', false);
             },
             build: function() {

                 if (vote.isOver()) {
                     message.msg('活动已结束,期待其他投票活动');
                 }

                 awardVm.campaignRule = $("#campaignRule").val();
                 opt.query();
                 var shareUrl = "https://" + window.location.host + '/vote/' + chainId + '/home';
                 vote.getWxCfg(window.location.href, function() {
                     vote.wxShareCfg({
                         title: '<' + campaignName + '>' + '发布了投票活动，等待你的支持，快去给Ta投票吧～',
                         link: shareUrl,
                         imgUrl: sponsorPic
                     }, {
                         title: '邀您投票',
                         desc: '<' + campaignName + '>' + '发布了投票活动，等待你的支持，快去给Ta投票吧～',
                         link: shareUrl,
                         imgUrl: sponsorPic,
                     });
                 });
             }
         };
         return {
             build: opt.build
         }
     })();

     awardOpt.build();
 });