(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[22],{zfh6:function(e,t,a){"use strict";var l=a("0ZgE");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,a("cGjX");var r=l(a("AV1Z"));a("f+r1");var s=l(a("cJq7"));a("KzlZ");var u=l(a("zE4n")),d=l(a("+wDg"));a("PJkc");var f=l(a("L5Fm")),m=l(a("U2oY"));a("1P5+");var o,n,c,p=l(a("22Gw")),i=l(a("ZS5U")),b=a("rAnT"),E=l(a("bfKc")),w=a("+n12"),g=l(a("7GcH")),v={labelCol:{span:5},wrapperCol:{span:19}},y=(o=(0,b.connect)(e=>{var t=e.form,a=e.loading;return{submitting:a.effects["form/submitStepForm"],data:t.step}}),n=p.default.create(),o(c=n(c=class extends i.default.PureComponent{render(){var e=this.props,t=e.form,a=e.data,l=e.dispatch,o=e.submitting,n=t.getFieldDecorator,c=t.validateFields,b=()=>{E.default.push("/form/step-form/info")},y=e=>{e.preventDefault(),c((e,t)=>{e||l({type:"form/submitStepForm",payload:(0,m.default)({},a,t)})})};return i.default.createElement(p.default,{layout:"horizontal",className:g.default.stepForm},i.default.createElement(f.default,{closable:!0,showIcon:!0,message:"\u786e\u8ba4\u8f6c\u8d26\u540e\uff0c\u8d44\u91d1\u5c06\u76f4\u63a5\u6253\u5165\u5bf9\u65b9\u8d26\u6237\uff0c\u65e0\u6cd5\u9000\u56de\u3002",style:{marginBottom:24}}),i.default.createElement(p.default.Item,(0,d.default)({},v,{className:g.default.stepFormText,label:"\u4ed8\u6b3e\u8d26\u6237"}),a.payAccount),i.default.createElement(p.default.Item,(0,d.default)({},v,{className:g.default.stepFormText,label:"\u6536\u6b3e\u8d26\u6237"}),a.receiverAccount),i.default.createElement(p.default.Item,(0,d.default)({},v,{className:g.default.stepFormText,label:"\u6536\u6b3e\u4eba\u59d3\u540d"}),a.receiverName),i.default.createElement(p.default.Item,(0,d.default)({},v,{className:g.default.stepFormText,label:"\u8f6c\u8d26\u91d1\u989d"}),i.default.createElement("span",{className:g.default.money},a.amount),i.default.createElement("span",{className:g.default.uppercase},"\uff08",(0,w.digitUppercase)(a.amount),"\uff09")),i.default.createElement(u.default,{style:{margin:"24px 0"}}),i.default.createElement(p.default.Item,(0,d.default)({},v,{label:"\u652f\u4ed8\u5bc6\u7801",required:!1}),n("password",{initialValue:"123456",rules:[{required:!0,message:"\u9700\u8981\u652f\u4ed8\u5bc6\u7801\u624d\u80fd\u8fdb\u884c\u652f\u4ed8"}]})(i.default.createElement(s.default,{type:"password",autoComplete:"off",style:{width:"80%"}}))),i.default.createElement(p.default.Item,{style:{marginBottom:8},wrapperCol:{xs:{span:24,offset:0},sm:{span:v.wrapperCol.span,offset:v.labelCol.span}},label:""},i.default.createElement(r.default,{type:"primary",onClick:y,loading:o},"\u63d0\u4ea4"),i.default.createElement(r.default,{onClick:b,style:{marginLeft:8}},"\u4e0a\u4e00\u6b65")))}})||c)||c),F=y;t.default=F}}]);