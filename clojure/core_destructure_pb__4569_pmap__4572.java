package clojure;

import clojure.lang.*;

public final class core_destructure_pb__4569_pmap__4572 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.IPersistentMap const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Keyword const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Var const__27;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.ISeq");
  const__4 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "clojure.lang.ISeq"));
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "or");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__10 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "seq?");
  const__12 = (clojure.lang.Symbol)Symbol.intern("clojure.lang.PersistentHashMap", "create");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "seq");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "dissoc");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "as");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "keys");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "strs");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__20 = (clojure.lang.Keyword)Keyword.intern(null, "syms");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "key");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "val");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__25 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "get");
  const__26 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "get");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 Object pb0;
 public core_destructure_pb__4569_pmap__4572(final Object pb0) {
  super();
  this.pb0 = pb0;
 }
 public java.lang.Object invoke(java.lang.Object bvec1, java.lang.Object b2, java.lang.Object v3) {
  {
   Object gmap4 = ((IFn)const__0.getRawRoot()).invoke("map__");
   Object gmapseq5 = ((IFn)const__1.getRawRoot()).invoke(gmap4, const__4);
   Object defaults6 = RT.get(b2, Keyword.intern(null, "or"));
   {
    Object ret7 = ((IFn)new clojure.core_destructure_pb__4569_pmap__4572_fn__4573(gmap4, b2)).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(bvec1, gmap4), v3), gmap4), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__11), ((IFn)const__9.getRawRoot()).invoke(gmap4)))), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__12), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__13), ((IFn)const__9.getRawRoot()).invoke(gmapseq5))))))), ((IFn)const__9.getRawRoot()).invoke(gmap4)))));
    Object bes8 = ((IFn)const__14.getRawRoot()).invoke(new clojure.core_destructure_pb__4569_pmap__4572_fn__4575(), ((IFn)const__15.getRawRoot()).invoke(b2, const__16, const__5), RT.mapUniqueKeys(const__17, new clojure.core_destructure_pb__4569_pmap__4572_fn__4579(), const__18, const__19.getRawRoot(), const__20, new clojure.core_destructure_pb__4569_pmap__4572_fn__4581()));
    while(true) {
     Object __r2799 = ((IFn)const__7.getRawRoot()).invoke(bes8);
     if (__r2799 != null && !(__r2799 == Boolean.FALSE)) {
      {
       Object bb9 = ((IFn)const__21.getRawRoot()).invoke(((IFn)const__22.getRawRoot()).invoke(bes8));
       Object bk10 = ((IFn)const__23.getRawRoot()).invoke(((IFn)const__22.getRawRoot()).invoke(bes8));
       Object has_default11 = ((IFn)const__24.getRawRoot()).invoke(defaults6, bb9);
       Object __r2800;
       Object __r2801 = has_default11;
       if (__r2801 != null && !(__r2801 == Boolean.FALSE)) {
        __r2800 = ((IFn)const__9.getRawRoot()).invoke(const__25, gmap4, bk10, ((IFn)defaults6).invoke(bb9));
       } else {
        __r2800 = ((IFn)const__9.getRawRoot()).invoke(const__26, gmap4, bk10);
       }
       java.lang.Object ret7___aux = ((IFn)this.pb0).invoke(ret7, bb9, __r2800);
       java.lang.Object bes8___aux = ((IFn)const__27.getRawRoot()).invoke(bes8);
       ret7 = ret7___aux;
       bes8 = bes8___aux;
       continue;
      }
     } else {
      return ret7;
     }
    }
   }
  }
 }
}
