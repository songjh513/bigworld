(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[13],{"5WY0":function(e,t,a){e.exports={main:"antd-pro\\pages\\-user\\-register-main",getCaptcha:"antd-pro\\pages\\-user\\-register-getCaptcha",submit:"antd-pro\\pages\\-user\\-register-submit",login:"antd-pro\\pages\\-user\\-register-login",error:"antd-pro\\pages\\-user\\-register-error",success:"antd-pro\\pages\\-user\\-register-success",warning:"antd-pro\\pages\\-user\\-register-warning","progress-pass":"antd-pro\\pages\\-user\\-register-progress-pass",progress:"antd-pro\\pages\\-user\\-register-progress"}},cq3J:function(e,t,a){"use strict";var r=a("0ZgE"),s=a("VY4n");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,a("Otnc");var l=r(a("PJ98"));a("cGjX");var i=r(a("AV1Z"));a("yf3c");var d=r(a("Tk4G"));a("z8hR");var o=r(a("93Mn"));a("nunE");var n=r(a("q3LG")),u=r(a("U2oY"));a("f+r1");var c=r(a("cJq7"));a("cGCP");var m=r(a("037l"));a("1P5+");var f,p,g,h=r(a("22Gw")),v=s(a("ZS5U")),E=a("rAnT"),w=a("Zp3c"),b=r(a("43Kr")),M=r(a("bfKc")),y=r(a("5WY0")),P=h.default.Item,S=m.default.Option,F=c.default.Group,k={ok:v.default.createElement("div",{className:y.default.success},v.default.createElement(w.FormattedMessage,{id:"validation.password.strength.strong"})),pass:v.default.createElement("div",{className:y.default.warning},v.default.createElement(w.FormattedMessage,{id:"validation.password.strength.medium"})),poor:v.default.createElement("div",{className:y.default.error},v.default.createElement(w.FormattedMessage,{id:"validation.password.strength.short"}))},q={ok:"success",pass:"normal",poor:"exception"},C=(f=(0,E.connect)(e=>{var t=e.register,a=e.loading;return{register:t,submitting:a.effects["register/submit"]}}),p=h.default.create(),f(g=p(g=class extends v.Component{constructor(){super(...arguments),this.state={count:0,confirmDirty:!1,visible:!1,help:"",prefix:"86"},this.onGetCaptcha=(()=>{var e=59;this.setState({count:e}),this.interval=setInterval(()=>{e-=1,this.setState({count:e}),0===e&&clearInterval(this.interval)},1e3)}),this.getPasswordStatus=(()=>{var e=this.props.form,t=e.getFieldValue("password");return t&&t.length>9?"ok":t&&t.length>5?"pass":"poor"}),this.handleSubmit=(e=>{e.preventDefault();var t=this.props,a=t.form,r=t.dispatch;a.validateFields({force:!0},(e,t)=>{if(!e){var a=this.state.prefix;r({type:"register/submit",payload:(0,u.default)({},t,{prefix:a})})}})}),this.handleConfirmBlur=(e=>{var t=e.target.value,a=this.state.confirmDirty;this.setState({confirmDirty:a||!!t})}),this.checkConfirm=((e,t,a)=>{var r=this.props.form;t&&t!==r.getFieldValue("password")?a((0,w.formatMessage)({id:"validation.password.twice"})):a()}),this.checkPassword=((e,t,a)=>{var r=this.state,s=r.visible,l=r.confirmDirty;if(t)if(this.setState({help:""}),s||this.setState({visible:!!t}),t.length<6)a("error");else{var i=this.props.form;t&&l&&i.validateFields(["confirm"],{force:!0}),a()}else this.setState({help:(0,w.formatMessage)({id:"validation.password.required"}),visible:!!t}),a("error")}),this.changePrefix=(e=>{this.setState({prefix:e})}),this.renderPasswordProgress=(()=>{var e=this.props.form,t=e.getFieldValue("password"),a=this.getPasswordStatus();return t&&t.length?v.default.createElement("div",{className:y.default[`progress-${a}`]},v.default.createElement(n.default,{status:q[a],className:y.default.progress,strokeWidth:6,percent:10*t.length>100?100:10*t.length,showInfo:!1})):null})}componentDidUpdate(){var e=this.props,t=e.form,a=e.register,r=t.getFieldValue("mail");"ok"===a.status&&M.default.push({pathname:"/user/register-result",state:{account:r}})}componentWillUnmount(){clearInterval(this.interval)}render(){var e=this.props,t=e.form,a=e.submitting,r=t.getFieldDecorator,s=this.state,n=s.count,u=s.prefix,f=s.help,p=s.visible;return v.default.createElement("div",{className:y.default.main},v.default.createElement("h3",null,v.default.createElement(w.FormattedMessage,{id:"app.register.register"})),v.default.createElement(h.default,{onSubmit:this.handleSubmit},v.default.createElement(P,null,r("mail",{rules:[{required:!0,message:(0,w.formatMessage)({id:"validation.email.required"})},{type:"email",message:(0,w.formatMessage)({id:"validation.email.wrong-format"})}]})(v.default.createElement(c.default,{size:"large",placeholder:(0,w.formatMessage)({id:"form.email.placeholder"})}))),v.default.createElement(P,{help:f},v.default.createElement(o.default,{content:v.default.createElement("div",{style:{padding:"4px 0"}},k[this.getPasswordStatus()],this.renderPasswordProgress(),v.default.createElement("div",{style:{marginTop:10}},v.default.createElement(w.FormattedMessage,{id:"validation.password.strength.msg"}))),overlayStyle:{width:240},placement:"right",visible:p},r("password",{rules:[{validator:this.checkPassword}]})(v.default.createElement(c.default,{size:"large",type:"password",placeholder:(0,w.formatMessage)({id:"form.password.placeholder"})})))),v.default.createElement(P,null,r("confirm",{rules:[{required:!0,message:(0,w.formatMessage)({id:"validation.confirm-password.required"})},{validator:this.checkConfirm}]})(v.default.createElement(c.default,{size:"large",type:"password",placeholder:(0,w.formatMessage)({id:"form.confirm-password.placeholder"})}))),v.default.createElement(P,null,v.default.createElement(F,{compact:!0},v.default.createElement(m.default,{size:"large",value:u,onChange:this.changePrefix,style:{width:"20%"}},v.default.createElement(S,{value:"86"},"+86"),v.default.createElement(S,{value:"87"},"+87")),r("mobile",{rules:[{required:!0,message:(0,w.formatMessage)({id:"validation.phone-number.required"})},{pattern:/^\d{10}$/,message:(0,w.formatMessage)({id:"validation.phone-number.wrong-format"})}]})(v.default.createElement(c.default,{size:"large",style:{width:"80%"},placeholder:(0,w.formatMessage)({id:"form.phone-number.placeholder"})})))),v.default.createElement(P,null,v.default.createElement(l.default,{gutter:8},v.default.createElement(d.default,{span:16},r("captcha",{rules:[{required:!0,message:(0,w.formatMessage)({id:"validation.verification-code.required"})}]})(v.default.createElement(c.default,{size:"large",placeholder:(0,w.formatMessage)({id:"form.verification-code.placeholder"})}))),v.default.createElement(d.default,{span:8},v.default.createElement(i.default,{size:"large",disabled:n,className:y.default.getCaptcha,onClick:this.onGetCaptcha},n?`${n} s`:(0,w.formatMessage)({id:"app.register.get-verification-code"}))))),v.default.createElement(P,null,v.default.createElement(i.default,{size:"large",loading:a,className:y.default.submit,type:"primary",htmlType:"submit"},v.default.createElement(w.FormattedMessage,{id:"app.register.register"})),v.default.createElement(b.default,{className:y.default.login,to:"/User/Login"},v.default.createElement(w.FormattedMessage,{id:"app.register.sing-in"})))))}})||g)||g),x=C;t.default=x}}]);