(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{135:function(e,t,a){e.exports=a(332)},140:function(e,t,a){},332:function(e,t,a){"use strict";a.r(t);var n=a(0),r=a.n(n),i=a(16),l=a.n(i),s=(a(140),a(30)),o=a(31),c=a(33),m=a(32),h=a(34),p=a(24),u=a(52),d=a(124),g=a(5),E=a.n(g),b=a(19),w=a(126),y=a.n(w),f=a(130),k=a.n(f),v=a(127),x=a.n(v),C=a(128),j=a.n(C),O=a(72),S=a.n(O),P=a(71),N=a.n(P),B=a(75),H=a.n(B),I=a(74),R=a.n(I),T=a(129),D=a.n(T),W=a(131),L=a.n(W),G=a(134),M=a.n(G),z=a(76),J=a.n(z),U=a(77),F=a.n(U),K=a(78),X=a.n(K),$=a(132),q=a.n($),A=a(133),Q=a.n(A),V=a(73),Y=a.n(V),Z=a(53),_=a.n(Z),ee=a(55),te=a.n(ee),ae=a(15),ne=a.n(ae),re=a(54),ie=a.n(re),le=a(21),se=a.n(le),oe=a(23),ce=a.n(oe),me=function(e){function t(e){var a;return Object(s.a)(this,t),(a=Object(c.a)(this,Object(m.a)(t).call(this,e))).state={},a}return Object(h.a)(t,e),Object(o.a)(t,[{key:"render",value:function(){var e=this.props.classes;return r.a.createElement("div",{style:{display:"flex",justifyContent:"center",marginTop:"50px"}},r.a.createElement(ce.a,{className:e.root,style:{width:"50%"}},r.a.createElement(_.a,{className:e.table},r.a.createElement(ie.a,null),r.a.createElement(te.a,null,r.a.createElement(se.a,null,r.a.createElement(ne.a,null,"Image: "),r.a.createElement(ne.a,{align:"center"},r.a.createElement("img",{src:this.props.imageurl,alt:"new"}))),r.a.createElement(se.a,null,r.a.createElement(ne.a,null,"Name: "),r.a.createElement(ne.a,{align:"center"},this.props.name)),r.a.createElement(se.a,null,r.a.createElement(ne.a,null,"Base Experience: "),r.a.createElement(ne.a,{align:"center"},this.props.baseexp)),r.a.createElement(se.a,null,r.a.createElement(ne.a,null,"Height: "),r.a.createElement(ne.a,{align:"center"},this.props.height)),r.a.createElement(se.a,null,r.a.createElement(ne.a,null,"Order: "),r.a.createElement(ne.a,{align:"center"},this.props.order)),r.a.createElement(se.a,null,r.a.createElement(ne.a,null,"Weight: "),r.a.createElement(ne.a,{align:"center"},this.props.weight)),r.a.createElement(se.a,null,r.a.createElement(ne.a,null,"Types: "),r.a.createElement(ne.a,{align:"center"},this.props.types.join(", ")))))))}}]),t}(r.a.Component),he=Object(b.withStyles)({})(me),pe=function(e){function t(e){var a;return Object(s.a)(this,t),(a=Object(c.a)(this,Object(m.a)(t).call(this,e))).state={number:0},a}return Object(h.a)(t,e),Object(o.a)(t,[{key:"render",value:function(){var e=this.props.classes,t=[];return this.props.history&&(t=this.props.history.map(function(e,t){return r.a.createElement(se.a,null,r.a.createElement(ne.a,{align:"center"},r.a.createElement("img",{src:e.imageurl,alt:"new"})),r.a.createElement(ne.a,{align:"center"},e.name.toUpperCase()))})),r.a.createElement("div",{style:{display:"flex",justifyContent:"center",marginTop:"50px"}},r.a.createElement(ce.a,{className:e.root,style:{width:"50%"}},r.a.createElement("div",{style:{display:"flex",justifyContent:"center"}},r.a.createElement("h3",{style:{color:"gray",align:"center"}},"History")),r.a.createElement(_.a,{className:e.table},r.a.createElement(ie.a,null,r.a.createElement(ne.a,{align:"center"},"Image"),r.a.createElement(ne.a,{align:"center"},"Name")),r.a.createElement(te.a,null,t))))}}]),t}(r.a.Component),ue=Object(b.withStyles)()(pe),de=function(e){function t(e){var a;return Object(s.a)(this,t),(a=Object(c.a)(this,Object(m.a)(t).call(this,e))).handleDrawerOpen=function(){a.setState({open:!0})},a.handleDrawerClose=function(){a.setState({open:!1})},a.handleChange=function(e){var t=e.target.value.toLowerCase();a.setState({pokemonsearchname:t})},a.handleSubmit=function(e){Y.a.get("https://mega-pokedex.herokuapp.com/pokemon?token="+a.state.pokemonsearchname).then(function(e){var t=e.data,n=t.name.toUpperCase();a.setState({name:n}),a.setState({types:t.types}),a.setState({imageurl:t.imageurl}),a.setState({baseexp:t.baseexp}),a.setState({height:t.height}),a.setState({order:t.order}),a.setState({weight:t.weight}),a.setState({showPokeResult:!0}),a.setState({showpoketable:!0}),console.log(t)})},a.getHistory=function(e){Y.a.get("https://mega-pokedex.herokuapp.com/history").then(function(e){var t=e.data;a.setState({history:t}),console.log(t)})},a.handleClickPokedex=function(){a.setState({showPokeResult:!0})},a.handleClickHistory=function(){a.setState({showPokeResult:!1}),a.getHistory()},a.handleClickHistory=a.handleClickHistory.bind(Object(p.a)(Object(p.a)(a))),a.handleClickPokedex=a.handleClickPokedex.bind(Object(p.a)(Object(p.a)(a))),a.state={open:!0,pokemonsearchname:"",name:"",types:[],imageurl:"",baseexp:"",order:"",weight:"",showpoketable:!1,showPokeResult:!0,history:[]},a}return Object(h.a)(t,e),Object(o.a)(t,[{key:"componentDidMount",value:function(){console.log("Test")}},{key:"render",value:function(){var e=this,t=this.props.classes;return r.a.createElement("div",{className:t.root},r.a.createElement(y.a,null),r.a.createElement(x.a,{position:"absolute",className:E()(t.appBar,this.state.open&&t.appBarShift)},r.a.createElement(j.a,{disableGutters:!this.state.open,className:t.toolbar},r.a.createElement(R.a,{color:"inherit","aria-label":"Open drawer",onClick:this.handleDrawerOpen,className:E()(t.menuButton,this.state.open&&t.menuButtonHidden)},r.a.createElement(D.a,null)),r.a.createElement(N.a,{component:"h1",variant:"h6",color:"inherit",noWrap:!0,className:t.title},"Pokedex"))),r.a.createElement(k.a,{variant:"permanent",classes:{paper:E()(t.drawerPaper,!this.state.open&&t.drawerPaperClose)},open:this.state.open},r.a.createElement("div",{className:t.toolbarIcon},r.a.createElement(R.a,{onClick:this.handleDrawerClose},r.a.createElement(L.a,null))),r.a.createElement(H.a,null),r.a.createElement(S.a,null,r.a.createElement(J.a,{button:!0,onClick:this.handleClickPokedex},r.a.createElement(F.a,null,r.a.createElement(q.a,null)),r.a.createElement(X.a,{primary:"Pokedex"})),r.a.createElement(J.a,{button:!0,onClick:this.handleClickHistory},r.a.createElement(F.a,null,r.a.createElement(Q.a,null)),r.a.createElement(X.a,{primary:"History"}))),r.a.createElement(H.a,null)),r.a.createElement("main",{className:t.content},r.a.createElement("div",{className:t.appBarSpacer}),r.a.createElement(M.a,{id:"filled-name",label:"Search Pokemon by Name or Number",className:t.textField,value:this.state.pokemonsearchname,onChange:this.handleChange,fullWidth:!0,onKeyPress:function(t){"Enter"===t.key&&e.handleSubmit()},margin:"normal",variant:"filled"}),this.state.showPokeResult?r.a.createElement("div",null,this.state.showpoketable?r.a.createElement(he,{name:this.state.name,types:this.state.types,imageurl:this.state.imageurl,baseexp:this.state.baseexp,height:this.state.height,order:this.state.order,weight:this.state.weight}):null):r.a.createElement(ue,{history:this.state.history})))}}]),t}(r.a.Component),ge=Object(b.withStyles)(function(e){return{root:{display:"flex"},toolbar:{paddingRight:24},toolbarIcon:Object(d.a)({display:"flex",alignItems:"center",justifyContent:"flex-end",padding:"0 8px"},e.mixins.toolbar),appBar:{zIndex:e.zIndex.drawer+1,transition:e.transitions.create(["width","margin"],{easing:e.transitions.easing.sharp,duration:e.transitions.duration.leavingScreen})},appBarShift:{marginLeft:240,width:"calc(100% - ".concat(240,"px)"),transition:e.transitions.create(["width","margin"],{easing:e.transitions.easing.sharp,duration:e.transitions.duration.enteringScreen})},menuButton:{marginLeft:12,marginRight:36},menuButtonHidden:{display:"none"},title:{flexGrow:1},drawerPaper:{position:"relative",whiteSpace:"nowrap",width:240,transition:e.transitions.create("width",{easing:e.transitions.easing.sharp,duration:e.transitions.duration.enteringScreen})},drawerPaperClose:Object(u.a)({overflowX:"hidden",transition:e.transitions.create("width",{easing:e.transitions.easing.sharp,duration:e.transitions.duration.leavingScreen}),width:7*e.spacing.unit},e.breakpoints.up("sm"),{width:9*e.spacing.unit}),appBarSpacer:e.mixins.toolbar,content:{flexGrow:1,padding:3*e.spacing.unit,height:"100vh",overflow:"auto"},chartContainer:{marginLeft:-22},tableContainer:{height:320},h5:{marginBottom:2*e.spacing.unit}}})(de),Ee=a(79),be=Object(b.createMuiTheme)({palette:{primary:Ee.deepOrange,secondary:Ee.lightBlack}});var we=function(){return r.a.createElement(b.MuiThemeProvider,{theme:be},r.a.createElement(ge,null))};Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));l.a.render(r.a.createElement(we,null),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then(function(e){e.unregister()})}},[[135,2,1]]]);
//# sourceMappingURL=main.b489d224.chunk.js.map