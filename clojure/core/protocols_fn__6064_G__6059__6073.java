package clojure.core;

import clojure.lang.*;

public final class protocols_fn__6064_G__6059__6073 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-cache-protocol-fn");
  const__1 = (java.lang.Object)clojure.core.protocols.InternalReduce.class;
 }
 Object G__60602;
 public protocols_fn__6064_G__6059__6073(final Object G__60602) {
  super();
  this.G__60602 = G__60602;
 }
 public java.lang.Object invoke(java.lang.Object gf__seq__60701, java.lang.Object gf__f__60712, java.lang.Object gf__start__60723) {
  {
   Object cache__5922__auto__4 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__5 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__4).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__seq__60701))))));
   Object __r3846 = f__5923__auto__5;
   if (__r3846 != null && !(__r3846 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__5).invoke(gf__seq__60701, gf__f__60712, gf__start__60723);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__seq__60701, const__1, this.G__60602)).invoke(gf__seq__60701, gf__f__60712, gf__start__60723);
   }
  }
 }
}
