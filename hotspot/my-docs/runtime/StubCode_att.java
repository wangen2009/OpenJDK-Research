ICache::flush_icache_stub [0x01dc0040, 0x01dc004a[ (10 bytes)
Loaded disassembler from D:\JavaSE1.8\jre\bin\hotspot\hsdis-i386.dll
[Disassembling for mach='i386']
  0x01dc0040: lock addl $0x0,(%esp)
  0x01dc0045: mov    0xc(%esp),%eax
  0x01dc0049: ret    

VM_Version::getPsrInfo_stub [0x01dc00c0, 0x01dc0286[ (454 bytes)
  0x01dc00c0: push   %ebp
  0x01dc00c1: mov    0x8(%esp),%ebp
  0x01dc00c5: push   %ebx
  0x01dc00c6: push   %esi
  0x01dc00c7: pushf  
  0x01dc00c8: pop    %eax
  0x01dc00c9: push   %eax
  0x01dc00ca: mov    %eax,%ecx
  0x01dc00cc: xor    $0x40000,%eax
  0x01dc00d2: push   %eax
  0x01dc00d3: popf   
  0x01dc00d4: pushf  
  0x01dc00d5: pop    %eax
  0x01dc00d6: cmp    %ecx,%eax
  0x01dc00d8: jne    0x01dc00e7
  0x01dc00da: mov    $0x300,%eax
  0x01dc00df: mov    %eax,0x10(%ebp)
  0x01dc00e2: jmp    0x01dc0281
  0x01dc00e7: mov    %ecx,%eax
  0x01dc00e9: xor    $0x200000,%eax
  0x01dc00ef: push   %eax
  0x01dc00f0: popf   
  0x01dc00f1: pushf  
  0x01dc00f2: pop    %eax
  0x01dc00f3: cmp    %eax,%ecx
  0x01dc00f5: jne    0x01dc0104
  0x01dc00f7: mov    $0x400,%eax
  0x01dc00fc: mov    %eax,0x10(%ebp)
  0x01dc00ff: jmp    0x01dc0281
  0x01dc0104: xor    %eax,%eax
  0x01dc0106: cpuid  
  0x01dc0108: or     %eax,%eax
  0x01dc010a: je     0x01dc00f7
  0x01dc010c: lea    0x0(%ebp),%esi
  0x01dc010f: mov    %eax,(%esi)
  0x01dc0111: mov    %ebx,0x4(%esi)
  0x01dc0114: mov    %ecx,0x8(%esi)
  0x01dc0117: mov    %edx,0xc(%esi)
  0x01dc011a: cmp    $0xa,%eax
  0x01dc011d: jbe    0x01dc0188
  0x01dc011f: mov    $0xb,%eax
  0x01dc0124: xor    %ecx,%ecx
  0x01dc0126: cpuid  
  0x01dc0128: lea    0x40(%ebp),%esi
  0x01dc012b: mov    %eax,(%esi)
  0x01dc012d: mov    %ebx,0x4(%esi)
  0x01dc0130: mov    %ecx,0x8(%esi)
  0x01dc0133: mov    %edx,0xc(%esi)
  0x01dc0136: mov    $0xb,%eax
  0x01dc013b: mov    $0x1,%ecx
  0x01dc0140: cpuid  
  0x01dc0142: push   %eax
  0x01dc0143: and    $0x1f,%eax
  0x01dc0146: or     %ebx,%eax
  0x01dc0148: and    $0xffff,%eax
  0x01dc014e: pop    %eax
  0x01dc014f: je     0x01dc0188
  0x01dc0151: lea    0x50(%ebp),%esi
  0x01dc0154: mov    %eax,(%esi)
  0x01dc0156: mov    %ebx,0x4(%esi)
  0x01dc0159: mov    %ecx,0x8(%esi)
  0x01dc015c: mov    %edx,0xc(%esi)
  0x01dc015f: mov    $0xb,%eax
  0x01dc0164: mov    $0x2,%ecx
  0x01dc0169: cpuid  
  0x01dc016b: push   %eax
  0x01dc016c: and    $0x1f,%eax
  0x01dc016f: or     %ebx,%eax
  0x01dc0171: and    $0xffff,%eax
  0x01dc0177: pop    %eax
  0x01dc0178: je     0x01dc0188
  0x01dc017a: lea    0x60(%ebp),%esi
  0x01dc017d: mov    %eax,(%esi)
  0x01dc017f: mov    %ebx,0x4(%esi)
  0x01dc0182: mov    %ecx,0x8(%esi)
  0x01dc0185: mov    %edx,0xc(%esi)
  0x01dc0188: mov    $0x4,%eax
  0x01dc018d: cmp    0x0(%ebp),%eax
  0x01dc0190: jg     0x01dc01ad
  0x01dc0192: xor    %ecx,%ecx
  0x01dc0194: cpuid  
  0x01dc0196: push   %eax
  0x01dc0197: and    $0x1f,%eax
  0x01dc019a: or     %eax,%eax
  0x01dc019c: pop    %eax
  0x01dc019d: je     0x01dc01ad
  0x01dc019f: lea    0x20(%ebp),%esi
  0x01dc01a2: mov    %eax,(%esi)
  0x01dc01a4: mov    %ebx,0x4(%esi)
  0x01dc01a7: mov    %ecx,0x8(%esi)
  0x01dc01aa: mov    %edx,0xc(%esi)
  0x01dc01ad: mov    $0x1,%eax
  0x01dc01b2: cpuid  
  0x01dc01b4: lea    0x10(%ebp),%esi
  0x01dc01b7: mov    %eax,(%esi)
  0x01dc01b9: mov    %ebx,0x4(%esi)
  0x01dc01bc: mov    %ecx,0x8(%esi)
  0x01dc01bf: mov    %edx,0xc(%esi)
  0x01dc01c2: and    $0x18000000,%ecx
  0x01dc01c8: cmp    $0x18000000,%ecx
  0x01dc01ce: jne    0x01dc01e0
  0x01dc01d0: xor    %ecx,%ecx
  0x01dc01d2: xgetbv 
  0x01dc01d5: lea    0xf0(%ebp),%esi
  0x01dc01db: mov    %eax,(%esi)
  0x01dc01dd: mov    %edx,0x4(%esi)
  0x01dc01e0: mov    $0x7,%eax
  0x01dc01e5: cmp    0x0(%ebp),%eax
  0x01dc01e8: jg     0x01dc01f6
  0x01dc01ea: xor    %ecx,%ecx
  0x01dc01ec: cpuid  
  0x01dc01ee: lea    0x30(%ebp),%esi
  0x01dc01f1: mov    %eax,(%esi)
  0x01dc01f3: mov    %ebx,0x4(%esi)
  0x01dc01f6: mov    $0x80000000,%eax
  0x01dc01fb: cpuid  
  0x01dc01fd: cmp    $0x80000000,%eax
  0x01dc0203: jbe    0x01dc0281
  0x01dc0209: cmp    $0x80000004,%eax
  0x01dc020f: jbe    0x01dc0269
  0x01dc0211: cmp    $0x80000006,%eax
  0x01dc0217: jbe    0x01dc0251
  0x01dc0219: cmp    $0x80000007,%eax
  0x01dc021f: jbe    0x01dc0239
  0x01dc0221: mov    $0x80000008,%eax
  0x01dc0226: cpuid  
  0x01dc0228: lea    0xe0(%ebp),%esi
  0x01dc022e: mov    %eax,(%esi)
  0x01dc0230: mov    %ebx,0x4(%esi)
  0x01dc0233: mov    %ecx,0x8(%esi)
  0x01dc0236: mov    %edx,0xc(%esi)
  0x01dc0239: mov    $0x80000007,%eax
  0x01dc023e: cpuid  
  0x01dc0240: lea    0xd0(%ebp),%esi
  0x01dc0246: mov    %eax,(%esi)
  0x01dc0248: mov    %ebx,0x4(%esi)
  0x01dc024b: mov    %ecx,0x8(%esi)
  0x01dc024e: mov    %edx,0xc(%esi)
  0x01dc0251: mov    $0x80000005,%eax
  0x01dc0256: cpuid  
  0x01dc0258: lea    0xc0(%ebp),%esi
  0x01dc025e: mov    %eax,(%esi)
  0x01dc0260: mov    %ebx,0x4(%esi)
  0x01dc0263: mov    %ecx,0x8(%esi)
  0x01dc0266: mov    %edx,0xc(%esi)
  0x01dc0269: mov    $0x80000001,%eax
  0x01dc026e: cpuid  
  0x01dc0270: lea    0x80(%ebp),%esi
  0x01dc0276: mov    %eax,(%esi)
  0x01dc0278: mov    %ebx,0x4(%esi)
  0x01dc027b: mov    %ecx,0x8(%esi)
  0x01dc027e: mov    %edx,0xc(%esi)
  0x01dc0281: popf   
  0x01dc0282: pop    %esi
  0x01dc0283: pop    %ebx
  0x01dc0284: pop    %ebp
  0x01dc0285: ret    

Decoding RuntimeStub - StackOverflowError throw_exception 0x01dc2848
  0x01dc2890: mov    %fs:0x0(,%eiz,1),%ebx
  0x01dc2898: mov    -0xc(%ebx),%ebx
  0x01dc289b: push   %ebp
  0x01dc289c: mov    %esp,%ebp
  0x01dc289e: sub    $0xc,%esp
  0x01dc28a1: mov    %ebx,(%esp)
  0x01dc28a4: mov    %ebp,0x144(%ebx)
  0x01dc28aa: mov    %esp,0x13c(%ebx)
  ;; call runtime_entry
  0x01dc28b0: call   0x55be4600
  0x01dc28b5: mov    %fs:0x0(,%eiz,1),%ebx
  0x01dc28bd: mov    -0xc(%ebx),%ebx
  0x01dc28c0: movl   $0x0,0x13c(%ebx)
  0x01dc28ca: movl   $0x0,0x144(%ebx)
  0x01dc28d4: mov    %ebp,%esp
  0x01dc28d6: pop    %ebp
  0x01dc28d7: cmpl   $0x0,0x4(%ebx)
  0x01dc28de: jne    0x01dc28f5
  0x01dc28e4: push   $0x55ccd97c
  0x01dc28e9: call   0x01dc28ee
  0x01dc28ee: pusha  
  0x01dc28ef: call   0x557bdbf0
  0x01dc28f4: hlt    
  0x01dc28f5: jmp    0x01dc0340
  0x01dc28fa: hlt    
  0x01dc28fb: hlt    

StubRoutines::forward exception [0x01dc0340, 0x01dc03b4[ (116 bytes)
  0x01dc0340: mov    %fs:0x0(,%eiz,1),%ecx
  0x01dc0348: mov    -0xc(%ecx),%ecx
  0x01dc034b: cmpl   $0x0,0x4(%ecx)
  0x01dc0352: jne    0x01dc0369
  0x01dc0358: push   $0x55ce7ef8
  0x01dc035d: call   0x01dc0362
  0x01dc0362: pusha  
  0x01dc0363: call   0x557bdbf0
  0x01dc0368: hlt    
  0x01dc0369: mov    %fs:0x0(,%eiz,1),%ecx
  0x01dc0371: mov    -0xc(%ecx),%ecx
  0x01dc0374: mov    (%esp),%edx
  ;; call exception_handler_for_return_address
  0x01dc0377: push   %edx
  0x01dc0378: push   %ecx
  0x01dc0379: call   0x55be3a10
  0x01dc037e: add    $0x8,%esp
  0x01dc0381: mov    %eax,%ebx
  0x01dc0383: mov    %fs:0x0(,%eiz,1),%ecx
  0x01dc038b: mov    -0xc(%ecx),%ecx
  0x01dc038e: pop    %edx
  0x01dc038f: mov    0x4(%ecx),%eax
  0x01dc0392: movl   $0x0,0x4(%ecx)
  0x01dc0399: test   %eax,%eax
  0x01dc039b: jne    0x01dc03b2
  0x01dc03a1: push   $0x55ce7f60
  0x01dc03a6: call   0x01dc03ab
  0x01dc03ab: pusha  
  0x01dc03ac: call   0x557bdbf0
  0x01dc03b1: hlt    
  0x01dc03b2: jmp    *%ebx

StubRoutines::call_stub [0x01dc03b4, 0x01dc0485[ (209 bytes)
  0x01dc03b4: push   %ebp
  0x01dc03b5: mov    %esp,%ebp
  0x01dc03b7: mov    0x20(%ebp),%ecx
  0x01dc03ba: shl    $0x2,%ecx
  0x01dc03bd: add    $0x10,%ecx
  0x01dc03c0: sub    %ecx,%esp
  0x01dc03c2: and    $0xfffffff0,%esp
  0x01dc03c5: mov    %edi,-0x4(%ebp)
  0x01dc03c8: mov    %esi,-0x8(%ebp)
  0x01dc03cb: mov    %ebx,-0xc(%ebp)
  0x01dc03ce: stmxcsr -0x10(%ebp)
  0x01dc03d2: mov    -0x10(%ebp),%eax
  0x01dc03d5: and    $0xffc0,%eax
  0x01dc03db: cmp    0x56005778,%eax
  0x01dc03e1: je     0x01dc03ee
  0x01dc03e7: ldmxcsr 0x56005778
  0x01dc03ee: fldcw  0x56005768
  0x01dc03f4: mov    0x24(%ebp),%ecx
  0x01dc03f7: cmpl   $0x0,0x4(%ecx)
  0x01dc03fe: je     0x01dc0415
  0x01dc0404: push   $0x55ce7d38
  0x01dc0409: call   0x01dc040e
  0x01dc040e: pusha  
  0x01dc040f: call   0x557bdbf0
  0x01dc0414: hlt    
  ;; pass parameters if any
  0x01dc0415: mov    0x20(%ebp),%ecx
  0x01dc0418: test   %ecx,%ecx
  0x01dc041a: je     0x01dc0430
  0x01dc0420: mov    0x1c(%ebp),%edx
  0x01dc0423: xor    %ebx,%ebx
  ;; loop:
  0x01dc0425: mov    -0x4(%edx,%ecx,4),%eax
  0x01dc0429: mov    %eax,(%esp,%ebx,4)
  0x01dc042c: inc    %ebx
  0x01dc042d: dec    %ecx
  0x01dc042e: jne    0x01dc0425
  ;; parameters_done:
  0x01dc0430: mov    0x14(%ebp),%ebx
  0x01dc0433: mov    0x18(%ebp),%eax
  0x01dc0436: mov    %esp,%esi
  ;; call Java function
  0x01dc0438: call   *%eax
  ;; call_stub_return_address:
  0x01dc043a: mov    0xc(%ebp),%edi
  0x01dc043d: mov    0x10(%ebp),%esi
  0x01dc0440: cmp    $0xb,%esi
  0x01dc0443: je     0x01dc0472
  0x01dc0449: cmp    $0x6,%esi
  0x01dc044c: je     0x01dc0479
  0x01dc0452: cmp    $0x7,%esi
  0x01dc0455: je     0x01dc047f
  0x01dc045b: mov    %eax,(%edi)
  ;; exit:
  0x01dc045d: lea    -0x10(%ebp),%esp
  0x01dc0460: ldmxcsr -0x10(%ebp)
  0x01dc0464: mov    -0xc(%ebp),%ebx
  0x01dc0467: mov    -0x8(%ebp),%esi
  0x01dc046a: mov    -0x4(%ebp),%edi
  0x01dc046d: add    $0x10,%esp
  0x01dc0470: pop    %ebp
  0x01dc0471: ret    
  ;; is_long:
  0x01dc0472: mov    %eax,(%edi)
  0x01dc0474: mov    %edx,0x4(%edi)
  0x01dc0477: jmp    0x01dc045d
  ;; is_float:
  0x01dc0479: movss  %xmm0,(%edi)
  0x01dc047d: jmp    0x01dc045d
  ;; is_double:
  0x01dc047f: movsd  %xmm0,(%edi)
  0x01dc0483: jmp    0x01dc045d

StubRoutines::catch_exception [0x01dc0485, 0x01dc04c2[ (61 bytes)
  0x01dc0485: mov    0x24(%ebp),%ecx
  0x01dc0488: mov    %fs:0x0(,%eiz,1),%ebx
  0x01dc0490: mov    -0xc(%ebx),%ebx
  0x01dc0493: cmp    %ecx,%ebx
  0x01dc0495: je     0x01dc04ac
  0x01dc049b: push   $0x55ce7e24
  0x01dc04a0: call   0x01dc04a5
  0x01dc04a5: pusha  
  0x01dc04a6: call   0x557bdbf0
  0x01dc04ab: hlt    
  0x01dc04ac: mov    %eax,0x4(%ecx)
  0x01dc04af: movl   $0x55ce7c9c,0x8(%ecx)
  0x01dc04b6: movl   $0x167,0xc(%ecx)
  0x01dc04bd: jmp    0x01dc043a

StubRoutines::atomic_xchg [0x01dc04c2, 0x01dc04cf[ (13 bytes)
  0x01dc04c2: push   %edx
  0x01dc04c3: mov    0x8(%esp),%eax
  0x01dc04c7: mov    0xc(%esp),%edx
  0x01dc04cb: xchg   %eax,(%edx)
  0x01dc04cd: pop    %edx
  0x01dc04ce: ret    

StubRoutines::handler_for_unsafe_access [0x01dc04cf, 0x01dc04e0[ (17 bytes)
  0x01dc04cf: push   $0x0
  0x01dc04d4: pusha  
  ;; call handle_unsafe_access
  0x01dc04d5: call   0x557d72b0
  0x01dc04da: mov    %eax,0x20(%esp)
  0x01dc04de: popa   
  0x01dc04df: ret    

StubRoutines::verify_mxcsr [0x01dc04e0, 0x01dc04e1[ (1 bytes)
  0x01dc04e0: ret    

StubRoutines::verify_spcw [0x01dc04e1, 0x01dc04e2[ (1 bytes)
  0x01dc04e1: ret    

StubRoutines::d2i_wrapper [0x01dc04e2, 0x01dc051a[ (56 bytes)
  0x01dc04e2: sub    $0x8,%esp
  0x01dc04e5: fstpl  (%esp)
  0x01dc04e8: push   %ebx
  0x01dc04e9: push   %ecx
  0x01dc04ea: push   %esi
  0x01dc04eb: push   %edi
  0x01dc04ec: push   %ebp
  0x01dc04ed: sub    $0x6c,%esp
  0x01dc04f0: fnsave (%esp)
  0x01dc04f3: fwait
  0x01dc04f4: fldl   0x80(%esp)
  0x01dc04fb: sub    $0x8,%esp
  0x01dc04fe: fstl   (%esp)
  0x01dc0501: emms   
  ;; SharedRuntime::d2i
  0x01dc0503: call   0x55be31d0
  0x01dc0508: add    $0x8,%esp
  0x01dc050b: frstor (%esp)
  0x01dc050e: add    $0x6c,%esp
  0x01dc0511: pop    %ebp
  0x01dc0512: pop    %edi
  0x01dc0513: pop    %esi
  0x01dc0514: pop    %ecx
  0x01dc0515: pop    %ebx
  0x01dc0516: add    $0x8,%esp
  0x01dc0519: ret    

StubRoutines::d2i_wrapper [0x01dc051a, 0x01dc0552[ (56 bytes)
  0x01dc051a: sub    $0x8,%esp
  0x01dc051d: fstpl  (%esp)
  0x01dc0520: push   %ebx
  0x01dc0521: push   %ecx
  0x01dc0522: push   %esi
  0x01dc0523: push   %edi
  0x01dc0524: push   %ebp
  0x01dc0525: sub    $0x6c,%esp
  0x01dc0528: fnsave (%esp)
  0x01dc052b: fwait
  0x01dc052c: fldl   0x80(%esp)
  0x01dc0533: sub    $0x8,%esp
  0x01dc0536: fstl   (%esp)
  0x01dc0539: emms   
  ;; SharedRuntime::d2l
  0x01dc053b: call   0x55be3340
  0x01dc0540: add    $0x8,%esp
  0x01dc0543: frstor (%esp)
  0x01dc0546: add    $0x6c,%esp
  0x01dc0549: pop    %ebp
  0x01dc054a: pop    %edi
  0x01dc054b: pop    %esi
  0x01dc054c: pop    %ecx
  0x01dc054d: pop    %ebx
  0x01dc054e: add    $0x8,%esp
  0x01dc0551: ret    

Decoding RuntimeStub - wrong_method_stub 0x01ea2e08
  0x01ea2e50: push   %ebp
  0x01ea2e51: mov    %esp,%ebp
  0x01ea2e53: pusha  
  0x01ea2e54: pushf  
  0x01ea2e55: sub    $0xc8,%esp
  0x01ea2e5b: sub    $0x6c,%esp
  0x01ea2e5e: fnsave (%esp)
  0x01ea2e61: fwait
  0x01ea2e62: cmpw   $0x27f,(%esp)
  0x01ea2e68: je     0x01ea2e7b
  0x01ea2e6a: push   $0x55ce69bc
  0x01ea2e6f: call   0x01ea2e74
  0x01ea2e74: pusha  
  0x01ea2e75: call   0x557bdbf0
  0x01ea2e7a: hlt    
  0x01ea2e7b: movw   $0x27f,(%esp)
  0x01ea2e81: frstor (%esp)
  0x01ea2e84: fstpl  0x70(%esp)
  0x01ea2e88: fstpl  0x78(%esp)
  0x01ea2e8c: fstpl  0x80(%esp)
  0x01ea2e93: fstpl  0x88(%esp)
  0x01ea2e9a: fstpl  0x90(%esp)
  0x01ea2ea1: fstpl  0x98(%esp)
  0x01ea2ea8: fstpl  0xa0(%esp)
  0x01ea2eaf: fstpl  0xa8(%esp)
  0x01ea2eb6: movdqu %xmm0,0xb0(%esp)
  0x01ea2ebf: movdqu %xmm1,0xc0(%esp)
  0x01ea2ec8: movdqu %xmm2,0xd0(%esp)
  0x01ea2ed1: movdqu %xmm3,0xe0(%esp)
  0x01ea2eda: movdqu %xmm4,0xf0(%esp)
  0x01ea2ee3: movdqu %xmm5,0x100(%esp)
  0x01ea2eec: movdqu %xmm6,0x110(%esp)
  0x01ea2ef5: movdqu %xmm7,0x120(%esp)
  0x01ea2efe: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea2f06: mov    -0xc(%edi),%edi
  0x01ea2f09: push   %edi
  0x01ea2f0a: mov    %ebp,0x144(%edi)
  0x01ea2f10: mov    %esp,0x13c(%edi)
  0x01ea2f16: call   0x55be8790
  0x01ea2f1b: add    $0x4,%esp
  0x01ea2f1e: movl   $0x0,0x13c(%edi)
  0x01ea2f28: movl   $0x0,0x144(%edi)
  0x01ea2f32: cmpl   $0x0,0x4(%edi)
  0x01ea2f39: jne    0x01ea2fb6
  0x01ea2f3f: mov    0x170(%edi),%ebx
  0x01ea2f45: movl   $0x0,0x170(%edi)
  0x01ea2f4f: mov    %ebx,0x148(%esp)
  0x01ea2f56: mov    %eax,0x154(%esp)
  0x01ea2f5d: movdqu 0xb0(%esp),%xmm0
  0x01ea2f66: movdqu 0xc0(%esp),%xmm1
  0x01ea2f6f: movdqu 0xd0(%esp),%xmm2
  0x01ea2f78: movdqu 0xe0(%esp),%xmm3
  0x01ea2f81: movdqu 0xf0(%esp),%xmm4
  0x01ea2f8a: movdqu 0x100(%esp),%xmm5
  0x01ea2f93: movdqu 0x110(%esp),%xmm6
  0x01ea2f9c: movdqu 0x120(%esp),%xmm7
  0x01ea2fa5: frstor (%esp)
  0x01ea2fa8: add    $0x6c,%esp
  0x01ea2fab: add    $0xc8,%esp
  0x01ea2fb1: popf   
  0x01ea2fb2: popa   
  0x01ea2fb3: pop    %ebp
  0x01ea2fb4: jmp    *%eax
  0x01ea2fb6: movdqu 0xb0(%esp),%xmm0
  0x01ea2fbf: movdqu 0xc0(%esp),%xmm1
  0x01ea2fc8: movdqu 0xd0(%esp),%xmm2
  0x01ea2fd1: movdqu 0xe0(%esp),%xmm3
  0x01ea2fda: movdqu 0xf0(%esp),%xmm4
  0x01ea2fe3: movdqu 0x100(%esp),%xmm5
  0x01ea2fec: movdqu 0x110(%esp),%xmm6
  0x01ea2ff5: movdqu 0x120(%esp),%xmm7
  0x01ea2ffe: frstor (%esp)
  0x01ea3001: add    $0x6c,%esp
  0x01ea3004: add    $0xc8,%esp
  0x01ea300a: popf   
  0x01ea300b: popa   
  0x01ea300c: pop    %ebp
  0x01ea300d: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3015: mov    -0xc(%edi),%edi
  0x01ea3018: movl   $0x0,0x16c(%edi)
  0x01ea3022: mov    0x4(%edi),%eax
  0x01ea3025: jmp    0x01dc0340
  0x01ea302a: hlt    
  0x01ea302b: hlt    

Decoding RuntimeStub - wrong_method_abstract_stub 0x01ea3048
  0x01ea3090: push   %ebp
  0x01ea3091: mov    %esp,%ebp
  0x01ea3093: pusha  
  0x01ea3094: pushf  
  0x01ea3095: sub    $0xc8,%esp
  0x01ea309b: sub    $0x6c,%esp
  0x01ea309e: fnsave (%esp)
  0x01ea30a1: fwait
  0x01ea30a2: cmpw   $0x27f,(%esp)
  0x01ea30a8: je     0x01ea30bb
  0x01ea30aa: push   $0x55ce69bc
  0x01ea30af: call   0x01ea30b4
  0x01ea30b4: pusha  
  0x01ea30b5: call   0x557bdbf0
  0x01ea30ba: hlt    
  0x01ea30bb: movw   $0x27f,(%esp)
  0x01ea30c1: frstor (%esp)
  0x01ea30c4: fstpl  0x70(%esp)
  0x01ea30c8: fstpl  0x78(%esp)
  0x01ea30cc: fstpl  0x80(%esp)
  0x01ea30d3: fstpl  0x88(%esp)
  0x01ea30da: fstpl  0x90(%esp)
  0x01ea30e1: fstpl  0x98(%esp)
  0x01ea30e8: fstpl  0xa0(%esp)
  0x01ea30ef: fstpl  0xa8(%esp)
  0x01ea30f6: movdqu %xmm0,0xb0(%esp)
  0x01ea30ff: movdqu %xmm1,0xc0(%esp)
  0x01ea3108: movdqu %xmm2,0xd0(%esp)
  0x01ea3111: movdqu %xmm3,0xe0(%esp)
  0x01ea311a: movdqu %xmm4,0xf0(%esp)
  0x01ea3123: movdqu %xmm5,0x100(%esp)
  0x01ea312c: movdqu %xmm6,0x110(%esp)
  0x01ea3135: movdqu %xmm7,0x120(%esp)
  0x01ea313e: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3146: mov    -0xc(%edi),%edi
  0x01ea3149: push   %edi
  0x01ea314a: mov    %ebp,0x144(%edi)
  0x01ea3150: mov    %esp,0x13c(%edi)
  0x01ea3156: call   0x55be8a40
  0x01ea315b: add    $0x4,%esp
  0x01ea315e: movl   $0x0,0x13c(%edi)
  0x01ea3168: movl   $0x0,0x144(%edi)
  0x01ea3172: cmpl   $0x0,0x4(%edi)
  0x01ea3179: jne    0x01ea31f6
  0x01ea317f: mov    0x170(%edi),%ebx
  0x01ea3185: movl   $0x0,0x170(%edi)
  0x01ea318f: mov    %ebx,0x148(%esp)
  0x01ea3196: mov    %eax,0x154(%esp)
  0x01ea319d: movdqu 0xb0(%esp),%xmm0
  0x01ea31a6: movdqu 0xc0(%esp),%xmm1
  0x01ea31af: movdqu 0xd0(%esp),%xmm2
  0x01ea31b8: movdqu 0xe0(%esp),%xmm3
  0x01ea31c1: movdqu 0xf0(%esp),%xmm4
  0x01ea31ca: movdqu 0x100(%esp),%xmm5
  0x01ea31d3: movdqu 0x110(%esp),%xmm6
  0x01ea31dc: movdqu 0x120(%esp),%xmm7
  0x01ea31e5: frstor (%esp)
  0x01ea31e8: add    $0x6c,%esp
  0x01ea31eb: add    $0xc8,%esp
  0x01ea31f1: popf   
  0x01ea31f2: popa   
  0x01ea31f3: pop    %ebp
  0x01ea31f4: jmp    *%eax
  0x01ea31f6: movdqu 0xb0(%esp),%xmm0
  0x01ea31ff: movdqu 0xc0(%esp),%xmm1
  0x01ea3208: movdqu 0xd0(%esp),%xmm2
  0x01ea3211: movdqu 0xe0(%esp),%xmm3
  0x01ea321a: movdqu 0xf0(%esp),%xmm4
  0x01ea3223: movdqu 0x100(%esp),%xmm5
  0x01ea322c: movdqu 0x110(%esp),%xmm6
  0x01ea3235: movdqu 0x120(%esp),%xmm7
  0x01ea323e: frstor (%esp)
  0x01ea3241: add    $0x6c,%esp
  0x01ea3244: add    $0xc8,%esp
  0x01ea324a: popf   
  0x01ea324b: popa   
  0x01ea324c: pop    %ebp
  0x01ea324d: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3255: mov    -0xc(%edi),%edi
  0x01ea3258: movl   $0x0,0x16c(%edi)
  0x01ea3262: mov    0x4(%edi),%eax
  0x01ea3265: jmp    0x01dc0340
  0x01ea326a: hlt    
  0x01ea326b: hlt    

Decoding RuntimeStub - ic_miss_stub 0x01ea3288
  0x01ea32d0: push   %ebp
  0x01ea32d1: mov    %esp,%ebp
  0x01ea32d3: pusha  
  0x01ea32d4: pushf  
  0x01ea32d5: sub    $0xc8,%esp
  0x01ea32db: sub    $0x6c,%esp
  0x01ea32de: fnsave (%esp)
  0x01ea32e1: fwait
  0x01ea32e2: cmpw   $0x27f,(%esp)
  0x01ea32e8: je     0x01ea32fb
  0x01ea32ea: push   $0x55ce69bc
  0x01ea32ef: call   0x01ea32f4
  0x01ea32f4: pusha  
  0x01ea32f5: call   0x557bdbf0
  0x01ea32fa: hlt    
  0x01ea32fb: movw   $0x27f,(%esp)
  0x01ea3301: frstor (%esp)
  0x01ea3304: fstpl  0x70(%esp)
  0x01ea3308: fstpl  0x78(%esp)
  0x01ea330c: fstpl  0x80(%esp)
  0x01ea3313: fstpl  0x88(%esp)
  0x01ea331a: fstpl  0x90(%esp)
  0x01ea3321: fstpl  0x98(%esp)
  0x01ea3328: fstpl  0xa0(%esp)
  0x01ea332f: fstpl  0xa8(%esp)
  0x01ea3336: movdqu %xmm0,0xb0(%esp)
  0x01ea333f: movdqu %xmm1,0xc0(%esp)
  0x01ea3348: movdqu %xmm2,0xd0(%esp)
  0x01ea3351: movdqu %xmm3,0xe0(%esp)
  0x01ea335a: movdqu %xmm4,0xf0(%esp)
  0x01ea3363: movdqu %xmm5,0x100(%esp)
  0x01ea336c: movdqu %xmm6,0x110(%esp)
  0x01ea3375: movdqu %xmm7,0x120(%esp)
  0x01ea337e: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3386: mov    -0xc(%edi),%edi
  0x01ea3389: push   %edi
  0x01ea338a: mov    %ebp,0x144(%edi)
  0x01ea3390: mov    %esp,0x13c(%edi)
  0x01ea3396: call   0x55be8b10
  0x01ea339b: add    $0x4,%esp
  0x01ea339e: movl   $0x0,0x13c(%edi)
  0x01ea33a8: movl   $0x0,0x144(%edi)
  0x01ea33b2: cmpl   $0x0,0x4(%edi)
  0x01ea33b9: jne    0x01ea3436
  0x01ea33bf: mov    0x170(%edi),%ebx
  0x01ea33c5: movl   $0x0,0x170(%edi)
  0x01ea33cf: mov    %ebx,0x148(%esp)
  0x01ea33d6: mov    %eax,0x154(%esp)
  0x01ea33dd: movdqu 0xb0(%esp),%xmm0
  0x01ea33e6: movdqu 0xc0(%esp),%xmm1
  0x01ea33ef: movdqu 0xd0(%esp),%xmm2
  0x01ea33f8: movdqu 0xe0(%esp),%xmm3
  0x01ea3401: movdqu 0xf0(%esp),%xmm4
  0x01ea340a: movdqu 0x100(%esp),%xmm5
  0x01ea3413: movdqu 0x110(%esp),%xmm6
  0x01ea341c: movdqu 0x120(%esp),%xmm7
  0x01ea3425: frstor (%esp)
  0x01ea3428: add    $0x6c,%esp
  0x01ea342b: add    $0xc8,%esp
  0x01ea3431: popf   
  0x01ea3432: popa   
  0x01ea3433: pop    %ebp
  0x01ea3434: jmp    *%eax
  0x01ea3436: movdqu 0xb0(%esp),%xmm0
  0x01ea343f: movdqu 0xc0(%esp),%xmm1
  0x01ea3448: movdqu 0xd0(%esp),%xmm2
  0x01ea3451: movdqu 0xe0(%esp),%xmm3
  0x01ea345a: movdqu 0xf0(%esp),%xmm4
  0x01ea3463: movdqu 0x100(%esp),%xmm5
  0x01ea346c: movdqu 0x110(%esp),%xmm6
  0x01ea3475: movdqu 0x120(%esp),%xmm7
  0x01ea347e: frstor (%esp)
  0x01ea3481: add    $0x6c,%esp
  0x01ea3484: add    $0xc8,%esp
  0x01ea348a: popf   
  0x01ea348b: popa   
  0x01ea348c: pop    %ebp
  0x01ea348d: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3495: mov    -0xc(%edi),%edi
  0x01ea3498: movl   $0x0,0x16c(%edi)
  0x01ea34a2: mov    0x4(%edi),%eax
  0x01ea34a5: jmp    0x01dc0340
  0x01ea34aa: hlt    
  0x01ea34ab: hlt    

Decoding RuntimeStub - resolve_opt_virtual_call 0x01ea34c8
  0x01ea3510: push   %ebp
  0x01ea3511: mov    %esp,%ebp
  0x01ea3513: pusha  
  0x01ea3514: pushf  
  0x01ea3515: sub    $0xc8,%esp
  0x01ea351b: sub    $0x6c,%esp
  0x01ea351e: fnsave (%esp)
  0x01ea3521: fwait
  0x01ea3522: cmpw   $0x27f,(%esp)
  0x01ea3528: je     0x01ea353b
  0x01ea352a: push   $0x55ce69bc
  0x01ea352f: call   0x01ea3534
  0x01ea3534: pusha  
  0x01ea3535: call   0x557bdbf0
  0x01ea353a: hlt    
  0x01ea353b: movw   $0x27f,(%esp)
  0x01ea3541: frstor (%esp)
  0x01ea3544: fstpl  0x70(%esp)
  0x01ea3548: fstpl  0x78(%esp)
  0x01ea354c: fstpl  0x80(%esp)
  0x01ea3553: fstpl  0x88(%esp)
  0x01ea355a: fstpl  0x90(%esp)
  0x01ea3561: fstpl  0x98(%esp)
  0x01ea3568: fstpl  0xa0(%esp)
  0x01ea356f: fstpl  0xa8(%esp)
  0x01ea3576: movdqu %xmm0,0xb0(%esp)
  0x01ea357f: movdqu %xmm1,0xc0(%esp)
  0x01ea3588: movdqu %xmm2,0xd0(%esp)
  0x01ea3591: movdqu %xmm3,0xe0(%esp)
  0x01ea359a: movdqu %xmm4,0xf0(%esp)
  0x01ea35a3: movdqu %xmm5,0x100(%esp)
  0x01ea35ac: movdqu %xmm6,0x110(%esp)
  0x01ea35b5: movdqu %xmm7,0x120(%esp)
  0x01ea35be: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea35c6: mov    -0xc(%edi),%edi
  0x01ea35c9: push   %edi
  0x01ea35ca: mov    %ebp,0x144(%edi)
  0x01ea35d0: mov    %esp,0x13c(%edi)
  0x01ea35d6: call   0x55be8450
  0x01ea35db: add    $0x4,%esp
  0x01ea35de: movl   $0x0,0x13c(%edi)
  0x01ea35e8: movl   $0x0,0x144(%edi)
  0x01ea35f2: cmpl   $0x0,0x4(%edi)
  0x01ea35f9: jne    0x01ea3676
  0x01ea35ff: mov    0x170(%edi),%ebx
  0x01ea3605: movl   $0x0,0x170(%edi)
  0x01ea360f: mov    %ebx,0x148(%esp)
  0x01ea3616: mov    %eax,0x154(%esp)
  0x01ea361d: movdqu 0xb0(%esp),%xmm0
  0x01ea3626: movdqu 0xc0(%esp),%xmm1
  0x01ea362f: movdqu 0xd0(%esp),%xmm2
  0x01ea3638: movdqu 0xe0(%esp),%xmm3
  0x01ea3641: movdqu 0xf0(%esp),%xmm4
  0x01ea364a: movdqu 0x100(%esp),%xmm5
  0x01ea3653: movdqu 0x110(%esp),%xmm6
  0x01ea365c: movdqu 0x120(%esp),%xmm7
  0x01ea3665: frstor (%esp)
  0x01ea3668: add    $0x6c,%esp
  0x01ea366b: add    $0xc8,%esp
  0x01ea3671: popf   
  0x01ea3672: popa   
  0x01ea3673: pop    %ebp
  0x01ea3674: jmp    *%eax
  0x01ea3676: movdqu 0xb0(%esp),%xmm0
  0x01ea367f: movdqu 0xc0(%esp),%xmm1
  0x01ea3688: movdqu 0xd0(%esp),%xmm2
  0x01ea3691: movdqu 0xe0(%esp),%xmm3
  0x01ea369a: movdqu 0xf0(%esp),%xmm4
  0x01ea36a3: movdqu 0x100(%esp),%xmm5
  0x01ea36ac: movdqu 0x110(%esp),%xmm6
  0x01ea36b5: movdqu 0x120(%esp),%xmm7
  0x01ea36be: frstor (%esp)
  0x01ea36c1: add    $0x6c,%esp
  0x01ea36c4: add    $0xc8,%esp
  0x01ea36ca: popf   
  0x01ea36cb: popa   
  0x01ea36cc: pop    %ebp
  0x01ea36cd: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea36d5: mov    -0xc(%edi),%edi
  0x01ea36d8: movl   $0x0,0x16c(%edi)
  0x01ea36e2: mov    0x4(%edi),%eax
  0x01ea36e5: jmp    0x01dc0340
  0x01ea36ea: hlt    
  0x01ea36eb: hlt    

Decoding RuntimeStub - resolve_virtual_call 0x01ea3708
  0x01ea3750: push   %ebp
  0x01ea3751: mov    %esp,%ebp
  0x01ea3753: pusha  
  0x01ea3754: pushf  
  0x01ea3755: sub    $0xc8,%esp
  0x01ea375b: sub    $0x6c,%esp
  0x01ea375e: fnsave (%esp)
  0x01ea3761: fwait
  0x01ea3762: cmpw   $0x27f,(%esp)
  0x01ea3768: je     0x01ea377b
  0x01ea376a: push   $0x55ce69bc
  0x01ea376f: call   0x01ea3774
  0x01ea3774: pusha  
  0x01ea3775: call   0x557bdbf0
  0x01ea377a: hlt    
  0x01ea377b: movw   $0x27f,(%esp)
  0x01ea3781: frstor (%esp)
  0x01ea3784: fstpl  0x70(%esp)
  0x01ea3788: fstpl  0x78(%esp)
  0x01ea378c: fstpl  0x80(%esp)
  0x01ea3793: fstpl  0x88(%esp)
  0x01ea379a: fstpl  0x90(%esp)
  0x01ea37a1: fstpl  0x98(%esp)
  0x01ea37a8: fstpl  0xa0(%esp)
  0x01ea37af: fstpl  0xa8(%esp)
  0x01ea37b6: movdqu %xmm0,0xb0(%esp)
  0x01ea37bf: movdqu %xmm1,0xc0(%esp)
  0x01ea37c8: movdqu %xmm2,0xd0(%esp)
  0x01ea37d1: movdqu %xmm3,0xe0(%esp)
  0x01ea37da: movdqu %xmm4,0xf0(%esp)
  0x01ea37e3: movdqu %xmm5,0x100(%esp)
  0x01ea37ec: movdqu %xmm6,0x110(%esp)
  0x01ea37f5: movdqu %xmm7,0x120(%esp)
  0x01ea37fe: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3806: mov    -0xc(%edi),%edi
  0x01ea3809: push   %edi
  0x01ea380a: mov    %ebp,0x144(%edi)
  0x01ea3810: mov    %esp,0x13c(%edi)
  0x01ea3816: call   0x55be8290
  0x01ea381b: add    $0x4,%esp
  0x01ea381e: movl   $0x0,0x13c(%edi)
  0x01ea3828: movl   $0x0,0x144(%edi)
  0x01ea3832: cmpl   $0x0,0x4(%edi)
  0x01ea3839: jne    0x01ea38b6
  0x01ea383f: mov    0x170(%edi),%ebx
  0x01ea3845: movl   $0x0,0x170(%edi)
  0x01ea384f: mov    %ebx,0x148(%esp)
  0x01ea3856: mov    %eax,0x154(%esp)
  0x01ea385d: movdqu 0xb0(%esp),%xmm0
  0x01ea3866: movdqu 0xc0(%esp),%xmm1
  0x01ea386f: movdqu 0xd0(%esp),%xmm2
  0x01ea3878: movdqu 0xe0(%esp),%xmm3
  0x01ea3881: movdqu 0xf0(%esp),%xmm4
  0x01ea388a: movdqu 0x100(%esp),%xmm5
  0x01ea3893: movdqu 0x110(%esp),%xmm6
  0x01ea389c: movdqu 0x120(%esp),%xmm7
  0x01ea38a5: frstor (%esp)
  0x01ea38a8: add    $0x6c,%esp
  0x01ea38ab: add    $0xc8,%esp
  0x01ea38b1: popf   
  0x01ea38b2: popa   
  0x01ea38b3: pop    %ebp
  0x01ea38b4: jmp    *%eax
  0x01ea38b6: movdqu 0xb0(%esp),%xmm0
  0x01ea38bf: movdqu 0xc0(%esp),%xmm1
  0x01ea38c8: movdqu 0xd0(%esp),%xmm2
  0x01ea38d1: movdqu 0xe0(%esp),%xmm3
  0x01ea38da: movdqu 0xf0(%esp),%xmm4
  0x01ea38e3: movdqu 0x100(%esp),%xmm5
  0x01ea38ec: movdqu 0x110(%esp),%xmm6
  0x01ea38f5: movdqu 0x120(%esp),%xmm7
  0x01ea38fe: frstor (%esp)
  0x01ea3901: add    $0x6c,%esp
  0x01ea3904: add    $0xc8,%esp
  0x01ea390a: popf   
  0x01ea390b: popa   
  0x01ea390c: pop    %ebp
  0x01ea390d: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3915: mov    -0xc(%edi),%edi
  0x01ea3918: movl   $0x0,0x16c(%edi)
  0x01ea3922: mov    0x4(%edi),%eax
  0x01ea3925: jmp    0x01dc0340
  0x01ea392a: hlt    
  0x01ea392b: hlt    

Decoding RuntimeStub - resolve_static_call 0x01ea3948
  0x01ea3990: push   %ebp
  0x01ea3991: mov    %esp,%ebp
  0x01ea3993: pusha  
  0x01ea3994: pushf  
  0x01ea3995: sub    $0xc8,%esp
  0x01ea399b: sub    $0x6c,%esp
  0x01ea399e: fnsave (%esp)
  0x01ea39a1: fwait
  0x01ea39a2: cmpw   $0x27f,(%esp)
  0x01ea39a8: je     0x01ea39bb
  0x01ea39aa: push   $0x55ce69bc
  0x01ea39af: call   0x01ea39b4
  0x01ea39b4: pusha  
  0x01ea39b5: call   0x557bdbf0
  0x01ea39ba: hlt    
  0x01ea39bb: movw   $0x27f,(%esp)
  0x01ea39c1: frstor (%esp)
  0x01ea39c4: fstpl  0x70(%esp)
  0x01ea39c8: fstpl  0x78(%esp)
  0x01ea39cc: fstpl  0x80(%esp)
  0x01ea39d3: fstpl  0x88(%esp)
  0x01ea39da: fstpl  0x90(%esp)
  0x01ea39e1: fstpl  0x98(%esp)
  0x01ea39e8: fstpl  0xa0(%esp)
  0x01ea39ef: fstpl  0xa8(%esp)
  0x01ea39f6: movdqu %xmm0,0xb0(%esp)
  0x01ea39ff: movdqu %xmm1,0xc0(%esp)
  0x01ea3a08: movdqu %xmm2,0xd0(%esp)
  0x01ea3a11: movdqu %xmm3,0xe0(%esp)
  0x01ea3a1a: movdqu %xmm4,0xf0(%esp)
  0x01ea3a23: movdqu %xmm5,0x100(%esp)
  0x01ea3a2c: movdqu %xmm6,0x110(%esp)
  0x01ea3a35: movdqu %xmm7,0x120(%esp)
  0x01ea3a3e: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3a46: mov    -0xc(%edi),%edi
  0x01ea3a49: push   %edi
  0x01ea3a4a: mov    %ebp,0x144(%edi)
  0x01ea3a50: mov    %esp,0x13c(%edi)
  0x01ea3a56: call   0x55be80d0
  0x01ea3a5b: add    $0x4,%esp
  0x01ea3a5e: movl   $0x0,0x13c(%edi)
  0x01ea3a68: movl   $0x0,0x144(%edi)
  0x01ea3a72: cmpl   $0x0,0x4(%edi)
  0x01ea3a79: jne    0x01ea3af6
  0x01ea3a7f: mov    0x170(%edi),%ebx
  0x01ea3a85: movl   $0x0,0x170(%edi)
  0x01ea3a8f: mov    %ebx,0x148(%esp)
  0x01ea3a96: mov    %eax,0x154(%esp)
  0x01ea3a9d: movdqu 0xb0(%esp),%xmm0
  0x01ea3aa6: movdqu 0xc0(%esp),%xmm1
  0x01ea3aaf: movdqu 0xd0(%esp),%xmm2
  0x01ea3ab8: movdqu 0xe0(%esp),%xmm3
  0x01ea3ac1: movdqu 0xf0(%esp),%xmm4
  0x01ea3aca: movdqu 0x100(%esp),%xmm5
  0x01ea3ad3: movdqu 0x110(%esp),%xmm6
  0x01ea3adc: movdqu 0x120(%esp),%xmm7
  0x01ea3ae5: frstor (%esp)
  0x01ea3ae8: add    $0x6c,%esp
  0x01ea3aeb: add    $0xc8,%esp
  0x01ea3af1: popf   
  0x01ea3af2: popa   
  0x01ea3af3: pop    %ebp
  0x01ea3af4: jmp    *%eax
  0x01ea3af6: movdqu 0xb0(%esp),%xmm0
  0x01ea3aff: movdqu 0xc0(%esp),%xmm1
  0x01ea3b08: movdqu 0xd0(%esp),%xmm2
  0x01ea3b11: movdqu 0xe0(%esp),%xmm3
  0x01ea3b1a: movdqu 0xf0(%esp),%xmm4
  0x01ea3b23: movdqu 0x100(%esp),%xmm5
  0x01ea3b2c: movdqu 0x110(%esp),%xmm6
  0x01ea3b35: movdqu 0x120(%esp),%xmm7
  0x01ea3b3e: frstor (%esp)
  0x01ea3b41: add    $0x6c,%esp
  0x01ea3b44: add    $0xc8,%esp
  0x01ea3b4a: popf   
  0x01ea3b4b: popa   
  0x01ea3b4c: pop    %ebp
  0x01ea3b4d: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3b55: mov    -0xc(%edi),%edi
  0x01ea3b58: movl   $0x0,0x16c(%edi)
  0x01ea3b62: mov    0x4(%edi),%eax
  0x01ea3b65: jmp    0x01dc0340
  0x01ea3b6a: hlt    
  0x01ea3b6b: hlt    

Decoding SafepointBlob 0x01ea3b88
  0x01ea3bd0: push   %ebx
  0x01ea3bd1: push   %ebp
  0x01ea3bd2: mov    %esp,%ebp
  0x01ea3bd4: pusha  
  0x01ea3bd5: pushf  
  0x01ea3bd6: sub    $0xc8,%esp
  0x01ea3bdc: sub    $0x6c,%esp
  0x01ea3bdf: fnsave (%esp)
  0x01ea3be2: fwait
  0x01ea3be3: frstor (%esp)
  0x01ea3be6: fldcw  0x56005768
  0x01ea3bec: fstpl  0x70(%esp)
  0x01ea3bf0: fstpl  0x78(%esp)
  0x01ea3bf4: fstpl  0x80(%esp)
  0x01ea3bfb: fstpl  0x88(%esp)
  0x01ea3c02: fstpl  0x90(%esp)
  0x01ea3c09: fstpl  0x98(%esp)
  0x01ea3c10: fstpl  0xa0(%esp)
  0x01ea3c17: fstpl  0xa8(%esp)
  0x01ea3c1e: movdqu %xmm0,0xb0(%esp)
  0x01ea3c27: movdqu %xmm1,0xc0(%esp)
  0x01ea3c30: movdqu %xmm2,0xd0(%esp)
  0x01ea3c39: movdqu %xmm3,0xe0(%esp)
  0x01ea3c42: movdqu %xmm4,0xf0(%esp)
  0x01ea3c4b: movdqu %xmm5,0x100(%esp)
  0x01ea3c54: movdqu %xmm6,0x110(%esp)
  0x01ea3c5d: movdqu %xmm7,0x120(%esp)
  0x01ea3c66: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3c6e: mov    -0xc(%edi),%edi
  0x01ea3c71: push   %edi
  0x01ea3c72: mov    %esp,0x13c(%edi)
  0x01ea3c78: mov    0x190(%edi),%eax
  0x01ea3c7e: mov    %eax,0x4(%ebp)
  0x01ea3c81: call   0x55be0c00
  0x01ea3c86: pop    %ecx
  0x01ea3c87: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3c8f: mov    -0xc(%edi),%edi
  0x01ea3c92: movl   $0x0,0x13c(%edi)
  0x01ea3c9c: cmpl   $0x0,0x4(%edi)
  0x01ea3ca3: je     0x01ea3d05
  0x01ea3ca9: movdqu 0xb0(%esp),%xmm0
  0x01ea3cb2: movdqu 0xc0(%esp),%xmm1
  0x01ea3cbb: movdqu 0xd0(%esp),%xmm2
  0x01ea3cc4: movdqu 0xe0(%esp),%xmm3
  0x01ea3ccd: movdqu 0xf0(%esp),%xmm4
  0x01ea3cd6: movdqu 0x100(%esp),%xmm5
  0x01ea3cdf: movdqu 0x110(%esp),%xmm6
  0x01ea3ce8: movdqu 0x120(%esp),%xmm7
  0x01ea3cf1: frstor (%esp)
  0x01ea3cf4: add    $0x6c,%esp
  0x01ea3cf7: add    $0xc8,%esp
  0x01ea3cfd: popf   
  0x01ea3cfe: popa   
  0x01ea3cff: pop    %ebp
  0x01ea3d00: jmp    0x01dc0340
  0x01ea3d05: movdqu 0xb0(%esp),%xmm0
  0x01ea3d0e: movdqu 0xc0(%esp),%xmm1
  0x01ea3d17: movdqu 0xd0(%esp),%xmm2
  0x01ea3d20: movdqu 0xe0(%esp),%xmm3
  0x01ea3d29: movdqu 0xf0(%esp),%xmm4
  0x01ea3d32: movdqu 0x100(%esp),%xmm5
  0x01ea3d3b: movdqu 0x110(%esp),%xmm6
  0x01ea3d44: movdqu 0x120(%esp),%xmm7
  0x01ea3d4d: frstor (%esp)
  0x01ea3d50: add    $0x6c,%esp
  0x01ea3d53: add    $0xc8,%esp
  0x01ea3d59: popf   
  0x01ea3d5a: popa   
  0x01ea3d5b: pop    %ebp
  0x01ea3d5c: ret    
  0x01ea3d5d: hlt    
  0x01ea3d5e: hlt    
  0x01ea3d5f: hlt    

Decoding SafepointBlob 0x01ea3d88
  0x01ea3dd0: push   %ebp
  0x01ea3dd1: mov    %esp,%ebp
  0x01ea3dd3: pusha  
  0x01ea3dd4: pushf  
  0x01ea3dd5: sub    $0xc8,%esp
  0x01ea3ddb: sub    $0x6c,%esp
  0x01ea3dde: fnsave (%esp)
  0x01ea3de1: fwait
  0x01ea3de2: frstor (%esp)
  0x01ea3de5: fldcw  0x56005768
  0x01ea3deb: fstpl  0x70(%esp)
  0x01ea3def: fstpl  0x78(%esp)
  0x01ea3df3: fstpl  0x80(%esp)
  0x01ea3dfa: fstpl  0x88(%esp)
  0x01ea3e01: fstpl  0x90(%esp)
  0x01ea3e08: fstpl  0x98(%esp)
  0x01ea3e0f: fstpl  0xa0(%esp)
  0x01ea3e16: fstpl  0xa8(%esp)
  0x01ea3e1d: movdqu %xmm0,0xb0(%esp)
  0x01ea3e26: movdqu %xmm1,0xc0(%esp)
  0x01ea3e2f: movdqu %xmm2,0xd0(%esp)
  0x01ea3e38: movdqu %xmm3,0xe0(%esp)
  0x01ea3e41: movdqu %xmm4,0xf0(%esp)
  0x01ea3e4a: movdqu %xmm5,0x100(%esp)
  0x01ea3e53: movdqu %xmm6,0x110(%esp)
  0x01ea3e5c: movdqu %xmm7,0x120(%esp)
  0x01ea3e65: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3e6d: mov    -0xc(%edi),%edi
  0x01ea3e70: push   %edi
  0x01ea3e71: mov    %esp,0x13c(%edi)
  0x01ea3e77: call   0x55be0c00
  0x01ea3e7c: pop    %ecx
  0x01ea3e7d: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea3e85: mov    -0xc(%edi),%edi
  0x01ea3e88: movl   $0x0,0x13c(%edi)
  0x01ea3e92: cmpl   $0x0,0x4(%edi)
  0x01ea3e99: je     0x01ea3efb
  0x01ea3e9f: movdqu 0xb0(%esp),%xmm0
  0x01ea3ea8: movdqu 0xc0(%esp),%xmm1
  0x01ea3eb1: movdqu 0xd0(%esp),%xmm2
  0x01ea3eba: movdqu 0xe0(%esp),%xmm3
  0x01ea3ec3: movdqu 0xf0(%esp),%xmm4
  0x01ea3ecc: movdqu 0x100(%esp),%xmm5
  0x01ea3ed5: movdqu 0x110(%esp),%xmm6
  0x01ea3ede: movdqu 0x120(%esp),%xmm7
  0x01ea3ee7: frstor (%esp)
  0x01ea3eea: add    $0x6c,%esp
  0x01ea3eed: add    $0xc8,%esp
  0x01ea3ef3: popf   
  0x01ea3ef4: popa   
  0x01ea3ef5: pop    %ebp
  0x01ea3ef6: jmp    0x01dc0340
  0x01ea3efb: movdqu 0xb0(%esp),%xmm0
  0x01ea3f04: movdqu 0xc0(%esp),%xmm1
  0x01ea3f0d: movdqu 0xd0(%esp),%xmm2
  0x01ea3f16: movdqu 0xe0(%esp),%xmm3
  0x01ea3f1f: movdqu 0xf0(%esp),%xmm4
  0x01ea3f28: movdqu 0x100(%esp),%xmm5
  0x01ea3f31: movdqu 0x110(%esp),%xmm6
  0x01ea3f3a: movdqu 0x120(%esp),%xmm7
  0x01ea3f43: frstor (%esp)
  0x01ea3f46: add    $0x6c,%esp
  0x01ea3f49: add    $0xc8,%esp
  0x01ea3f4f: popf   
  0x01ea3f50: popa   
  0x01ea3f51: pop    %ebp
  0x01ea3f52: ret    
  0x01ea3f53: hlt    

Decoding DeoptimizationBlob 0x01ea3f88
  0x01ea4000: push   %ebp
  0x01ea4001: mov    %esp,%ebp
  0x01ea4003: pusha  
  0x01ea4004: pushf  
  0x01ea4005: sub    $0xc8,%esp
  0x01ea400b: sub    $0x6c,%esp
  0x01ea400e: fnsave (%esp)
  0x01ea4011: fwait
  0x01ea4012: frstor (%esp)
  0x01ea4015: fldcw  0x56005768
  0x01ea401b: fstpl  0x70(%esp)
  0x01ea401f: fstpl  0x78(%esp)
  0x01ea4023: fstpl  0x80(%esp)
  0x01ea402a: fstpl  0x88(%esp)
  0x01ea4031: fstpl  0x90(%esp)
  0x01ea4038: fstpl  0x98(%esp)
  0x01ea403f: fstpl  0xa0(%esp)
  0x01ea4046: fstpl  0xa8(%esp)
  0x01ea404d: movdqu %xmm0,0xb0(%esp)
  0x01ea4056: movdqu %xmm1,0xc0(%esp)
  0x01ea405f: movdqu %xmm2,0xd0(%esp)
  0x01ea4068: movdqu %xmm3,0xe0(%esp)
  0x01ea4071: movdqu %xmm4,0xf0(%esp)
  0x01ea407a: movdqu %xmm5,0x100(%esp)
  0x01ea4083: movdqu %xmm6,0x110(%esp)
  0x01ea408c: movdqu %xmm7,0x120(%esp)
  0x01ea4095: push   $0x0
  0x01ea409a: jmp    0x01ea4234
  0x01ea409f: push   %ebp
  0x01ea40a0: mov    %esp,%ebp
  0x01ea40a2: pusha  
  0x01ea40a3: pushf  
  0x01ea40a4: sub    $0xc8,%esp
  0x01ea40aa: sub    $0x6c,%esp
  0x01ea40ad: fnsave (%esp)
  0x01ea40b0: fwait
  0x01ea40b1: frstor (%esp)
  0x01ea40b4: fldcw  0x56005768
  0x01ea40ba: fstpl  0x70(%esp)
  0x01ea40be: fstpl  0x78(%esp)
  0x01ea40c2: fstpl  0x80(%esp)
  0x01ea40c9: fstpl  0x88(%esp)
  0x01ea40d0: fstpl  0x90(%esp)
  0x01ea40d7: fstpl  0x98(%esp)
  0x01ea40de: fstpl  0xa0(%esp)
  0x01ea40e5: fstpl  0xa8(%esp)
  0x01ea40ec: movdqu %xmm0,0xb0(%esp)
  0x01ea40f5: movdqu %xmm1,0xc0(%esp)
  0x01ea40fe: movdqu %xmm2,0xd0(%esp)
  0x01ea4107: movdqu %xmm3,0xe0(%esp)
  0x01ea4110: movdqu %xmm4,0xf0(%esp)
  0x01ea4119: movdqu %xmm5,0x100(%esp)
  0x01ea4122: movdqu %xmm6,0x110(%esp)
  0x01ea412b: movdqu %xmm7,0x120(%esp)
  0x01ea4134: push   $0x3
  0x01ea4139: jmp    0x01ea4234
  0x01ea413e: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea4146: mov    -0xc(%edi),%edi
  0x01ea4149: mov    %edx,0x1b0(%edi)
  0x01ea414f: mov    %eax,0x1ac(%edi)
  0x01ea4155: push   $0x0
  0x01ea415a: push   %ebp
  0x01ea415b: mov    %esp,%ebp
  0x01ea415d: pusha  
  0x01ea415e: pushf  
  0x01ea415f: sub    $0xc8,%esp
  0x01ea4165: sub    $0x6c,%esp
  0x01ea4168: fnsave (%esp)
  0x01ea416b: fwait
  0x01ea416c: frstor (%esp)
  0x01ea416f: fldcw  0x56005768
  0x01ea4175: fstpl  0x70(%esp)
  0x01ea4179: fstpl  0x78(%esp)
  0x01ea417d: fstpl  0x80(%esp)
  0x01ea4184: fstpl  0x88(%esp)
  0x01ea418b: fstpl  0x90(%esp)
  0x01ea4192: fstpl  0x98(%esp)
  0x01ea4199: fstpl  0xa0(%esp)
  0x01ea41a0: fstpl  0xa8(%esp)
  0x01ea41a7: movdqu %xmm0,0xb0(%esp)
  0x01ea41b0: movdqu %xmm1,0xc0(%esp)
  0x01ea41b9: movdqu %xmm2,0xd0(%esp)
  0x01ea41c2: movdqu %xmm3,0xe0(%esp)
  0x01ea41cb: movdqu %xmm4,0xf0(%esp)
  0x01ea41d4: movdqu %xmm5,0x100(%esp)
  0x01ea41dd: movdqu %xmm6,0x110(%esp)
  0x01ea41e6: movdqu %xmm7,0x120(%esp)
  0x01ea41ef: push   $0x1
  0x01ea41f4: mov    %fs:0x0(,%eiz,1),%edi
  0x01ea41fc: mov    -0xc(%edi),%edi
  0x01ea41ff: mov    0x1b0(%edi),%edx
  0x01ea4205: mov    %edx,0x4(%ebp)
  0x01ea4208: movl   $0x0,0x1b0(%edi)
  0x01ea4212: mov    0x1ac(%edi),%eax
  0x01ea4218: mov    0x4(%edi),%eax
  0x01ea421b: test   %eax,%eax
  0x01ea421d: je     0x01ea4234
  0x01ea4223: push   $0x55ce7288
  0x01ea4228: call   0x01ea422d
  0x01ea422d: pusha  
  0x01ea422e: call   0x557bdbf0
  0x01ea4233: hlt    
  0x01ea4234: emms   
  0x01ea4236: mov    %fs:0x0(,%eiz,1),%ecx
  0x01ea423e: mov    -0xc(%ecx),%ecx
  0x01ea4241: push   %ecx
  0x01ea4242: mov    %esp,0x13c(%ecx)
  0x01ea4248: call   0x55bb1760
  0x01ea424d: pop    %ecx
  0x01ea424e: mov    %fs:0x0(,%eiz,1),%ecx
  0x01ea4256: mov    -0xc(%ecx),%ecx
  0x01ea4259: movl   $0x0,0x13c(%ecx)
  0x01ea4263: mov    %eax,%edi
  0x01ea4265: pop    %eax
  0x01ea4266: mov    %eax,0x30(%edi)
  0x01ea4269: cmp    $0x1,%eax
  0x01ea426c: jne    0x01ea42a0
  0x01ea4272: mov    0x1ac(%ecx),%eax
  0x01ea4278: mov    0x1b0(%ecx),%edx
  0x01ea427e: movl   $0x0,0x1ac(%ecx)
  0x01ea4288: movl   $0x0,0x1b0(%ecx)
  0x01ea4292: mov    %eax,0x154(%esp)
  0x01ea4299: mov    %edx,0x14c(%esp)
  0x01ea42a0: frstor (%esp)
  0x01ea42a3: movsd  0xb0(%esp),%xmm0
  0x01ea42ac: mov    0x154(%esp),%eax
  0x01ea42b3: mov    0x14c(%esp),%edx
  0x01ea42ba: add    $0x15c,%esp
  0x01ea42c0: fldcw  0x56005768
  0x01ea42c6: add    0x4(%edi),%esp
  0x01ea42c9: mov    0x24(%edi),%ebp
  0x01ea42cc: mov    0x10(%edi),%ebx
  0x01ea42cf: mov    %esp,%ecx
  0x01ea42d1: mov    %ebx,-0x1000(%ecx)
  0x01ea42d7: sub    $0x1000,%ecx
  0x01ea42dd: sub    $0x1000,%ebx
  0x01ea42e3: jg     0x01ea42d1
  0x01ea42e5: mov    %ebx,-0x1000(%ecx)
  0x01ea42eb: mov    %ebx,-0x2000(%ecx)
  0x01ea42f1: mov    %ebx,-0x3000(%ecx)
  0x01ea42f7: mov    %ebx,-0x4000(%ecx)
  0x01ea42fd: mov    %ebx,-0x5000(%ecx)
  0x01ea4303: mov    %ebx,-0x6000(%ecx)
  0x01ea4309: mov    %ebx,-0x7000(%ecx)
  0x01ea430f: mov    %ebx,-0x8000(%ecx)
  0x01ea4315: mov    %ebx,-0x9000(%ecx)
  0x01ea431b: mov    0x18(%edi),%ecx
  0x01ea431e: pop    %esi
  0x01ea431f: mov    0x14(%edi),%esi
  0x01ea4322: mov    0xc(%edi),%ebx
  0x01ea4325: mov    %ebx,0x2c(%edi)
  0x01ea4328: mov    %esp,0x34(%edi)
  0x01ea432b: mov    0x8(%edi),%ebx
  0x01ea432e: sub    %ebx,%esp
  0x01ea4330: mov    (%esi),%ebx
  0x01ea4332: sub    $0x8,%ebx
  0x01ea4335: pushl  (%ecx)
  0x01ea4337: push   %ebp
  0x01ea4338: mov    %esp,%ebp
  0x01ea433a: sub    %ebx,%esp
  0x01ea433c: mov    0x34(%edi),%ebx
  0x01ea433f: movl   $0x0,-0x8(%ebp)
  0x01ea4346: mov    %ebx,-0x4(%ebp)
  0x01ea4349: mov    %esp,0x34(%edi)
  0x01ea434c: add    $0x4,%esi
  0x01ea434f: add    $0x4,%ecx
  0x01ea4352: decl   0x2c(%edi)
  0x01ea4355: jne    0x01ea4330
  0x01ea4357: pushl  (%ecx)
  0x01ea4359: push   %ebp
  0x01ea435a: mov    %esp,%ebp
  0x01ea435c: sub    $0x158,%esp
  0x01ea4362: mov    %eax,0x154(%esp)
  0x01ea4369: mov    %edx,0x14c(%esp)
  0x01ea4370: fstpl  0x70(%esp)
  0x01ea4374: movsd  %xmm0,0xb0(%esp)
  0x01ea437d: pushl  0x30(%edi)
  0x01ea4380: mov    %fs:0x0(,%eiz,1),%ecx
  0x01ea4388: mov    -0xc(%ecx),%ecx
  0x01ea438b: push   %ecx
  0x01ea438c: mov    %ebp,0x144(%ecx)
  0x01ea4392: mov    %esp,0x13c(%ecx)
  0x01ea4398: call   0x55bb1840
  0x01ea439d: push   %eax
  0x01ea439e: mov    %fs:0x0(,%eiz,1),%ecx
  0x01ea43a6: mov    -0xc(%ecx),%ecx
  0x01ea43a9: movl   $0x0,0x13c(%ecx)
  0x01ea43b3: mov    0x160(%esp),%eax
  0x01ea43ba: mov    0x158(%esp),%edx
  0x01ea43c1: emms   
  0x01ea43c3: cmpl   $0x7,(%esp)
  0x01ea43ca: je     0x01ea43eb
  0x01ea43d0: cmpl   $0x6,(%esp)
  0x01ea43d7: jne    0x01ea43f4
  0x01ea43dd: movss  0xbc(%esp),%xmm0
  0x01ea43e6: jmp    0x01ea43f4
  0x01ea43eb: movsd  0xbc(%esp),%xmm0
  0x01ea43f4: mov    %ebp,%esp
  0x01ea43f6: pop    %ebp
  0x01ea43f7: ret    

AHE@0x018f9564: 0x i2c: 0x01dc2770 c2i: 0x01dc27f9 c2iUV: 0x01dc27d8
i2c argument handler #0 for: static ()V (207 bytes generated)
c2i argument handler starts at 01DC27F9
  0x01dc2770: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01dc2773: mov    $0x1dc2940,%edi
  0x01dc2778: cmp    %edi,%eax
  0x01dc277a: jbe    0x01dc278d
  0x01dc2780: mov    $0x1ea2940,%edi
  0x01dc2785: cmp    %edi,%eax
  0x01dc2787: jb     0x01dc27b8
  0x01dc278d: mov    $0x1dc0340,%edi
  0x01dc2792: cmp    %edi,%eax
  0x01dc2794: jbe    0x01dc27a7
  0x01dc279a: mov    $0x1dc2668,%edi
  0x01dc279f: cmp    %edi,%eax
  0x01dc27a1: jb     0x01dc27b8
  ;; i2c adapter must return to an interpreter frame
  0x01dc27a7: push   $0x55ce723c
  0x01dc27ac: call   0x01dc27b1
  0x01dc27b1: pusha  
  0x01dc27b2: call   0x557bdbf0
  0x01dc27b7: hlt    
  ;; } verify_i2ce 
  0x01dc27b8: mov    %esp,%edi
  0x01dc27ba: and    $0xfffffff0,%esp
  0x01dc27bd: push   %eax
  0x01dc27be: mov    %edi,%eax
  0x01dc27c0: mov    0x2c(%ebx),%edi
  0x01dc27c3: mov    %fs:0x0(,%eiz,1),%eax
  0x01dc27cb: mov    -0xc(%eax),%eax
  0x01dc27ce: mov    %ebx,0x168(%eax)
  0x01dc27d4: mov    %ebx,%eax
  0x01dc27d6: jmp    *%edi
  0x01dc27d8: mov    0x4(%ecx),%ebx
  0x01dc27db: cmp    0x8(%eax),%ebx
  0x01dc27de: mov    0x4(%eax),%ebx
  0x01dc27e1: jne    0x01dc27f4
  0x01dc27e7: cmpl   $0x0,0x30(%ebx)
  0x01dc27ee: je     0x01dc2833
  0x01dc27f4: jmp    0x01ea32d0
  0x01dc27f9: cmpl   $0x0,0x30(%ebx)
  0x01dc2800: je     0x01dc2833
  0x01dc2806: mov    (%esp),%eax
  0x01dc2809: pusha  
  0x01dc280a: pushf  
  0x01dc280b: sub    $0x10,%esp
  0x01dc280e: movsd  %xmm0,(%esp)
  0x01dc2813: movsd  %xmm1,0x8(%esp)
  0x01dc2819: push   %eax
  0x01dc281a: push   %ebx
  0x01dc281b: call   0x55be79d0
  0x01dc2820: add    $0x8,%esp
  0x01dc2823: movsd  (%esp),%xmm0
  0x01dc2828: movsd  0x8(%esp),%xmm1
  0x01dc282e: add    $0x10,%esp
  0x01dc2831: popf   
  0x01dc2832: popa   
  0x01dc2833: pop    %eax
  0x01dc2834: mov    %esp,%esi
  0x01dc2836: sub    $0x0,%esp
  0x01dc2839: mov    0x24(%ebx),%ecx
  0x01dc283c: push   %eax
  0x01dc283d: jmp    *%ecx

AHE@0x018f9590: 0xa0000000 i2c: 0x01ea2cf0 c2i: 0x01ea2d7c c2iUV: 0x01ea2d5b
i2c argument handler #1 for: receiver ()V (213 bytes generated)
c2i argument handler starts at 01EA2D7C
  0x01ea2cf0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ea2cf3: mov    $0x1dc2940,%edi
  0x01ea2cf8: cmp    %edi,%eax
  0x01ea2cfa: jbe    0x01ea2d0d
  0x01ea2d00: mov    $0x1ea2940,%edi
  0x01ea2d05: cmp    %edi,%eax
  0x01ea2d07: jb     0x01ea2d38
  0x01ea2d0d: mov    $0x1dc0340,%edi
  0x01ea2d12: cmp    %edi,%eax
  0x01ea2d14: jbe    0x01ea2d27
  0x01ea2d1a: mov    $0x1dc2668,%edi
  0x01ea2d1f: cmp    %edi,%eax
  0x01ea2d21: jb     0x01ea2d38
  ;; i2c adapter must return to an interpreter frame
  0x01ea2d27: push   $0x55ce723c
  0x01ea2d2c: call   0x01ea2d31
  0x01ea2d31: pusha  
  0x01ea2d32: call   0x557bdbf0
  0x01ea2d37: hlt    
  ;; } verify_i2ce 
  0x01ea2d38: mov    %esp,%edi
  0x01ea2d3a: and    $0xfffffff0,%esp
  0x01ea2d3d: push   %eax
  0x01ea2d3e: mov    %edi,%eax
  0x01ea2d40: mov    0x2c(%ebx),%edi
  0x01ea2d43: mov    0x4(%eax),%ecx
  0x01ea2d46: mov    %fs:0x0(,%eiz,1),%eax
  0x01ea2d4e: mov    -0xc(%eax),%eax
  0x01ea2d51: mov    %ebx,0x168(%eax)
  0x01ea2d57: mov    %ebx,%eax
  0x01ea2d59: jmp    *%edi
  0x01ea2d5b: mov    0x4(%ecx),%ebx
  0x01ea2d5e: cmp    0x8(%eax),%ebx
  0x01ea2d61: mov    0x4(%eax),%ebx
  0x01ea2d64: jne    0x01ea2d77
  0x01ea2d6a: cmpl   $0x0,0x30(%ebx)
  0x01ea2d71: je     0x01ea2db6
  0x01ea2d77: jmp    0x01ea32d0
  0x01ea2d7c: cmpl   $0x0,0x30(%ebx)
  0x01ea2d83: je     0x01ea2db6
  0x01ea2d89: mov    (%esp),%eax
  0x01ea2d8c: pusha  
  0x01ea2d8d: pushf  
  0x01ea2d8e: sub    $0x10,%esp
  0x01ea2d91: movsd  %xmm0,(%esp)
  0x01ea2d96: movsd  %xmm1,0x8(%esp)
  0x01ea2d9c: push   %eax
  0x01ea2d9d: push   %ebx
  0x01ea2d9e: call   0x55be79d0
  0x01ea2da3: add    $0x8,%esp
  0x01ea2da6: movsd  (%esp),%xmm0
  0x01ea2dab: movsd  0x8(%esp),%xmm1
  0x01ea2db1: add    $0x10,%esp
  0x01ea2db4: popf   
  0x01ea2db5: popa   
  0x01ea2db6: pop    %eax
  0x01ea2db7: mov    %esp,%esi
  0x01ea2db9: sub    $0x4,%esp
  0x01ea2dbc: mov    %ecx,(%esp)
  0x01ea2dbf: mov    0x24(%ebx),%ecx
  0x01ea2dc2: push   %eax
  0x01ea2dc3: jmp    *%ecx

AHE@0x018f95bc: 0xaa000000 i2c: 0x01ea2b70 c2i: 0x01ea2bff c2iUV: 0x01ea2bde
i2c argument handler #2 for: receiver (Ljava/lang/Object;)Z (220 bytes generated)
c2i argument handler starts at 01EA2BFF
  0x01ea2b70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ea2b73: mov    $0x1dc2940,%edi
  0x01ea2b78: cmp    %edi,%eax
  0x01ea2b7a: jbe    0x01ea2b8d
  0x01ea2b80: mov    $0x1ea2940,%edi
  0x01ea2b85: cmp    %edi,%eax
  0x01ea2b87: jb     0x01ea2bb8
  0x01ea2b8d: mov    $0x1dc0340,%edi
  0x01ea2b92: cmp    %edi,%eax
  0x01ea2b94: jbe    0x01ea2ba7
  0x01ea2b9a: mov    $0x1dc2668,%edi
  0x01ea2b9f: cmp    %edi,%eax
  0x01ea2ba1: jb     0x01ea2bb8
  ;; i2c adapter must return to an interpreter frame
  0x01ea2ba7: push   $0x55ce723c
  0x01ea2bac: call   0x01ea2bb1
  0x01ea2bb1: pusha  
  0x01ea2bb2: call   0x557bdbf0
  0x01ea2bb7: hlt    
  ;; } verify_i2ce 
  0x01ea2bb8: mov    %esp,%edi
  0x01ea2bba: and    $0xfffffff0,%esp
  0x01ea2bbd: push   %eax
  0x01ea2bbe: mov    %edi,%eax
  0x01ea2bc0: mov    0x2c(%ebx),%edi
  0x01ea2bc3: mov    0x8(%eax),%ecx
  0x01ea2bc6: mov    0x4(%eax),%edx
  0x01ea2bc9: mov    %fs:0x0(,%eiz,1),%eax
  0x01ea2bd1: mov    -0xc(%eax),%eax
  0x01ea2bd4: mov    %ebx,0x168(%eax)
  0x01ea2bda: mov    %ebx,%eax
  0x01ea2bdc: jmp    *%edi
  0x01ea2bde: mov    0x4(%ecx),%ebx
  0x01ea2be1: cmp    0x8(%eax),%ebx
  0x01ea2be4: mov    0x4(%eax),%ebx
  0x01ea2be7: jne    0x01ea2bfa
  0x01ea2bed: cmpl   $0x0,0x30(%ebx)
  0x01ea2bf4: je     0x01ea2c39
  0x01ea2bfa: jmp    0x01ea32d0
  0x01ea2bff: cmpl   $0x0,0x30(%ebx)
  0x01ea2c06: je     0x01ea2c39
  0x01ea2c0c: mov    (%esp),%eax
  0x01ea2c0f: pusha  
  0x01ea2c10: pushf  
  0x01ea2c11: sub    $0x10,%esp
  0x01ea2c14: movsd  %xmm0,(%esp)
  0x01ea2c19: movsd  %xmm1,0x8(%esp)
  0x01ea2c1f: push   %eax
  0x01ea2c20: push   %ebx
  0x01ea2c21: call   0x55be79d0
  0x01ea2c26: add    $0x8,%esp
  0x01ea2c29: movsd  (%esp),%xmm0
  0x01ea2c2e: movsd  0x8(%esp),%xmm1
  0x01ea2c34: add    $0x10,%esp
  0x01ea2c37: popf   
  0x01ea2c38: popa   
  0x01ea2c39: pop    %eax
  0x01ea2c3a: mov    %esp,%esi
  0x01ea2c3c: sub    $0x8,%esp
  0x01ea2c3f: mov    %ecx,0x4(%esp)
  0x01ea2c43: mov    %edx,(%esp)
  0x01ea2c46: mov    0x24(%ebx),%ecx
  0x01ea2c49: push   %eax
  0x01ea2c4a: jmp    *%ecx

AHE@0x018f95e8: 0xabe00000 i2c: 0x01ea29f0 c2i: 0x01ea2a8d c2iUV: 0x01ea2a6c
i2c argument handler #3 for: receiver (J)V (246 bytes generated)
c2i argument handler starts at 01EA2A8D
  0x01ea29f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ea29f3: mov    $0x1dc2940,%edi
  0x01ea29f8: cmp    %edi,%eax
  0x01ea29fa: jbe    0x01ea2a0d
  0x01ea2a00: mov    $0x1ea2940,%edi
  0x01ea2a05: cmp    %edi,%eax
  0x01ea2a07: jb     0x01ea2a38
  0x01ea2a0d: mov    $0x1dc0340,%edi
  0x01ea2a12: cmp    %edi,%eax
  0x01ea2a14: jbe    0x01ea2a27
  0x01ea2a1a: mov    $0x1dc2668,%edi
  0x01ea2a1f: cmp    %edi,%eax
  0x01ea2a21: jb     0x01ea2a38
  ;; i2c adapter must return to an interpreter frame
  0x01ea2a27: push   $0x55ce723c
  0x01ea2a2c: call   0x01ea2a31
  0x01ea2a31: pusha  
  0x01ea2a32: call   0x557bdbf0
  0x01ea2a37: hlt    
  ;; } verify_i2ce 
  0x01ea2a38: mov    %esp,%edi
  0x01ea2a3a: sub    $0x8,%esp
  0x01ea2a3d: and    $0xfffffff0,%esp
  0x01ea2a40: push   %eax
  0x01ea2a41: mov    %edi,%eax
  0x01ea2a43: mov    0x2c(%ebx),%edi
  0x01ea2a46: mov    0xc(%eax),%ecx
  0x01ea2a49: mov    0x4(%eax),%esi
  0x01ea2a4c: mov    %esi,0x4(%esp)
  0x01ea2a50: mov    0x8(%eax),%esi
  0x01ea2a53: mov    %esi,0x8(%esp)
  0x01ea2a57: mov    %fs:0x0(,%eiz,1),%eax
  0x01ea2a5f: mov    -0xc(%eax),%eax
  0x01ea2a62: mov    %ebx,0x168(%eax)
  0x01ea2a68: mov    %ebx,%eax
  0x01ea2a6a: jmp    *%edi
  0x01ea2a6c: mov    0x4(%ecx),%ebx
  0x01ea2a6f: cmp    0x8(%eax),%ebx
  0x01ea2a72: mov    0x4(%eax),%ebx
  0x01ea2a75: jne    0x01ea2a88
  0x01ea2a7b: cmpl   $0x0,0x30(%ebx)
  0x01ea2a82: je     0x01ea2ac7
  0x01ea2a88: jmp    0x01ea32d0
  0x01ea2a8d: cmpl   $0x0,0x30(%ebx)
  0x01ea2a94: je     0x01ea2ac7
  0x01ea2a9a: mov    (%esp),%eax
  0x01ea2a9d: pusha  
  0x01ea2a9e: pushf  
  0x01ea2a9f: sub    $0x10,%esp
  0x01ea2aa2: movsd  %xmm0,(%esp)
  0x01ea2aa7: movsd  %xmm1,0x8(%esp)
  0x01ea2aad: push   %eax
  0x01ea2aae: push   %ebx
  0x01ea2aaf: call   0x55be79d0
  0x01ea2ab4: add    $0x8,%esp
  0x01ea2ab7: movsd  (%esp),%xmm0
  0x01ea2abc: movsd  0x8(%esp),%xmm1
  0x01ea2ac2: add    $0x10,%esp
  0x01ea2ac5: popf   
  0x01ea2ac6: popa   
  0x01ea2ac7: pop    %eax
  0x01ea2ac8: mov    %esp,%esi
  0x01ea2aca: sub    $0xc,%esp
  0x01ea2acd: mov    %ecx,0x8(%esp)
  0x01ea2ad1: mov    0xc(%esp),%edi
  0x01ea2ad5: mov    %edi,(%esp)
  0x01ea2ad8: mov    0x10(%esp),%edi
  0x01ea2adc: mov    %edi,0x4(%esp)
  0x01ea2ae0: mov    0x24(%ebx),%ecx
  0x01ea2ae3: push   %eax
  0x01ea2ae4: jmp    *%ecx

AHE@0x018f9614: 0xabea0000 i2c: 0x01eaacf0 c2i: 0x01eaad90 c2iUV: 0x01eaad6f
i2c argument handler #4 for: receiver (JI)V (253 bytes generated)
c2i argument handler starts at 01EAAD90
  0x01eaacf0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eaacf3: mov    $0x1dc2940,%edi
  0x01eaacf8: cmp    %edi,%eax
  0x01eaacfa: jbe    0x01eaad0d
  0x01eaad00: mov    $0x1ea2940,%edi
  0x01eaad05: cmp    %edi,%eax
  0x01eaad07: jb     0x01eaad38
  0x01eaad0d: mov    $0x1dc0340,%edi
  0x01eaad12: cmp    %edi,%eax
  0x01eaad14: jbe    0x01eaad27
  0x01eaad1a: mov    $0x1dc2668,%edi
  0x01eaad1f: cmp    %edi,%eax
  0x01eaad21: jb     0x01eaad38
  ;; i2c adapter must return to an interpreter frame
  0x01eaad27: push   $0x55ce723c
  0x01eaad2c: call   0x01eaad31
  0x01eaad31: pusha  
  0x01eaad32: call   0x557bdbf0
  0x01eaad37: hlt    
  ;; } verify_i2ce 
  0x01eaad38: mov    %esp,%edi
  0x01eaad3a: sub    $0x8,%esp
  0x01eaad3d: and    $0xfffffff0,%esp
  0x01eaad40: push   %eax
  0x01eaad41: mov    %edi,%eax
  0x01eaad43: mov    0x2c(%ebx),%edi
  0x01eaad46: mov    0x10(%eax),%ecx
  0x01eaad49: mov    0x8(%eax),%esi
  0x01eaad4c: mov    %esi,0x4(%esp)
  0x01eaad50: mov    0xc(%eax),%esi
  0x01eaad53: mov    %esi,0x8(%esp)
  0x01eaad57: mov    0x4(%eax),%edx
  0x01eaad5a: mov    %fs:0x0(,%eiz,1),%eax
  0x01eaad62: mov    -0xc(%eax),%eax
  0x01eaad65: mov    %ebx,0x168(%eax)
  0x01eaad6b: mov    %ebx,%eax
  0x01eaad6d: jmp    *%edi
  0x01eaad6f: mov    0x4(%ecx),%ebx
  0x01eaad72: cmp    0x8(%eax),%ebx
  0x01eaad75: mov    0x4(%eax),%ebx
  0x01eaad78: jne    0x01eaad8b
  0x01eaad7e: cmpl   $0x0,0x30(%ebx)
  0x01eaad85: je     0x01eaadca
  0x01eaad8b: jmp    0x01ea32d0
  0x01eaad90: cmpl   $0x0,0x30(%ebx)
  0x01eaad97: je     0x01eaadca
  0x01eaad9d: mov    (%esp),%eax
  0x01eaada0: pusha  
  0x01eaada1: pushf  
  0x01eaada2: sub    $0x10,%esp
  0x01eaada5: movsd  %xmm0,(%esp)
  0x01eaadaa: movsd  %xmm1,0x8(%esp)
  0x01eaadb0: push   %eax
  0x01eaadb1: push   %ebx
  0x01eaadb2: call   0x55be79d0
  0x01eaadb7: add    $0x8,%esp
  0x01eaadba: movsd  (%esp),%xmm0
  0x01eaadbf: movsd  0x8(%esp),%xmm1
  0x01eaadc5: add    $0x10,%esp
  0x01eaadc8: popf   
  0x01eaadc9: popa   
  0x01eaadca: pop    %eax
  0x01eaadcb: mov    %esp,%esi
  0x01eaadcd: sub    $0x10,%esp
  0x01eaadd0: mov    %ecx,0xc(%esp)
  0x01eaadd4: mov    0x10(%esp),%edi
  0x01eaadd8: mov    %edi,0x4(%esp)
  0x01eaaddc: mov    0x14(%esp),%edi
  0x01eaade0: mov    %edi,0x8(%esp)
  0x01eaade4: mov    %edx,(%esp)
  0x01eaade7: mov    0x24(%ebx),%ecx
  0x01eaadea: push   %eax
  0x01eaadeb: jmp    *%ecx

AHE@0x018f9640: 0xaaaaaa00 i2c: 0x01eaae70 c2i: 0x01eaaf1e c2iUV: 0x01eaaefd
i2c argument handler #5 for: receiver (Ljava/lang/Throwable$PrintStreamOrWriter;[Ljava/lang/StackTraceElement;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V (283 bytes generated)
c2i argument handler starts at 01EAAF1E
  0x01eaae70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eaae73: mov    $0x1dc2940,%edi
  0x01eaae78: cmp    %edi,%eax
  0x01eaae7a: jbe    0x01eaae8d
  0x01eaae80: mov    $0x1ea2940,%edi
  0x01eaae85: cmp    %edi,%eax
  0x01eaae87: jb     0x01eaaeb8
  0x01eaae8d: mov    $0x1dc0340,%edi
  0x01eaae92: cmp    %edi,%eax
  0x01eaae94: jbe    0x01eaaea7
  0x01eaae9a: mov    $0x1dc2668,%edi
  0x01eaae9f: cmp    %edi,%eax
  0x01eaaea1: jb     0x01eaaeb8
  ;; i2c adapter must return to an interpreter frame
  0x01eaaea7: push   $0x55ce723c
  0x01eaaeac: call   0x01eaaeb1
  0x01eaaeb1: pusha  
  0x01eaaeb2: call   0x557bdbf0
  0x01eaaeb7: hlt    
  ;; } verify_i2ce 
  0x01eaaeb8: mov    %esp,%edi
  0x01eaaeba: sub    $0x10,%esp
  0x01eaaebd: and    $0xfffffff0,%esp
  0x01eaaec0: push   %eax
  0x01eaaec1: mov    %edi,%eax
  0x01eaaec3: mov    0x2c(%ebx),%edi
  0x01eaaec6: mov    0x18(%eax),%ecx
  0x01eaaec9: mov    0x14(%eax),%edx
  0x01eaaecc: mov    0x10(%eax),%esi
  0x01eaaecf: mov    %esi,0x4(%esp)
  0x01eaaed3: mov    0xc(%eax),%esi
  0x01eaaed6: mov    %esi,0x8(%esp)
  0x01eaaeda: mov    0x8(%eax),%esi
  0x01eaaedd: mov    %esi,0xc(%esp)
  0x01eaaee1: mov    0x4(%eax),%esi
  0x01eaaee4: mov    %esi,0x10(%esp)
  0x01eaaee8: mov    %fs:0x0(,%eiz,1),%eax
  0x01eaaef0: mov    -0xc(%eax),%eax
  0x01eaaef3: mov    %ebx,0x168(%eax)
  0x01eaaef9: mov    %ebx,%eax
  0x01eaaefb: jmp    *%edi
  0x01eaaefd: mov    0x4(%ecx),%ebx
  0x01eaaf00: cmp    0x8(%eax),%ebx
  0x01eaaf03: mov    0x4(%eax),%ebx
  0x01eaaf06: jne    0x01eaaf19
  0x01eaaf0c: cmpl   $0x0,0x30(%ebx)
  0x01eaaf13: je     0x01eaaf58
  0x01eaaf19: jmp    0x01ea32d0
  0x01eaaf1e: cmpl   $0x0,0x30(%ebx)
  0x01eaaf25: je     0x01eaaf58
  0x01eaaf2b: mov    (%esp),%eax
  0x01eaaf2e: pusha  
  0x01eaaf2f: pushf  
  0x01eaaf30: sub    $0x10,%esp
  0x01eaaf33: movsd  %xmm0,(%esp)
  0x01eaaf38: movsd  %xmm1,0x8(%esp)
  0x01eaaf3e: push   %eax
  0x01eaaf3f: push   %ebx
  0x01eaaf40: call   0x55be79d0
  0x01eaaf45: add    $0x8,%esp
  0x01eaaf48: movsd  (%esp),%xmm0
  0x01eaaf4d: movsd  0x8(%esp),%xmm1
  0x01eaaf53: add    $0x10,%esp
  0x01eaaf56: popf   
  0x01eaaf57: popa   
  0x01eaaf58: pop    %eax
  0x01eaaf59: mov    %esp,%esi
  0x01eaaf5b: sub    $0x18,%esp
  0x01eaaf5e: mov    %ecx,0x14(%esp)
  0x01eaaf62: mov    %edx,0x10(%esp)
  0x01eaaf66: mov    0x18(%esp),%edi
  0x01eaaf6a: mov    %edi,0xc(%esp)
  0x01eaaf6e: mov    0x1c(%esp),%edi
  0x01eaaf72: mov    %edi,0x8(%esp)
  0x01eaaf76: mov    0x20(%esp),%edi
  0x01eaaf7a: mov    %edi,0x4(%esp)
  0x01eaaf7e: mov    0x24(%esp),%edi
  0x01eaaf82: mov    %edi,(%esp)
  0x01eaaf85: mov    0x24(%ebx),%ecx
  0x01eaaf88: push   %eax
  0x01eaaf89: jmp    *%ecx

AHE@0x018f966c: 0xaaa00000 i2c: 0x01eab030 c2i: 0x01eab0c9 c2iUV: 0x01eab0a8
i2c argument handler #6 for: receiver (Ljava/lang/String;Ljava/lang/Throwable;)V (238 bytes generated)
c2i argument handler starts at 01EAB0C9
  0x01eab030: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eab033: mov    $0x1dc2940,%edi
  0x01eab038: cmp    %edi,%eax
  0x01eab03a: jbe    0x01eab04d
  0x01eab040: mov    $0x1ea2940,%edi
  0x01eab045: cmp    %edi,%eax
  0x01eab047: jb     0x01eab078
  0x01eab04d: mov    $0x1dc0340,%edi
  0x01eab052: cmp    %edi,%eax
  0x01eab054: jbe    0x01eab067
  0x01eab05a: mov    $0x1dc2668,%edi
  0x01eab05f: cmp    %edi,%eax
  0x01eab061: jb     0x01eab078
  ;; i2c adapter must return to an interpreter frame
  0x01eab067: push   $0x55ce723c
  0x01eab06c: call   0x01eab071
  0x01eab071: pusha  
  0x01eab072: call   0x557bdbf0
  0x01eab077: hlt    
  ;; } verify_i2ce 
  0x01eab078: mov    %esp,%edi
  0x01eab07a: sub    $0x8,%esp
  0x01eab07d: and    $0xfffffff0,%esp
  0x01eab080: push   %eax
  0x01eab081: mov    %edi,%eax
  0x01eab083: mov    0x2c(%ebx),%edi
  0x01eab086: mov    0xc(%eax),%ecx
  0x01eab089: mov    0x8(%eax),%edx
  0x01eab08c: mov    0x4(%eax),%esi
  0x01eab08f: mov    %esi,0x4(%esp)
  0x01eab093: mov    %fs:0x0(,%eiz,1),%eax
  0x01eab09b: mov    -0xc(%eax),%eax
  0x01eab09e: mov    %ebx,0x168(%eax)
  0x01eab0a4: mov    %ebx,%eax
  0x01eab0a6: jmp    *%edi
  0x01eab0a8: mov    0x4(%ecx),%ebx
  0x01eab0ab: cmp    0x8(%eax),%ebx
  0x01eab0ae: mov    0x4(%eax),%ebx
  0x01eab0b1: jne    0x01eab0c4
  0x01eab0b7: cmpl   $0x0,0x30(%ebx)
  0x01eab0be: je     0x01eab103
  0x01eab0c4: jmp    0x01ea32d0
  0x01eab0c9: cmpl   $0x0,0x30(%ebx)
  0x01eab0d0: je     0x01eab103
  0x01eab0d6: mov    (%esp),%eax
  0x01eab0d9: pusha  
  0x01eab0da: pushf  
  0x01eab0db: sub    $0x10,%esp
  0x01eab0de: movsd  %xmm0,(%esp)
  0x01eab0e3: movsd  %xmm1,0x8(%esp)
  0x01eab0e9: push   %eax
  0x01eab0ea: push   %ebx
  0x01eab0eb: call   0x55be79d0
  0x01eab0f0: add    $0x8,%esp
  0x01eab0f3: movsd  (%esp),%xmm0
  0x01eab0f8: movsd  0x8(%esp),%xmm1
  0x01eab0fe: add    $0x10,%esp
  0x01eab101: popf   
  0x01eab102: popa   
  0x01eab103: pop    %eax
  0x01eab104: mov    %esp,%esi
  0x01eab106: sub    $0xc,%esp
  0x01eab109: mov    %ecx,0x8(%esp)
  0x01eab10d: mov    %edx,0x4(%esp)
  0x01eab111: mov    0xc(%esp),%edi
  0x01eab115: mov    %edi,(%esp)
  0x01eab118: mov    0x24(%ebx),%ecx
  0x01eab11b: push   %eax
  0x01eab11c: jmp    *%ecx

AHE@0x018f9698: 0xaaaaa000 i2c: 0x01eab1b0 c2i: 0x01eab257 c2iUV: 0x01eab236
i2c argument handler #7 for: receiver (Ljava/lang/String;Ljava/lang/Throwable;ZZ)V (268 bytes generated)
c2i argument handler starts at 01EAB257
  0x01eab1b0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eab1b3: mov    $0x1dc2940,%edi
  0x01eab1b8: cmp    %edi,%eax
  0x01eab1ba: jbe    0x01eab1cd
  0x01eab1c0: mov    $0x1ea2940,%edi
  0x01eab1c5: cmp    %edi,%eax
  0x01eab1c7: jb     0x01eab1f8
  0x01eab1cd: mov    $0x1dc0340,%edi
  0x01eab1d2: cmp    %edi,%eax
  0x01eab1d4: jbe    0x01eab1e7
  0x01eab1da: mov    $0x1dc2668,%edi
  0x01eab1df: cmp    %edi,%eax
  0x01eab1e1: jb     0x01eab1f8
  ;; i2c adapter must return to an interpreter frame
  0x01eab1e7: push   $0x55ce723c
  0x01eab1ec: call   0x01eab1f1
  0x01eab1f1: pusha  
  0x01eab1f2: call   0x557bdbf0
  0x01eab1f7: hlt    
  ;; } verify_i2ce 
  0x01eab1f8: mov    %esp,%edi
  0x01eab1fa: sub    $0x10,%esp
  0x01eab1fd: and    $0xfffffff0,%esp
  0x01eab200: push   %eax
  0x01eab201: mov    %edi,%eax
  0x01eab203: mov    0x2c(%ebx),%edi
  0x01eab206: mov    0x14(%eax),%ecx
  0x01eab209: mov    0x10(%eax),%edx
  0x01eab20c: mov    0xc(%eax),%esi
  0x01eab20f: mov    %esi,0x4(%esp)
  0x01eab213: mov    0x8(%eax),%esi
  0x01eab216: mov    %esi,0x8(%esp)
  0x01eab21a: mov    0x4(%eax),%esi
  0x01eab21d: mov    %esi,0xc(%esp)
  0x01eab221: mov    %fs:0x0(,%eiz,1),%eax
  0x01eab229: mov    -0xc(%eax),%eax
  0x01eab22c: mov    %ebx,0x168(%eax)
  0x01eab232: mov    %ebx,%eax
  0x01eab234: jmp    *%edi
  0x01eab236: mov    0x4(%ecx),%ebx
  0x01eab239: cmp    0x8(%eax),%ebx
  0x01eab23c: mov    0x4(%eax),%ebx
  0x01eab23f: jne    0x01eab252
  0x01eab245: cmpl   $0x0,0x30(%ebx)
  0x01eab24c: je     0x01eab291
  0x01eab252: jmp    0x01ea32d0
  0x01eab257: cmpl   $0x0,0x30(%ebx)
  0x01eab25e: je     0x01eab291
  0x01eab264: mov    (%esp),%eax
  0x01eab267: pusha  
  0x01eab268: pushf  
  0x01eab269: sub    $0x10,%esp
  0x01eab26c: movsd  %xmm0,(%esp)
  0x01eab271: movsd  %xmm1,0x8(%esp)
  0x01eab277: push   %eax
  0x01eab278: push   %ebx
  0x01eab279: call   0x55be79d0
  0x01eab27e: add    $0x8,%esp
  0x01eab281: movsd  (%esp),%xmm0
  0x01eab286: movsd  0x8(%esp),%xmm1
  0x01eab28c: add    $0x10,%esp
  0x01eab28f: popf   
  0x01eab290: popa   
  0x01eab291: pop    %eax
  0x01eab292: mov    %esp,%esi
  0x01eab294: sub    $0x14,%esp
  0x01eab297: mov    %ecx,0x10(%esp)
  0x01eab29b: mov    %edx,0xc(%esp)
  0x01eab29f: mov    0x14(%esp),%edi
  0x01eab2a3: mov    %edi,0x8(%esp)
  0x01eab2a7: mov    0x18(%esp),%edi
  0x01eab2ab: mov    %edi,0x4(%esp)
  0x01eab2af: mov    0x1c(%esp),%edi
  0x01eab2b3: mov    %edi,(%esp)
  0x01eab2b6: mov    0x24(%ebx),%ecx
  0x01eab2b9: push   %eax
  0x01eab2ba: jmp    *%ecx

AHE@0x018f96c4: 0xaabebea0 i2c: 0x01eab330 c2i: 0x01eab3e5 c2iUV: 0x01eab3c4
i2c argument handler #8 for: receiver (Ljava/lang/Object;JJB)V (298 bytes generated)
c2i argument handler starts at 01EAB3E5
  0x01eab330: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eab333: mov    $0x1dc2940,%edi
  0x01eab338: cmp    %edi,%eax
  0x01eab33a: jbe    0x01eab34d
  0x01eab340: mov    $0x1ea2940,%edi
  0x01eab345: cmp    %edi,%eax
  0x01eab347: jb     0x01eab378
  0x01eab34d: mov    $0x1dc0340,%edi
  0x01eab352: cmp    %edi,%eax
  0x01eab354: jbe    0x01eab367
  0x01eab35a: mov    $0x1dc2668,%edi
  0x01eab35f: cmp    %edi,%eax
  0x01eab361: jb     0x01eab378
  ;; i2c adapter must return to an interpreter frame
  0x01eab367: push   $0x55ce723c
  0x01eab36c: call   0x01eab371
  0x01eab371: pusha  
  0x01eab372: call   0x557bdbf0
  0x01eab377: hlt    
  ;; } verify_i2ce 
  0x01eab378: mov    %esp,%edi
  0x01eab37a: sub    $0x18,%esp
  0x01eab37d: and    $0xfffffff0,%esp
  0x01eab380: push   %eax
  0x01eab381: mov    %edi,%eax
  0x01eab383: mov    0x2c(%ebx),%edi
  0x01eab386: mov    0x1c(%eax),%ecx
  0x01eab389: mov    0x18(%eax),%edx
  0x01eab38c: mov    0x10(%eax),%esi
  0x01eab38f: mov    %esi,0x4(%esp)
  0x01eab393: mov    0x14(%eax),%esi
  0x01eab396: mov    %esi,0x8(%esp)
  0x01eab39a: mov    0x8(%eax),%esi
  0x01eab39d: mov    %esi,0xc(%esp)
  0x01eab3a1: mov    0xc(%eax),%esi
  0x01eab3a4: mov    %esi,0x10(%esp)
  0x01eab3a8: mov    0x4(%eax),%esi
  0x01eab3ab: mov    %esi,0x14(%esp)
  0x01eab3af: mov    %fs:0x0(,%eiz,1),%eax
  0x01eab3b7: mov    -0xc(%eax),%eax
  0x01eab3ba: mov    %ebx,0x168(%eax)
  0x01eab3c0: mov    %ebx,%eax
  0x01eab3c2: jmp    *%edi
  0x01eab3c4: mov    0x4(%ecx),%ebx
  0x01eab3c7: cmp    0x8(%eax),%ebx
  0x01eab3ca: mov    0x4(%eax),%ebx
  0x01eab3cd: jne    0x01eab3e0
  0x01eab3d3: cmpl   $0x0,0x30(%ebx)
  0x01eab3da: je     0x01eab41f
  0x01eab3e0: jmp    0x01ea32d0
  0x01eab3e5: cmpl   $0x0,0x30(%ebx)
  0x01eab3ec: je     0x01eab41f
  0x01eab3f2: mov    (%esp),%eax
  0x01eab3f5: pusha  
  0x01eab3f6: pushf  
  0x01eab3f7: sub    $0x10,%esp
  0x01eab3fa: movsd  %xmm0,(%esp)
  0x01eab3ff: movsd  %xmm1,0x8(%esp)
  0x01eab405: push   %eax
  0x01eab406: push   %ebx
  0x01eab407: call   0x55be79d0
  0x01eab40c: add    $0x8,%esp
  0x01eab40f: movsd  (%esp),%xmm0
  0x01eab414: movsd  0x8(%esp),%xmm1
  0x01eab41a: add    $0x10,%esp
  0x01eab41d: popf   
  0x01eab41e: popa   
  0x01eab41f: pop    %eax
  0x01eab420: mov    %esp,%esi
  0x01eab422: sub    $0x1c,%esp
  0x01eab425: mov    %ecx,0x18(%esp)
  0x01eab429: mov    %edx,0x14(%esp)
  0x01eab42d: mov    0x1c(%esp),%edi
  0x01eab431: mov    %edi,0xc(%esp)
  0x01eab435: mov    0x20(%esp),%edi
  0x01eab439: mov    %edi,0x10(%esp)
  0x01eab43d: mov    0x24(%esp),%edi
  0x01eab441: mov    %edi,0x4(%esp)
  0x01eab445: mov    0x28(%esp),%edi
  0x01eab449: mov    %edi,0x8(%esp)
  0x01eab44d: mov    0x2c(%esp),%edi
  0x01eab451: mov    %edi,(%esp)
  0x01eab454: mov    0x24(%ebx),%ecx
  0x01eab457: push   %eax
  0x01eab458: jmp    *%ecx

AHE@0x018f96f0: 0xabebea00 i2c: 0x01eab4f0 c2i: 0x01eab59e c2iUV: 0x01eab57d
i2c argument handler #9 for: receiver (JJB)V (283 bytes generated)
c2i argument handler starts at 01EAB59E
  0x01eab4f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eab4f3: mov    $0x1dc2940,%edi
  0x01eab4f8: cmp    %edi,%eax
  0x01eab4fa: jbe    0x01eab50d
  0x01eab500: mov    $0x1ea2940,%edi
  0x01eab505: cmp    %edi,%eax
  0x01eab507: jb     0x01eab538
  0x01eab50d: mov    $0x1dc0340,%edi
  0x01eab512: cmp    %edi,%eax
  0x01eab514: jbe    0x01eab527
  0x01eab51a: mov    $0x1dc2668,%edi
  0x01eab51f: cmp    %edi,%eax
  0x01eab521: jb     0x01eab538
  ;; i2c adapter must return to an interpreter frame
  0x01eab527: push   $0x55ce723c
  0x01eab52c: call   0x01eab531
  0x01eab531: pusha  
  0x01eab532: call   0x557bdbf0
  0x01eab537: hlt    
  ;; } verify_i2ce 
  0x01eab538: mov    %esp,%edi
  0x01eab53a: sub    $0x10,%esp
  0x01eab53d: and    $0xfffffff0,%esp
  0x01eab540: push   %eax
  0x01eab541: mov    %edi,%eax
  0x01eab543: mov    0x2c(%ebx),%edi
  0x01eab546: mov    0x18(%eax),%ecx
  0x01eab549: mov    0x10(%eax),%esi
  0x01eab54c: mov    %esi,0x4(%esp)
  0x01eab550: mov    0x14(%eax),%esi
  0x01eab553: mov    %esi,0x8(%esp)
  0x01eab557: mov    0x8(%eax),%esi
  0x01eab55a: mov    %esi,0xc(%esp)
  0x01eab55e: mov    0xc(%eax),%esi
  0x01eab561: mov    %esi,0x10(%esp)
  0x01eab565: mov    0x4(%eax),%edx
  0x01eab568: mov    %fs:0x0(,%eiz,1),%eax
  0x01eab570: mov    -0xc(%eax),%eax
  0x01eab573: mov    %ebx,0x168(%eax)
  0x01eab579: mov    %ebx,%eax
  0x01eab57b: jmp    *%edi
  0x01eab57d: mov    0x4(%ecx),%ebx
  0x01eab580: cmp    0x8(%eax),%ebx
  0x01eab583: mov    0x4(%eax),%ebx
  0x01eab586: jne    0x01eab599
  0x01eab58c: cmpl   $0x0,0x30(%ebx)
  0x01eab593: je     0x01eab5d8
  0x01eab599: jmp    0x01ea32d0
  0x01eab59e: cmpl   $0x0,0x30(%ebx)
  0x01eab5a5: je     0x01eab5d8
  0x01eab5ab: mov    (%esp),%eax
  0x01eab5ae: pusha  
  0x01eab5af: pushf  
  0x01eab5b0: sub    $0x10,%esp
  0x01eab5b3: movsd  %xmm0,(%esp)
  0x01eab5b8: movsd  %xmm1,0x8(%esp)
  0x01eab5be: push   %eax
  0x01eab5bf: push   %ebx
  0x01eab5c0: call   0x55be79d0
  0x01eab5c5: add    $0x8,%esp
  0x01eab5c8: movsd  (%esp),%xmm0
  0x01eab5cd: movsd  0x8(%esp),%xmm1
  0x01eab5d3: add    $0x10,%esp
  0x01eab5d6: popf   
  0x01eab5d7: popa   
  0x01eab5d8: pop    %eax
  0x01eab5d9: mov    %esp,%esi
  0x01eab5db: sub    $0x18,%esp
  0x01eab5de: mov    %ecx,0x14(%esp)
  0x01eab5e2: mov    0x18(%esp),%edi
  0x01eab5e6: mov    %edi,0xc(%esp)
  0x01eab5ea: mov    0x1c(%esp),%edi
  0x01eab5ee: mov    %edi,0x10(%esp)
  0x01eab5f2: mov    0x20(%esp),%edi
  0x01eab5f6: mov    %edi,0x4(%esp)
  0x01eab5fa: mov    0x24(%esp),%edi
  0x01eab5fe: mov    %edi,0x8(%esp)
  0x01eab602: mov    %edx,(%esp)
  0x01eab605: mov    0x24(%ebx),%ecx
  0x01eab608: push   %eax
  0x01eab609: jmp    *%ecx

AHE@0x018f971c: 0xabebe000 i2c: 0x01eab6b0 c2i: 0x01eab75b c2iUV: 0x01eab73a
i2c argument handler #10 for: receiver (JJ)J (276 bytes generated)
c2i argument handler starts at 01EAB75B
  0x01eab6b0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eab6b3: mov    $0x1dc2940,%edi
  0x01eab6b8: cmp    %edi,%eax
  0x01eab6ba: jbe    0x01eab6cd
  0x01eab6c0: mov    $0x1ea2940,%edi
  0x01eab6c5: cmp    %edi,%eax
  0x01eab6c7: jb     0x01eab6f8
  0x01eab6cd: mov    $0x1dc0340,%edi
  0x01eab6d2: cmp    %edi,%eax
  0x01eab6d4: jbe    0x01eab6e7
  0x01eab6da: mov    $0x1dc2668,%edi
  0x01eab6df: cmp    %edi,%eax
  0x01eab6e1: jb     0x01eab6f8
  ;; i2c adapter must return to an interpreter frame
  0x01eab6e7: push   $0x55ce723c
  0x01eab6ec: call   0x01eab6f1
  0x01eab6f1: pusha  
  0x01eab6f2: call   0x557bdbf0
  0x01eab6f7: hlt    
  ;; } verify_i2ce 
  0x01eab6f8: mov    %esp,%edi
  0x01eab6fa: sub    $0x10,%esp
  0x01eab6fd: and    $0xfffffff0,%esp
  0x01eab700: push   %eax
  0x01eab701: mov    %edi,%eax
  0x01eab703: mov    0x2c(%ebx),%edi
  0x01eab706: mov    0x14(%eax),%ecx
  0x01eab709: mov    0xc(%eax),%esi
  0x01eab70c: mov    %esi,0x4(%esp)
  0x01eab710: mov    0x10(%eax),%esi
  0x01eab713: mov    %esi,0x8(%esp)
  0x01eab717: mov    0x4(%eax),%esi
  0x01eab71a: mov    %esi,0xc(%esp)
  0x01eab71e: mov    0x8(%eax),%esi
  0x01eab721: mov    %esi,0x10(%esp)
  0x01eab725: mov    %fs:0x0(,%eiz,1),%eax
  0x01eab72d: mov    -0xc(%eax),%eax
  0x01eab730: mov    %ebx,0x168(%eax)
  0x01eab736: mov    %ebx,%eax
  0x01eab738: jmp    *%edi
  0x01eab73a: mov    0x4(%ecx),%ebx
  0x01eab73d: cmp    0x8(%eax),%ebx
  0x01eab740: mov    0x4(%eax),%ebx
  0x01eab743: jne    0x01eab756
  0x01eab749: cmpl   $0x0,0x30(%ebx)
  0x01eab750: je     0x01eab795
  0x01eab756: jmp    0x01ea32d0
  0x01eab75b: cmpl   $0x0,0x30(%ebx)
  0x01eab762: je     0x01eab795
  0x01eab768: mov    (%esp),%eax
  0x01eab76b: pusha  
  0x01eab76c: pushf  
  0x01eab76d: sub    $0x10,%esp
  0x01eab770: movsd  %xmm0,(%esp)
  0x01eab775: movsd  %xmm1,0x8(%esp)
  0x01eab77b: push   %eax
  0x01eab77c: push   %ebx
  0x01eab77d: call   0x55be79d0
  0x01eab782: add    $0x8,%esp
  0x01eab785: movsd  (%esp),%xmm0
  0x01eab78a: movsd  0x8(%esp),%xmm1
  0x01eab790: add    $0x10,%esp
  0x01eab793: popf   
  0x01eab794: popa   
  0x01eab795: pop    %eax
  0x01eab796: mov    %esp,%esi
  0x01eab798: sub    $0x14,%esp
  0x01eab79b: mov    %ecx,0x10(%esp)
  0x01eab79f: mov    0x14(%esp),%edi
  0x01eab7a3: mov    %edi,0x8(%esp)
  0x01eab7a7: mov    0x18(%esp),%edi
  0x01eab7ab: mov    %edi,0xc(%esp)
  0x01eab7af: mov    0x1c(%esp),%edi
  0x01eab7b3: mov    %edi,(%esp)
  0x01eab7b6: mov    0x20(%esp),%edi
  0x01eab7ba: mov    %edi,0x4(%esp)
  0x01eab7be: mov    0x24(%ebx),%ecx
  0x01eab7c1: push   %eax
  0x01eab7c2: jmp    *%ecx

AHE@0x018f9748: 0xaaaa0000 i2c: 0x01eab870 c2i: 0x01eab910 c2iUV: 0x01eab8ef
i2c argument handler #11 for: receiver (Ljava/lang/Class;[B[Ljava/lang/Object;)Ljava/lang/Class; (253 bytes generated)
c2i argument handler starts at 01EAB910
  0x01eab870: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eab873: mov    $0x1dc2940,%edi
  0x01eab878: cmp    %edi,%eax
  0x01eab87a: jbe    0x01eab88d
  0x01eab880: mov    $0x1ea2940,%edi
  0x01eab885: cmp    %edi,%eax
  0x01eab887: jb     0x01eab8b8
  0x01eab88d: mov    $0x1dc0340,%edi
  0x01eab892: cmp    %edi,%eax
  0x01eab894: jbe    0x01eab8a7
  0x01eab89a: mov    $0x1dc2668,%edi
  0x01eab89f: cmp    %edi,%eax
  0x01eab8a1: jb     0x01eab8b8
  ;; i2c adapter must return to an interpreter frame
  0x01eab8a7: push   $0x55ce723c
  0x01eab8ac: call   0x01eab8b1
  0x01eab8b1: pusha  
  0x01eab8b2: call   0x557bdbf0
  0x01eab8b7: hlt    
  ;; } verify_i2ce 
  0x01eab8b8: mov    %esp,%edi
  0x01eab8ba: sub    $0x8,%esp
  0x01eab8bd: and    $0xfffffff0,%esp
  0x01eab8c0: push   %eax
  0x01eab8c1: mov    %edi,%eax
  0x01eab8c3: mov    0x2c(%ebx),%edi
  0x01eab8c6: mov    0x10(%eax),%ecx
  0x01eab8c9: mov    0xc(%eax),%edx
  0x01eab8cc: mov    0x8(%eax),%esi
  0x01eab8cf: mov    %esi,0x4(%esp)
  0x01eab8d3: mov    0x4(%eax),%esi
  0x01eab8d6: mov    %esi,0x8(%esp)
  0x01eab8da: mov    %fs:0x0(,%eiz,1),%eax
  0x01eab8e2: mov    -0xc(%eax),%eax
  0x01eab8e5: mov    %ebx,0x168(%eax)
  0x01eab8eb: mov    %ebx,%eax
  0x01eab8ed: jmp    *%edi
  0x01eab8ef: mov    0x4(%ecx),%ebx
  0x01eab8f2: cmp    0x8(%eax),%ebx
  0x01eab8f5: mov    0x4(%eax),%ebx
  0x01eab8f8: jne    0x01eab90b
  0x01eab8fe: cmpl   $0x0,0x30(%ebx)
  0x01eab905: je     0x01eab94a
  0x01eab90b: jmp    0x01ea32d0
  0x01eab910: cmpl   $0x0,0x30(%ebx)
  0x01eab917: je     0x01eab94a
  0x01eab91d: mov    (%esp),%eax
  0x01eab920: pusha  
  0x01eab921: pushf  
  0x01eab922: sub    $0x10,%esp
  0x01eab925: movsd  %xmm0,(%esp)
  0x01eab92a: movsd  %xmm1,0x8(%esp)
  0x01eab930: push   %eax
  0x01eab931: push   %ebx
  0x01eab932: call   0x55be79d0
  0x01eab937: add    $0x8,%esp
  0x01eab93a: movsd  (%esp),%xmm0
  0x01eab93f: movsd  0x8(%esp),%xmm1
  0x01eab945: add    $0x10,%esp
  0x01eab948: popf   
  0x01eab949: popa   
  0x01eab94a: pop    %eax
  0x01eab94b: mov    %esp,%esi
  0x01eab94d: sub    $0x10,%esp
  0x01eab950: mov    %ecx,0xc(%esp)
  0x01eab954: mov    %edx,0x8(%esp)
  0x01eab958: mov    0x10(%esp),%edi
  0x01eab95c: mov    %edi,0x4(%esp)
  0x01eab960: mov    0x14(%esp),%edi
  0x01eab964: mov    %edi,(%esp)
  0x01eab967: mov    0x24(%ebx),%ecx
  0x01eab96a: push   %eax
  0x01eab96b: jmp    *%ecx

AHE@0x018f9774: 0xaaaaaaa0 i2c: 0x01eab9f0 c2i: 0x01eabaa5 c2iUV: 0x01eaba84
i2c argument handler #12 for: receiver (Ljava/lang/String;[BIILjava/lang/ClassLoader;Ljava/security/ProtectionDomain;)Ljava/lang/Class; (298 bytes generated)
c2i argument handler starts at 01EABAA5
  0x01eab9f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eab9f3: mov    $0x1dc2940,%edi
  0x01eab9f8: cmp    %edi,%eax
  0x01eab9fa: jbe    0x01eaba0d
  0x01eaba00: mov    $0x1ea2940,%edi
  0x01eaba05: cmp    %edi,%eax
  0x01eaba07: jb     0x01eaba38
  0x01eaba0d: mov    $0x1dc0340,%edi
  0x01eaba12: cmp    %edi,%eax
  0x01eaba14: jbe    0x01eaba27
  0x01eaba1a: mov    $0x1dc2668,%edi
  0x01eaba1f: cmp    %edi,%eax
  0x01eaba21: jb     0x01eaba38
  ;; i2c adapter must return to an interpreter frame
  0x01eaba27: push   $0x55ce723c
  0x01eaba2c: call   0x01eaba31
  0x01eaba31: pusha  
  0x01eaba32: call   0x557bdbf0
  0x01eaba37: hlt    
  ;; } verify_i2ce 
  0x01eaba38: mov    %esp,%edi
  0x01eaba3a: sub    $0x18,%esp
  0x01eaba3d: and    $0xfffffff0,%esp
  0x01eaba40: push   %eax
  0x01eaba41: mov    %edi,%eax
  0x01eaba43: mov    0x2c(%ebx),%edi
  0x01eaba46: mov    0x1c(%eax),%ecx
  0x01eaba49: mov    0x18(%eax),%edx
  0x01eaba4c: mov    0x14(%eax),%esi
  0x01eaba4f: mov    %esi,0x4(%esp)
  0x01eaba53: mov    0x10(%eax),%esi
  0x01eaba56: mov    %esi,0x8(%esp)
  0x01eaba5a: mov    0xc(%eax),%esi
  0x01eaba5d: mov    %esi,0xc(%esp)
  0x01eaba61: mov    0x8(%eax),%esi
  0x01eaba64: mov    %esi,0x10(%esp)
  0x01eaba68: mov    0x4(%eax),%esi
  0x01eaba6b: mov    %esi,0x14(%esp)
  0x01eaba6f: mov    %fs:0x0(,%eiz,1),%eax
  0x01eaba77: mov    -0xc(%eax),%eax
  0x01eaba7a: mov    %ebx,0x168(%eax)
  0x01eaba80: mov    %ebx,%eax
  0x01eaba82: jmp    *%edi
  0x01eaba84: mov    0x4(%ecx),%ebx
  0x01eaba87: cmp    0x8(%eax),%ebx
  0x01eaba8a: mov    0x4(%eax),%ebx
  0x01eaba8d: jne    0x01eabaa0
  0x01eaba93: cmpl   $0x0,0x30(%ebx)
  0x01eaba9a: je     0x01eabadf
  0x01eabaa0: jmp    0x01ea32d0
  0x01eabaa5: cmpl   $0x0,0x30(%ebx)
  0x01eabaac: je     0x01eabadf
  0x01eabab2: mov    (%esp),%eax
  0x01eabab5: pusha  
  0x01eabab6: pushf  
  0x01eabab7: sub    $0x10,%esp
  0x01eababa: movsd  %xmm0,(%esp)
  0x01eababf: movsd  %xmm1,0x8(%esp)
  0x01eabac5: push   %eax
  0x01eabac6: push   %ebx
  0x01eabac7: call   0x55be79d0
  0x01eabacc: add    $0x8,%esp
  0x01eabacf: movsd  (%esp),%xmm0
  0x01eabad4: movsd  0x8(%esp),%xmm1
  0x01eabada: add    $0x10,%esp
  0x01eabadd: popf   
  0x01eabade: popa   
  0x01eabadf: pop    %eax
  0x01eabae0: mov    %esp,%esi
  0x01eabae2: sub    $0x1c,%esp
  0x01eabae5: mov    %ecx,0x18(%esp)
  0x01eabae9: mov    %edx,0x14(%esp)
  0x01eabaed: mov    0x1c(%esp),%edi
  0x01eabaf1: mov    %edi,0x10(%esp)
  0x01eabaf5: mov    0x20(%esp),%edi
  0x01eabaf9: mov    %edi,0xc(%esp)
  0x01eabafd: mov    0x24(%esp),%edi
  0x01eabb01: mov    %edi,0x8(%esp)
  0x01eabb05: mov    0x28(%esp),%edi
  0x01eabb09: mov    %edi,0x4(%esp)
  0x01eabb0d: mov    0x2c(%esp),%edi
  0x01eabb11: mov    %edi,(%esp)
  0x01eabb14: mov    0x24(%ebx),%ecx
  0x01eabb17: push   %eax
  0x01eabb18: jmp    *%ecx

AHE@0x018f97a0: 0xaabea000 i2c: 0x01eabbb0 c2i: 0x01eabc57 c2iUV: 0x01eabc36
i2c argument handler #13 for: receiver (Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object; (268 bytes generated)
c2i argument handler starts at 01EABC57
  0x01eabbb0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eabbb3: mov    $0x1dc2940,%edi
  0x01eabbb8: cmp    %edi,%eax
  0x01eabbba: jbe    0x01eabbcd
  0x01eabbc0: mov    $0x1ea2940,%edi
  0x01eabbc5: cmp    %edi,%eax
  0x01eabbc7: jb     0x01eabbf8
  0x01eabbcd: mov    $0x1dc0340,%edi
  0x01eabbd2: cmp    %edi,%eax
  0x01eabbd4: jbe    0x01eabbe7
  0x01eabbda: mov    $0x1dc2668,%edi
  0x01eabbdf: cmp    %edi,%eax
  0x01eabbe1: jb     0x01eabbf8
  ;; i2c adapter must return to an interpreter frame
  0x01eabbe7: push   $0x55ce723c
  0x01eabbec: call   0x01eabbf1
  0x01eabbf1: pusha  
  0x01eabbf2: call   0x557bdbf0
  0x01eabbf7: hlt    
  ;; } verify_i2ce 
  0x01eabbf8: mov    %esp,%edi
  0x01eabbfa: sub    $0x10,%esp
  0x01eabbfd: and    $0xfffffff0,%esp
  0x01eabc00: push   %eax
  0x01eabc01: mov    %edi,%eax
  0x01eabc03: mov    0x2c(%ebx),%edi
  0x01eabc06: mov    0x14(%eax),%ecx
  0x01eabc09: mov    0x10(%eax),%edx
  0x01eabc0c: mov    0x8(%eax),%esi
  0x01eabc0f: mov    %esi,0x4(%esp)
  0x01eabc13: mov    0xc(%eax),%esi
  0x01eabc16: mov    %esi,0x8(%esp)
  0x01eabc1a: mov    0x4(%eax),%esi
  0x01eabc1d: mov    %esi,0xc(%esp)
  0x01eabc21: mov    %fs:0x0(,%eiz,1),%eax
  0x01eabc29: mov    -0xc(%eax),%eax
  0x01eabc2c: mov    %ebx,0x168(%eax)
  0x01eabc32: mov    %ebx,%eax
  0x01eabc34: jmp    *%edi
  0x01eabc36: mov    0x4(%ecx),%ebx
  0x01eabc39: cmp    0x8(%eax),%ebx
  0x01eabc3c: mov    0x4(%eax),%ebx
  0x01eabc3f: jne    0x01eabc52
  0x01eabc45: cmpl   $0x0,0x30(%ebx)
  0x01eabc4c: je     0x01eabc91
  0x01eabc52: jmp    0x01ea32d0
  0x01eabc57: cmpl   $0x0,0x30(%ebx)
  0x01eabc5e: je     0x01eabc91
  0x01eabc64: mov    (%esp),%eax
  0x01eabc67: pusha  
  0x01eabc68: pushf  
  0x01eabc69: sub    $0x10,%esp
  0x01eabc6c: movsd  %xmm0,(%esp)
  0x01eabc71: movsd  %xmm1,0x8(%esp)
  0x01eabc77: push   %eax
  0x01eabc78: push   %ebx
  0x01eabc79: call   0x55be79d0
  0x01eabc7e: add    $0x8,%esp
  0x01eabc81: movsd  (%esp),%xmm0
  0x01eabc86: movsd  0x8(%esp),%xmm1
  0x01eabc8c: add    $0x10,%esp
  0x01eabc8f: popf   
  0x01eabc90: popa   
  0x01eabc91: pop    %eax
  0x01eabc92: mov    %esp,%esi
  0x01eabc94: sub    $0x14,%esp
  0x01eabc97: mov    %ecx,0x10(%esp)
  0x01eabc9b: mov    %edx,0xc(%esp)
  0x01eabc9f: mov    0x14(%esp),%edi
  0x01eabca3: mov    %edi,0x4(%esp)
  0x01eabca7: mov    0x18(%esp),%edi
  0x01eabcab: mov    %edi,0x8(%esp)
  0x01eabcaf: mov    0x1c(%esp),%edi
  0x01eabcb3: mov    %edi,(%esp)
  0x01eabcb6: mov    0x24(%ebx),%ecx
  0x01eabcb9: push   %eax
  0x01eabcba: jmp    *%ecx

AHE@0x018f97cc: 0xaabebe00 i2c: 0x01eabd30 c2i: 0x01eabdde c2iUV: 0x01eabdbd
i2c argument handler #14 for: receiver (Ljava/lang/Object;JJ)J (283 bytes generated)
c2i argument handler starts at 01EABDDE
  0x01eabd30: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eabd33: mov    $0x1dc2940,%edi
  0x01eabd38: cmp    %edi,%eax
  0x01eabd3a: jbe    0x01eabd4d
  0x01eabd40: mov    $0x1ea2940,%edi
  0x01eabd45: cmp    %edi,%eax
  0x01eabd47: jb     0x01eabd78
  0x01eabd4d: mov    $0x1dc0340,%edi
  0x01eabd52: cmp    %edi,%eax
  0x01eabd54: jbe    0x01eabd67
  0x01eabd5a: mov    $0x1dc2668,%edi
  0x01eabd5f: cmp    %edi,%eax
  0x01eabd61: jb     0x01eabd78
  ;; i2c adapter must return to an interpreter frame
  0x01eabd67: push   $0x55ce723c
  0x01eabd6c: call   0x01eabd71
  0x01eabd71: pusha  
  0x01eabd72: call   0x557bdbf0
  0x01eabd77: hlt    
  ;; } verify_i2ce 
  0x01eabd78: mov    %esp,%edi
  0x01eabd7a: sub    $0x10,%esp
  0x01eabd7d: and    $0xfffffff0,%esp
  0x01eabd80: push   %eax
  0x01eabd81: mov    %edi,%eax
  0x01eabd83: mov    0x2c(%ebx),%edi
  0x01eabd86: mov    0x18(%eax),%ecx
  0x01eabd89: mov    0x14(%eax),%edx
  0x01eabd8c: mov    0xc(%eax),%esi
  0x01eabd8f: mov    %esi,0x4(%esp)
  0x01eabd93: mov    0x10(%eax),%esi
  0x01eabd96: mov    %esi,0x8(%esp)
  0x01eabd9a: mov    0x4(%eax),%esi
  0x01eabd9d: mov    %esi,0xc(%esp)
  0x01eabda1: mov    0x8(%eax),%esi
  0x01eabda4: mov    %esi,0x10(%esp)
  0x01eabda8: mov    %fs:0x0(,%eiz,1),%eax
  0x01eabdb0: mov    -0xc(%eax),%eax
  0x01eabdb3: mov    %ebx,0x168(%eax)
  0x01eabdb9: mov    %ebx,%eax
  0x01eabdbb: jmp    *%edi
  0x01eabdbd: mov    0x4(%ecx),%ebx
  0x01eabdc0: cmp    0x8(%eax),%ebx
  0x01eabdc3: mov    0x4(%eax),%ebx
  0x01eabdc6: jne    0x01eabdd9
  0x01eabdcc: cmpl   $0x0,0x30(%ebx)
  0x01eabdd3: je     0x01eabe18
  0x01eabdd9: jmp    0x01ea32d0
  0x01eabdde: cmpl   $0x0,0x30(%ebx)
  0x01eabde5: je     0x01eabe18
  0x01eabdeb: mov    (%esp),%eax
  0x01eabdee: pusha  
  0x01eabdef: pushf  
  0x01eabdf0: sub    $0x10,%esp
  0x01eabdf3: movsd  %xmm0,(%esp)
  0x01eabdf8: movsd  %xmm1,0x8(%esp)
  0x01eabdfe: push   %eax
  0x01eabdff: push   %ebx
  0x01eabe00: call   0x55be79d0
  0x01eabe05: add    $0x8,%esp
  0x01eabe08: movsd  (%esp),%xmm0
  0x01eabe0d: movsd  0x8(%esp),%xmm1
  0x01eabe13: add    $0x10,%esp
  0x01eabe16: popf   
  0x01eabe17: popa   
  0x01eabe18: pop    %eax
  0x01eabe19: mov    %esp,%esi
  0x01eabe1b: sub    $0x18,%esp
  0x01eabe1e: mov    %ecx,0x14(%esp)
  0x01eabe22: mov    %edx,0x10(%esp)
  0x01eabe26: mov    0x18(%esp),%edi
  0x01eabe2a: mov    %edi,0x8(%esp)
  0x01eabe2e: mov    0x1c(%esp),%edi
  0x01eabe32: mov    %edi,0xc(%esp)
  0x01eabe36: mov    0x20(%esp),%edi
  0x01eabe3a: mov    %edi,(%esp)
  0x01eabe3d: mov    0x24(%esp),%edi
  0x01eabe41: mov    %edi,0x4(%esp)
  0x01eabe45: mov    0x24(%ebx),%ecx
  0x01eabe48: push   %eax
  0x01eabe49: jmp    *%ecx

AHE@0x018f97f8: 0xaabeaa00 i2c: 0x01eabef0 c2i: 0x01eabf9e c2iUV: 0x01eabf7d
i2c argument handler #15 for: receiver (Ljava/lang/Object;JII)Z (283 bytes generated)
c2i argument handler starts at 01EABF9E
  0x01eabef0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eabef3: mov    $0x1dc2940,%edi
  0x01eabef8: cmp    %edi,%eax
  0x01eabefa: jbe    0x01eabf0d
  0x01eabf00: mov    $0x1ea2940,%edi
  0x01eabf05: cmp    %edi,%eax
  0x01eabf07: jb     0x01eabf38
  0x01eabf0d: mov    $0x1dc0340,%edi
  0x01eabf12: cmp    %edi,%eax
  0x01eabf14: jbe    0x01eabf27
  0x01eabf1a: mov    $0x1dc2668,%edi
  0x01eabf1f: cmp    %edi,%eax
  0x01eabf21: jb     0x01eabf38
  ;; i2c adapter must return to an interpreter frame
  0x01eabf27: push   $0x55ce723c
  0x01eabf2c: call   0x01eabf31
  0x01eabf31: pusha  
  0x01eabf32: call   0x557bdbf0
  0x01eabf37: hlt    
  ;; } verify_i2ce 
  0x01eabf38: mov    %esp,%edi
  0x01eabf3a: sub    $0x10,%esp
  0x01eabf3d: and    $0xfffffff0,%esp
  0x01eabf40: push   %eax
  0x01eabf41: mov    %edi,%eax
  0x01eabf43: mov    0x2c(%ebx),%edi
  0x01eabf46: mov    0x18(%eax),%ecx
  0x01eabf49: mov    0x14(%eax),%edx
  0x01eabf4c: mov    0xc(%eax),%esi
  0x01eabf4f: mov    %esi,0x4(%esp)
  0x01eabf53: mov    0x10(%eax),%esi
  0x01eabf56: mov    %esi,0x8(%esp)
  0x01eabf5a: mov    0x8(%eax),%esi
  0x01eabf5d: mov    %esi,0xc(%esp)
  0x01eabf61: mov    0x4(%eax),%esi
  0x01eabf64: mov    %esi,0x10(%esp)
  0x01eabf68: mov    %fs:0x0(,%eiz,1),%eax
  0x01eabf70: mov    -0xc(%eax),%eax
  0x01eabf73: mov    %ebx,0x168(%eax)
  0x01eabf79: mov    %ebx,%eax
  0x01eabf7b: jmp    *%edi
  0x01eabf7d: mov    0x4(%ecx),%ebx
  0x01eabf80: cmp    0x8(%eax),%ebx
  0x01eabf83: mov    0x4(%eax),%ebx
  0x01eabf86: jne    0x01eabf99
  0x01eabf8c: cmpl   $0x0,0x30(%ebx)
  0x01eabf93: je     0x01eabfd8
  0x01eabf99: jmp    0x01ea32d0
  0x01eabf9e: cmpl   $0x0,0x30(%ebx)
  0x01eabfa5: je     0x01eabfd8
  0x01eabfab: mov    (%esp),%eax
  0x01eabfae: pusha  
  0x01eabfaf: pushf  
  0x01eabfb0: sub    $0x10,%esp
  0x01eabfb3: movsd  %xmm0,(%esp)
  0x01eabfb8: movsd  %xmm1,0x8(%esp)
  0x01eabfbe: push   %eax
  0x01eabfbf: push   %ebx
  0x01eabfc0: call   0x55be79d0
  0x01eabfc5: add    $0x8,%esp
  0x01eabfc8: movsd  (%esp),%xmm0
  0x01eabfcd: movsd  0x8(%esp),%xmm1
  0x01eabfd3: add    $0x10,%esp
  0x01eabfd6: popf   
  0x01eabfd7: popa   
  0x01eabfd8: pop    %eax
  0x01eabfd9: mov    %esp,%esi
  0x01eabfdb: sub    $0x18,%esp
  0x01eabfde: mov    %ecx,0x14(%esp)
  0x01eabfe2: mov    %edx,0x10(%esp)
  0x01eabfe6: mov    0x18(%esp),%edi
  0x01eabfea: mov    %edi,0x8(%esp)
  0x01eabfee: mov    0x1c(%esp),%edi
  0x01eabff2: mov    %edi,0xc(%esp)
  0x01eabff6: mov    0x20(%esp),%edi
  0x01eabffa: mov    %edi,0x4(%esp)
  0x01eabffe: mov    0x24(%esp),%edi
  0x01eac002: mov    %edi,(%esp)
  0x01eac005: mov    0x24(%ebx),%ecx
  0x01eac008: push   %eax
  0x01eac009: jmp    *%ecx

AHE@0x018f9824: 0xaabebebe i2c: 0x01eac0b0 c2i: 0x01eac16c c2iUV: 0x01eac14b
i2c argument handler #16 for: receiver (Ljava/lang/Object;JJJ)Z (313 bytes generated)
c2i argument handler starts at 01EAC16C
  0x01eac0b0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eac0b3: mov    $0x1dc2940,%edi
  0x01eac0b8: cmp    %edi,%eax
  0x01eac0ba: jbe    0x01eac0cd
  0x01eac0c0: mov    $0x1ea2940,%edi
  0x01eac0c5: cmp    %edi,%eax
  0x01eac0c7: jb     0x01eac0f8
  0x01eac0cd: mov    $0x1dc0340,%edi
  0x01eac0d2: cmp    %edi,%eax
  0x01eac0d4: jbe    0x01eac0e7
  0x01eac0da: mov    $0x1dc2668,%edi
  0x01eac0df: cmp    %edi,%eax
  0x01eac0e1: jb     0x01eac0f8
  ;; i2c adapter must return to an interpreter frame
  0x01eac0e7: push   $0x55ce723c
  0x01eac0ec: call   0x01eac0f1
  0x01eac0f1: pusha  
  0x01eac0f2: call   0x557bdbf0
  0x01eac0f7: hlt    
  ;; } verify_i2ce 
  0x01eac0f8: mov    %esp,%edi
  0x01eac0fa: sub    $0x18,%esp
  0x01eac0fd: and    $0xfffffff0,%esp
  0x01eac100: push   %eax
  0x01eac101: mov    %edi,%eax
  0x01eac103: mov    0x2c(%ebx),%edi
  0x01eac106: mov    0x20(%eax),%ecx
  0x01eac109: mov    0x1c(%eax),%edx
  0x01eac10c: mov    0x14(%eax),%esi
  0x01eac10f: mov    %esi,0x4(%esp)
  0x01eac113: mov    0x18(%eax),%esi
  0x01eac116: mov    %esi,0x8(%esp)
  0x01eac11a: mov    0xc(%eax),%esi
  0x01eac11d: mov    %esi,0xc(%esp)
  0x01eac121: mov    0x10(%eax),%esi
  0x01eac124: mov    %esi,0x10(%esp)
  0x01eac128: mov    0x4(%eax),%esi
  0x01eac12b: mov    %esi,0x14(%esp)
  0x01eac12f: mov    0x8(%eax),%esi
  0x01eac132: mov    %esi,0x18(%esp)
  0x01eac136: mov    %fs:0x0(,%eiz,1),%eax
  0x01eac13e: mov    -0xc(%eax),%eax
  0x01eac141: mov    %ebx,0x168(%eax)
  0x01eac147: mov    %ebx,%eax
  0x01eac149: jmp    *%edi
  0x01eac14b: mov    0x4(%ecx),%ebx
  0x01eac14e: cmp    0x8(%eax),%ebx
  0x01eac151: mov    0x4(%eax),%ebx
  0x01eac154: jne    0x01eac167
  0x01eac15a: cmpl   $0x0,0x30(%ebx)
  0x01eac161: je     0x01eac1a6
  0x01eac167: jmp    0x01ea32d0
  0x01eac16c: cmpl   $0x0,0x30(%ebx)
  0x01eac173: je     0x01eac1a6
  0x01eac179: mov    (%esp),%eax
  0x01eac17c: pusha  
  0x01eac17d: pushf  
  0x01eac17e: sub    $0x10,%esp
  0x01eac181: movsd  %xmm0,(%esp)
  0x01eac186: movsd  %xmm1,0x8(%esp)
  0x01eac18c: push   %eax
  0x01eac18d: push   %ebx
  0x01eac18e: call   0x55be79d0
  0x01eac193: add    $0x8,%esp
  0x01eac196: movsd  (%esp),%xmm0
  0x01eac19b: movsd  0x8(%esp),%xmm1
  0x01eac1a1: add    $0x10,%esp
  0x01eac1a4: popf   
  0x01eac1a5: popa   
  0x01eac1a6: pop    %eax
  0x01eac1a7: mov    %esp,%esi
  0x01eac1a9: sub    $0x20,%esp
  0x01eac1ac: mov    %ecx,0x1c(%esp)
  0x01eac1b0: mov    %edx,0x18(%esp)
  0x01eac1b4: mov    0x20(%esp),%edi
  0x01eac1b8: mov    %edi,0x10(%esp)
  0x01eac1bc: mov    0x24(%esp),%edi
  0x01eac1c0: mov    %edi,0x14(%esp)
  0x01eac1c4: mov    0x28(%esp),%edi
  0x01eac1c8: mov    %edi,0x8(%esp)
  0x01eac1cc: mov    0x2c(%esp),%edi
  0x01eac1d0: mov    %edi,0xc(%esp)
  0x01eac1d4: mov    0x30(%esp),%edi
  0x01eac1d8: mov    %edi,(%esp)
  0x01eac1db: mov    0x34(%esp),%edi
  0x01eac1df: mov    %edi,0x4(%esp)
  0x01eac1e3: mov    0x24(%ebx),%ecx
  0x01eac1e6: push   %eax
  0x01eac1e7: jmp    *%ecx

AHE@0x018f9850: 0xaabe7e00 i2c: 0x01eac270 c2i: 0x01eac315 c2iUV: 0x01eac2f4
i2c argument handler #17 for: receiver (Ljava/lang/Object;JD)V (264 bytes generated)
c2i argument handler starts at 01EAC315
  0x01eac270: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eac273: mov    $0x1dc2940,%edi
  0x01eac278: cmp    %edi,%eax
  0x01eac27a: jbe    0x01eac28d
  0x01eac280: mov    $0x1ea2940,%edi
  0x01eac285: cmp    %edi,%eax
  0x01eac287: jb     0x01eac2b8
  0x01eac28d: mov    $0x1dc0340,%edi
  0x01eac292: cmp    %edi,%eax
  0x01eac294: jbe    0x01eac2a7
  0x01eac29a: mov    $0x1dc2668,%edi
  0x01eac29f: cmp    %edi,%eax
  0x01eac2a1: jb     0x01eac2b8
  ;; i2c adapter must return to an interpreter frame
  0x01eac2a7: push   $0x55ce723c
  0x01eac2ac: call   0x01eac2b1
  0x01eac2b1: pusha  
  0x01eac2b2: call   0x557bdbf0
  0x01eac2b7: hlt    
  ;; } verify_i2ce 
  0x01eac2b8: mov    %esp,%edi
  0x01eac2ba: sub    $0x8,%esp
  0x01eac2bd: and    $0xfffffff0,%esp
  0x01eac2c0: push   %eax
  0x01eac2c1: mov    %edi,%eax
  0x01eac2c3: mov    0x2c(%ebx),%edi
  0x01eac2c6: mov    0x18(%eax),%ecx
  0x01eac2c9: mov    0x14(%eax),%edx
  0x01eac2cc: mov    0xc(%eax),%esi
  0x01eac2cf: mov    %esi,0x4(%esp)
  0x01eac2d3: mov    0x10(%eax),%esi
  0x01eac2d6: mov    %esi,0x8(%esp)
  0x01eac2da: movsd  0x4(%eax),%xmm0
  0x01eac2df: mov    %fs:0x0(,%eiz,1),%eax
  0x01eac2e7: mov    -0xc(%eax),%eax
  0x01eac2ea: mov    %ebx,0x168(%eax)
  0x01eac2f0: mov    %ebx,%eax
  0x01eac2f2: jmp    *%edi
  0x01eac2f4: mov    0x4(%ecx),%ebx
  0x01eac2f7: cmp    0x8(%eax),%ebx
  0x01eac2fa: mov    0x4(%eax),%ebx
  0x01eac2fd: jne    0x01eac310
  0x01eac303: cmpl   $0x0,0x30(%ebx)
  0x01eac30a: je     0x01eac34f
  0x01eac310: jmp    0x01ea32d0
  0x01eac315: cmpl   $0x0,0x30(%ebx)
  0x01eac31c: je     0x01eac34f
  0x01eac322: mov    (%esp),%eax
  0x01eac325: pusha  
  0x01eac326: pushf  
  0x01eac327: sub    $0x10,%esp
  0x01eac32a: movsd  %xmm0,(%esp)
  0x01eac32f: movsd  %xmm1,0x8(%esp)
  0x01eac335: push   %eax
  0x01eac336: push   %ebx
  0x01eac337: call   0x55be79d0
  0x01eac33c: add    $0x8,%esp
  0x01eac33f: movsd  (%esp),%xmm0
  0x01eac344: movsd  0x8(%esp),%xmm1
  0x01eac34a: add    $0x10,%esp
  0x01eac34d: popf   
  0x01eac34e: popa   
  0x01eac34f: pop    %eax
  0x01eac350: mov    %esp,%esi
  0x01eac352: sub    $0x18,%esp
  0x01eac355: mov    %ecx,0x14(%esp)
  0x01eac359: mov    %edx,0x10(%esp)
  0x01eac35d: mov    0x18(%esp),%edi
  0x01eac361: mov    %edi,0x8(%esp)
  0x01eac365: mov    0x1c(%esp),%edi
  0x01eac369: mov    %edi,0xc(%esp)
  0x01eac36d: movsd  %xmm0,(%esp)
  0x01eac372: mov    0x24(%ebx),%ecx
  0x01eac375: push   %eax
  0x01eac376: jmp    *%ecx

AHE@0x018f987c: 0xaabe0000 i2c: 0x01eac3f0 c2i: 0x01eac490 c2iUV: 0x01eac46f
i2c argument handler #18 for: receiver (Ljava/lang/Object;J)D (253 bytes generated)
c2i argument handler starts at 01EAC490
  0x01eac3f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eac3f3: mov    $0x1dc2940,%edi
  0x01eac3f8: cmp    %edi,%eax
  0x01eac3fa: jbe    0x01eac40d
  0x01eac400: mov    $0x1ea2940,%edi
  0x01eac405: cmp    %edi,%eax
  0x01eac407: jb     0x01eac438
  0x01eac40d: mov    $0x1dc0340,%edi
  0x01eac412: cmp    %edi,%eax
  0x01eac414: jbe    0x01eac427
  0x01eac41a: mov    $0x1dc2668,%edi
  0x01eac41f: cmp    %edi,%eax
  0x01eac421: jb     0x01eac438
  ;; i2c adapter must return to an interpreter frame
  0x01eac427: push   $0x55ce723c
  0x01eac42c: call   0x01eac431
  0x01eac431: pusha  
  0x01eac432: call   0x557bdbf0
  0x01eac437: hlt    
  ;; } verify_i2ce 
  0x01eac438: mov    %esp,%edi
  0x01eac43a: sub    $0x8,%esp
  0x01eac43d: and    $0xfffffff0,%esp
  0x01eac440: push   %eax
  0x01eac441: mov    %edi,%eax
  0x01eac443: mov    0x2c(%ebx),%edi
  0x01eac446: mov    0x10(%eax),%ecx
  0x01eac449: mov    0xc(%eax),%edx
  0x01eac44c: mov    0x4(%eax),%esi
  0x01eac44f: mov    %esi,0x4(%esp)
  0x01eac453: mov    0x8(%eax),%esi
  0x01eac456: mov    %esi,0x8(%esp)
  0x01eac45a: mov    %fs:0x0(,%eiz,1),%eax
  0x01eac462: mov    -0xc(%eax),%eax
  0x01eac465: mov    %ebx,0x168(%eax)
  0x01eac46b: mov    %ebx,%eax
  0x01eac46d: jmp    *%edi
  0x01eac46f: mov    0x4(%ecx),%ebx
  0x01eac472: cmp    0x8(%eax),%ebx
  0x01eac475: mov    0x4(%eax),%ebx
  0x01eac478: jne    0x01eac48b
  0x01eac47e: cmpl   $0x0,0x30(%ebx)
  0x01eac485: je     0x01eac4ca
  0x01eac48b: jmp    0x01ea32d0
  0x01eac490: cmpl   $0x0,0x30(%ebx)
  0x01eac497: je     0x01eac4ca
  0x01eac49d: mov    (%esp),%eax
  0x01eac4a0: pusha  
  0x01eac4a1: pushf  
  0x01eac4a2: sub    $0x10,%esp
  0x01eac4a5: movsd  %xmm0,(%esp)
  0x01eac4aa: movsd  %xmm1,0x8(%esp)
  0x01eac4b0: push   %eax
  0x01eac4b1: push   %ebx
  0x01eac4b2: call   0x55be79d0
  0x01eac4b7: add    $0x8,%esp
  0x01eac4ba: movsd  (%esp),%xmm0
  0x01eac4bf: movsd  0x8(%esp),%xmm1
  0x01eac4c5: add    $0x10,%esp
  0x01eac4c8: popf   
  0x01eac4c9: popa   
  0x01eac4ca: pop    %eax
  0x01eac4cb: mov    %esp,%esi
  0x01eac4cd: sub    $0x10,%esp
  0x01eac4d0: mov    %ecx,0xc(%esp)
  0x01eac4d4: mov    %edx,0x8(%esp)
  0x01eac4d8: mov    0x10(%esp),%edi
  0x01eac4dc: mov    %edi,(%esp)
  0x01eac4df: mov    0x14(%esp),%edi
  0x01eac4e3: mov    %edi,0x4(%esp)
  0x01eac4e7: mov    0x24(%ebx),%ecx
  0x01eac4ea: push   %eax
  0x01eac4eb: jmp    *%ecx

AHE@0x018f98a8: 0xaabe6000 i2c: 0x01eac570 c2i: 0x01eac615 c2iUV: 0x01eac5f4
i2c argument handler #19 for: receiver (Ljava/lang/Object;JF)V (264 bytes generated)
c2i argument handler starts at 01EAC615
  0x01eac570: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eac573: mov    $0x1dc2940,%edi
  0x01eac578: cmp    %edi,%eax
  0x01eac57a: jbe    0x01eac58d
  0x01eac580: mov    $0x1ea2940,%edi
  0x01eac585: cmp    %edi,%eax
  0x01eac587: jb     0x01eac5b8
  0x01eac58d: mov    $0x1dc0340,%edi
  0x01eac592: cmp    %edi,%eax
  0x01eac594: jbe    0x01eac5a7
  0x01eac59a: mov    $0x1dc2668,%edi
  0x01eac59f: cmp    %edi,%eax
  0x01eac5a1: jb     0x01eac5b8
  ;; i2c adapter must return to an interpreter frame
  0x01eac5a7: push   $0x55ce723c
  0x01eac5ac: call   0x01eac5b1
  0x01eac5b1: pusha  
  0x01eac5b2: call   0x557bdbf0
  0x01eac5b7: hlt    
  ;; } verify_i2ce 
  0x01eac5b8: mov    %esp,%edi
  0x01eac5ba: sub    $0x8,%esp
  0x01eac5bd: and    $0xfffffff0,%esp
  0x01eac5c0: push   %eax
  0x01eac5c1: mov    %edi,%eax
  0x01eac5c3: mov    0x2c(%ebx),%edi
  0x01eac5c6: mov    0x14(%eax),%ecx
  0x01eac5c9: mov    0x10(%eax),%edx
  0x01eac5cc: mov    0x8(%eax),%esi
  0x01eac5cf: mov    %esi,0x4(%esp)
  0x01eac5d3: mov    0xc(%eax),%esi
  0x01eac5d6: mov    %esi,0x8(%esp)
  0x01eac5da: movss  0x4(%eax),%xmm0
  0x01eac5df: mov    %fs:0x0(,%eiz,1),%eax
  0x01eac5e7: mov    -0xc(%eax),%eax
  0x01eac5ea: mov    %ebx,0x168(%eax)
  0x01eac5f0: mov    %ebx,%eax
  0x01eac5f2: jmp    *%edi
  0x01eac5f4: mov    0x4(%ecx),%ebx
  0x01eac5f7: cmp    0x8(%eax),%ebx
  0x01eac5fa: mov    0x4(%eax),%ebx
  0x01eac5fd: jne    0x01eac610
  0x01eac603: cmpl   $0x0,0x30(%ebx)
  0x01eac60a: je     0x01eac64f
  0x01eac610: jmp    0x01ea32d0
  0x01eac615: cmpl   $0x0,0x30(%ebx)
  0x01eac61c: je     0x01eac64f
  0x01eac622: mov    (%esp),%eax
  0x01eac625: pusha  
  0x01eac626: pushf  
  0x01eac627: sub    $0x10,%esp
  0x01eac62a: movsd  %xmm0,(%esp)
  0x01eac62f: movsd  %xmm1,0x8(%esp)
  0x01eac635: push   %eax
  0x01eac636: push   %ebx
  0x01eac637: call   0x55be79d0
  0x01eac63c: add    $0x8,%esp
  0x01eac63f: movsd  (%esp),%xmm0
  0x01eac644: movsd  0x8(%esp),%xmm1
  0x01eac64a: add    $0x10,%esp
  0x01eac64d: popf   
  0x01eac64e: popa   
  0x01eac64f: pop    %eax
  0x01eac650: mov    %esp,%esi
  0x01eac652: sub    $0x14,%esp
  0x01eac655: mov    %ecx,0x10(%esp)
  0x01eac659: mov    %edx,0xc(%esp)
  0x01eac65d: mov    0x14(%esp),%edi
  0x01eac661: mov    %edi,0x4(%esp)
  0x01eac665: mov    0x18(%esp),%edi
  0x01eac669: mov    %edi,0x8(%esp)
  0x01eac66d: movss  %xmm0,(%esp)
  0x01eac672: mov    0x24(%ebx),%ecx
  0x01eac675: push   %eax
  0x01eac676: jmp    *%ecx

AHE@0x018f98d4: 0xabe7e000 i2c: 0x01eac6f0 c2i: 0x01eac792 c2iUV: 0x01eac771
i2c argument handler #20 for: receiver (JD)V (257 bytes generated)
c2i argument handler starts at 01EAC792
  0x01eac6f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eac6f3: mov    $0x1dc2940,%edi
  0x01eac6f8: cmp    %edi,%eax
  0x01eac6fa: jbe    0x01eac70d
  0x01eac700: mov    $0x1ea2940,%edi
  0x01eac705: cmp    %edi,%eax
  0x01eac707: jb     0x01eac738
  0x01eac70d: mov    $0x1dc0340,%edi
  0x01eac712: cmp    %edi,%eax
  0x01eac714: jbe    0x01eac727
  0x01eac71a: mov    $0x1dc2668,%edi
  0x01eac71f: cmp    %edi,%eax
  0x01eac721: jb     0x01eac738
  ;; i2c adapter must return to an interpreter frame
  0x01eac727: push   $0x55ce723c
  0x01eac72c: call   0x01eac731
  0x01eac731: pusha  
  0x01eac732: call   0x557bdbf0
  0x01eac737: hlt    
  ;; } verify_i2ce 
  0x01eac738: mov    %esp,%edi
  0x01eac73a: sub    $0x8,%esp
  0x01eac73d: and    $0xfffffff0,%esp
  0x01eac740: push   %eax
  0x01eac741: mov    %edi,%eax
  0x01eac743: mov    0x2c(%ebx),%edi
  0x01eac746: mov    0x14(%eax),%ecx
  0x01eac749: mov    0xc(%eax),%esi
  0x01eac74c: mov    %esi,0x4(%esp)
  0x01eac750: mov    0x10(%eax),%esi
  0x01eac753: mov    %esi,0x8(%esp)
  0x01eac757: movsd  0x4(%eax),%xmm0
  0x01eac75c: mov    %fs:0x0(,%eiz,1),%eax
  0x01eac764: mov    -0xc(%eax),%eax
  0x01eac767: mov    %ebx,0x168(%eax)
  0x01eac76d: mov    %ebx,%eax
  0x01eac76f: jmp    *%edi
  0x01eac771: mov    0x4(%ecx),%ebx
  0x01eac774: cmp    0x8(%eax),%ebx
  0x01eac777: mov    0x4(%eax),%ebx
  0x01eac77a: jne    0x01eac78d
  0x01eac780: cmpl   $0x0,0x30(%ebx)
  0x01eac787: je     0x01eac7cc
  0x01eac78d: jmp    0x01ea32d0
  0x01eac792: cmpl   $0x0,0x30(%ebx)
  0x01eac799: je     0x01eac7cc
  0x01eac79f: mov    (%esp),%eax
  0x01eac7a2: pusha  
  0x01eac7a3: pushf  
  0x01eac7a4: sub    $0x10,%esp
  0x01eac7a7: movsd  %xmm0,(%esp)
  0x01eac7ac: movsd  %xmm1,0x8(%esp)
  0x01eac7b2: push   %eax
  0x01eac7b3: push   %ebx
  0x01eac7b4: call   0x55be79d0
  0x01eac7b9: add    $0x8,%esp
  0x01eac7bc: movsd  (%esp),%xmm0
  0x01eac7c1: movsd  0x8(%esp),%xmm1
  0x01eac7c7: add    $0x10,%esp
  0x01eac7ca: popf   
  0x01eac7cb: popa   
  0x01eac7cc: pop    %eax
  0x01eac7cd: mov    %esp,%esi
  0x01eac7cf: sub    $0x14,%esp
  0x01eac7d2: mov    %ecx,0x10(%esp)
  0x01eac7d6: mov    0x14(%esp),%edi
  0x01eac7da: mov    %edi,0x8(%esp)
  0x01eac7de: mov    0x18(%esp),%edi
  0x01eac7e2: mov    %edi,0xc(%esp)
  0x01eac7e6: movsd  %xmm0,(%esp)
  0x01eac7eb: mov    0x24(%ebx),%ecx
  0x01eac7ee: push   %eax
  0x01eac7ef: jmp    *%ecx

AHE@0x018f9900: 0xaaa7e000 i2c: 0x01eac870 c2i: 0x01eac90e c2iUV: 0x01eac8ed
i2c argument handler #21 for: receiver (Ljava/lang/Object;ID)V (249 bytes generated)
c2i argument handler starts at 01EAC90E
  0x01eac870: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eac873: mov    $0x1dc2940,%edi
  0x01eac878: cmp    %edi,%eax
  0x01eac87a: jbe    0x01eac88d
  0x01eac880: mov    $0x1ea2940,%edi
  0x01eac885: cmp    %edi,%eax
  0x01eac887: jb     0x01eac8b8
  0x01eac88d: mov    $0x1dc0340,%edi
  0x01eac892: cmp    %edi,%eax
  0x01eac894: jbe    0x01eac8a7
  0x01eac89a: mov    $0x1dc2668,%edi
  0x01eac89f: cmp    %edi,%eax
  0x01eac8a1: jb     0x01eac8b8
  ;; i2c adapter must return to an interpreter frame
  0x01eac8a7: push   $0x55ce723c
  0x01eac8ac: call   0x01eac8b1
  0x01eac8b1: pusha  
  0x01eac8b2: call   0x557bdbf0
  0x01eac8b7: hlt    
  ;; } verify_i2ce 
  0x01eac8b8: mov    %esp,%edi
  0x01eac8ba: sub    $0x8,%esp
  0x01eac8bd: and    $0xfffffff0,%esp
  0x01eac8c0: push   %eax
  0x01eac8c1: mov    %edi,%eax
  0x01eac8c3: mov    0x2c(%ebx),%edi
  0x01eac8c6: mov    0x14(%eax),%ecx
  0x01eac8c9: mov    0x10(%eax),%edx
  0x01eac8cc: mov    0xc(%eax),%esi
  0x01eac8cf: mov    %esi,0x4(%esp)
  0x01eac8d3: movsd  0x4(%eax),%xmm0
  0x01eac8d8: mov    %fs:0x0(,%eiz,1),%eax
  0x01eac8e0: mov    -0xc(%eax),%eax
  0x01eac8e3: mov    %ebx,0x168(%eax)
  0x01eac8e9: mov    %ebx,%eax
  0x01eac8eb: jmp    *%edi
  0x01eac8ed: mov    0x4(%ecx),%ebx
  0x01eac8f0: cmp    0x8(%eax),%ebx
  0x01eac8f3: mov    0x4(%eax),%ebx
  0x01eac8f6: jne    0x01eac909
  0x01eac8fc: cmpl   $0x0,0x30(%ebx)
  0x01eac903: je     0x01eac948
  0x01eac909: jmp    0x01ea32d0
  0x01eac90e: cmpl   $0x0,0x30(%ebx)
  0x01eac915: je     0x01eac948
  0x01eac91b: mov    (%esp),%eax
  0x01eac91e: pusha  
  0x01eac91f: pushf  
  0x01eac920: sub    $0x10,%esp
  0x01eac923: movsd  %xmm0,(%esp)
  0x01eac928: movsd  %xmm1,0x8(%esp)
  0x01eac92e: push   %eax
  0x01eac92f: push   %ebx
  0x01eac930: call   0x55be79d0
  0x01eac935: add    $0x8,%esp
  0x01eac938: movsd  (%esp),%xmm0
  0x01eac93d: movsd  0x8(%esp),%xmm1
  0x01eac943: add    $0x10,%esp
  0x01eac946: popf   
  0x01eac947: popa   
  0x01eac948: pop    %eax
  0x01eac949: mov    %esp,%esi
  0x01eac94b: sub    $0x14,%esp
  0x01eac94e: mov    %ecx,0x10(%esp)
  0x01eac952: mov    %edx,0xc(%esp)
  0x01eac956: mov    0x14(%esp),%edi
  0x01eac95a: mov    %edi,0x8(%esp)
  0x01eac95e: movsd  %xmm0,(%esp)
  0x01eac963: mov    0x24(%ebx),%ecx
  0x01eac966: push   %eax
  0x01eac967: jmp    *%ecx

AHE@0x018f992c: 0xaaa60000 i2c: 0x01eac9f0 c2i: 0x01eaca8e c2iUV: 0x01eaca6d
i2c argument handler #22 for: receiver (Ljava/lang/Object;IF)V (249 bytes generated)
c2i argument handler starts at 01EACA8E
  0x01eac9f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eac9f3: mov    $0x1dc2940,%edi
  0x01eac9f8: cmp    %edi,%eax
  0x01eac9fa: jbe    0x01eaca0d
  0x01eaca00: mov    $0x1ea2940,%edi
  0x01eaca05: cmp    %edi,%eax
  0x01eaca07: jb     0x01eaca38
  0x01eaca0d: mov    $0x1dc0340,%edi
  0x01eaca12: cmp    %edi,%eax
  0x01eaca14: jbe    0x01eaca27
  0x01eaca1a: mov    $0x1dc2668,%edi
  0x01eaca1f: cmp    %edi,%eax
  0x01eaca21: jb     0x01eaca38
  ;; i2c adapter must return to an interpreter frame
  0x01eaca27: push   $0x55ce723c
  0x01eaca2c: call   0x01eaca31
  0x01eaca31: pusha  
  0x01eaca32: call   0x557bdbf0
  0x01eaca37: hlt    
  ;; } verify_i2ce 
  0x01eaca38: mov    %esp,%edi
  0x01eaca3a: sub    $0x8,%esp
  0x01eaca3d: and    $0xfffffff0,%esp
  0x01eaca40: push   %eax
  0x01eaca41: mov    %edi,%eax
  0x01eaca43: mov    0x2c(%ebx),%edi
  0x01eaca46: mov    0x10(%eax),%ecx
  0x01eaca49: mov    0xc(%eax),%edx
  0x01eaca4c: mov    0x8(%eax),%esi
  0x01eaca4f: mov    %esi,0x4(%esp)
  0x01eaca53: movss  0x4(%eax),%xmm0
  0x01eaca58: mov    %fs:0x0(,%eiz,1),%eax
  0x01eaca60: mov    -0xc(%eax),%eax
  0x01eaca63: mov    %ebx,0x168(%eax)
  0x01eaca69: mov    %ebx,%eax
  0x01eaca6b: jmp    *%edi
  0x01eaca6d: mov    0x4(%ecx),%ebx
  0x01eaca70: cmp    0x8(%eax),%ebx
  0x01eaca73: mov    0x4(%eax),%ebx
  0x01eaca76: jne    0x01eaca89
  0x01eaca7c: cmpl   $0x0,0x30(%ebx)
  0x01eaca83: je     0x01eacac8
  0x01eaca89: jmp    0x01ea32d0
  0x01eaca8e: cmpl   $0x0,0x30(%ebx)
  0x01eaca95: je     0x01eacac8
  0x01eaca9b: mov    (%esp),%eax
  0x01eaca9e: pusha  
  0x01eaca9f: pushf  
  0x01eacaa0: sub    $0x10,%esp
  0x01eacaa3: movsd  %xmm0,(%esp)
  0x01eacaa8: movsd  %xmm1,0x8(%esp)
  0x01eacaae: push   %eax
  0x01eacaaf: push   %ebx
  0x01eacab0: call   0x55be79d0
  0x01eacab5: add    $0x8,%esp
  0x01eacab8: movsd  (%esp),%xmm0
  0x01eacabd: movsd  0x8(%esp),%xmm1
  0x01eacac3: add    $0x10,%esp
  0x01eacac6: popf   
  0x01eacac7: popa   
  0x01eacac8: pop    %eax
  0x01eacac9: mov    %esp,%esi
  0x01eacacb: sub    $0x10,%esp
  0x01eacace: mov    %ecx,0xc(%esp)
  0x01eacad2: mov    %edx,0x8(%esp)
  0x01eacad6: mov    0x10(%esp),%edi
  0x01eacada: mov    %edi,0x4(%esp)
  0x01eacade: movss  %xmm0,(%esp)
  0x01eacae3: mov    0x24(%ebx),%ecx
  0x01eacae6: push   %eax
  0x01eacae7: jmp    *%ecx

AHE@0x018f9958: 0xabe60000 i2c: 0x01eacb70 c2i: 0x01eacc12 c2iUV: 0x01eacbf1
i2c argument handler #23 for: receiver (JF)V (257 bytes generated)
c2i argument handler starts at 01EACC12
  0x01eacb70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eacb73: mov    $0x1dc2940,%edi
  0x01eacb78: cmp    %edi,%eax
  0x01eacb7a: jbe    0x01eacb8d
  0x01eacb80: mov    $0x1ea2940,%edi
  0x01eacb85: cmp    %edi,%eax
  0x01eacb87: jb     0x01eacbb8
  0x01eacb8d: mov    $0x1dc0340,%edi
  0x01eacb92: cmp    %edi,%eax
  0x01eacb94: jbe    0x01eacba7
  0x01eacb9a: mov    $0x1dc2668,%edi
  0x01eacb9f: cmp    %edi,%eax
  0x01eacba1: jb     0x01eacbb8
  ;; i2c adapter must return to an interpreter frame
  0x01eacba7: push   $0x55ce723c
  0x01eacbac: call   0x01eacbb1
  0x01eacbb1: pusha  
  0x01eacbb2: call   0x557bdbf0
  0x01eacbb7: hlt    
  ;; } verify_i2ce 
  0x01eacbb8: mov    %esp,%edi
  0x01eacbba: sub    $0x8,%esp
  0x01eacbbd: and    $0xfffffff0,%esp
  0x01eacbc0: push   %eax
  0x01eacbc1: mov    %edi,%eax
  0x01eacbc3: mov    0x2c(%ebx),%edi
  0x01eacbc6: mov    0x10(%eax),%ecx
  0x01eacbc9: mov    0x8(%eax),%esi
  0x01eacbcc: mov    %esi,0x4(%esp)
  0x01eacbd0: mov    0xc(%eax),%esi
  0x01eacbd3: mov    %esi,0x8(%esp)
  0x01eacbd7: movss  0x4(%eax),%xmm0
  0x01eacbdc: mov    %fs:0x0(,%eiz,1),%eax
  0x01eacbe4: mov    -0xc(%eax),%eax
  0x01eacbe7: mov    %ebx,0x168(%eax)
  0x01eacbed: mov    %ebx,%eax
  0x01eacbef: jmp    *%edi
  0x01eacbf1: mov    0x4(%ecx),%ebx
  0x01eacbf4: cmp    0x8(%eax),%ebx
  0x01eacbf7: mov    0x4(%eax),%ebx
  0x01eacbfa: jne    0x01eacc0d
  0x01eacc00: cmpl   $0x0,0x30(%ebx)
  0x01eacc07: je     0x01eacc4c
  0x01eacc0d: jmp    0x01ea32d0
  0x01eacc12: cmpl   $0x0,0x30(%ebx)
  0x01eacc19: je     0x01eacc4c
  0x01eacc1f: mov    (%esp),%eax
  0x01eacc22: pusha  
  0x01eacc23: pushf  
  0x01eacc24: sub    $0x10,%esp
  0x01eacc27: movsd  %xmm0,(%esp)
  0x01eacc2c: movsd  %xmm1,0x8(%esp)
  0x01eacc32: push   %eax
  0x01eacc33: push   %ebx
  0x01eacc34: call   0x55be79d0
  0x01eacc39: add    $0x8,%esp
  0x01eacc3c: movsd  (%esp),%xmm0
  0x01eacc41: movsd  0x8(%esp),%xmm1
  0x01eacc47: add    $0x10,%esp
  0x01eacc4a: popf   
  0x01eacc4b: popa   
  0x01eacc4c: pop    %eax
  0x01eacc4d: mov    %esp,%esi
  0x01eacc4f: sub    $0x10,%esp
  0x01eacc52: mov    %ecx,0xc(%esp)
  0x01eacc56: mov    0x10(%esp),%edi
  0x01eacc5a: mov    %edi,0x4(%esp)
  0x01eacc5e: mov    0x14(%esp),%edi
  0x01eacc62: mov    %edi,0x8(%esp)
  0x01eacc66: movss  %xmm0,(%esp)
  0x01eacc6b: mov    0x24(%ebx),%ecx
  0x01eacc6e: push   %eax
  0x01eacc6f: jmp    *%ecx

AHE@0x018f9984: 0xaaabe000 i2c: 0x01eaccf0 c2i: 0x01eacd97 c2iUV: 0x01eacd76
i2c argument handler #24 for: receiver (Ljava/lang/Object;IJ)V (268 bytes generated)
c2i argument handler starts at 01EACD97
  0x01eaccf0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eaccf3: mov    $0x1dc2940,%edi
  0x01eaccf8: cmp    %edi,%eax
  0x01eaccfa: jbe    0x01eacd0d
  0x01eacd00: mov    $0x1ea2940,%edi
  0x01eacd05: cmp    %edi,%eax
  0x01eacd07: jb     0x01eacd38
  0x01eacd0d: mov    $0x1dc0340,%edi
  0x01eacd12: cmp    %edi,%eax
  0x01eacd14: jbe    0x01eacd27
  0x01eacd1a: mov    $0x1dc2668,%edi
  0x01eacd1f: cmp    %edi,%eax
  0x01eacd21: jb     0x01eacd38
  ;; i2c adapter must return to an interpreter frame
  0x01eacd27: push   $0x55ce723c
  0x01eacd2c: call   0x01eacd31
  0x01eacd31: pusha  
  0x01eacd32: call   0x557bdbf0
  0x01eacd37: hlt    
  ;; } verify_i2ce 
  0x01eacd38: mov    %esp,%edi
  0x01eacd3a: sub    $0x10,%esp
  0x01eacd3d: and    $0xfffffff0,%esp
  0x01eacd40: push   %eax
  0x01eacd41: mov    %edi,%eax
  0x01eacd43: mov    0x2c(%ebx),%edi
  0x01eacd46: mov    0x14(%eax),%ecx
  0x01eacd49: mov    0x10(%eax),%edx
  0x01eacd4c: mov    0xc(%eax),%esi
  0x01eacd4f: mov    %esi,0xc(%esp)
  0x01eacd53: mov    0x4(%eax),%esi
  0x01eacd56: mov    %esi,0x4(%esp)
  0x01eacd5a: mov    0x8(%eax),%esi
  0x01eacd5d: mov    %esi,0x8(%esp)
  0x01eacd61: mov    %fs:0x0(,%eiz,1),%eax
  0x01eacd69: mov    -0xc(%eax),%eax
  0x01eacd6c: mov    %ebx,0x168(%eax)
  0x01eacd72: mov    %ebx,%eax
  0x01eacd74: jmp    *%edi
  0x01eacd76: mov    0x4(%ecx),%ebx
  0x01eacd79: cmp    0x8(%eax),%ebx
  0x01eacd7c: mov    0x4(%eax),%ebx
  0x01eacd7f: jne    0x01eacd92
  0x01eacd85: cmpl   $0x0,0x30(%ebx)
  0x01eacd8c: je     0x01eacdd1
  0x01eacd92: jmp    0x01ea32d0
  0x01eacd97: cmpl   $0x0,0x30(%ebx)
  0x01eacd9e: je     0x01eacdd1
  0x01eacda4: mov    (%esp),%eax
  0x01eacda7: pusha  
  0x01eacda8: pushf  
  0x01eacda9: sub    $0x10,%esp
  0x01eacdac: movsd  %xmm0,(%esp)
  0x01eacdb1: movsd  %xmm1,0x8(%esp)
  0x01eacdb7: push   %eax
  0x01eacdb8: push   %ebx
  0x01eacdb9: call   0x55be79d0
  0x01eacdbe: add    $0x8,%esp
  0x01eacdc1: movsd  (%esp),%xmm0
  0x01eacdc6: movsd  0x8(%esp),%xmm1
  0x01eacdcc: add    $0x10,%esp
  0x01eacdcf: popf   
  0x01eacdd0: popa   
  0x01eacdd1: pop    %eax
  0x01eacdd2: mov    %esp,%esi
  0x01eacdd4: sub    $0x14,%esp
  0x01eacdd7: mov    %ecx,0x10(%esp)
  0x01eacddb: mov    %edx,0xc(%esp)
  0x01eacddf: mov    0x1c(%esp),%edi
  0x01eacde3: mov    %edi,0x8(%esp)
  0x01eacde7: mov    0x14(%esp),%edi
  0x01eacdeb: mov    %edi,(%esp)
  0x01eacdee: mov    0x18(%esp),%edi
  0x01eacdf2: mov    %edi,0x4(%esp)
  0x01eacdf6: mov    0x24(%ebx),%ecx
  0x01eacdf9: push   %eax
  0x01eacdfa: jmp    *%ecx

AHE@0x018f99b0: 0xaabeabebe0000000 i2c: 0x01eace70 c2i: 0x01eacf33 c2iUV: 0x01eacf12
i2c argument handler #25 for: receiver (Ljava/lang/Object;JLjava/lang/Object;JJ)V (328 bytes generated)
c2i argument handler starts at 01EACF33
  0x01eace70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eace73: mov    $0x1dc2940,%edi
  0x01eace78: cmp    %edi,%eax
  0x01eace7a: jbe    0x01eace8d
  0x01eace80: mov    $0x1ea2940,%edi
  0x01eace85: cmp    %edi,%eax
  0x01eace87: jb     0x01eaceb8
  0x01eace8d: mov    $0x1dc0340,%edi
  0x01eace92: cmp    %edi,%eax
  0x01eace94: jbe    0x01eacea7
  0x01eace9a: mov    $0x1dc2668,%edi
  0x01eace9f: cmp    %edi,%eax
  0x01eacea1: jb     0x01eaceb8
  ;; i2c adapter must return to an interpreter frame
  0x01eacea7: push   $0x55ce723c
  0x01eaceac: call   0x01eaceb1
  0x01eaceb1: pusha  
  0x01eaceb2: call   0x557bdbf0
  0x01eaceb7: hlt    
  ;; } verify_i2ce 
  0x01eaceb8: mov    %esp,%edi
  0x01eaceba: sub    $0x20,%esp
  0x01eacebd: and    $0xfffffff0,%esp
  0x01eacec0: push   %eax
  0x01eacec1: mov    %edi,%eax
  0x01eacec3: mov    0x2c(%ebx),%edi
  0x01eacec6: mov    0x24(%eax),%ecx
  0x01eacec9: mov    0x20(%eax),%edx
  0x01eacecc: mov    0x18(%eax),%esi
  0x01eacecf: mov    %esi,0x4(%esp)
  0x01eaced3: mov    0x1c(%eax),%esi
  0x01eaced6: mov    %esi,0x8(%esp)
  0x01eaceda: mov    0x14(%eax),%esi
  0x01eacedd: mov    %esi,0x1c(%esp)
  0x01eacee1: mov    0xc(%eax),%esi
  0x01eacee4: mov    %esi,0xc(%esp)
  0x01eacee8: mov    0x10(%eax),%esi
  0x01eaceeb: mov    %esi,0x10(%esp)
  0x01eaceef: mov    0x4(%eax),%esi
  0x01eacef2: mov    %esi,0x14(%esp)
  0x01eacef6: mov    0x8(%eax),%esi
  0x01eacef9: mov    %esi,0x18(%esp)
  0x01eacefd: mov    %fs:0x0(,%eiz,1),%eax
  0x01eacf05: mov    -0xc(%eax),%eax
  0x01eacf08: mov    %ebx,0x168(%eax)
  0x01eacf0e: mov    %ebx,%eax
  0x01eacf10: jmp    *%edi
  0x01eacf12: mov    0x4(%ecx),%ebx
  0x01eacf15: cmp    0x8(%eax),%ebx
  0x01eacf18: mov    0x4(%eax),%ebx
  0x01eacf1b: jne    0x01eacf2e
  0x01eacf21: cmpl   $0x0,0x30(%ebx)
  0x01eacf28: je     0x01eacf6d
  0x01eacf2e: jmp    0x01ea32d0
  0x01eacf33: cmpl   $0x0,0x30(%ebx)
  0x01eacf3a: je     0x01eacf6d
  0x01eacf40: mov    (%esp),%eax
  0x01eacf43: pusha  
  0x01eacf44: pushf  
  0x01eacf45: sub    $0x10,%esp
  0x01eacf48: movsd  %xmm0,(%esp)
  0x01eacf4d: movsd  %xmm1,0x8(%esp)
  0x01eacf53: push   %eax
  0x01eacf54: push   %ebx
  0x01eacf55: call   0x55be79d0
  0x01eacf5a: add    $0x8,%esp
  0x01eacf5d: movsd  (%esp),%xmm0
  0x01eacf62: movsd  0x8(%esp),%xmm1
  0x01eacf68: add    $0x10,%esp
  0x01eacf6b: popf   
  0x01eacf6c: popa   
  0x01eacf6d: pop    %eax
  0x01eacf6e: mov    %esp,%esi
  0x01eacf70: sub    $0x24,%esp
  0x01eacf73: mov    %ecx,0x20(%esp)
  0x01eacf77: mov    %edx,0x1c(%esp)
  0x01eacf7b: mov    0x24(%esp),%edi
  0x01eacf7f: mov    %edi,0x14(%esp)
  0x01eacf83: mov    0x28(%esp),%edi
  0x01eacf87: mov    %edi,0x18(%esp)
  0x01eacf8b: mov    0x3c(%esp),%edi
  0x01eacf8f: mov    %edi,0x10(%esp)
  0x01eacf93: mov    0x2c(%esp),%edi
  0x01eacf97: mov    %edi,0x8(%esp)
  0x01eacf9b: mov    0x30(%esp),%edi
  0x01eacf9f: mov    %edi,0xc(%esp)
  0x01eacfa3: mov    0x34(%esp),%edi
  0x01eacfa7: mov    %edi,(%esp)
  0x01eacfaa: mov    0x38(%esp),%edi
  0x01eacfae: mov    %edi,0x4(%esp)
  0x01eacfb2: mov    0x24(%ebx),%ecx
  0x01eacfb5: push   %eax
  0x01eacfb6: jmp    *%ecx

AHE@0x018f99dc: 0xabebebe0 i2c: 0x01ead030 c2i: 0x01ead0e9 c2iUV: 0x01ead0c8
i2c argument handler #26 for: receiver (JJJ)V (306 bytes generated)
c2i argument handler starts at 01EAD0E9
  0x01ead030: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ead033: mov    $0x1dc2940,%edi
  0x01ead038: cmp    %edi,%eax
  0x01ead03a: jbe    0x01ead04d
  0x01ead040: mov    $0x1ea2940,%edi
  0x01ead045: cmp    %edi,%eax
  0x01ead047: jb     0x01ead078
  0x01ead04d: mov    $0x1dc0340,%edi
  0x01ead052: cmp    %edi,%eax
  0x01ead054: jbe    0x01ead067
  0x01ead05a: mov    $0x1dc2668,%edi
  0x01ead05f: cmp    %edi,%eax
  0x01ead061: jb     0x01ead078
  ;; i2c adapter must return to an interpreter frame
  0x01ead067: push   $0x55ce723c
  0x01ead06c: call   0x01ead071
  0x01ead071: pusha  
  0x01ead072: call   0x557bdbf0
  0x01ead077: hlt    
  ;; } verify_i2ce 
  0x01ead078: mov    %esp,%edi
  0x01ead07a: sub    $0x18,%esp
  0x01ead07d: and    $0xfffffff0,%esp
  0x01ead080: push   %eax
  0x01ead081: mov    %edi,%eax
  0x01ead083: mov    0x2c(%ebx),%edi
  0x01ead086: mov    0x1c(%eax),%ecx
  0x01ead089: mov    0x14(%eax),%esi
  0x01ead08c: mov    %esi,0x4(%esp)
  0x01ead090: mov    0x18(%eax),%esi
  0x01ead093: mov    %esi,0x8(%esp)
  0x01ead097: mov    0xc(%eax),%esi
  0x01ead09a: mov    %esi,0xc(%esp)
  0x01ead09e: mov    0x10(%eax),%esi
  0x01ead0a1: mov    %esi,0x10(%esp)
  0x01ead0a5: mov    0x4(%eax),%esi
  0x01ead0a8: mov    %esi,0x14(%esp)
  0x01ead0ac: mov    0x8(%eax),%esi
  0x01ead0af: mov    %esi,0x18(%esp)
  0x01ead0b3: mov    %fs:0x0(,%eiz,1),%eax
  0x01ead0bb: mov    -0xc(%eax),%eax
  0x01ead0be: mov    %ebx,0x168(%eax)
  0x01ead0c4: mov    %ebx,%eax
  0x01ead0c6: jmp    *%edi
  0x01ead0c8: mov    0x4(%ecx),%ebx
  0x01ead0cb: cmp    0x8(%eax),%ebx
  0x01ead0ce: mov    0x4(%eax),%ebx
  0x01ead0d1: jne    0x01ead0e4
  0x01ead0d7: cmpl   $0x0,0x30(%ebx)
  0x01ead0de: je     0x01ead123
  0x01ead0e4: jmp    0x01ea32d0
  0x01ead0e9: cmpl   $0x0,0x30(%ebx)
  0x01ead0f0: je     0x01ead123
  0x01ead0f6: mov    (%esp),%eax
  0x01ead0f9: pusha  
  0x01ead0fa: pushf  
  0x01ead0fb: sub    $0x10,%esp
  0x01ead0fe: movsd  %xmm0,(%esp)
  0x01ead103: movsd  %xmm1,0x8(%esp)
  0x01ead109: push   %eax
  0x01ead10a: push   %ebx
  0x01ead10b: call   0x55be79d0
  0x01ead110: add    $0x8,%esp
  0x01ead113: movsd  (%esp),%xmm0
  0x01ead118: movsd  0x8(%esp),%xmm1
  0x01ead11e: add    $0x10,%esp
  0x01ead121: popf   
  0x01ead122: popa   
  0x01ead123: pop    %eax
  0x01ead124: mov    %esp,%esi
  0x01ead126: sub    $0x1c,%esp
  0x01ead129: mov    %ecx,0x18(%esp)
  0x01ead12d: mov    0x1c(%esp),%edi
  0x01ead131: mov    %edi,0x10(%esp)
  0x01ead135: mov    0x20(%esp),%edi
  0x01ead139: mov    %edi,0x14(%esp)
  0x01ead13d: mov    0x24(%esp),%edi
  0x01ead141: mov    %edi,0x8(%esp)
  0x01ead145: mov    0x28(%esp),%edi
  0x01ead149: mov    %edi,0xc(%esp)
  0x01ead14d: mov    0x2c(%esp),%edi
  0x01ead151: mov    %edi,(%esp)
  0x01ead154: mov    0x30(%esp),%edi
  0x01ead158: mov    %edi,0x4(%esp)
  0x01ead15c: mov    0x24(%ebx),%ecx
  0x01ead15f: push   %eax
  0x01ead160: jmp    *%ecx

AHE@0x018f9a08: 0xaaaaaaaaa0000000 i2c: 0x01ead1f0 c2i: 0x01ead2b3 c2iUV: 0x01ead292
i2c argument handler #27 for: receiver (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/Package; (328 bytes generated)
c2i argument handler starts at 01EAD2B3
  0x01ead1f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ead1f3: mov    $0x1dc2940,%edi
  0x01ead1f8: cmp    %edi,%eax
  0x01ead1fa: jbe    0x01ead20d
  0x01ead200: mov    $0x1ea2940,%edi
  0x01ead205: cmp    %edi,%eax
  0x01ead207: jb     0x01ead238
  0x01ead20d: mov    $0x1dc0340,%edi
  0x01ead212: cmp    %edi,%eax
  0x01ead214: jbe    0x01ead227
  0x01ead21a: mov    $0x1dc2668,%edi
  0x01ead21f: cmp    %edi,%eax
  0x01ead221: jb     0x01ead238
  ;; i2c adapter must return to an interpreter frame
  0x01ead227: push   $0x55ce723c
  0x01ead22c: call   0x01ead231
  0x01ead231: pusha  
  0x01ead232: call   0x557bdbf0
  0x01ead237: hlt    
  ;; } verify_i2ce 
  0x01ead238: mov    %esp,%edi
  0x01ead23a: sub    $0x20,%esp
  0x01ead23d: and    $0xfffffff0,%esp
  0x01ead240: push   %eax
  0x01ead241: mov    %edi,%eax
  0x01ead243: mov    0x2c(%ebx),%edi
  0x01ead246: mov    0x24(%eax),%ecx
  0x01ead249: mov    0x20(%eax),%edx
  0x01ead24c: mov    0x1c(%eax),%esi
  0x01ead24f: mov    %esi,0x4(%esp)
  0x01ead253: mov    0x18(%eax),%esi
  0x01ead256: mov    %esi,0x8(%esp)
  0x01ead25a: mov    0x14(%eax),%esi
  0x01ead25d: mov    %esi,0xc(%esp)
  0x01ead261: mov    0x10(%eax),%esi
  0x01ead264: mov    %esi,0x10(%esp)
  0x01ead268: mov    0xc(%eax),%esi
  0x01ead26b: mov    %esi,0x14(%esp)
  0x01ead26f: mov    0x8(%eax),%esi
  0x01ead272: mov    %esi,0x18(%esp)
  0x01ead276: mov    0x4(%eax),%esi
  0x01ead279: mov    %esi,0x1c(%esp)
  0x01ead27d: mov    %fs:0x0(,%eiz,1),%eax
  0x01ead285: mov    -0xc(%eax),%eax
  0x01ead288: mov    %ebx,0x168(%eax)
  0x01ead28e: mov    %ebx,%eax
  0x01ead290: jmp    *%edi
  0x01ead292: mov    0x4(%ecx),%ebx
  0x01ead295: cmp    0x8(%eax),%ebx
  0x01ead298: mov    0x4(%eax),%ebx
  0x01ead29b: jne    0x01ead2ae
  0x01ead2a1: cmpl   $0x0,0x30(%ebx)
  0x01ead2a8: je     0x01ead2ed
  0x01ead2ae: jmp    0x01ea32d0
  0x01ead2b3: cmpl   $0x0,0x30(%ebx)
  0x01ead2ba: je     0x01ead2ed
  0x01ead2c0: mov    (%esp),%eax
  0x01ead2c3: pusha  
  0x01ead2c4: pushf  
  0x01ead2c5: sub    $0x10,%esp
  0x01ead2c8: movsd  %xmm0,(%esp)
  0x01ead2cd: movsd  %xmm1,0x8(%esp)
  0x01ead2d3: push   %eax
  0x01ead2d4: push   %ebx
  0x01ead2d5: call   0x55be79d0
  0x01ead2da: add    $0x8,%esp
  0x01ead2dd: movsd  (%esp),%xmm0
  0x01ead2e2: movsd  0x8(%esp),%xmm1
  0x01ead2e8: add    $0x10,%esp
  0x01ead2eb: popf   
  0x01ead2ec: popa   
  0x01ead2ed: pop    %eax
  0x01ead2ee: mov    %esp,%esi
  0x01ead2f0: sub    $0x24,%esp
  0x01ead2f3: mov    %ecx,0x20(%esp)
  0x01ead2f7: mov    %edx,0x1c(%esp)
  0x01ead2fb: mov    0x24(%esp),%edi
  0x01ead2ff: mov    %edi,0x18(%esp)
  0x01ead303: mov    0x28(%esp),%edi
  0x01ead307: mov    %edi,0x14(%esp)
  0x01ead30b: mov    0x2c(%esp),%edi
  0x01ead30f: mov    %edi,0x10(%esp)
  0x01ead313: mov    0x30(%esp),%edi
  0x01ead317: mov    %edi,0xc(%esp)
  0x01ead31b: mov    0x34(%esp),%edi
  0x01ead31f: mov    %edi,0x8(%esp)
  0x01ead323: mov    0x38(%esp),%edi
  0x01ead327: mov    %edi,0x4(%esp)
  0x01ead32b: mov    0x3c(%esp),%edi
  0x01ead32f: mov    %edi,(%esp)
  0x01ead332: mov    0x24(%ebx),%ecx
  0x01ead335: push   %eax
  0x01ead336: jmp    *%ecx

Decoding RuntimeStub - AbstractMethodError throw_exception 0x01eb2b48
  0x01eb2b90: mov    %fs:0x0(,%eiz,1),%ebx
  0x01eb2b98: mov    -0xc(%ebx),%ebx
  0x01eb2b9b: push   %ebp
  0x01eb2b9c: mov    %esp,%ebp
  0x01eb2b9e: sub    $0xc,%esp
  0x01eb2ba1: mov    %ebx,(%esp)
  0x01eb2ba4: mov    %ebp,0x144(%ebx)
  0x01eb2baa: mov    %esp,0x13c(%ebx)
  ;; call runtime_entry
  0x01eb2bb0: call   0x55be40b0
  0x01eb2bb5: mov    %fs:0x0(,%eiz,1),%ebx
  0x01eb2bbd: mov    -0xc(%ebx),%ebx
  0x01eb2bc0: movl   $0x0,0x13c(%ebx)
  0x01eb2bca: movl   $0x0,0x144(%ebx)
  0x01eb2bd4: mov    %ebp,%esp
  0x01eb2bd6: pop    %ebp
  0x01eb2bd7: cmpl   $0x0,0x4(%ebx)
  0x01eb2bde: jne    0x01eb2bf5
  0x01eb2be4: push   $0x55ccd97c
  0x01eb2be9: call   0x01eb2bee
  0x01eb2bee: pusha  
  0x01eb2bef: call   0x557bdbf0
  0x01eb2bf4: hlt    
  0x01eb2bf5: jmp    Stub::forward exception
  0x01eb2bfa: hlt    
  0x01eb2bfb: hlt    

Decoding RuntimeStub - IncompatibleClassChangeError throw_exception 0x01eb2c08
  0x01eb2c50: mov    %fs:0x0(,%eiz,1),%ebx
  0x01eb2c58: mov    -0xc(%ebx),%ebx
  0x01eb2c5b: push   %ebp
  0x01eb2c5c: mov    %esp,%ebp
  0x01eb2c5e: sub    $0xc,%esp
  0x01eb2c61: mov    %ebx,(%esp)
  0x01eb2c64: mov    %ebp,0x144(%ebx)
  0x01eb2c6a: mov    %esp,0x13c(%ebx)
  ;; call runtime_entry
  0x01eb2c70: call   0x55be41c0
  0x01eb2c75: mov    %fs:0x0(,%eiz,1),%ebx
  0x01eb2c7d: mov    -0xc(%ebx),%ebx
  0x01eb2c80: movl   $0x0,0x13c(%ebx)
  0x01eb2c8a: movl   $0x0,0x144(%ebx)
  0x01eb2c94: mov    %ebp,%esp
  0x01eb2c96: pop    %ebp
  0x01eb2c97: cmpl   $0x0,0x4(%ebx)
  0x01eb2c9e: jne    0x01eb2cb5
  0x01eb2ca4: push   $0x55ccd97c
  0x01eb2ca9: call   0x01eb2cae
  0x01eb2cae: pusha  
  0x01eb2caf: call   0x557bdbf0
  0x01eb2cb4: hlt    
  0x01eb2cb5: jmp    Stub::forward exception
  0x01eb2cba: hlt    
  0x01eb2cbb: hlt    

Decoding RuntimeStub - NullPointerException at call throw_exception 0x01eb2cc8
  0x01eb2d10: mov    %fs:0x0(,%eiz,1),%ebx
  0x01eb2d18: mov    -0xc(%ebx),%ebx
  0x01eb2d1b: push   %ebp
  0x01eb2d1c: mov    %esp,%ebp
  0x01eb2d1e: sub    $0xc,%esp
  0x01eb2d21: mov    %ebx,(%esp)
  0x01eb2d24: mov    %ebp,0x144(%ebx)
  0x01eb2d2a: mov    %esp,0x13c(%ebx)
  ;; call runtime_entry
  0x01eb2d30: call   0x55be44f0
  0x01eb2d35: mov    %fs:0x0(,%eiz,1),%ebx
  0x01eb2d3d: mov    -0xc(%ebx),%ebx
  0x01eb2d40: movl   $0x0,0x13c(%ebx)
  0x01eb2d4a: movl   $0x0,0x144(%ebx)
  0x01eb2d54: mov    %ebp,%esp
  0x01eb2d56: pop    %ebp
  0x01eb2d57: cmpl   $0x0,0x4(%ebx)
  0x01eb2d5e: jne    0x01eb2d75
  0x01eb2d64: push   $0x55ccd97c
  0x01eb2d69: call   0x01eb2d6e
  0x01eb2d6e: pusha  
  0x01eb2d6f: call   0x557bdbf0
  0x01eb2d74: hlt    
  0x01eb2d75: jmp    Stub::forward exception
  0x01eb2d7a: hlt    
  0x01eb2d7b: hlt    

StubRoutines::verify_oop [0x01ead380, 0x01ead3c9[ (73 bytes)
  0x01ead380: pushf  
  0x01ead381: incl   0x5600570c
  0x01ead387: push   %edx
  0x01ead388: mov    0x10(%esp),%eax
  0x01ead38c: test   %eax,%eax
  0x01ead38e: je     Stub::verify_oop+48 0x01EAD3B0
  0x01ead394: mov    %eax,%edx
  0x01ead396: and    $0xe0000007,%edx
  0x01ead39c: cmp    $0x0,%edx
  0x01ead39f: jne    Stub::verify_oop+57 0x01EAD3B9
  0x01ead3a5: mov    0x4(%eax),%eax
  0x01ead3a8: test   %eax,%eax
  0x01ead3aa: je     Stub::verify_oop+57 0x01EAD3B9
  0x01ead3b0: mov    0x14(%esp),%eax
  0x01ead3b4: pop    %edx
  0x01ead3b5: popf   
  0x01ead3b6: ret    $0xc
  0x01ead3b9: mov    0x14(%esp),%eax
  0x01ead3bd: pop    %edx
  0x01ead3be: popf   
  0x01ead3bf: pusha  
  ;; call MacroAssembler::debug
  0x01ead3c0: call   0x557bdbf0
  0x01ead3c5: popa   
  0x01ead3c6: ret    $0xc

StubRoutines::arrayof_jbyte_disjoint_arraycopy [0x01ead3d0, 0x01ead483[ (179 bytes)
  0x01ead3d0: push   %ebp
  0x01ead3d1: mov    %esp,%ebp
  0x01ead3d3: push   %esi
  0x01ead3d4: push   %edi
  0x01ead3d5: mov    0x10(%esp),%esi
  0x01ead3d9: mov    0x14(%esp),%edi
  0x01ead3dd: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01ead3e1: sub    %esi,%edi
  0x01ead3e3: cmp    $0x8,%ecx
  0x01ead3e6: jb     Stub::arrayof_jbyte_disjoint_arraycopy+118 0x01EAD446
  ;; L_copy_64_bytes:
  0x01ead3ec: mov    %ecx,%eax
  0x01ead3ee: shr    $0x3,%eax
  0x01ead3f1: jmp    Stub::arrayof_jbyte_disjoint_arraycopy+93 0x01EAD42D
  0x01ead3f3: nop    
  0x01ead3f4: nop    
  0x01ead3f5: nop    
  0x01ead3f6: nop    
  0x01ead3f7: nop    
  0x01ead3f8: nop    
  0x01ead3f9: nop    
  0x01ead3fa: nop    
  0x01ead3fb: nop    
  0x01ead3fc: nop    
  0x01ead3fd: nop    
  0x01ead3fe: nop    
  0x01ead3ff: nop    
  ;; L_copy_64_bytes_loop:
  0x01ead400: movdqu (%esi),%xmm0
  0x01ead404: movdqu %xmm0,(%esi,%edi,1)
  0x01ead409: movdqu 0x10(%esi),%xmm1
  0x01ead40e: movdqu %xmm1,0x10(%esi,%edi,1)
  0x01ead414: movdqu 0x20(%esi),%xmm2
  0x01ead419: movdqu %xmm2,0x20(%esi,%edi,1)
  0x01ead41f: movdqu 0x30(%esi),%xmm3
  0x01ead424: movdqu %xmm3,0x30(%esi,%edi,1)
  0x01ead42a: add    $0x40,%esi
  ;; L_copy_64_bytes:
  0x01ead42d: sub    $0x8,%eax
  0x01ead430: jge    Stub::arrayof_jbyte_disjoint_arraycopy+48 0x01EAD400
  0x01ead432: add    $0x8,%eax
  0x01ead435: je     Stub::arrayof_jbyte_disjoint_arraycopy+118 0x01EAD446
  ;; L_copy_8_bytes:
  0x01ead437: movq   (%esi),%xmm0
  0x01ead43b: movq   %xmm0,(%esi,%edi,1)
  0x01ead440: add    $0x8,%esi
  0x01ead443: dec    %eax
  0x01ead444: jg     Stub::arrayof_jbyte_disjoint_arraycopy+103 0x01EAD437
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01ead446: test   $0x4,%ecx
  0x01ead44c: je     Stub::arrayof_jbyte_disjoint_arraycopy+134 0x01EAD456
  0x01ead44e: mov    (%esi),%eax
  0x01ead450: mov    %eax,(%esi,%edi,1)
  0x01ead453: add    $0x4,%esi
  ;; L_copy_2_bytes:
  0x01ead456: test   $0x2,%ecx
  0x01ead45c: je     Stub::arrayof_jbyte_disjoint_arraycopy+152 0x01EAD468
  0x01ead45e: mov    (%esi),%ax
  0x01ead461: mov    %ax,(%esi,%edi,1)
  0x01ead465: add    $0x2,%esi
  ;; L_copy_byte:
  0x01ead468: test   $0x1,%ecx
  0x01ead46e: je     Stub::arrayof_jbyte_disjoint_arraycopy+165 0x01EAD475
  0x01ead470: mov    (%esi),%al
  0x01ead472: mov    %al,(%esi,%edi,1)
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jbyte_array_copy_ctr
  0x01ead475: incl   0x56004944
  0x01ead47b: pop    %edi
  0x01ead47c: pop    %esi
  0x01ead47d: mov    %ebp,%esp
  0x01ead47f: pop    %ebp
  0x01ead480: xor    %eax,%eax
  0x01ead482: ret    

StubRoutines::arrayof_jbyte_arraycopy [0x01ead490, 0x01ead554[ (196 bytes)
  0x01ead490: push   %ebp
  0x01ead491: mov    %esp,%ebp
  0x01ead493: push   %esi
  0x01ead494: push   %edi
  0x01ead495: mov    0x10(%esp),%eax
  0x01ead499: mov    0x14(%esp),%edx
  0x01ead49d: mov    0x18(%esp),%ecx
  0x01ead4a1: mov    %eax,%esi
  0x01ead4a3: mov    %edx,%edi
  0x01ead4a5: cmp    %eax,%edx
  0x01ead4a7: lea    (%eax,%ecx,1),%eax
  0x01ead4aa: jbe    Stub::arrayof_jbyte_disjoint_arraycopy+17 0x01EAD3E1
  0x01ead4b0: cmp    %eax,%edx
  0x01ead4b2: jae    Stub::arrayof_jbyte_disjoint_arraycopy+17 0x01EAD3E1
  0x01ead4b8: cmp    $0x8,%ecx
  0x01ead4bb: jb     Stub::arrayof_jbyte_arraycopy+130 0x01EAD512
  0x01ead4c1: lea    (%edx,%ecx,1),%eax
  0x01ead4c4: test   $0x1,%eax
  0x01ead4c9: je     Stub::arrayof_jbyte_arraycopy+66 0x01EAD4D2
  0x01ead4cb: dec    %ecx
  0x01ead4cc: mov    (%esi,%ecx,1),%dl
  0x01ead4cf: mov    %dl,(%edi,%ecx,1)
  ;; L_skip_align1:
  0x01ead4d2: test   $0x2,%eax
  0x01ead4d7: je     Stub::arrayof_jbyte_arraycopy+84 0x01EAD4E4
  0x01ead4d9: sub    $0x2,%ecx
  0x01ead4dc: mov    (%esi,%ecx,1),%dx
  0x01ead4e0: mov    %dx,(%edi,%ecx,1)
  ;; L_skip_align2:
  0x01ead4e4: cmp    $0x8,%ecx
  0x01ead4e7: jb     Stub::arrayof_jbyte_arraycopy+130 0x01EAD512
  0x01ead4ed: test   $0x4,%eax
  0x01ead4f2: je     Stub::arrayof_jbyte_arraycopy+122 0x01EAD50A
  0x01ead4f4: sub    $0x4,%ecx
  0x01ead4f7: mov    (%esi,%ecx,1),%edx
  0x01ead4fa: mov    %edx,(%edi,%ecx,1)
  0x01ead4fd: jmp    Stub::arrayof_jbyte_arraycopy+122 0x01EAD50A
  0x01ead4ff: nop    
  ;; L_copy_8_bytes_loop:
  0x01ead500: movq   (%esi,%ecx,1),%xmm0
  0x01ead505: movq   %xmm0,(%edi,%ecx,1)
  ;; L_copy_8_bytes:
  0x01ead50a: sub    $0x8,%ecx
  0x01ead50d: jge    Stub::arrayof_jbyte_arraycopy+112 0x01EAD500
  0x01ead50f: add    $0x8,%ecx
  ;; L_copy_4_bytes:
  0x01ead512: test   $0x4,%ecx
  0x01ead518: je     Stub::arrayof_jbyte_arraycopy+149 0x01EAD525
  0x01ead51a: mov    -0x4(%esi,%ecx,1),%edx
  0x01ead51e: mov    %edx,-0x4(%edi,%ecx,1)
  0x01ead522: sub    $0x4,%ecx
  ;; L_copy_2_bytes:
  0x01ead525: test   $0x2,%ecx
  0x01ead52b: je     Stub::arrayof_jbyte_arraycopy+170 0x01EAD53A
  0x01ead52d: mov    -0x2(%esi,%ecx,1),%dx
  0x01ead532: mov    %dx,-0x2(%edi,%ecx,1)
  0x01ead537: sub    $0x2,%ecx
  ;; L_copy_byte:
  0x01ead53a: test   $0x1,%ecx
  0x01ead540: je     Stub::arrayof_jbyte_arraycopy+182 0x01EAD546
  0x01ead542: mov    (%esi),%dl
  0x01ead544: mov    %dl,(%edi)
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jbyte_array_copy_ctr
  0x01ead546: incl   0x56004944
  0x01ead54c: pop    %edi
  0x01ead54d: pop    %esi
  0x01ead54e: mov    %ebp,%esp
  0x01ead550: pop    %ebp
  0x01ead551: xor    %eax,%eax
  0x01ead553: ret    

StubRoutines::jbyte_disjoint_arraycopy [0x01ead560, 0x01ead613[ (179 bytes)
  0x01ead560: push   %ebp
  0x01ead561: mov    %esp,%ebp
  0x01ead563: push   %esi
  0x01ead564: push   %edi
  0x01ead565: mov    0x10(%esp),%esi
  0x01ead569: mov    0x14(%esp),%edi
  0x01ead56d: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01ead571: sub    %esi,%edi
  0x01ead573: cmp    $0x8,%ecx
  0x01ead576: jb     Stub::jbyte_disjoint_arraycopy+118 0x01EAD5D6
  ;; L_copy_64_bytes:
  0x01ead57c: mov    %ecx,%eax
  0x01ead57e: shr    $0x3,%eax
  0x01ead581: jmp    Stub::jbyte_disjoint_arraycopy+93 0x01EAD5BD
  0x01ead583: nop    
  0x01ead584: nop    
  0x01ead585: nop    
  0x01ead586: nop    
  0x01ead587: nop    
  0x01ead588: nop    
  0x01ead589: nop    
  0x01ead58a: nop    
  0x01ead58b: nop    
  0x01ead58c: nop    
  0x01ead58d: nop    
  0x01ead58e: nop    
  0x01ead58f: nop    
  ;; L_copy_64_bytes_loop:
  0x01ead590: movdqu (%esi),%xmm0
  0x01ead594: movdqu %xmm0,(%esi,%edi,1)
  0x01ead599: movdqu 0x10(%esi),%xmm1
  0x01ead59e: movdqu %xmm1,0x10(%esi,%edi,1)
  0x01ead5a4: movdqu 0x20(%esi),%xmm2
  0x01ead5a9: movdqu %xmm2,0x20(%esi,%edi,1)
  0x01ead5af: movdqu 0x30(%esi),%xmm3
  0x01ead5b4: movdqu %xmm3,0x30(%esi,%edi,1)
  0x01ead5ba: add    $0x40,%esi
  ;; L_copy_64_bytes:
  0x01ead5bd: sub    $0x8,%eax
  0x01ead5c0: jge    Stub::jbyte_disjoint_arraycopy+48 0x01EAD590
  0x01ead5c2: add    $0x8,%eax
  0x01ead5c5: je     Stub::jbyte_disjoint_arraycopy+118 0x01EAD5D6
  ;; L_copy_8_bytes:
  0x01ead5c7: movq   (%esi),%xmm0
  0x01ead5cb: movq   %xmm0,(%esi,%edi,1)
  0x01ead5d0: add    $0x8,%esi
  0x01ead5d3: dec    %eax
  0x01ead5d4: jg     Stub::jbyte_disjoint_arraycopy+103 0x01EAD5C7
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01ead5d6: test   $0x4,%ecx
  0x01ead5dc: je     Stub::jbyte_disjoint_arraycopy+134 0x01EAD5E6
  0x01ead5de: mov    (%esi),%eax
  0x01ead5e0: mov    %eax,(%esi,%edi,1)
  0x01ead5e3: add    $0x4,%esi
  ;; L_copy_2_bytes:
  0x01ead5e6: test   $0x2,%ecx
  0x01ead5ec: je     Stub::jbyte_disjoint_arraycopy+152 0x01EAD5F8
  0x01ead5ee: mov    (%esi),%ax
  0x01ead5f1: mov    %ax,(%esi,%edi,1)
  0x01ead5f5: add    $0x2,%esi
  ;; L_copy_byte:
  0x01ead5f8: test   $0x1,%ecx
  0x01ead5fe: je     Stub::jbyte_disjoint_arraycopy+165 0x01EAD605
  0x01ead600: mov    (%esi),%al
  0x01ead602: mov    %al,(%esi,%edi,1)
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jbyte_array_copy_ctr
  0x01ead605: incl   0x56004944
  0x01ead60b: pop    %edi
  0x01ead60c: pop    %esi
  0x01ead60d: mov    %ebp,%esp
  0x01ead60f: pop    %ebp
  0x01ead610: xor    %eax,%eax
  0x01ead612: ret    

StubRoutines::jbyte_arraycopy [0x01ead620, 0x01ead6e4[ (196 bytes)
  0x01ead620: push   %ebp
  0x01ead621: mov    %esp,%ebp
  0x01ead623: push   %esi
  0x01ead624: push   %edi
  0x01ead625: mov    0x10(%esp),%eax
  0x01ead629: mov    0x14(%esp),%edx
  0x01ead62d: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01ead631: mov    %eax,%esi
  0x01ead633: mov    %edx,%edi
  0x01ead635: cmp    %eax,%edx
  0x01ead637: lea    (%eax,%ecx,1),%eax
  0x01ead63a: jbe    Stub::jbyte_disjoint_arraycopy+17 0x01EAD571
  0x01ead640: cmp    %eax,%edx
  0x01ead642: jae    Stub::jbyte_disjoint_arraycopy+17 0x01EAD571
  0x01ead648: cmp    $0x8,%ecx
  0x01ead64b: jb     Stub::jbyte_arraycopy+130 0x01EAD6A2
  0x01ead651: lea    (%edx,%ecx,1),%eax
  0x01ead654: test   $0x1,%eax
  0x01ead659: je     Stub::jbyte_arraycopy+66 0x01EAD662
  0x01ead65b: dec    %ecx
  0x01ead65c: mov    (%esi,%ecx,1),%dl
  0x01ead65f: mov    %dl,(%edi,%ecx,1)
  ;; L_skip_align1:
  0x01ead662: test   $0x2,%eax
  0x01ead667: je     Stub::jbyte_arraycopy+84 0x01EAD674
  0x01ead669: sub    $0x2,%ecx
  0x01ead66c: mov    (%esi,%ecx,1),%dx
  0x01ead670: mov    %dx,(%edi,%ecx,1)
  ;; L_skip_align2:
  0x01ead674: cmp    $0x8,%ecx
  0x01ead677: jb     Stub::jbyte_arraycopy+130 0x01EAD6A2
  0x01ead67d: test   $0x4,%eax
  0x01ead682: je     Stub::jbyte_arraycopy+122 0x01EAD69A
  0x01ead684: sub    $0x4,%ecx
  0x01ead687: mov    (%esi,%ecx,1),%edx
  0x01ead68a: mov    %edx,(%edi,%ecx,1)
  0x01ead68d: jmp    Stub::jbyte_arraycopy+122 0x01EAD69A
  0x01ead68f: nop    
  ;; L_copy_8_bytes_loop:
  0x01ead690: movq   (%esi,%ecx,1),%xmm0
  0x01ead695: movq   %xmm0,(%edi,%ecx,1)
  ;; L_copy_8_bytes:
  0x01ead69a: sub    $0x8,%ecx
  0x01ead69d: jge    Stub::jbyte_arraycopy+112 0x01EAD690
  0x01ead69f: add    $0x8,%ecx
  ;; L_copy_4_bytes:
  0x01ead6a2: test   $0x4,%ecx
  0x01ead6a8: je     Stub::jbyte_arraycopy+149 0x01EAD6B5
  0x01ead6aa: mov    -0x4(%esi,%ecx,1),%edx
  0x01ead6ae: mov    %edx,-0x4(%edi,%ecx,1)
  0x01ead6b2: sub    $0x4,%ecx
  ;; L_copy_2_bytes:
  0x01ead6b5: test   $0x2,%ecx
  0x01ead6bb: je     Stub::jbyte_arraycopy+170 0x01EAD6CA
  0x01ead6bd: mov    -0x2(%esi,%ecx,1),%dx
  0x01ead6c2: mov    %dx,-0x2(%edi,%ecx,1)
  0x01ead6c7: sub    $0x2,%ecx
  ;; L_copy_byte:
  0x01ead6ca: test   $0x1,%ecx
  0x01ead6d0: je     Stub::jbyte_arraycopy+182 0x01EAD6D6
  0x01ead6d2: mov    (%esi),%dl
  0x01ead6d4: mov    %dl,(%edi)
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jbyte_array_copy_ctr
  0x01ead6d6: incl   0x56004944
  0x01ead6dc: pop    %edi
  0x01ead6dd: pop    %esi
  0x01ead6de: mov    %ebp,%esp
  0x01ead6e0: pop    %ebp
  0x01ead6e1: xor    %eax,%eax
  0x01ead6e3: ret    

StubRoutines::arrayof_jshort_disjoint_arraycopy [0x01ead6f0, 0x01ead793[ (163 bytes)
  0x01ead6f0: push   %ebp
  0x01ead6f1: mov    %esp,%ebp
  0x01ead6f3: push   %esi
  0x01ead6f4: push   %edi
  0x01ead6f5: mov    0x10(%esp),%esi
  0x01ead6f9: mov    0x14(%esp),%edi
  0x01ead6fd: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01ead701: sub    %esi,%edi
  0x01ead703: cmp    $0x4,%ecx
  0x01ead706: jb     Stub::arrayof_jshort_disjoint_arraycopy+118 0x01EAD766
  ;; L_copy_64_bytes:
  0x01ead70c: mov    %ecx,%eax
  0x01ead70e: shr    $0x2,%eax
  0x01ead711: jmp    Stub::arrayof_jshort_disjoint_arraycopy+93 0x01EAD74D
  0x01ead713: nop    
  0x01ead714: nop    
  0x01ead715: nop    
  0x01ead716: nop    
  0x01ead717: nop    
  0x01ead718: nop    
  0x01ead719: nop    
  0x01ead71a: nop    
  0x01ead71b: nop    
  0x01ead71c: nop    
  0x01ead71d: nop    
  0x01ead71e: nop    
  0x01ead71f: nop    
  ;; L_copy_64_bytes_loop:
  0x01ead720: movdqu (%esi),%xmm0
  0x01ead724: movdqu %xmm0,(%esi,%edi,1)
  0x01ead729: movdqu 0x10(%esi),%xmm1
  0x01ead72e: movdqu %xmm1,0x10(%esi,%edi,1)
  0x01ead734: movdqu 0x20(%esi),%xmm2
  0x01ead739: movdqu %xmm2,0x20(%esi,%edi,1)
  0x01ead73f: movdqu 0x30(%esi),%xmm3
  0x01ead744: movdqu %xmm3,0x30(%esi,%edi,1)
  0x01ead74a: add    $0x40,%esi
  ;; L_copy_64_bytes:
  0x01ead74d: sub    $0x8,%eax
  0x01ead750: jge    Stub::arrayof_jshort_disjoint_arraycopy+48 0x01EAD720
  0x01ead752: add    $0x8,%eax
  0x01ead755: je     Stub::arrayof_jshort_disjoint_arraycopy+118 0x01EAD766
  ;; L_copy_8_bytes:
  0x01ead757: movq   (%esi),%xmm0
  0x01ead75b: movq   %xmm0,(%esi,%edi,1)
  0x01ead760: add    $0x8,%esi
  0x01ead763: dec    %eax
  0x01ead764: jg     Stub::arrayof_jshort_disjoint_arraycopy+103 0x01EAD757
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01ead766: test   $0x2,%ecx
  0x01ead76c: je     Stub::arrayof_jshort_disjoint_arraycopy+134 0x01EAD776
  0x01ead76e: mov    (%esi),%eax
  0x01ead770: mov    %eax,(%esi,%edi,1)
  0x01ead773: add    $0x4,%esi
  ;; L_copy_2_bytes:
  0x01ead776: test   $0x1,%ecx
  0x01ead77c: je     Stub::arrayof_jshort_disjoint_arraycopy+149 0x01EAD785
  0x01ead77e: mov    (%esi),%ax
  0x01ead781: mov    %ax,(%esi,%edi,1)
  ;; L_copy_byte:
  ;; inc_counter SharedRuntime::_jshort_array_copy_ctr
  0x01ead785: incl   0x5600494c
  0x01ead78b: pop    %edi
  0x01ead78c: pop    %esi
  0x01ead78d: mov    %ebp,%esp
  0x01ead78f: pop    %ebp
  0x01ead790: xor    %eax,%eax
  0x01ead792: ret    

StubRoutines::arrayof_jshort_arraycopy [0x01ead7a0, 0x01ead855[ (181 bytes)
  0x01ead7a0: push   %ebp
  0x01ead7a1: mov    %esp,%ebp
  0x01ead7a3: push   %esi
  0x01ead7a4: push   %edi
  0x01ead7a5: mov    0x10(%esp),%eax
  0x01ead7a9: mov    0x14(%esp),%edx
  0x01ead7ad: mov    0x18(%esp),%ecx
  0x01ead7b1: mov    %eax,%esi
  0x01ead7b3: mov    %edx,%edi
  0x01ead7b5: cmp    %eax,%edx
  0x01ead7b7: lea    (%eax,%ecx,2),%eax
  0x01ead7ba: jbe    Stub::arrayof_jshort_disjoint_arraycopy+17 0x01EAD701
  0x01ead7c0: cmp    %eax,%edx
  0x01ead7c2: jae    Stub::arrayof_jshort_disjoint_arraycopy+17 0x01EAD701
  0x01ead7c8: cmp    $0x4,%ecx
  0x01ead7cb: jb     Stub::arrayof_jshort_arraycopy+130 0x01EAD822
  0x01ead7d1: lea    (%edx,%ecx,2),%eax
  0x01ead7d4: test   $0x2,%eax
  0x01ead7d9: je     Stub::arrayof_jshort_arraycopy+70 0x01EAD7E6
  0x01ead7db: sub    $0x1,%ecx
  0x01ead7de: mov    (%esi,%ecx,2),%dx
  0x01ead7e2: mov    %dx,(%edi,%ecx,2)
  ;; L_skip_align2:
  0x01ead7e6: cmp    $0x4,%ecx
  0x01ead7e9: jb     Stub::arrayof_jshort_arraycopy+130 0x01EAD822
  0x01ead7ef: test   $0x4,%eax
  0x01ead7f4: je     Stub::arrayof_jshort_arraycopy+122 0x01EAD81A
  0x01ead7f6: sub    $0x2,%ecx
  0x01ead7f9: mov    (%esi,%ecx,2),%edx
  0x01ead7fc: mov    %edx,(%edi,%ecx,2)
  0x01ead7ff: jmp    Stub::arrayof_jshort_arraycopy+122 0x01EAD81A
  0x01ead801: nop    
  0x01ead802: nop    
  0x01ead803: nop    
  0x01ead804: nop    
  0x01ead805: nop    
  0x01ead806: nop    
  0x01ead807: nop    
  0x01ead808: nop    
  0x01ead809: nop    
  0x01ead80a: nop    
  0x01ead80b: nop    
  0x01ead80c: nop    
  0x01ead80d: nop    
  0x01ead80e: nop    
  0x01ead80f: nop    
  ;; L_copy_8_bytes_loop:
  0x01ead810: movq   (%esi,%ecx,2),%xmm0
  0x01ead815: movq   %xmm0,(%edi,%ecx,2)
  ;; L_copy_8_bytes:
  0x01ead81a: sub    $0x4,%ecx
  0x01ead81d: jge    Stub::arrayof_jshort_arraycopy+112 0x01EAD810
  0x01ead81f: add    $0x4,%ecx
  ;; L_copy_4_bytes:
  0x01ead822: test   $0x2,%ecx
  0x01ead828: je     Stub::arrayof_jshort_arraycopy+149 0x01EAD835
  0x01ead82a: mov    -0x4(%esi,%ecx,2),%edx
  0x01ead82e: mov    %edx,-0x4(%edi,%ecx,2)
  0x01ead832: sub    $0x2,%ecx
  ;; L_copy_2_bytes:
  0x01ead835: test   $0x1,%ecx
  0x01ead83b: je     Stub::arrayof_jshort_arraycopy+167 0x01EAD847
  0x01ead83d: mov    -0x2(%esi,%ecx,2),%dx
  0x01ead842: mov    %dx,-0x2(%edi,%ecx,2)
  ;; L_copy_byte:
  ;; inc_counter SharedRuntime::_jshort_array_copy_ctr
  0x01ead847: incl   0x5600494c
  0x01ead84d: pop    %edi
  0x01ead84e: pop    %esi
  0x01ead84f: mov    %ebp,%esp
  0x01ead851: pop    %ebp
  0x01ead852: xor    %eax,%eax
  0x01ead854: ret    

StubRoutines::jshort_disjoint_arraycopy [0x01ead860, 0x01ead903[ (163 bytes)
  0x01ead860: push   %ebp
  0x01ead861: mov    %esp,%ebp
  0x01ead863: push   %esi
  0x01ead864: push   %edi
  0x01ead865: mov    0x10(%esp),%esi
  0x01ead869: mov    0x14(%esp),%edi
  0x01ead86d: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01ead871: sub    %esi,%edi
  0x01ead873: cmp    $0x4,%ecx
  0x01ead876: jb     Stub::jshort_disjoint_arraycopy+118 0x01EAD8D6
  ;; L_copy_64_bytes:
  0x01ead87c: mov    %ecx,%eax
  0x01ead87e: shr    $0x2,%eax
  0x01ead881: jmp    Stub::jshort_disjoint_arraycopy+93 0x01EAD8BD
  0x01ead883: nop    
  0x01ead884: nop    
  0x01ead885: nop    
  0x01ead886: nop    
  0x01ead887: nop    
  0x01ead888: nop    
  0x01ead889: nop    
  0x01ead88a: nop    
  0x01ead88b: nop    
  0x01ead88c: nop    
  0x01ead88d: nop    
  0x01ead88e: nop    
  0x01ead88f: nop    
  ;; L_copy_64_bytes_loop:
  0x01ead890: movdqu (%esi),%xmm0
  0x01ead894: movdqu %xmm0,(%esi,%edi,1)
  0x01ead899: movdqu 0x10(%esi),%xmm1
  0x01ead89e: movdqu %xmm1,0x10(%esi,%edi,1)
  0x01ead8a4: movdqu 0x20(%esi),%xmm2
  0x01ead8a9: movdqu %xmm2,0x20(%esi,%edi,1)
  0x01ead8af: movdqu 0x30(%esi),%xmm3
  0x01ead8b4: movdqu %xmm3,0x30(%esi,%edi,1)
  0x01ead8ba: add    $0x40,%esi
  ;; L_copy_64_bytes:
  0x01ead8bd: sub    $0x8,%eax
  0x01ead8c0: jge    Stub::jshort_disjoint_arraycopy+48 0x01EAD890
  0x01ead8c2: add    $0x8,%eax
  0x01ead8c5: je     Stub::jshort_disjoint_arraycopy+118 0x01EAD8D6
  ;; L_copy_8_bytes:
  0x01ead8c7: movq   (%esi),%xmm0
  0x01ead8cb: movq   %xmm0,(%esi,%edi,1)
  0x01ead8d0: add    $0x8,%esi
  0x01ead8d3: dec    %eax
  0x01ead8d4: jg     Stub::jshort_disjoint_arraycopy+103 0x01EAD8C7
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01ead8d6: test   $0x2,%ecx
  0x01ead8dc: je     Stub::jshort_disjoint_arraycopy+134 0x01EAD8E6
  0x01ead8de: mov    (%esi),%eax
  0x01ead8e0: mov    %eax,(%esi,%edi,1)
  0x01ead8e3: add    $0x4,%esi
  ;; L_copy_2_bytes:
  0x01ead8e6: test   $0x1,%ecx
  0x01ead8ec: je     Stub::jshort_disjoint_arraycopy+149 0x01EAD8F5
  0x01ead8ee: mov    (%esi),%ax
  0x01ead8f1: mov    %ax,(%esi,%edi,1)
  ;; L_copy_byte:
  ;; inc_counter SharedRuntime::_jshort_array_copy_ctr
  0x01ead8f5: incl   0x5600494c
  0x01ead8fb: pop    %edi
  0x01ead8fc: pop    %esi
  0x01ead8fd: mov    %ebp,%esp
  0x01ead8ff: pop    %ebp
  0x01ead900: xor    %eax,%eax
  0x01ead902: ret    

StubRoutines::jshort_arraycopy [0x01ead910, 0x01ead9c5[ (181 bytes)
  0x01ead910: push   %ebp
  0x01ead911: mov    %esp,%ebp
  0x01ead913: push   %esi
  0x01ead914: push   %edi
  0x01ead915: mov    0x10(%esp),%eax
  0x01ead919: mov    0x14(%esp),%edx
  0x01ead91d: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01ead921: mov    %eax,%esi
  0x01ead923: mov    %edx,%edi
  0x01ead925: cmp    %eax,%edx
  0x01ead927: lea    (%eax,%ecx,2),%eax
  0x01ead92a: jbe    Stub::jshort_disjoint_arraycopy+17 0x01EAD871
  0x01ead930: cmp    %eax,%edx
  0x01ead932: jae    Stub::jshort_disjoint_arraycopy+17 0x01EAD871
  0x01ead938: cmp    $0x4,%ecx
  0x01ead93b: jb     Stub::jshort_arraycopy+130 0x01EAD992
  0x01ead941: lea    (%edx,%ecx,2),%eax
  0x01ead944: test   $0x2,%eax
  0x01ead949: je     Stub::jshort_arraycopy+70 0x01EAD956
  0x01ead94b: sub    $0x1,%ecx
  0x01ead94e: mov    (%esi,%ecx,2),%dx
  0x01ead952: mov    %dx,(%edi,%ecx,2)
  ;; L_skip_align2:
  0x01ead956: cmp    $0x4,%ecx
  0x01ead959: jb     Stub::jshort_arraycopy+130 0x01EAD992
  0x01ead95f: test   $0x4,%eax
  0x01ead964: je     Stub::jshort_arraycopy+122 0x01EAD98A
  0x01ead966: sub    $0x2,%ecx
  0x01ead969: mov    (%esi,%ecx,2),%edx
  0x01ead96c: mov    %edx,(%edi,%ecx,2)
  0x01ead96f: jmp    Stub::jshort_arraycopy+122 0x01EAD98A
  0x01ead971: nop    
  0x01ead972: nop    
  0x01ead973: nop    
  0x01ead974: nop    
  0x01ead975: nop    
  0x01ead976: nop    
  0x01ead977: nop    
  0x01ead978: nop    
  0x01ead979: nop    
  0x01ead97a: nop    
  0x01ead97b: nop    
  0x01ead97c: nop    
  0x01ead97d: nop    
  0x01ead97e: nop    
  0x01ead97f: nop    
  ;; L_copy_8_bytes_loop:
  0x01ead980: movq   (%esi,%ecx,2),%xmm0
  0x01ead985: movq   %xmm0,(%edi,%ecx,2)
  ;; L_copy_8_bytes:
  0x01ead98a: sub    $0x4,%ecx
  0x01ead98d: jge    Stub::jshort_arraycopy+112 0x01EAD980
  0x01ead98f: add    $0x4,%ecx
  ;; L_copy_4_bytes:
  0x01ead992: test   $0x2,%ecx
  0x01ead998: je     Stub::jshort_arraycopy+149 0x01EAD9A5
  0x01ead99a: mov    -0x4(%esi,%ecx,2),%edx
  0x01ead99e: mov    %edx,-0x4(%edi,%ecx,2)
  0x01ead9a2: sub    $0x2,%ecx
  ;; L_copy_2_bytes:
  0x01ead9a5: test   $0x1,%ecx
  0x01ead9ab: je     Stub::jshort_arraycopy+167 0x01EAD9B7
  0x01ead9ad: mov    -0x2(%esi,%ecx,2),%dx
  0x01ead9b2: mov    %dx,-0x2(%edi,%ecx,2)
  ;; L_copy_byte:
  ;; inc_counter SharedRuntime::_jshort_array_copy_ctr
  0x01ead9b7: incl   0x5600494c
  0x01ead9bd: pop    %edi
  0x01ead9be: pop    %esi
  0x01ead9bf: mov    %ebp,%esp
  0x01ead9c1: pop    %ebp
  0x01ead9c2: xor    %eax,%eax
  0x01ead9c4: ret    

StubRoutines::jint_disjoint_arraycopy [0x01ead9d0, 0x01eada61[ (145 bytes)
  0x01ead9d0: push   %ebp
  0x01ead9d1: mov    %esp,%ebp
  0x01ead9d3: push   %esi
  0x01ead9d4: push   %edi
  0x01ead9d5: mov    0x10(%esp),%esi
  0x01ead9d9: mov    0x14(%esp),%edi
  0x01ead9dd: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01ead9e1: sub    %esi,%edi
  0x01ead9e3: cmp    $0x2,%ecx
  0x01ead9e6: jb     Stub::jint_disjoint_arraycopy+118 0x01EADA46
  ;; L_copy_64_bytes:
  0x01ead9ec: mov    %ecx,%eax
  0x01ead9ee: shr    $0x1,%eax
  0x01ead9f1: jmp    Stub::jint_disjoint_arraycopy+93 0x01EADA2D
  0x01ead9f3: nop    
  0x01ead9f4: nop    
  0x01ead9f5: nop    
  0x01ead9f6: nop    
  0x01ead9f7: nop    
  0x01ead9f8: nop    
  0x01ead9f9: nop    
  0x01ead9fa: nop    
  0x01ead9fb: nop    
  0x01ead9fc: nop    
  0x01ead9fd: nop    
  0x01ead9fe: nop    
  0x01ead9ff: nop    
  ;; L_copy_64_bytes_loop:
  0x01eada00: movdqu (%esi),%xmm0
  0x01eada04: movdqu %xmm0,(%esi,%edi,1)
  0x01eada09: movdqu 0x10(%esi),%xmm1
  0x01eada0e: movdqu %xmm1,0x10(%esi,%edi,1)
  0x01eada14: movdqu 0x20(%esi),%xmm2
  0x01eada19: movdqu %xmm2,0x20(%esi,%edi,1)
  0x01eada1f: movdqu 0x30(%esi),%xmm3
  0x01eada24: movdqu %xmm3,0x30(%esi,%edi,1)
  0x01eada2a: add    $0x40,%esi
  ;; L_copy_64_bytes:
  0x01eada2d: sub    $0x8,%eax
  0x01eada30: jge    Stub::jint_disjoint_arraycopy+48 0x01EADA00
  0x01eada32: add    $0x8,%eax
  0x01eada35: je     Stub::jint_disjoint_arraycopy+118 0x01EADA46
  ;; L_copy_8_bytes:
  0x01eada37: movq   (%esi),%xmm0
  0x01eada3b: movq   %xmm0,(%esi,%edi,1)
  0x01eada40: add    $0x8,%esi
  0x01eada43: dec    %eax
  0x01eada44: jg     Stub::jint_disjoint_arraycopy+103 0x01EADA37
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01eada46: test   $0x1,%ecx
  0x01eada4c: je     Stub::jint_disjoint_arraycopy+131 0x01EADA53
  0x01eada4e: mov    (%esi),%eax
  0x01eada50: mov    %eax,(%esi,%edi,1)
  ;; L_copy_2_bytes:
  ;; inc_counter SharedRuntime::_jint_array_copy_ctr
  0x01eada53: incl   0x56004950
  0x01eada59: pop    %edi
  0x01eada5a: pop    %esi
  0x01eada5b: mov    %ebp,%esp
  0x01eada5d: pop    %ebp
  0x01eada5e: xor    %eax,%eax
  0x01eada60: ret    

StubRoutines::jint_arraycopy [0x01eada70, 0x01eadaf0[ (128 bytes)
  0x01eada70: push   %ebp
  0x01eada71: mov    %esp,%ebp
  0x01eada73: push   %esi
  0x01eada74: push   %edi
  0x01eada75: mov    0x10(%esp),%eax
  0x01eada79: mov    0x14(%esp),%edx
  0x01eada7d: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01eada81: mov    %eax,%esi
  0x01eada83: mov    %edx,%edi
  0x01eada85: cmp    %eax,%edx
  0x01eada87: lea    (%eax,%ecx,4),%eax
  0x01eada8a: jbe    Stub::jint_disjoint_arraycopy+17 0x01EAD9E1
  0x01eada90: cmp    %eax,%edx
  0x01eada92: jae    Stub::jint_disjoint_arraycopy+17 0x01EAD9E1
  0x01eada98: cmp    $0x2,%ecx
  0x01eada9b: jb     Stub::jint_arraycopy+98 0x01EADAD2
  0x01eadaa1: test   $0x4,%eax
  0x01eadaa6: je     Stub::jint_arraycopy+90 0x01EADACA
  0x01eadaa8: sub    $0x1,%ecx
  0x01eadaab: mov    (%esi,%ecx,4),%edx
  0x01eadaae: mov    %edx,(%edi,%ecx,4)
  0x01eadab1: jmp    Stub::jint_arraycopy+90 0x01EADACA
  0x01eadab3: nop    
  0x01eadab4: nop    
  0x01eadab5: nop    
  0x01eadab6: nop    
  0x01eadab7: nop    
  0x01eadab8: nop    
  0x01eadab9: nop    
  0x01eadaba: nop    
  0x01eadabb: nop    
  0x01eadabc: nop    
  0x01eadabd: nop    
  0x01eadabe: nop    
  0x01eadabf: nop    
  ;; L_copy_8_bytes_loop:
  0x01eadac0: movq   (%esi,%ecx,4),%xmm0
  0x01eadac5: movq   %xmm0,(%edi,%ecx,4)
  ;; L_copy_8_bytes:
  0x01eadaca: sub    $0x2,%ecx
  0x01eadacd: jge    Stub::jint_arraycopy+80 0x01EADAC0
  0x01eadacf: add    $0x2,%ecx
  ;; L_copy_4_bytes:
  0x01eadad2: test   $0x1,%ecx
  0x01eadad8: je     Stub::jint_arraycopy+114 0x01EADAE2
  0x01eadada: mov    -0x4(%esi,%ecx,4),%edx
  0x01eadade: mov    %edx,-0x4(%edi,%ecx,4)
  ;; L_copy_2_bytes:
  ;; inc_counter SharedRuntime::_jint_array_copy_ctr
  0x01eadae2: incl   0x56004950
  0x01eadae8: pop    %edi
  0x01eadae9: pop    %esi
  0x01eadaea: mov    %ebp,%esp
  0x01eadaec: pop    %ebp
  0x01eadaed: xor    %eax,%eax
  0x01eadaef: ret    

StubRoutines::oop_disjoint_arraycopy [0x01eadaf0, 0x01eadb9e[ (174 bytes)
  0x01eadaf0: push   %ebp
  0x01eadaf1: mov    %esp,%ebp
  0x01eadaf3: push   %esi
  0x01eadaf4: push   %edi
  0x01eadaf5: mov    0x10(%esp),%esi
  0x01eadaf9: mov    0x14(%esp),%edi
  0x01eadafd: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01eadb01: test   %ecx,%ecx
  0x01eadb03: je     Stub::oop_disjoint_arraycopy+160 0x01EADB90
  0x01eadb09: mov    %edi,%edx
  0x01eadb0b: sub    %esi,%edi
  0x01eadb0d: cmp    $0x2,%ecx
  0x01eadb10: jb     Stub::oop_disjoint_arraycopy+118 0x01EADB66
  ;; L_copy_64_bytes:
  0x01eadb16: mov    %ecx,%eax
  0x01eadb18: shr    $0x1,%eax
  0x01eadb1b: jmp    Stub::oop_disjoint_arraycopy+93 0x01EADB4D
  0x01eadb1d: nop    
  0x01eadb1e: nop    
  0x01eadb1f: nop    
  ;; L_copy_64_bytes_loop:
  0x01eadb20: movdqu (%esi),%xmm0
  0x01eadb24: movdqu %xmm0,(%esi,%edi,1)
  0x01eadb29: movdqu 0x10(%esi),%xmm1
  0x01eadb2e: movdqu %xmm1,0x10(%esi,%edi,1)
  0x01eadb34: movdqu 0x20(%esi),%xmm2
  0x01eadb39: movdqu %xmm2,0x20(%esi,%edi,1)
  0x01eadb3f: movdqu 0x30(%esi),%xmm3
  0x01eadb44: movdqu %xmm3,0x30(%esi,%edi,1)
  0x01eadb4a: add    $0x40,%esi
  ;; L_copy_64_bytes:
  0x01eadb4d: sub    $0x8,%eax
  0x01eadb50: jge    Stub::oop_disjoint_arraycopy+48 0x01EADB20
  0x01eadb52: add    $0x8,%eax
  0x01eadb55: je     Stub::oop_disjoint_arraycopy+118 0x01EADB66
  ;; L_copy_8_bytes:
  0x01eadb57: movq   (%esi),%xmm0
  0x01eadb5b: movq   %xmm0,(%esi,%edi,1)
  0x01eadb60: add    $0x8,%esi
  0x01eadb63: dec    %eax
  0x01eadb64: jg     Stub::oop_disjoint_arraycopy+103 0x01EADB57
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01eadb66: test   $0x1,%ecx
  0x01eadb6c: je     Stub::oop_disjoint_arraycopy+131 0x01EADB73
  0x01eadb6e: mov    (%esi),%eax
  0x01eadb70: mov    %eax,(%esi,%edi,1)
  ;; L_copy_2_bytes:
  0x01eadb73: mov    0x18(%esp),%ecx
  0x01eadb77: mov    %edx,%edi
  0x01eadb79: lea    -0x4(%edi,%ecx,4),%ecx
  0x01eadb7d: shr    $0x9,%edi
  0x01eadb80: shr    $0x9,%ecx
  0x01eadb83: sub    %edi,%ecx
  ;; L_loop:
  0x01eadb85: movb   $0x0,0x1207000(%edi,%ecx,1)
  0x01eadb8d: dec    %ecx
  0x01eadb8e: jge    Stub::oop_disjoint_arraycopy+149 0x01EADB85
  ;; L_0_count:
  ;; inc_counter SharedRuntime::_oop_array_copy_ctr
  0x01eadb90: incl   0x56004958
  0x01eadb96: pop    %edi
  0x01eadb97: pop    %esi
  0x01eadb98: mov    %ebp,%esp
  0x01eadb9a: pop    %ebp
  0x01eadb9b: xor    %eax,%eax
  0x01eadb9d: ret    

StubRoutines::oop_arraycopy [0x01eadba0, 0x01eadc3b[ (155 bytes)
  0x01eadba0: push   %ebp
  0x01eadba1: mov    %esp,%ebp
  0x01eadba3: push   %esi
  0x01eadba4: push   %edi
  0x01eadba5: mov    0x10(%esp),%eax
  0x01eadba9: mov    0x14(%esp),%edx
  0x01eadbad: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01eadbb1: mov    %eax,%esi
  0x01eadbb3: mov    %edx,%edi
  0x01eadbb5: cmp    %eax,%edx
  0x01eadbb7: lea    (%eax,%ecx,4),%eax
  0x01eadbba: jbe    Stub::oop_disjoint_arraycopy+17 0x01EADB01
  0x01eadbc0: cmp    %eax,%edx
  0x01eadbc2: jae    Stub::oop_disjoint_arraycopy+17 0x01EADB01
  0x01eadbc8: test   %ecx,%ecx
  0x01eadbca: je     Stub::oop_arraycopy+141 0x01EADC2D
  0x01eadbd0: cmp    $0x2,%ecx
  0x01eadbd3: jb     Stub::oop_arraycopy+98 0x01EADC02
  0x01eadbd9: test   $0x4,%eax
  0x01eadbde: je     Stub::oop_arraycopy+90 0x01EADBFA
  0x01eadbe0: sub    $0x1,%ecx
  0x01eadbe3: mov    (%esi,%ecx,4),%edx
  0x01eadbe6: mov    %edx,(%edi,%ecx,4)
  0x01eadbe9: jmp    Stub::oop_arraycopy+90 0x01EADBFA
  0x01eadbeb: nop    
  0x01eadbec: nop    
  0x01eadbed: nop    
  0x01eadbee: nop    
  0x01eadbef: nop    
  ;; L_copy_8_bytes_loop:
  0x01eadbf0: movq   (%esi,%ecx,4),%xmm0
  0x01eadbf5: movq   %xmm0,(%edi,%ecx,4)
  ;; L_copy_8_bytes:
  0x01eadbfa: sub    $0x2,%ecx
  0x01eadbfd: jge    Stub::oop_arraycopy+80 0x01EADBF0
  0x01eadbff: add    $0x2,%ecx
  ;; L_copy_4_bytes:
  0x01eadc02: test   $0x1,%ecx
  0x01eadc08: je     Stub::oop_arraycopy+114 0x01EADC12
  0x01eadc0a: mov    -0x4(%esi,%ecx,4),%edx
  0x01eadc0e: mov    %edx,-0x4(%edi,%ecx,4)
  ;; L_copy_2_bytes:
  0x01eadc12: mov    0x18(%esp),%ecx
  0x01eadc16: lea    -0x4(%edi,%ecx,4),%ecx
  0x01eadc1a: shr    $0x9,%edi
  0x01eadc1d: shr    $0x9,%ecx
  0x01eadc20: sub    %edi,%ecx
  ;; L_loop:
  0x01eadc22: movb   $0x0,0x1207000(%edi,%ecx,1)
  0x01eadc2a: dec    %ecx
  0x01eadc2b: jge    Stub::oop_arraycopy+130 0x01EADC22
  ;; L_0_count:
  ;; inc_counter SharedRuntime::_oop_array_copy_ctr
  0x01eadc2d: incl   0x56004958
  0x01eadc33: pop    %edi
  0x01eadc34: pop    %esi
  0x01eadc35: mov    %ebp,%esp
  0x01eadc37: pop    %ebp
  0x01eadc38: xor    %eax,%eax
  0x01eadc3a: ret    

StubRoutines::oop_disjoint_arraycopy_uninit [0x01eadc40, 0x01eadcee[ (174 bytes)
  0x01eadc40: push   %ebp
  0x01eadc41: mov    %esp,%ebp
  0x01eadc43: push   %esi
  0x01eadc44: push   %edi
  0x01eadc45: mov    0x10(%esp),%esi
  0x01eadc49: mov    0x14(%esp),%edi
  0x01eadc4d: mov    0x18(%esp),%ecx
  ;; Entry:
  0x01eadc51: test   %ecx,%ecx
  0x01eadc53: je     Stub::oop_disjoint_arraycopy_uninit+160 0x01EADCE0
  0x01eadc59: mov    %edi,%edx
  0x01eadc5b: sub    %esi,%edi
  0x01eadc5d: cmp    $0x2,%ecx
  0x01eadc60: jb     Stub::oop_disjoint_arraycopy_uninit+118 0x01EADCB6
  ;; L_copy_64_bytes:
  0x01eadc66: mov    %ecx,%eax
  0x01eadc68: shr    $0x1,%eax
  0x01eadc6b: jmp    Stub::oop_disjoint_arraycopy_uninit+93 0x01EADC9D
  0x01eadc6d: nop    
  0x01eadc6e: nop    
  0x01eadc6f: nop    
  ;; L_copy_64_bytes_loop:
  0x01eadc70: movdqu (%esi),%xmm0
  0x01eadc74: movdqu %xmm0,(%esi,%edi,1)
  0x01eadc79: movdqu 0x10(%esi),%xmm1
  0x01eadc7e: movdqu %xmm1,0x10(%esi,%edi,1)
  0x01eadc84: movdqu 0x20(%esi),%xmm2
  0x01eadc89: movdqu %xmm2,0x20(%esi,%edi,1)
  0x01eadc8f: movdqu 0x30(%esi),%xmm3
  0x01eadc94: movdqu %xmm3,0x30(%esi,%edi,1)
  0x01eadc9a: add    $0x40,%esi
  ;; L_copy_64_bytes:
  0x01eadc9d: sub    $0x8,%eax
  0x01eadca0: jge    Stub::oop_disjoint_arraycopy_uninit+48 0x01EADC70
  0x01eadca2: add    $0x8,%eax
  0x01eadca5: je     Stub::oop_disjoint_arraycopy_uninit+118 0x01EADCB6
  ;; L_copy_8_bytes:
  0x01eadca7: movq   (%esi),%xmm0
  0x01eadcab: movq   %xmm0,(%esi,%edi,1)
  0x01eadcb0: add    $0x8,%esi
  0x01eadcb3: dec    %eax
  0x01eadcb4: jg     Stub::oop_disjoint_arraycopy_uninit+103 0x01EADCA7
  ;; L_exit:
  ;; L_copy_4_bytes:
  0x01eadcb6: test   $0x1,%ecx
  0x01eadcbc: je     Stub::oop_disjoint_arraycopy_uninit+131 0x01EADCC3
  0x01eadcbe: mov    (%esi),%eax
  0x01eadcc0: mov    %eax,(%esi,%edi,1)
  ;; L_copy_2_bytes:
  0x01eadcc3: mov    0x18(%esp),%ecx
  0x01eadcc7: mov    %edx,%edi
  0x01eadcc9: lea    -0x4(%edi,%ecx,4),%ecx
  0x01eadccd: shr    $0x9,%edi
  0x01eadcd0: shr    $0x9,%ecx
  0x01eadcd3: sub    %edi,%ecx
  ;; L_loop:
  0x01eadcd5: movb   $0x0,0x1207000(%edi,%ecx,1)
  0x01eadcdd: dec    %ecx
  0x01eadcde: jge    Stub::oop_disjoint_arraycopy_uninit+149 0x01EADCD5
  ;; L_0_count:
  ;; inc_counter SharedRuntime::_oop_array_copy_ctr
  0x01eadce0: incl   0x56004958
  0x01eadce6: pop    %edi
  0x01eadce7: pop    %esi
  0x01eadce8: mov    %ebp,%esp
  0x01eadcea: pop    %ebp
  0x01eadceb: xor    %eax,%eax
  0x01eadced: ret    

StubRoutines::oop_arraycopy_uninit [0x01eadcf0, 0x01eadd8b[ (155 bytes)
  0x01eadcf0: push   %ebp
  0x01eadcf1: mov    %esp,%ebp
  0x01eadcf3: push   %esi
  0x01eadcf4: push   %edi
  0x01eadcf5: mov    0x10(%esp),%eax
  0x01eadcf9: mov    0x14(%esp),%edx
  0x01eadcfd: mov    0x18(%esp),%ecx
  0x01eadd01: mov    %eax,%esi
  0x01eadd03: mov    %edx,%edi
  0x01eadd05: cmp    %eax,%edx
  0x01eadd07: lea    (%eax,%ecx,4),%eax
  0x01eadd0a: jbe    Stub::oop_disjoint_arraycopy_uninit+17 0x01EADC51
  0x01eadd10: cmp    %eax,%edx
  0x01eadd12: jae    Stub::oop_disjoint_arraycopy_uninit+17 0x01EADC51
  0x01eadd18: test   %ecx,%ecx
  0x01eadd1a: je     Stub::oop_arraycopy_uninit+141 0x01EADD7D
  0x01eadd20: cmp    $0x2,%ecx
  0x01eadd23: jb     Stub::oop_arraycopy_uninit+98 0x01EADD52
  0x01eadd29: test   $0x4,%eax
  0x01eadd2e: je     Stub::oop_arraycopy_uninit+90 0x01EADD4A
  0x01eadd30: sub    $0x1,%ecx
  0x01eadd33: mov    (%esi,%ecx,4),%edx
  0x01eadd36: mov    %edx,(%edi,%ecx,4)
  0x01eadd39: jmp    Stub::oop_arraycopy_uninit+90 0x01EADD4A
  0x01eadd3b: nop    
  0x01eadd3c: nop    
  0x01eadd3d: nop    
  0x01eadd3e: nop    
  0x01eadd3f: nop    
  ;; L_copy_8_bytes_loop:
  0x01eadd40: movq   (%esi,%ecx,4),%xmm0
  0x01eadd45: movq   %xmm0,(%edi,%ecx,4)
  ;; L_copy_8_bytes:
  0x01eadd4a: sub    $0x2,%ecx
  0x01eadd4d: jge    Stub::oop_arraycopy_uninit+80 0x01EADD40
  0x01eadd4f: add    $0x2,%ecx
  ;; L_copy_4_bytes:
  0x01eadd52: test   $0x1,%ecx
  0x01eadd58: je     Stub::oop_arraycopy_uninit+114 0x01EADD62
  0x01eadd5a: mov    -0x4(%esi,%ecx,4),%edx
  0x01eadd5e: mov    %edx,-0x4(%edi,%ecx,4)
  ;; L_copy_2_bytes:
  0x01eadd62: mov    0x18(%esp),%ecx
  0x01eadd66: lea    -0x4(%edi,%ecx,4),%ecx
  0x01eadd6a: shr    $0x9,%edi
  0x01eadd6d: shr    $0x9,%ecx
  0x01eadd70: sub    %edi,%ecx
  ;; L_loop:
  0x01eadd72: movb   $0x0,0x1207000(%edi,%ecx,1)
  0x01eadd7a: dec    %ecx
  0x01eadd7b: jge    Stub::oop_arraycopy_uninit+130 0x01EADD72
  ;; L_0_count:
  ;; inc_counter SharedRuntime::_oop_array_copy_ctr
  0x01eadd7d: incl   0x56004958
  0x01eadd83: pop    %edi
  0x01eadd84: pop    %esi
  0x01eadd85: mov    %ebp,%esp
  0x01eadd87: pop    %ebp
  0x01eadd88: xor    %eax,%eax
  0x01eadd8a: ret    

StubRoutines::jlong_disjoint_arraycopy [0x01eadd90, 0x01eade02[ (114 bytes)
  0x01eadd90: push   %ebp
  0x01eadd91: mov    %esp,%ebp
  0x01eadd93: mov    0x8(%esp),%eax
  0x01eadd97: mov    0xc(%esp),%edx
  0x01eadd9b: mov    0x10(%esp),%ecx
  ;; Entry:
  0x01eadd9f: sub    %eax,%edx
  0x01eadda1: jmp    Stub::jlong_disjoint_arraycopy+77 0x01EADDDD
  0x01eadda3: nop    
  0x01eadda4: nop    
  0x01eadda5: nop    
  0x01eadda6: nop    
  0x01eadda7: nop    
  0x01eadda8: nop    
  0x01eadda9: nop    
  0x01eaddaa: nop    
  0x01eaddab: nop    
  0x01eaddac: nop    
  0x01eaddad: nop    
  0x01eaddae: nop    
  0x01eaddaf: nop    
  ;; L_copy_64_bytes_loop:
  0x01eaddb0: movdqu (%eax),%xmm0
  0x01eaddb4: movdqu %xmm0,(%eax,%edx,1)
  0x01eaddb9: movdqu 0x10(%eax),%xmm1
  0x01eaddbe: movdqu %xmm1,0x10(%eax,%edx,1)
  0x01eaddc4: movdqu 0x20(%eax),%xmm2
  0x01eaddc9: movdqu %xmm2,0x20(%eax,%edx,1)
  0x01eaddcf: movdqu 0x30(%eax),%xmm3
  0x01eaddd4: movdqu %xmm3,0x30(%eax,%edx,1)
  0x01eaddda: add    $0x40,%eax
  ;; L_copy_64_bytes:
  0x01eadddd: sub    $0x8,%ecx
  0x01eadde0: jge    Stub::jlong_disjoint_arraycopy+32 0x01EADDB0
  0x01eadde2: add    $0x8,%ecx
  0x01eadde5: je     Stub::jlong_disjoint_arraycopy+102 0x01EADDF6
  ;; L_copy_8_bytes:
  0x01eadde7: movq   (%eax),%xmm0
  0x01eaddeb: movq   %xmm0,(%eax,%edx,1)
  0x01eaddf0: add    $0x8,%eax
  0x01eaddf3: dec    %ecx
  0x01eaddf4: jg     Stub::jlong_disjoint_arraycopy+87 0x01EADDE7
  ;; L_exit:
  ;; inc_counter SharedRuntime::_jlong_array_copy_ctr
  0x01eaddf6: incl   0x56004954
  0x01eaddfc: mov    %ebp,%esp
  0x01eaddfe: pop    %ebp
  0x01eaddff: xor    %eax,%eax
  0x01eade01: ret    

StubRoutines::jlong_arraycopy [0x01eade10, 0x01eade59[ (73 bytes)
  0x01eade10: push   %ebp
  0x01eade11: mov    %esp,%ebp
  0x01eade13: mov    0x8(%esp),%eax
  0x01eade17: mov    0xc(%esp),%edx
  0x01eade1b: mov    0x10(%esp),%ecx
  ;; Entry:
  0x01eade1f: cmp    %eax,%edx
  0x01eade21: jbe    Stub::jlong_disjoint_arraycopy+15 0x01EADD9F
  0x01eade27: lea    (%eax,%ecx,8),%eax
  0x01eade2a: cmp    %eax,%edx
  0x01eade2c: mov    0x8(%esp),%eax
  0x01eade30: jae    Stub::jlong_disjoint_arraycopy+15 0x01EADD9F
  0x01eade36: jmp    Stub::jlong_arraycopy+58 0x01EADE4A
  0x01eade38: nop    
  0x01eade39: nop    
  0x01eade3a: nop    
  0x01eade3b: nop    
  0x01eade3c: nop    
  0x01eade3d: nop    
  0x01eade3e: nop    
  0x01eade3f: nop    
  ;; L_copy_8_bytes_loop:
  0x01eade40: movq   (%eax,%ecx,8),%xmm0
  0x01eade45: movq   %xmm0,(%edx,%ecx,8)
  ;; L_copy_8_bytes:
  0x01eade4a: dec    %ecx
  0x01eade4b: jge    Stub::jlong_arraycopy+48 0x01EADE40
  ;; inc_counter SharedRuntime::_jlong_array_copy_ctr
  0x01eade4d: incl   0x56004954
  0x01eade53: mov    %ebp,%esp
  0x01eade55: pop    %ebp
  0x01eade56: xor    %eax,%eax
  0x01eade58: ret    

StubRoutines::jbyte_fill [0x01eade60, 0x01eadeef[ (143 bytes)
  ;; Entry:
  0x01eade60: push   %ebp
  0x01eade61: mov    %esp,%ebp
  0x01eade63: push   %esi
  0x01eade64: push   %edi
  0x01eade65: mov    0x10(%esp),%edi
  0x01eade69: mov    0x14(%esp),%edx
  0x01eade6d: mov    0x18(%esp),%esi
  0x01eade71: and    $0xff,%edx
  0x01eade77: mov    %edx,%eax
  0x01eade79: shl    $0x8,%eax
  0x01eade7c: or     %eax,%edx
  0x01eade7e: mov    %edx,%eax
  0x01eade80: shl    $0x10,%eax
  0x01eade83: or     %eax,%edx
  0x01eade85: cmp    $0x8,%esi
  0x01eade88: jb     Stub::jbyte_fill+100 0x01EADEC4
  ;; L_fill_32_bytes:
  0x01eade8e: movd   %edx,%xmm0
  0x01eade92: pshufd $0x0,%xmm0,%xmm0
  0x01eade97: sub    $0x20,%esi
  0x01eade9a: jl     Stub::jbyte_fill+81 0x01EADEB1
  ;; L_fill_32_bytes_loop:
  0x01eadea0: movdqu %xmm0,(%edi)
  0x01eadea4: movdqu %xmm0,0x10(%edi)
  0x01eadea9: add    $0x20,%edi
  0x01eadeac: sub    $0x20,%esi
  0x01eadeaf: jge    Stub::jbyte_fill+64 0x01EADEA0
  ;; L_check_fill_8_bytes:
  0x01eadeb1: add    $0x20,%esi
  0x01eadeb4: je     Stub::jbyte_fill+137 0x01EADEE9
  0x01eadeb6: jmp    Stub::jbyte_fill+95 0x01EADEBF
  ;; L_fill_8_bytes_loop:
  0x01eadeb8: movq   %xmm0,(%edi)
  0x01eadebc: add    $0x8,%edi
  ;; L_fill_8_bytes:
  0x01eadebf: sub    $0x8,%esi
  0x01eadec2: jge    Stub::jbyte_fill+88 0x01EADEB8
  ;; L_fill_4_bytes:
  0x01eadec4: test   $0x4,%esi
  0x01eadeca: je     Stub::jbyte_fill+113 0x01EADED1
  0x01eadecc: mov    %edx,(%edi)
  0x01eadece: add    $0x4,%edi
  ;; L_fill_2_bytes:
  0x01eaded1: test   $0x2,%esi
  0x01eaded7: je     Stub::jbyte_fill+127 0x01EADEDF
  0x01eaded9: mov    %dx,(%edi)
  0x01eadedc: add    $0x2,%edi
  ;; L_fill_byte:
  0x01eadedf: test   $0x1,%esi
  0x01eadee5: je     Stub::jbyte_fill+137 0x01EADEE9
  0x01eadee7: mov    %dl,(%edi)
  ;; L_exit:
  0x01eadee9: pop    %edi
  0x01eadeea: pop    %esi
  0x01eadeeb: mov    %ebp,%esp
  0x01eadeed: pop    %ebp
  0x01eadeee: ret    

StubRoutines::jshort_fill [0x01eadef0, 0x01eadf72[ (130 bytes)
  ;; Entry:
  0x01eadef0: push   %ebp
  0x01eadef1: mov    %esp,%ebp
  0x01eadef3: push   %esi
  0x01eadef4: push   %edi
  0x01eadef5: mov    0x10(%esp),%edi
  0x01eadef9: mov    0x14(%esp),%edx
  0x01eadefd: mov    0x18(%esp),%esi
  0x01eadf01: and    $0xffff,%edx
  0x01eadf07: mov    %edx,%eax
  0x01eadf09: shl    $0x10,%eax
  0x01eadf0c: or     %eax,%edx
  0x01eadf0e: cmp    $0x4,%esi
  0x01eadf11: jb     Stub::jshort_fill+100 0x01EADF54
  ;; L_fill_32_bytes:
  0x01eadf17: movd   %edx,%xmm0
  0x01eadf1b: pshufd $0x0,%xmm0,%xmm0
  0x01eadf20: sub    $0x10,%esi
  0x01eadf23: jl     Stub::jshort_fill+81 0x01EADF41
  0x01eadf29: nop    
  0x01eadf2a: nop    
  0x01eadf2b: nop    
  0x01eadf2c: nop    
  0x01eadf2d: nop    
  0x01eadf2e: nop    
  0x01eadf2f: nop    
  ;; L_fill_32_bytes_loop:
  0x01eadf30: movdqu %xmm0,(%edi)
  0x01eadf34: movdqu %xmm0,0x10(%edi)
  0x01eadf39: add    $0x20,%edi
  0x01eadf3c: sub    $0x10,%esi
  0x01eadf3f: jge    Stub::jshort_fill+64 0x01EADF30
  ;; L_check_fill_8_bytes:
  0x01eadf41: add    $0x10,%esi
  0x01eadf44: je     Stub::jshort_fill+124 0x01EADF6C
  0x01eadf46: jmp    Stub::jshort_fill+95 0x01EADF4F
  ;; L_fill_8_bytes_loop:
  0x01eadf48: movq   %xmm0,(%edi)
  0x01eadf4c: add    $0x8,%edi
  ;; L_fill_8_bytes:
  0x01eadf4f: sub    $0x4,%esi
  0x01eadf52: jge    Stub::jshort_fill+88 0x01EADF48
  ;; L_fill_4_bytes:
  0x01eadf54: test   $0x2,%esi
  0x01eadf5a: je     Stub::jshort_fill+113 0x01EADF61
  0x01eadf5c: mov    %edx,(%edi)
  0x01eadf5e: add    $0x4,%edi
  ;; L_fill_2_bytes:
  0x01eadf61: test   $0x1,%esi
  0x01eadf67: je     Stub::jshort_fill+124 0x01EADF6C
  0x01eadf69: mov    %dx,(%edi)
  ;; L_fill_byte:
  ;; L_exit:
  0x01eadf6c: pop    %edi
  0x01eadf6d: pop    %esi
  0x01eadf6e: mov    %ebp,%esp
  0x01eadf70: pop    %ebp
  0x01eadf71: ret    

StubRoutines::jint_fill [0x01eadf80, 0x01eadfe4[ (100 bytes)
  ;; Entry:
  0x01eadf80: push   %ebp
  0x01eadf81: mov    %esp,%ebp
  0x01eadf83: push   %esi
  0x01eadf84: push   %edi
  0x01eadf85: mov    0x10(%esp),%edi
  0x01eadf89: mov    0x14(%esp),%edx
  0x01eadf8d: mov    0x18(%esp),%esi
  0x01eadf91: cmp    $0x2,%esi
  0x01eadf94: jb     Stub::jint_fill+84 0x01EADFD4
  ;; L_fill_32_bytes:
  0x01eadf9a: movd   %edx,%xmm0
  0x01eadf9e: pshufd $0x0,%xmm0,%xmm0
  0x01eadfa3: sub    $0x8,%esi
  0x01eadfa6: jl     Stub::jint_fill+65 0x01EADFC1
  0x01eadfac: nop    
  0x01eadfad: nop    
  0x01eadfae: nop    
  0x01eadfaf: nop    
  ;; L_fill_32_bytes_loop:
  0x01eadfb0: movdqu %xmm0,(%edi)
  0x01eadfb4: movdqu %xmm0,0x10(%edi)
  0x01eadfb9: add    $0x20,%edi
  0x01eadfbc: sub    $0x8,%esi
  0x01eadfbf: jge    Stub::jint_fill+48 0x01EADFB0
  ;; L_check_fill_8_bytes:
  0x01eadfc1: add    $0x8,%esi
  0x01eadfc4: je     Stub::jint_fill+94 0x01EADFDE
  0x01eadfc6: jmp    Stub::jint_fill+79 0x01EADFCF
  ;; L_fill_8_bytes_loop:
  0x01eadfc8: movq   %xmm0,(%edi)
  0x01eadfcc: add    $0x8,%edi
  ;; L_fill_8_bytes:
  0x01eadfcf: sub    $0x2,%esi
  0x01eadfd2: jge    Stub::jint_fill+72 0x01EADFC8
  ;; L_fill_4_bytes:
  0x01eadfd4: test   $0x1,%esi
  0x01eadfda: je     Stub::jint_fill+94 0x01EADFDE
  0x01eadfdc: mov    %edx,(%edi)
  ;; L_fill_2_bytes:
  ;; L_exit:
  0x01eadfde: pop    %edi
  0x01eadfdf: pop    %esi
  0x01eadfe0: mov    %ebp,%esp
  0x01eadfe2: pop    %ebp
  0x01eadfe3: ret    

StubRoutines::arrayof_jbyte_fill [0x01eadff0, 0x01eae07f[ (143 bytes)
  ;; Entry:
  0x01eadff0: push   %ebp
  0x01eadff1: mov    %esp,%ebp
  0x01eadff3: push   %esi
  0x01eadff4: push   %edi
  0x01eadff5: mov    0x10(%esp),%edi
  0x01eadff9: mov    0x14(%esp),%edx
  0x01eadffd: mov    0x18(%esp),%esi
  0x01eae001: and    $0xff,%edx
  0x01eae007: mov    %edx,%eax
  0x01eae009: shl    $0x8,%eax
  0x01eae00c: or     %eax,%edx
  0x01eae00e: mov    %edx,%eax
  0x01eae010: shl    $0x10,%eax
  0x01eae013: or     %eax,%edx
  0x01eae015: cmp    $0x8,%esi
  0x01eae018: jb     Stub::arrayof_jbyte_fill+100 0x01EAE054
  ;; L_fill_32_bytes:
  0x01eae01e: movd   %edx,%xmm0
  0x01eae022: pshufd $0x0,%xmm0,%xmm0
  0x01eae027: sub    $0x20,%esi
  0x01eae02a: jl     Stub::arrayof_jbyte_fill+81 0x01EAE041
  ;; L_fill_32_bytes_loop:
  0x01eae030: movdqu %xmm0,(%edi)
  0x01eae034: movdqu %xmm0,0x10(%edi)
  0x01eae039: add    $0x20,%edi
  0x01eae03c: sub    $0x20,%esi
  0x01eae03f: jge    Stub::arrayof_jbyte_fill+64 0x01EAE030
  ;; L_check_fill_8_bytes:
  0x01eae041: add    $0x20,%esi
  0x01eae044: je     Stub::arrayof_jbyte_fill+137 0x01EAE079
  0x01eae046: jmp    Stub::arrayof_jbyte_fill+95 0x01EAE04F
  ;; L_fill_8_bytes_loop:
  0x01eae048: movq   %xmm0,(%edi)
  0x01eae04c: add    $0x8,%edi
  ;; L_fill_8_bytes:
  0x01eae04f: sub    $0x8,%esi
  0x01eae052: jge    Stub::arrayof_jbyte_fill+88 0x01EAE048
  ;; L_fill_4_bytes:
  0x01eae054: test   $0x4,%esi
  0x01eae05a: je     Stub::arrayof_jbyte_fill+113 0x01EAE061
  0x01eae05c: mov    %edx,(%edi)
  0x01eae05e: add    $0x4,%edi
  ;; L_fill_2_bytes:
  0x01eae061: test   $0x2,%esi
  0x01eae067: je     Stub::arrayof_jbyte_fill+127 0x01EAE06F
  0x01eae069: mov    %dx,(%edi)
  0x01eae06c: add    $0x2,%edi
  ;; L_fill_byte:
  0x01eae06f: test   $0x1,%esi
  0x01eae075: je     Stub::arrayof_jbyte_fill+137 0x01EAE079
  0x01eae077: mov    %dl,(%edi)
  ;; L_exit:
  0x01eae079: pop    %edi
  0x01eae07a: pop    %esi
  0x01eae07b: mov    %ebp,%esp
  0x01eae07d: pop    %ebp
  0x01eae07e: ret    

StubRoutines::arrayof_jshort_fill [0x01eae080, 0x01eae102[ (130 bytes)
  ;; Entry:
  0x01eae080: push   %ebp
  0x01eae081: mov    %esp,%ebp
  0x01eae083: push   %esi
  0x01eae084: push   %edi
  0x01eae085: mov    0x10(%esp),%edi
  0x01eae089: mov    0x14(%esp),%edx
  0x01eae08d: mov    0x18(%esp),%esi
  0x01eae091: and    $0xffff,%edx
  0x01eae097: mov    %edx,%eax
  0x01eae099: shl    $0x10,%eax
  0x01eae09c: or     %eax,%edx
  0x01eae09e: cmp    $0x4,%esi
  0x01eae0a1: jb     Stub::arrayof_jshort_fill+100 0x01EAE0E4
  ;; L_fill_32_bytes:
  0x01eae0a7: movd   %edx,%xmm0
  0x01eae0ab: pshufd $0x0,%xmm0,%xmm0
  0x01eae0b0: sub    $0x10,%esi
  0x01eae0b3: jl     Stub::arrayof_jshort_fill+81 0x01EAE0D1
  0x01eae0b9: nop    
  0x01eae0ba: nop    
  0x01eae0bb: nop    
  0x01eae0bc: nop    
  0x01eae0bd: nop    
  0x01eae0be: nop    
  0x01eae0bf: nop    
  ;; L_fill_32_bytes_loop:
  0x01eae0c0: movdqu %xmm0,(%edi)
  0x01eae0c4: movdqu %xmm0,0x10(%edi)
  0x01eae0c9: add    $0x20,%edi
  0x01eae0cc: sub    $0x10,%esi
  0x01eae0cf: jge    Stub::arrayof_jshort_fill+64 0x01EAE0C0
  ;; L_check_fill_8_bytes:
  0x01eae0d1: add    $0x10,%esi
  0x01eae0d4: je     Stub::arrayof_jshort_fill+124 0x01EAE0FC
  0x01eae0d6: jmp    Stub::arrayof_jshort_fill+95 0x01EAE0DF
  ;; L_fill_8_bytes_loop:
  0x01eae0d8: movq   %xmm0,(%edi)
  0x01eae0dc: add    $0x8,%edi
  ;; L_fill_8_bytes:
  0x01eae0df: sub    $0x4,%esi
  0x01eae0e2: jge    Stub::arrayof_jshort_fill+88 0x01EAE0D8
  ;; L_fill_4_bytes:
  0x01eae0e4: test   $0x2,%esi
  0x01eae0ea: je     Stub::arrayof_jshort_fill+113 0x01EAE0F1
  0x01eae0ec: mov    %edx,(%edi)
  0x01eae0ee: add    $0x4,%edi
  ;; L_fill_2_bytes:
  0x01eae0f1: test   $0x1,%esi
  0x01eae0f7: je     Stub::arrayof_jshort_fill+124 0x01EAE0FC
  0x01eae0f9: mov    %dx,(%edi)
  ;; L_fill_byte:
  ;; L_exit:
  0x01eae0fc: pop    %edi
  0x01eae0fd: pop    %esi
  0x01eae0fe: mov    %ebp,%esp
  0x01eae100: pop    %ebp
  0x01eae101: ret    

StubRoutines::arrayof_jint_fill [0x01eae110, 0x01eae174[ (100 bytes)
  ;; Entry:
  0x01eae110: push   %ebp
  0x01eae111: mov    %esp,%ebp
  0x01eae113: push   %esi
  0x01eae114: push   %edi
  0x01eae115: mov    0x10(%esp),%edi
  0x01eae119: mov    0x14(%esp),%edx
  0x01eae11d: mov    0x18(%esp),%esi
  0x01eae121: cmp    $0x2,%esi
  0x01eae124: jb     Stub::arrayof_jint_fill+84 0x01EAE164
  ;; L_fill_32_bytes:
  0x01eae12a: movd   %edx,%xmm0
  0x01eae12e: pshufd $0x0,%xmm0,%xmm0
  0x01eae133: sub    $0x8,%esi
  0x01eae136: jl     Stub::arrayof_jint_fill+65 0x01EAE151
  0x01eae13c: nop    
  0x01eae13d: nop    
  0x01eae13e: nop    
  0x01eae13f: nop    
  ;; L_fill_32_bytes_loop:
  0x01eae140: movdqu %xmm0,(%edi)
  0x01eae144: movdqu %xmm0,0x10(%edi)
  0x01eae149: add    $0x20,%edi
  0x01eae14c: sub    $0x8,%esi
  0x01eae14f: jge    Stub::arrayof_jint_fill+48 0x01EAE140
  ;; L_check_fill_8_bytes:
  0x01eae151: add    $0x8,%esi
  0x01eae154: je     Stub::arrayof_jint_fill+94 0x01EAE16E
  0x01eae156: jmp    Stub::arrayof_jint_fill+79 0x01EAE15F
  ;; L_fill_8_bytes_loop:
  0x01eae158: movq   %xmm0,(%edi)
  0x01eae15c: add    $0x8,%edi
  ;; L_fill_8_bytes:
  0x01eae15f: sub    $0x2,%esi
  0x01eae162: jge    Stub::arrayof_jint_fill+72 0x01EAE158
  ;; L_fill_4_bytes:
  0x01eae164: test   $0x1,%esi
  0x01eae16a: je     Stub::arrayof_jint_fill+94 0x01EAE16E
  0x01eae16c: mov    %edx,(%edi)
  ;; L_fill_2_bytes:
  ;; L_exit:
  0x01eae16e: pop    %edi
  0x01eae16f: pop    %esi
  0x01eae170: mov    %ebp,%esp
  0x01eae172: pop    %ebp
  0x01eae173: ret    

StubRoutines::checkcast_arraycopy [0x01eae180, 0x01eae243[ (195 bytes)
  0x01eae180: push   %ebp
  0x01eae181: mov    %esp,%ebp
  0x01eae183: push   %esi
  0x01eae184: push   %edi
  0x01eae185: push   %ebx
  0x01eae186: mov    0x14(%esp),%eax
  0x01eae18a: mov    0x18(%esp),%edx
  0x01eae18e: mov    0x1c(%esp),%ecx
  ;; Entry:
  0x01eae192: lea    (%eax,%ecx,4),%eax
  0x01eae195: lea    (%edx,%ecx,4),%edx
  0x01eae198: neg    %ecx
  0x01eae19a: jne    Stub::checkcast_arraycopy+54 0x01EAE1B6
  0x01eae19c: xor    %eax,%eax
  0x01eae19e: jmp    Stub::checkcast_arraycopy+182 0x01EAE236
  0x01eae1a3: nop    
  0x01eae1a4: nop    
  0x01eae1a5: nop    
  0x01eae1a6: nop    
  0x01eae1a7: nop    
  0x01eae1a8: nop    
  0x01eae1a9: nop    
  0x01eae1aa: nop    
  0x01eae1ab: nop    
  0x01eae1ac: nop    
  0x01eae1ad: nop    
  0x01eae1ae: nop    
  0x01eae1af: nop    
  ;; L_store_element:
  0x01eae1b0: mov    %edi,(%edx,%ecx,4)
  0x01eae1b3: inc    %ecx
  0x01eae1b4: je     Stub::checkcast_arraycopy+149 0x01EAE215
  ;; L_load_element:
  0x01eae1b6: mov    (%eax,%ecx,4),%edi
  0x01eae1b9: test   %edi,%edi
  0x01eae1bb: je     Stub::checkcast_arraycopy+48 0x01EAE1B0
  0x01eae1bd: mov    0x4(%edi),%esi
  ;; type_check:
  0x01eae1c0: cmp    0x24(%esp),%esi
  0x01eae1c4: je     Stub::checkcast_arraycopy+48 0x01EAE1B0
  0x01eae1c6: mov    0x20(%esp),%ebx
  0x01eae1ca: mov    (%esi,%ebx,1),%ebx
  0x01eae1cd: cmp    0x24(%esp),%ebx
  0x01eae1d1: je     Stub::checkcast_arraycopy+48 0x01EAE1B0
  0x01eae1d3: cmpl   $0x14,0x20(%esp)
  0x01eae1db: jne    Stub::checkcast_arraycopy+134 0x01EAE206
  0x01eae1e1: mov    0x24(%esp),%ebx
  0x01eae1e5: push   %eax
  0x01eae1e6: mov    %ebx,%eax
  0x01eae1e8: push   %ecx
  0x01eae1e9: push   %edi
  0x01eae1ea: incl   0x560049a0
  0x01eae1f0: mov    0x18(%esi),%edi
  0x01eae1f3: mov    (%edi),%ecx
  0x01eae1f5: add    $0x4,%edi
  0x01eae1f8: test   %eax,%eax
  0x01eae1fa: repnz scas %es:(%edi),%eax
  0x01eae1fc: pop    %edi
  0x01eae1fd: pop    %ecx
  0x01eae1fe: pop    %eax
  0x01eae1ff: jne    Stub::checkcast_arraycopy+134 0x01EAE206
  0x01eae201: mov    %ebx,0x14(%esi)
  0x01eae204: jmp    Stub::checkcast_arraycopy+48 0x01EAE1B0
  ;; L_failure:
  0x01eae206: add    0x1c(%esp),%ecx
  0x01eae20a: mov    %ecx,%eax
  0x01eae20c: not    %eax
  0x01eae20e: jne    Stub::checkcast_arraycopy+155 0x01EAE21B
  0x01eae210: jmp    Stub::checkcast_arraycopy+182 0x01EAE236
  ;; L_do_card_marks:
  0x01eae215: xor    %eax,%eax
  0x01eae217: mov    0x1c(%esp),%ecx
  ;; L_post_barrier:
  0x01eae21b: mov    0x18(%esp),%edx
  0x01eae21f: lea    -0x4(%edx,%ecx,4),%ecx
  0x01eae223: shr    $0x9,%edx
  0x01eae226: shr    $0x9,%ecx
  0x01eae229: sub    %edx,%ecx
  ;; L_loop:
  0x01eae22b: movb   $0x0,0x1207000(%edx,%ecx,1)
  0x01eae233: dec    %ecx
  0x01eae234: jge    Stub::checkcast_arraycopy+171 0x01EAE22B
  ;; L_done:
  0x01eae236: pop    %ebx
  0x01eae237: pop    %edi
  0x01eae238: pop    %esi
  ;; inc_counter SharedRuntime::_checkcast_array_copy_ctr
  0x01eae239: incl   0x5600495c
  0x01eae23f: mov    %ebp,%esp
  0x01eae241: pop    %ebp
  0x01eae242: ret    

StubRoutines::checkcast_arraycopy_uninit [0x01eae250, 0x01eae313[ (195 bytes)
  0x01eae250: push   %ebp
  0x01eae251: mov    %esp,%ebp
  0x01eae253: push   %esi
  0x01eae254: push   %edi
  0x01eae255: push   %ebx
  0x01eae256: mov    0x14(%esp),%eax
  0x01eae25a: mov    0x18(%esp),%edx
  0x01eae25e: mov    0x1c(%esp),%ecx
  0x01eae262: lea    (%eax,%ecx,4),%eax
  0x01eae265: lea    (%edx,%ecx,4),%edx
  0x01eae268: neg    %ecx
  0x01eae26a: jne    Stub::checkcast_arraycopy_uninit+54 0x01EAE286
  0x01eae26c: xor    %eax,%eax
  0x01eae26e: jmp    Stub::checkcast_arraycopy_uninit+182 0x01EAE306
  0x01eae273: nop    
  0x01eae274: nop    
  0x01eae275: nop    
  0x01eae276: nop    
  0x01eae277: nop    
  0x01eae278: nop    
  0x01eae279: nop    
  0x01eae27a: nop    
  0x01eae27b: nop    
  0x01eae27c: nop    
  0x01eae27d: nop    
  0x01eae27e: nop    
  0x01eae27f: nop    
  ;; L_store_element:
  0x01eae280: mov    %edi,(%edx,%ecx,4)
  0x01eae283: inc    %ecx
  0x01eae284: je     Stub::checkcast_arraycopy_uninit+149 0x01EAE2E5
  ;; L_load_element:
  0x01eae286: mov    (%eax,%ecx,4),%edi
  0x01eae289: test   %edi,%edi
  0x01eae28b: je     Stub::checkcast_arraycopy_uninit+48 0x01EAE280
  0x01eae28d: mov    0x4(%edi),%esi
  ;; type_check:
  0x01eae290: cmp    0x24(%esp),%esi
  0x01eae294: je     Stub::checkcast_arraycopy_uninit+48 0x01EAE280
  0x01eae296: mov    0x20(%esp),%ebx
  0x01eae29a: mov    (%esi,%ebx,1),%ebx
  0x01eae29d: cmp    0x24(%esp),%ebx
  0x01eae2a1: je     Stub::checkcast_arraycopy_uninit+48 0x01EAE280
  0x01eae2a3: cmpl   $0x14,0x20(%esp)
  0x01eae2ab: jne    Stub::checkcast_arraycopy_uninit+134 0x01EAE2D6
  0x01eae2b1: mov    0x24(%esp),%ebx
  0x01eae2b5: push   %eax
  0x01eae2b6: mov    %ebx,%eax
  0x01eae2b8: push   %ecx
  0x01eae2b9: push   %edi
  0x01eae2ba: incl   0x560049a0
  0x01eae2c0: mov    0x18(%esi),%edi
  0x01eae2c3: mov    (%edi),%ecx
  0x01eae2c5: add    $0x4,%edi
  0x01eae2c8: test   %eax,%eax
  0x01eae2ca: repnz scas %es:(%edi),%eax
  0x01eae2cc: pop    %edi
  0x01eae2cd: pop    %ecx
  0x01eae2ce: pop    %eax
  0x01eae2cf: jne    Stub::checkcast_arraycopy_uninit+134 0x01EAE2D6
  0x01eae2d1: mov    %ebx,0x14(%esi)
  0x01eae2d4: jmp    Stub::checkcast_arraycopy_uninit+48 0x01EAE280
  ;; L_failure:
  0x01eae2d6: add    0x1c(%esp),%ecx
  0x01eae2da: mov    %ecx,%eax
  0x01eae2dc: not    %eax
  0x01eae2de: jne    Stub::checkcast_arraycopy_uninit+155 0x01EAE2EB
  0x01eae2e0: jmp    Stub::checkcast_arraycopy_uninit+182 0x01EAE306
  ;; L_do_card_marks:
  0x01eae2e5: xor    %eax,%eax
  0x01eae2e7: mov    0x1c(%esp),%ecx
  ;; L_post_barrier:
  0x01eae2eb: mov    0x18(%esp),%edx
  0x01eae2ef: lea    -0x4(%edx,%ecx,4),%ecx
  0x01eae2f3: shr    $0x9,%edx
  0x01eae2f6: shr    $0x9,%ecx
  0x01eae2f9: sub    %edx,%ecx
  ;; L_loop:
  0x01eae2fb: movb   $0x0,0x1207000(%edx,%ecx,1)
  0x01eae303: dec    %ecx
  0x01eae304: jge    Stub::checkcast_arraycopy_uninit+171 0x01EAE2FB
  ;; L_done:
  0x01eae306: pop    %ebx
  0x01eae307: pop    %edi
  0x01eae308: pop    %esi
  ;; inc_counter SharedRuntime::_checkcast_array_copy_ctr
  0x01eae309: incl   0x5600495c
  0x01eae30f: mov    %ebp,%esp
  0x01eae311: pop    %ebp
  0x01eae312: ret    

StubRoutines::unsafe_arraycopy [0x01eae320, 0x01eae37f[ (95 bytes)
  0x01eae320: push   %ebp
  0x01eae321: mov    %esp,%ebp
  0x01eae323: push   %esi
  0x01eae324: push   %edi
  0x01eae325: mov    0x10(%esp),%eax
  0x01eae329: mov    0x14(%esp),%edx
  0x01eae32d: mov    0x18(%esp),%ecx
  ;; inc_counter SharedRuntime::_unsafe_array_copy_ctr
  0x01eae331: incl   0x56004960
  0x01eae337: mov    %eax,%esi
  0x01eae339: or     %edx,%esi
  0x01eae33b: or     %ecx,%esi
  0x01eae33d: test   $0x7,%esi
  0x01eae343: je     Stub::unsafe_arraycopy+81 0x01EAE371
  0x01eae345: test   $0x3,%esi
  0x01eae34b: je     Stub::unsafe_arraycopy+69 0x01EAE365
  0x01eae34d: test   $0x1,%esi
  0x01eae353: jne    Stub::jbyte_arraycopy+17 0x01EAD631
  ;; L_short_aligned:
  0x01eae359: shr    $0x1,%ecx
  0x01eae35c: mov    %ecx,0x18(%esp)
  0x01eae360: jmp    Stub::jshort_arraycopy+17 0x01EAD921
  ;; L_int_aligned:
  0x01eae365: shr    $0x2,%ecx
  0x01eae368: mov    %ecx,0x18(%esp)
  0x01eae36c: jmp    Stub::jint_arraycopy+17 0x01EADA81
  ;; L_long_aligned:
  0x01eae371: shr    $0x3,%ecx
  0x01eae374: mov    %ecx,0x18(%esp)
  0x01eae378: pop    %edi
  0x01eae379: pop    %esi
  0x01eae37a: jmp    Stub::jlong_arraycopy+15 0x01EADE1F

StubRoutines::generic_arraycopy [0x01eae38b, 0x01eae57d[ (498 bytes)
  ;; L_failed_0:
  0x01eae38b: jmp    Stub::generic_arraycopy+253 0x01EAE488
  0x01eae390: push   %ebp
  0x01eae391: mov    %esp,%ebp
  0x01eae393: push   %esi
  0x01eae394: push   %edi
  ;; inc_counter SharedRuntime::_generic_array_copy_ctr
  0x01eae395: incl   0x56004964
  0x01eae39b: mov    0x10(%esp),%eax
  0x01eae39f: test   %eax,%eax
  0x01eae3a1: je     Stub::generic_arraycopy
  0x01eae3a3: mov    0x14(%esp),%esi
  0x01eae3a7: test   %esi,%esi
  0x01eae3a9: js     Stub::generic_arraycopy
  0x01eae3ab: mov    0x18(%esp),%edx
  0x01eae3af: test   %edx,%edx
  0x01eae3b1: je     Stub::generic_arraycopy
  0x01eae3b3: mov    0x1c(%esp),%edi
  0x01eae3b7: test   %edi,%edi
  0x01eae3b9: js     Stub::generic_arraycopy
  0x01eae3bb: mov    0x20(%esp),%ecx
  0x01eae3bf: test   %ecx,%ecx
  0x01eae3c1: js     Stub::generic_arraycopy
  0x01eae3c3: mov    0x4(%eax),%ecx
  ;; assert klasses not null
  0x01eae3c6: test   %ecx,%ecx
  0x01eae3c8: jne    Stub::generic_arraycopy+80 0x01EAE3DB
  0x01eae3ca: push   $0x55ce8468
  0x01eae3cf: call   Stub::generic_arraycopy+73 0x01EAE3D4
  0x01eae3d4: pusha  
  0x01eae3d5: call   0x557bdbf0
  0x01eae3da: hlt    
  0x01eae3db: cmpl   $0x0,0x4(%edx)
  0x01eae3e2: je     Stub::generic_arraycopy+63 0x01EAE3CA
  ;; assert done
  0x01eae3e4: cmpl   $0x800c0c02,0x8(%ecx)
  0x01eae3eb: je     Stub::generic_arraycopy+263 0x01EAE492
  0x01eae3f1: cmp    0x4(%edx),%ecx
  0x01eae3f4: jne    Stub::generic_arraycopy
  0x01eae3f6: mov    0x8(%ecx),%ecx
  0x01eae3f9: cmp    $0x0,%ecx
  0x01eae3fc: jge    Stub::generic_arraycopy
  0x01eae3fe: cmp    $0xc0000000,%ecx
  0x01eae404: jge    Stub::generic_arraycopy+144 0x01EAE41B
  0x01eae40a: push   $0x55ce84bc
  0x01eae40f: call   Stub::generic_arraycopy+137 0x01EAE414
  0x01eae414: pusha  
  0x01eae415: call   0x557bdbf0
  0x01eae41a: hlt    
  ;; arraycopy_range_checks:
  0x01eae41b: add    0x20(%esp),%esi
  0x01eae41f: add    0x20(%esp),%edi
  0x01eae423: cmp    0x8(%eax),%esi
  0x01eae426: ja     Stub::generic_arraycopy+253 0x01EAE488
  0x01eae42c: cmp    0x8(%edx),%edi
  0x01eae42f: ja     Stub::generic_arraycopy+253 0x01EAE488
  ;; arraycopy_range_checks done
  0x01eae435: mov    %ecx,%esi
  0x01eae437: shr    $0x10,%esi
  0x01eae43a: and    $0xff,%esi
  0x01eae440: add    %esi,%eax
  0x01eae442: add    %esi,%edx
  0x01eae444: and    $0x3f,%ecx
  ;; scale indexes to element size
  0x01eae447: mov    0x14(%esp),%esi
  0x01eae44b: shl    %cl,%esi
  0x01eae44d: add    %esi,%eax
  0x01eae44f: mov    0x1c(%esp),%edi
  0x01eae453: shl    %cl,%edi
  0x01eae455: add    %edi,%edx
  0x01eae457: mov    %eax,0x10(%esp)
  0x01eae45b: mov    %ecx,%edi
  0x01eae45d: mov    0x20(%esp),%ecx
  ;; choose copy loop based on element size
  0x01eae461: cmp    $0x0,%edi
  0x01eae464: je     Stub::jbyte_arraycopy+17 0x01EAD631
  0x01eae46a: cmp    $0x1,%edi
  0x01eae46d: je     Stub::jshort_arraycopy+17 0x01EAD921
  0x01eae473: cmp    $0x2,%edi
  0x01eae476: je     Stub::jint_arraycopy+17 0x01EADA81
  0x01eae47c: cmp    $0x3,%edi
  0x01eae47f: jne    Stub::generic_arraycopy+253 0x01EAE488
  0x01eae481: pop    %edi
  0x01eae482: pop    %esi
  0x01eae483: jmp    Stub::jlong_arraycopy+15 0x01EADE1F
  ;; L_failed:
  0x01eae488: xor    %eax,%eax
  0x01eae48a: not    %eax
  0x01eae48c: pop    %edi
  0x01eae48d: pop    %esi
  0x01eae48e: mov    %ebp,%esp
  0x01eae490: pop    %ebp
  0x01eae491: ret    
  ;; L_objArray:
  0x01eae492: cmp    0x4(%edx),%ecx
  0x01eae495: jne    Stub::generic_arraycopy+323 0x01EAE4CE
  ;; arraycopy_range_checks:
  0x01eae497: add    0x20(%esp),%esi
  0x01eae49b: add    0x20(%esp),%edi
  0x01eae49f: cmp    0x8(%eax),%esi
  0x01eae4a2: ja     Stub::generic_arraycopy+253 0x01EAE488
  0x01eae4a4: cmp    0x8(%edx),%edi
  0x01eae4a7: ja     Stub::generic_arraycopy+253 0x01EAE488
  ;; arraycopy_range_checks done
  ;; L_plain_copy:
  0x01eae4a9: mov    0x20(%esp),%ecx
  0x01eae4ad: mov    0x14(%esp),%esi
  0x01eae4b1: lea    0xc(%eax,%esi,4),%eax
  0x01eae4b5: mov    0x1c(%esp),%edi
  0x01eae4b9: lea    0xc(%edx,%edi,4),%edx
  0x01eae4bd: mov    %eax,0x10(%esp)
  0x01eae4c1: mov    %edx,0x14(%esp)
  0x01eae4c5: mov    %ecx,0x18(%esp)
  0x01eae4c9: jmp    Stub::oop_arraycopy+17 0x01EADBB1
  ;; L_checkcast_copy:
  0x01eae4ce: mov    0x4(%edx),%esi
  0x01eae4d1: cmpl   $0x800c0c02,0x8(%esi)
  0x01eae4d8: jne    Stub::generic_arraycopy+253 0x01EAE488
  0x01eae4da: mov    0x14(%esp),%esi
  ;; arraycopy_range_checks:
  0x01eae4de: add    0x20(%esp),%esi
  0x01eae4e2: add    0x20(%esp),%edi
  0x01eae4e6: cmp    0x8(%eax),%esi
  0x01eae4e9: ja     Stub::generic_arraycopy+253 0x01EAE488
  0x01eae4eb: cmp    0x8(%edx),%edi
  0x01eae4ee: ja     Stub::generic_arraycopy+253 0x01EAE488
  ;; arraycopy_range_checks done
  0x01eae4f0: push   %ebx
  0x01eae4f1: mov    %ecx,%ebx
  0x01eae4f3: mov    0x4(%edx),%esi
  ;; type_check:
  0x01eae4f6: cmp    0x4(%edx),%ebx
  0x01eae4f9: je     Stub::generic_arraycopy+438 0x01EAE541
  0x01eae4ff: mov    0xc(%esi),%edi
  0x01eae502: mov    (%ebx,%edi,1),%edi
  0x01eae505: cmp    0x4(%edx),%edi
  0x01eae508: je     Stub::generic_arraycopy+438 0x01EAE541
  0x01eae50e: cmpl   $0x14,0xc(%esi)
  0x01eae515: jne    Stub::generic_arraycopy+444 0x01EAE547
  0x01eae51b: mov    0x4(%edx),%edi
  0x01eae51e: push   %eax
  0x01eae51f: mov    %edi,%eax
  0x01eae521: push   %ecx
  0x01eae522: push   %edi
  0x01eae523: incl   0x560049a0
  0x01eae529: mov    0x18(%ebx),%edi
  0x01eae52c: mov    (%edi),%ecx
  0x01eae52e: add    $0x4,%edi
  0x01eae531: test   %eax,%eax
  0x01eae533: repnz scas %es:(%edi),%eax
  0x01eae535: pop    %edi
  0x01eae536: pop    %ecx
  0x01eae537: pop    %eax
  0x01eae538: jne    Stub::generic_arraycopy+444 0x01EAE547
  0x01eae53e: mov    %edi,0x14(%ebx)
  ;; L_success:
  0x01eae541: pop    %ebx
  0x01eae542: jmp    Stub::generic_arraycopy+286 0x01EAE4A9
  ;; L_fail_array_check:
  0x01eae547: mov    0x90(%esi),%ebx
  0x01eae54d: mov    0x24(%esp),%ecx
  0x01eae551: mov    0x18(%esp),%esi
  0x01eae555: mov    0x20(%esp),%edi
  0x01eae559: mov    %ebx,0x24(%esp)
  0x01eae55d: mov    0xc(%ebx),%ebx
  0x01eae560: mov    %ebx,0x20(%esp)
  0x01eae564: mov    %ecx,0x1c(%esp)
  0x01eae568: lea    0xc(%eax,%esi,4),%eax
  0x01eae56c: mov    %eax,0x14(%esp)
  0x01eae570: lea    0xc(%edx,%edi,4),%edx
  0x01eae574: mov    %edx,0x18(%esp)
  0x01eae578: jmp    Stub::checkcast_arraycopy+18 0x01EAE192

StubRoutines::log [0x01eae57d, 0x01eae588[ (11 bytes)
  0x01eae57d: fldl   0x4(%esp)
  0x01eae581: fldln2 
  0x01eae583: fxch   %st(1)
  0x01eae585: fyl2x  
  0x01eae587: ret    

StubRoutines::log10 [0x01eae588, 0x01eae593[ (11 bytes)
  0x01eae588: fldl   0x4(%esp)
  0x01eae58c: fldlg2 
  0x01eae58e: fxch   %st(1)
  0x01eae590: fyl2x  
  0x01eae592: ret    

StubRoutines::sin [0x01eae593, 0x01eae62f[ (156 bytes)
  0x01eae593: fldl   0x4(%esp)
  0x01eae597: fldl   0x55ce1630
  0x01eae59d: fld    %st(1)
  0x01eae59f: fabs   
  0x01eae5a1: fucomip %st(1),%st
  0x01eae5a3: ffree  %st(0)
  0x01eae5a5: fincstp 
  0x01eae5a7: ja     Stub::sin+33 0x01EAE5B4
  0x01eae5ad: fsin   
  0x01eae5af: jmp    Stub::sin+155 0x01EAE62E
  0x01eae5b4: pusha  
  0x01eae5b5: sub    $0x80,%esp
  0x01eae5bb: movdqu %xmm0,(%esp)
  0x01eae5c0: movdqu %xmm1,0x10(%esp)
  0x01eae5c6: movdqu %xmm2,0x20(%esp)
  0x01eae5cc: movdqu %xmm3,0x30(%esp)
  0x01eae5d2: movdqu %xmm4,0x40(%esp)
  0x01eae5d8: movdqu %xmm5,0x50(%esp)
  0x01eae5de: movdqu %xmm6,0x60(%esp)
  0x01eae5e4: movdqu %xmm7,0x70(%esp)
  0x01eae5ea: sub    $0x8,%esp
  0x01eae5ed: fstpl  (%esp)
  0x01eae5f0: call   0x55beda10
  0x01eae5f5: add    $0x8,%esp
  0x01eae5f8: movdqu (%esp),%xmm0
  0x01eae5fd: movdqu 0x10(%esp),%xmm1
  0x01eae603: movdqu 0x20(%esp),%xmm2
  0x01eae609: movdqu 0x30(%esp),%xmm3
  0x01eae60f: movdqu 0x40(%esp),%xmm4
  0x01eae615: movdqu 0x50(%esp),%xmm5
  0x01eae61b: movdqu 0x60(%esp),%xmm6
  0x01eae621: movdqu 0x70(%esp),%xmm7
  0x01eae627: add    $0x80,%esp
  0x01eae62d: popa   
  0x01eae62e: ret    

StubRoutines::cos [0x01eae62f, 0x01eae6cb[ (156 bytes)
  0x01eae62f: fldl   0x4(%esp)
  0x01eae633: fldl   0x55ce1630
  0x01eae639: fld    %st(1)
  0x01eae63b: fabs   
  0x01eae63d: fucomip %st(1),%st
  0x01eae63f: ffree  %st(0)
  0x01eae641: fincstp 
  0x01eae643: ja     Stub::cos+33 0x01EAE650
  0x01eae649: fcos   
  0x01eae64b: jmp    Stub::cos+155 0x01EAE6CA
  0x01eae650: pusha  
  0x01eae651: sub    $0x80,%esp
  0x01eae657: movdqu %xmm0,(%esp)
  0x01eae65c: movdqu %xmm1,0x10(%esp)
  0x01eae662: movdqu %xmm2,0x20(%esp)
  0x01eae668: movdqu %xmm3,0x30(%esp)
  0x01eae66e: movdqu %xmm4,0x40(%esp)
  0x01eae674: movdqu %xmm5,0x50(%esp)
  0x01eae67a: movdqu %xmm6,0x60(%esp)
  0x01eae680: movdqu %xmm7,0x70(%esp)
  0x01eae686: sub    $0x8,%esp
  0x01eae689: fstpl  (%esp)
  0x01eae68c: call   0x55bedd30
  0x01eae691: add    $0x8,%esp
  0x01eae694: movdqu (%esp),%xmm0
  0x01eae699: movdqu 0x10(%esp),%xmm1
  0x01eae69f: movdqu 0x20(%esp),%xmm2
  0x01eae6a5: movdqu 0x30(%esp),%xmm3
  0x01eae6ab: movdqu 0x40(%esp),%xmm4
  0x01eae6b1: movdqu 0x50(%esp),%xmm5
  0x01eae6b7: movdqu 0x60(%esp),%xmm6
  0x01eae6bd: movdqu 0x70(%esp),%xmm7
  0x01eae6c3: add    $0x80,%esp
  0x01eae6c9: popa   
  0x01eae6ca: ret    

StubRoutines::tan [0x01eae6cb, 0x01eae769[ (158 bytes)
  0x01eae6cb: fldl   0x4(%esp)
  0x01eae6cf: fldl   0x55ce1630
  0x01eae6d5: fld    %st(1)
  0x01eae6d7: fabs   
  0x01eae6d9: fucomip %st(1),%st
  0x01eae6db: ffree  %st(0)
  0x01eae6dd: fincstp 
  0x01eae6df: ja     Stub::tan+35 0x01EAE6EE
  0x01eae6e5: fptan  
  0x01eae6e7: fstp   %st(0)
  0x01eae6e9: jmp    Stub::tan+157 0x01EAE768
  0x01eae6ee: pusha  
  0x01eae6ef: sub    $0x80,%esp
  0x01eae6f5: movdqu %xmm0,(%esp)
  0x01eae6fa: movdqu %xmm1,0x10(%esp)
  0x01eae700: movdqu %xmm2,0x20(%esp)
  0x01eae706: movdqu %xmm3,0x30(%esp)
  0x01eae70c: movdqu %xmm4,0x40(%esp)
  0x01eae712: movdqu %xmm5,0x50(%esp)
  0x01eae718: movdqu %xmm6,0x60(%esp)
  0x01eae71e: movdqu %xmm7,0x70(%esp)
  0x01eae724: sub    $0x8,%esp
  0x01eae727: fstpl  (%esp)
  0x01eae72a: call   0x55bee050
  0x01eae72f: add    $0x8,%esp
  0x01eae732: movdqu (%esp),%xmm0
  0x01eae737: movdqu 0x10(%esp),%xmm1
  0x01eae73d: movdqu 0x20(%esp),%xmm2
  0x01eae743: movdqu 0x30(%esp),%xmm3
  0x01eae749: movdqu 0x40(%esp),%xmm4
  0x01eae74f: movdqu 0x50(%esp),%xmm5
  0x01eae755: movdqu 0x60(%esp),%xmm6
  0x01eae75b: movdqu 0x70(%esp),%xmm7
  0x01eae761: add    $0x80,%esp
  0x01eae767: popa   
  0x01eae768: ret    

StubRoutines::exp [0x01eae769, 0x01eae863[ (250 bytes)
  0x01eae769: fldl   0x4(%esp)
  0x01eae76d: fld    %st(0)
  0x01eae76f: sub    $0x4,%esp
  0x01eae772: fstcw  (%esp)
  0x01eae776: mov    (%esp),%eax
  0x01eae779: or     $0x300,%eax
  0x01eae77f: push   %eax
  0x01eae780: fldcw  (%esp)
  0x01eae783: pop    %eax
  0x01eae784: fldl2e 
  0x01eae786: fmulp  %st,%st(1)
  0x01eae788: sub    $0x8,%esp
  0x01eae78b: fld    %st(0)
  0x01eae78d: frndint 
  0x01eae78f: fsubr  %st,%st(1)
  0x01eae791: fistpl (%esp)
  0x01eae794: f2xm1  
  0x01eae796: fld1   
  0x01eae798: faddp  %st,%st(1)
  0x01eae79a: mov    (%esp),%eax
  0x01eae79d: mov    $0xfffff800,%ecx
  0x01eae7a2: add    $0x3ff,%eax
  0x01eae7a8: mov    %eax,%edx
  0x01eae7aa: shl    $0x14,%eax
  0x01eae7ad: add    $0x1,%edx
  0x01eae7b0: cmove  %ecx,%eax
  0x01eae7b3: cmp    $0x1,%edx
  0x01eae7b6: cmove  %ecx,%eax
  0x01eae7b9: test   %edx,%ecx
  0x01eae7bb: cmovne %ecx,%eax
  0x01eae7be: mov    %eax,0x4(%esp)
  0x01eae7c2: movl   $0x0,(%esp)
  0x01eae7c9: fmull  (%esp)
  0x01eae7cc: add    $0x8,%esp
  0x01eae7cf: fldcw  (%esp)
  0x01eae7d2: add    $0x4,%esp
  0x01eae7d5: fucomi %st(0),%st
  0x01eae7d7: jp     Stub::exp+123 0x01EAE7E4
  0x01eae7dd: ffree  %st(1)
  0x01eae7df: jmp    Stub::exp+249 0x01EAE862
  0x01eae7e4: ffree  %st(0)
  0x01eae7e6: fincstp 
  0x01eae7e8: pusha  
  0x01eae7e9: sub    $0x80,%esp
  0x01eae7ef: movdqu %xmm0,(%esp)
  0x01eae7f4: movdqu %xmm1,0x10(%esp)
  0x01eae7fa: movdqu %xmm2,0x20(%esp)
  0x01eae800: movdqu %xmm3,0x30(%esp)
  0x01eae806: movdqu %xmm4,0x40(%esp)
  0x01eae80c: movdqu %xmm5,0x50(%esp)
  0x01eae812: movdqu %xmm6,0x60(%esp)
  0x01eae818: movdqu %xmm7,0x70(%esp)
  0x01eae81e: sub    $0x8,%esp
  0x01eae821: fstpl  (%esp)
  0x01eae824: call   0x55bec000
  0x01eae829: add    $0x8,%esp
  0x01eae82c: movdqu (%esp),%xmm0
  0x01eae831: movdqu 0x10(%esp),%xmm1
  0x01eae837: movdqu 0x20(%esp),%xmm2
  0x01eae83d: movdqu 0x30(%esp),%xmm3
  0x01eae843: movdqu 0x40(%esp),%xmm4
  0x01eae849: movdqu 0x50(%esp),%xmm5
  0x01eae84f: movdqu 0x60(%esp),%xmm6
  0x01eae855: movdqu 0x70(%esp),%xmm7
  0x01eae85b: add    $0x80,%esp
  0x01eae861: popa   
  0x01eae862: ret    

StubRoutines::pow [0x01eae863, 0x01eaea4d[ (490 bytes)
  0x01eae863: fldl   0xc(%esp)
  0x01eae867: fldl   0x4(%esp)
  0x01eae86b: fldz   
  0x01eae86d: fucomip %st(1),%st
  0x01eae86f: ja     Stub::pow+139 0x01EAE8EE
  0x01eae875: fld    %st(1)
  0x01eae877: fld    %st(1)
  0x01eae879: sub    $0x4,%esp
  0x01eae87c: fstcw  (%esp)
  0x01eae880: mov    (%esp),%eax
  0x01eae883: or     $0x300,%eax
  0x01eae889: push   %eax
  0x01eae88a: fldcw  (%esp)
  0x01eae88d: pop    %eax
  0x01eae88e: fyl2x  
  0x01eae890: sub    $0x8,%esp
  0x01eae893: fld    %st(0)
  0x01eae895: frndint 
  0x01eae897: fsubr  %st,%st(1)
  0x01eae899: fistpl (%esp)
  0x01eae89c: f2xm1  
  0x01eae89e: fld1   
  0x01eae8a0: faddp  %st,%st(1)
  0x01eae8a2: mov    (%esp),%eax
  0x01eae8a5: mov    $0xfffff800,%ecx
  0x01eae8aa: add    $0x3ff,%eax
  0x01eae8b0: mov    %eax,%edx
  0x01eae8b2: shl    $0x14,%eax
  0x01eae8b5: add    $0x1,%edx
  0x01eae8b8: cmove  %ecx,%eax
  0x01eae8bb: cmp    $0x1,%edx
  0x01eae8be: cmove  %ecx,%eax
  0x01eae8c1: test   %edx,%ecx
  0x01eae8c3: cmovne %ecx,%eax
  0x01eae8c6: mov    %eax,0x4(%esp)
  0x01eae8ca: movl   $0x0,(%esp)
  0x01eae8d1: fmull  (%esp)
  0x01eae8d4: add    $0x8,%esp
  0x01eae8d7: fldcw  (%esp)
  0x01eae8da: add    $0x4,%esp
  0x01eae8dd: fucomi %st(0),%st
  0x01eae8df: jp     Stub::pow+359 0x01EAE9CA
  0x01eae8e5: ffree  %st(2)
  0x01eae8e7: ffree  %st(1)
  0x01eae8e9: jmp    Stub::pow+489 0x01EAEA4C
  0x01eae8ee: fld    %st(1)
  0x01eae8f0: frndint 
  0x01eae8f2: fucomi %st(2),%st
  0x01eae8f4: jne    Stub::pow+359 0x01EAE9CA
  0x01eae8fa: sub    $0x8,%esp
  0x01eae8fd: fld1   
  0x01eae8ff: fadd   %st(1),%st
  0x01eae901: fucomip %st(1),%st
  0x01eae903: fistpll (%esp)
  0x01eae906: jne    Stub::pow+184 0x01EAE91B
  0x01eae90c: movl   $0x0,(%esp)
  0x01eae913: movl   $0x0,0x4(%esp)
  0x01eae91b: fld    %st(1)
  0x01eae91d: fld    %st(1)
  0x01eae91f: fabs   
  0x01eae921: sub    $0x4,%esp
  0x01eae924: fstcw  (%esp)
  0x01eae928: mov    (%esp),%eax
  0x01eae92b: or     $0x300,%eax
  0x01eae931: push   %eax
  0x01eae932: fldcw  (%esp)
  0x01eae935: pop    %eax
  0x01eae936: fyl2x  
  0x01eae938: sub    $0x8,%esp
  0x01eae93b: fld    %st(0)
  0x01eae93d: frndint 
  0x01eae93f: fsubr  %st,%st(1)
  0x01eae941: fistpl (%esp)
  0x01eae944: f2xm1  
  0x01eae946: fld1   
  0x01eae948: faddp  %st,%st(1)
  0x01eae94a: mov    (%esp),%eax
  0x01eae94d: mov    $0xfffff800,%ecx
  0x01eae952: add    $0x3ff,%eax
  0x01eae958: mov    %eax,%edx
  0x01eae95a: shl    $0x14,%eax
  0x01eae95d: add    $0x1,%edx
  0x01eae960: cmove  %ecx,%eax
  0x01eae963: cmp    $0x1,%edx
  0x01eae966: cmove  %ecx,%eax
  0x01eae969: test   %edx,%ecx
  0x01eae96b: cmovne %ecx,%eax
  0x01eae96e: mov    %eax,0x4(%esp)
  0x01eae972: movl   $0x0,(%esp)
  0x01eae979: fmull  (%esp)
  0x01eae97c: add    $0x8,%esp
  0x01eae97f: fldcw  (%esp)
  0x01eae982: add    $0x4,%esp
  0x01eae985: fucomi %st(0),%st
  0x01eae987: pop    %eax
  0x01eae988: pop    %ecx
  0x01eae989: jp     Stub::pow+359 0x01EAE9CA
  0x01eae98f: test   %eax,%eax
  0x01eae991: jne    Stub::pow+337 0x01EAE9B4
  0x01eae997: cmp    $0x80000000,%ecx
  0x01eae99d: jne    Stub::pow+337 0x01EAE9B4
  ;; integer indefinite value shouldn't be seen here
  0x01eae9a3: push   $0x55ce3a8c
  0x01eae9a8: call   Stub::pow+330 0x01EAE9AD
  0x01eae9ad: pusha  
  0x01eae9ae: call   0x557bdbf0
  0x01eae9b3: hlt    
  0x01eae9b4: ffree  %st(2)
  0x01eae9b6: ffree  %st(1)
  0x01eae9b8: test   $0x1,%eax
  0x01eae9bd: je     Stub::pow+489 0x01EAEA4C
  0x01eae9c3: fchs   
  0x01eae9c5: jmp    Stub::pow+489 0x01EAEA4C
  0x01eae9ca: ffree  %st(0)
  0x01eae9cc: fincstp 
  0x01eae9ce: pusha  
  0x01eae9cf: sub    $0x80,%esp
  0x01eae9d5: movdqu %xmm0,(%esp)
  0x01eae9da: movdqu %xmm1,0x10(%esp)
  0x01eae9e0: movdqu %xmm2,0x20(%esp)
  0x01eae9e6: movdqu %xmm3,0x30(%esp)
  0x01eae9ec: movdqu %xmm4,0x40(%esp)
  0x01eae9f2: movdqu %xmm5,0x50(%esp)
  0x01eae9f8: movdqu %xmm6,0x60(%esp)
  0x01eae9fe: movdqu %xmm7,0x70(%esp)
  0x01eaea04: sub    $0x10,%esp
  0x01eaea07: fstpl  (%esp)
  0x01eaea0a: fstpl  0x8(%esp)
  0x01eaea0e: call   0x55bec0f0
  0x01eaea13: add    $0x10,%esp
  0x01eaea16: movdqu (%esp),%xmm0
  0x01eaea1b: movdqu 0x10(%esp),%xmm1
  0x01eaea21: movdqu 0x20(%esp),%xmm2
  0x01eaea27: movdqu 0x30(%esp),%xmm3
  0x01eaea2d: movdqu 0x40(%esp),%xmm4
  0x01eaea33: movdqu 0x50(%esp),%xmm5
  0x01eaea39: movdqu 0x60(%esp),%xmm6
  0x01eaea3f: movdqu 0x70(%esp),%xmm7
  0x01eaea45: add    $0x80,%esp
  0x01eaea4b: popa   
  0x01eaea4c: ret    

StubRoutines::SafeFetch32 [0x01eaea4d, 0x01eaea58[ (11 bytes)
  0x01eaea4d: mov    0x8(%esp),%eax
  0x01eaea51: mov    0x4(%esp),%ecx
  0x01eaea55: mov    (%ecx),%eax
  0x01eaea57: ret    

AHE@0x018f9a34: 0x7e000000 i2c: 0x01eb2a30 c2i: 0x01eb2ad8 c2iUV: 0x01eb2ab7
i2c argument handler #28 for: static (D)Ljava/lang/String; (243 bytes generated)
c2i argument handler starts at 01EB2AD8
  0x01eb2a30: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eb2a33: mov    $0x1dc2940,%edi
  0x01eb2a38: cmp    %edi,%eax
  0x01eb2a3a: jbe    0x01eb2a4d
  0x01eb2a40: mov    $0x1ea2940,%edi
  0x01eb2a45: cmp    %edi,%eax
  0x01eb2a47: jb     0x01eb2a92
  0x01eb2a4d: mov    $0x1dc0340,%edi
  0x01eb2a52: cmp    %edi,%eax
  0x01eb2a54: jbe    0x01eb2a67
  0x01eb2a5a: mov    $0x1dc2668,%edi
  0x01eb2a5f: cmp    %edi,%eax
  0x01eb2a61: jb     0x01eb2a92
  0x01eb2a67: mov    $0x1ead380,%edi
  0x01eb2a6c: cmp    %edi,%eax
  0x01eb2a6e: jbe    0x01eb2a81
  0x01eb2a74: mov    $0x1eb2970,%edi
  0x01eb2a79: cmp    %edi,%eax
  0x01eb2a7b: jb     0x01eb2a92
  ;; i2c adapter must return to an interpreter frame
  0x01eb2a81: push   $0x55ce723c
  0x01eb2a86: call   0x01eb2a8b
  0x01eb2a8b: pusha  
  0x01eb2a8c: call   0x557bdbf0
  0x01eb2a91: hlt    
  ;; } verify_i2ce 
  0x01eb2a92: mov    %esp,%edi
  0x01eb2a94: and    $0xfffffff0,%esp
  0x01eb2a97: push   %eax
  0x01eb2a98: mov    %edi,%eax
  0x01eb2a9a: mov    0x2c(%ebx),%edi
  0x01eb2a9d: movsd  0x4(%eax),%xmm0
  0x01eb2aa2: mov    %fs:0x0(,%eiz,1),%eax
  0x01eb2aaa: mov    -0xc(%eax),%eax
  0x01eb2aad: mov    %ebx,0x168(%eax)
  0x01eb2ab3: mov    %ebx,%eax
  0x01eb2ab5: jmp    *%edi
  0x01eb2ab7: mov    0x4(%ecx),%ebx
  0x01eb2aba: cmp    0x8(%eax),%ebx
  0x01eb2abd: mov    0x4(%eax),%ebx
  0x01eb2ac0: jne    0x01eb2ad3
  0x01eb2ac6: cmpl   $0x0,0x30(%ebx)
  0x01eb2acd: je     0x01eb2b12
  0x01eb2ad3: jmp    0x01ea32d0
  0x01eb2ad8: cmpl   $0x0,0x30(%ebx)
  0x01eb2adf: je     0x01eb2b12
  0x01eb2ae5: mov    (%esp),%eax
  0x01eb2ae8: pusha  
  0x01eb2ae9: pushf  
  0x01eb2aea: sub    $0x10,%esp
  0x01eb2aed: movsd  %xmm0,(%esp)
  0x01eb2af2: movsd  %xmm1,0x8(%esp)
  0x01eb2af8: push   %eax
  0x01eb2af9: push   %ebx
  0x01eb2afa: call   0x55be79d0
  0x01eb2aff: add    $0x8,%esp
  0x01eb2b02: movsd  (%esp),%xmm0
  0x01eb2b07: movsd  0x8(%esp),%xmm1
  0x01eb2b0d: add    $0x10,%esp
  0x01eb2b10: popf   
  0x01eb2b11: popa   
  0x01eb2b12: pop    %eax
  0x01eb2b13: mov    %esp,%esi
  0x01eb2b15: sub    $0x8,%esp
  0x01eb2b18: movsd  %xmm0,(%esp)
  0x01eb2b1d: mov    0x24(%ebx),%ecx
  0x01eb2b20: push   %eax
  0x01eb2b21: jmp    *%ecx

AHE@0x018f9a60: 0x60000000 i2c: 0x01eb2df0 c2i: 0x01eb2e98 c2iUV: 0x01eb2e77
i2c argument handler #29 for: static (F)Ljava/lang/String; (243 bytes generated)
c2i argument handler starts at 01EB2E98
  0x01eb2df0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eb2df3: mov    $0x1dc2940,%edi
  0x01eb2df8: cmp    %edi,%eax
  0x01eb2dfa: jbe    0x01eb2e0d
  0x01eb2e00: mov    $0x1ea2940,%edi
  0x01eb2e05: cmp    %edi,%eax
  0x01eb2e07: jb     0x01eb2e52
  0x01eb2e0d: mov    $0x1dc0340,%edi
  0x01eb2e12: cmp    %edi,%eax
  0x01eb2e14: jbe    0x01eb2e27
  0x01eb2e1a: mov    $0x1dc2668,%edi
  0x01eb2e1f: cmp    %edi,%eax
  0x01eb2e21: jb     0x01eb2e52
  0x01eb2e27: mov    $0x1ead380,%edi
  0x01eb2e2c: cmp    %edi,%eax
  0x01eb2e2e: jbe    0x01eb2e41
  0x01eb2e34: mov    $0x1eb2970,%edi
  0x01eb2e39: cmp    %edi,%eax
  0x01eb2e3b: jb     0x01eb2e52
  ;; i2c adapter must return to an interpreter frame
  0x01eb2e41: push   $0x55ce723c
  0x01eb2e46: call   0x01eb2e4b
  0x01eb2e4b: pusha  
  0x01eb2e4c: call   0x557bdbf0
  0x01eb2e51: hlt    
  ;; } verify_i2ce 
  0x01eb2e52: mov    %esp,%edi
  0x01eb2e54: and    $0xfffffff0,%esp
  0x01eb2e57: push   %eax
  0x01eb2e58: mov    %edi,%eax
  0x01eb2e5a: mov    0x2c(%ebx),%edi
  0x01eb2e5d: movss  0x4(%eax),%xmm0
  0x01eb2e62: mov    %fs:0x0(,%eiz,1),%eax
  0x01eb2e6a: mov    -0xc(%eax),%eax
  0x01eb2e6d: mov    %ebx,0x168(%eax)
  0x01eb2e73: mov    %ebx,%eax
  0x01eb2e75: jmp    *%edi
  0x01eb2e77: mov    0x4(%ecx),%ebx
  0x01eb2e7a: cmp    0x8(%eax),%ebx
  0x01eb2e7d: mov    0x4(%eax),%ebx
  0x01eb2e80: jne    0x01eb2e93
  0x01eb2e86: cmpl   $0x0,0x30(%ebx)
  0x01eb2e8d: je     0x01eb2ed2
  0x01eb2e93: jmp    0x01ea32d0
  0x01eb2e98: cmpl   $0x0,0x30(%ebx)
  0x01eb2e9f: je     0x01eb2ed2
  0x01eb2ea5: mov    (%esp),%eax
  0x01eb2ea8: pusha  
  0x01eb2ea9: pushf  
  0x01eb2eaa: sub    $0x10,%esp
  0x01eb2ead: movsd  %xmm0,(%esp)
  0x01eb2eb2: movsd  %xmm1,0x8(%esp)
  0x01eb2eb8: push   %eax
  0x01eb2eb9: push   %ebx
  0x01eb2eba: call   0x55be79d0
  0x01eb2ebf: add    $0x8,%esp
  0x01eb2ec2: movsd  (%esp),%xmm0
  0x01eb2ec7: movsd  0x8(%esp),%xmm1
  0x01eb2ecd: add    $0x10,%esp
  0x01eb2ed0: popf   
  0x01eb2ed1: popa   
  0x01eb2ed2: pop    %eax
  0x01eb2ed3: mov    %esp,%esi
  0x01eb2ed5: sub    $0x4,%esp
  0x01eb2ed8: movss  %xmm0,(%esp)
  0x01eb2edd: mov    0x24(%ebx),%ecx
  0x01eb2ee0: push   %eax
  0x01eb2ee1: jmp    *%ecx

AHE@0x018f9a8c: 0xbe000000 i2c: 0x01eb2f70 c2i: 0x01eb3024 c2iUV: 0x01eb3003
i2c argument handler #30 for: static (J)Ljava/lang/String; (265 bytes generated)
c2i argument handler starts at 01EB3024
  0x01eb2f70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01eb2f73: mov    $0x1dc2940,%edi
  0x01eb2f78: cmp    %edi,%eax
  0x01eb2f7a: jbe    0x01eb2f8d
  0x01eb2f80: mov    $0x1ea2940,%edi
  0x01eb2f85: cmp    %edi,%eax
  0x01eb2f87: jb     0x01eb2fd2
  0x01eb2f8d: mov    $0x1dc0340,%edi
  0x01eb2f92: cmp    %edi,%eax
  0x01eb2f94: jbe    0x01eb2fa7
  0x01eb2f9a: mov    $0x1dc2668,%edi
  0x01eb2f9f: cmp    %edi,%eax
  0x01eb2fa1: jb     0x01eb2fd2
  0x01eb2fa7: mov    $0x1ead380,%edi
  0x01eb2fac: cmp    %edi,%eax
  0x01eb2fae: jbe    0x01eb2fc1
  0x01eb2fb4: mov    $0x1eb2970,%edi
  0x01eb2fb9: cmp    %edi,%eax
  0x01eb2fbb: jb     0x01eb2fd2
  ;; i2c adapter must return to an interpreter frame
  0x01eb2fc1: push   $0x55ce723c
  0x01eb2fc6: call   0x01eb2fcb
  0x01eb2fcb: pusha  
  0x01eb2fcc: call   0x557bdbf0
  0x01eb2fd1: hlt    
  ;; } verify_i2ce 
  0x01eb2fd2: mov    %esp,%edi
  0x01eb2fd4: sub    $0x8,%esp
  0x01eb2fd7: and    $0xfffffff0,%esp
  0x01eb2fda: push   %eax
  0x01eb2fdb: mov    %edi,%eax
  0x01eb2fdd: mov    0x2c(%ebx),%edi
  0x01eb2fe0: mov    0x4(%eax),%esi
  0x01eb2fe3: mov    %esi,0x4(%esp)
  0x01eb2fe7: mov    0x8(%eax),%esi
  0x01eb2fea: mov    %esi,0x8(%esp)
  0x01eb2fee: mov    %fs:0x0(,%eiz,1),%eax
  0x01eb2ff6: mov    -0xc(%eax),%eax
  0x01eb2ff9: mov    %ebx,0x168(%eax)
  0x01eb2fff: mov    %ebx,%eax
  0x01eb3001: jmp    *%edi
  0x01eb3003: mov    0x4(%ecx),%ebx
  0x01eb3006: cmp    0x8(%eax),%ebx
  0x01eb3009: mov    0x4(%eax),%ebx
  0x01eb300c: jne    0x01eb301f
  0x01eb3012: cmpl   $0x0,0x30(%ebx)
  0x01eb3019: je     0x01eb305e
  0x01eb301f: jmp    0x01ea32d0
  0x01eb3024: cmpl   $0x0,0x30(%ebx)
  0x01eb302b: je     0x01eb305e
  0x01eb3031: mov    (%esp),%eax
  0x01eb3034: pusha  
  0x01eb3035: pushf  
  0x01eb3036: sub    $0x10,%esp
  0x01eb3039: movsd  %xmm0,(%esp)
  0x01eb303e: movsd  %xmm1,0x8(%esp)
  0x01eb3044: push   %eax
  0x01eb3045: push   %ebx
  0x01eb3046: call   0x55be79d0
  0x01eb304b: add    $0x8,%esp
  0x01eb304e: movsd  (%esp),%xmm0
  0x01eb3053: movsd  0x8(%esp),%xmm1
  0x01eb3059: add    $0x10,%esp
  0x01eb305c: popf   
  0x01eb305d: popa   
  0x01eb305e: pop    %eax
  0x01eb305f: mov    %esp,%esi
  0x01eb3061: sub    $0x8,%esp
  0x01eb3064: mov    0x8(%esp),%edi
  0x01eb3068: mov    %edi,(%esp)
  0x01eb306b: mov    0xc(%esp),%edi
  0x01eb306f: mov    %edi,0x4(%esp)
  0x01eb3073: mov    0x24(%ebx),%ecx
  0x01eb3076: push   %eax
  0x01eb3077: jmp    *%ecx

AHE@0x018f9ab8: 0xbea00000 i2c: 0x01ebb570 c2i: 0x01ebb627 c2iUV: 0x01ebb606
i2c argument handler #31 for: static (JI)V (272 bytes generated)
c2i argument handler starts at 01EBB627
  0x01ebb570: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebb573: mov    $0x1dc2940,%edi
  0x01ebb578: cmp    %edi,%eax
  0x01ebb57a: jbe    0x01ebb58d
  0x01ebb580: mov    $0x1ea2940,%edi
  0x01ebb585: cmp    %edi,%eax
  0x01ebb587: jb     0x01ebb5d2
  0x01ebb58d: mov    $0x1dc0340,%edi
  0x01ebb592: cmp    %edi,%eax
  0x01ebb594: jbe    0x01ebb5a7
  0x01ebb59a: mov    $0x1dc2668,%edi
  0x01ebb59f: cmp    %edi,%eax
  0x01ebb5a1: jb     0x01ebb5d2
  0x01ebb5a7: mov    $0x1ead380,%edi
  0x01ebb5ac: cmp    %edi,%eax
  0x01ebb5ae: jbe    0x01ebb5c1
  0x01ebb5b4: mov    $0x1eb2970,%edi
  0x01ebb5b9: cmp    %edi,%eax
  0x01ebb5bb: jb     0x01ebb5d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebb5c1: push   $0x55ce723c
  0x01ebb5c6: call   0x01ebb5cb
  0x01ebb5cb: pusha  
  0x01ebb5cc: call   0x557bdbf0
  0x01ebb5d1: hlt    
  ;; } verify_i2ce 
  0x01ebb5d2: mov    %esp,%edi
  0x01ebb5d4: sub    $0x8,%esp
  0x01ebb5d7: and    $0xfffffff0,%esp
  0x01ebb5da: push   %eax
  0x01ebb5db: mov    %edi,%eax
  0x01ebb5dd: mov    0x2c(%ebx),%edi
  0x01ebb5e0: mov    0x8(%eax),%esi
  0x01ebb5e3: mov    %esi,0x4(%esp)
  0x01ebb5e7: mov    0xc(%eax),%esi
  0x01ebb5ea: mov    %esi,0x8(%esp)
  0x01ebb5ee: mov    0x4(%eax),%ecx
  0x01ebb5f1: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebb5f9: mov    -0xc(%eax),%eax
  0x01ebb5fc: mov    %ebx,0x168(%eax)
  0x01ebb602: mov    %ebx,%eax
  0x01ebb604: jmp    *%edi
  0x01ebb606: mov    0x4(%ecx),%ebx
  0x01ebb609: cmp    0x8(%eax),%ebx
  0x01ebb60c: mov    0x4(%eax),%ebx
  0x01ebb60f: jne    0x01ebb622
  0x01ebb615: cmpl   $0x0,0x30(%ebx)
  0x01ebb61c: je     0x01ebb661
  0x01ebb622: jmp    0x01ea32d0
  0x01ebb627: cmpl   $0x0,0x30(%ebx)
  0x01ebb62e: je     0x01ebb661
  0x01ebb634: mov    (%esp),%eax
  0x01ebb637: pusha  
  0x01ebb638: pushf  
  0x01ebb639: sub    $0x10,%esp
  0x01ebb63c: movsd  %xmm0,(%esp)
  0x01ebb641: movsd  %xmm1,0x8(%esp)
  0x01ebb647: push   %eax
  0x01ebb648: push   %ebx
  0x01ebb649: call   0x55be79d0
  0x01ebb64e: add    $0x8,%esp
  0x01ebb651: movsd  (%esp),%xmm0
  0x01ebb656: movsd  0x8(%esp),%xmm1
  0x01ebb65c: add    $0x10,%esp
  0x01ebb65f: popf   
  0x01ebb660: popa   
  0x01ebb661: pop    %eax
  0x01ebb662: mov    %esp,%esi
  0x01ebb664: sub    $0xc,%esp
  0x01ebb667: mov    0xc(%esp),%edi
  0x01ebb66b: mov    %edi,0x4(%esp)
  0x01ebb66f: mov    0x10(%esp),%edi
  0x01ebb673: mov    %edi,0x8(%esp)
  0x01ebb677: mov    %ecx,(%esp)
  0x01ebb67a: mov    0x24(%ebx),%ecx
  0x01ebb67d: push   %eax
  0x01ebb67e: jmp    *%ecx

AHE@0x018f9ae4: 0xaaaabe00 i2c: 0x01ebb6f0 c2i: 0x01ebb7b8 c2iUV: 0x01ebb797
i2c argument handler #32 for: receiver (Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;J)V (309 bytes generated)
c2i argument handler starts at 01EBB7B8
  0x01ebb6f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebb6f3: mov    $0x1dc2940,%edi
  0x01ebb6f8: cmp    %edi,%eax
  0x01ebb6fa: jbe    0x01ebb70d
  0x01ebb700: mov    $0x1ea2940,%edi
  0x01ebb705: cmp    %edi,%eax
  0x01ebb707: jb     0x01ebb752
  0x01ebb70d: mov    $0x1dc0340,%edi
  0x01ebb712: cmp    %edi,%eax
  0x01ebb714: jbe    0x01ebb727
  0x01ebb71a: mov    $0x1dc2668,%edi
  0x01ebb71f: cmp    %edi,%eax
  0x01ebb721: jb     0x01ebb752
  0x01ebb727: mov    $0x1ead380,%edi
  0x01ebb72c: cmp    %edi,%eax
  0x01ebb72e: jbe    0x01ebb741
  0x01ebb734: mov    $0x1eb2970,%edi
  0x01ebb739: cmp    %edi,%eax
  0x01ebb73b: jb     0x01ebb752
  ;; i2c adapter must return to an interpreter frame
  0x01ebb741: push   $0x55ce723c
  0x01ebb746: call   0x01ebb74b
  0x01ebb74b: pusha  
  0x01ebb74c: call   0x557bdbf0
  0x01ebb751: hlt    
  ;; } verify_i2ce 
  0x01ebb752: mov    %esp,%edi
  0x01ebb754: sub    $0x10,%esp
  0x01ebb757: and    $0xfffffff0,%esp
  0x01ebb75a: push   %eax
  0x01ebb75b: mov    %edi,%eax
  0x01ebb75d: mov    0x2c(%ebx),%edi
  0x01ebb760: mov    0x18(%eax),%ecx
  0x01ebb763: mov    0x14(%eax),%edx
  0x01ebb766: mov    0x10(%eax),%esi
  0x01ebb769: mov    %esi,0xc(%esp)
  0x01ebb76d: mov    0xc(%eax),%esi
  0x01ebb770: mov    %esi,0x10(%esp)
  0x01ebb774: mov    0x4(%eax),%esi
  0x01ebb777: mov    %esi,0x4(%esp)
  0x01ebb77b: mov    0x8(%eax),%esi
  0x01ebb77e: mov    %esi,0x8(%esp)
  0x01ebb782: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebb78a: mov    -0xc(%eax),%eax
  0x01ebb78d: mov    %ebx,0x168(%eax)
  0x01ebb793: mov    %ebx,%eax
  0x01ebb795: jmp    *%edi
  0x01ebb797: mov    0x4(%ecx),%ebx
  0x01ebb79a: cmp    0x8(%eax),%ebx
  0x01ebb79d: mov    0x4(%eax),%ebx
  0x01ebb7a0: jne    0x01ebb7b3
  0x01ebb7a6: cmpl   $0x0,0x30(%ebx)
  0x01ebb7ad: je     0x01ebb7f2
  0x01ebb7b3: jmp    0x01ea32d0
  0x01ebb7b8: cmpl   $0x0,0x30(%ebx)
  0x01ebb7bf: je     0x01ebb7f2
  0x01ebb7c5: mov    (%esp),%eax
  0x01ebb7c8: pusha  
  0x01ebb7c9: pushf  
  0x01ebb7ca: sub    $0x10,%esp
  0x01ebb7cd: movsd  %xmm0,(%esp)
  0x01ebb7d2: movsd  %xmm1,0x8(%esp)
  0x01ebb7d8: push   %eax
  0x01ebb7d9: push   %ebx
  0x01ebb7da: call   0x55be79d0
  0x01ebb7df: add    $0x8,%esp
  0x01ebb7e2: movsd  (%esp),%xmm0
  0x01ebb7e7: movsd  0x8(%esp),%xmm1
  0x01ebb7ed: add    $0x10,%esp
  0x01ebb7f0: popf   
  0x01ebb7f1: popa   
  0x01ebb7f2: pop    %eax
  0x01ebb7f3: mov    %esp,%esi
  0x01ebb7f5: sub    $0x18,%esp
  0x01ebb7f8: mov    %ecx,0x14(%esp)
  0x01ebb7fc: mov    %edx,0x10(%esp)
  0x01ebb800: mov    0x20(%esp),%edi
  0x01ebb804: mov    %edi,0xc(%esp)
  0x01ebb808: mov    0x24(%esp),%edi
  0x01ebb80c: mov    %edi,0x8(%esp)
  0x01ebb810: mov    0x18(%esp),%edi
  0x01ebb814: mov    %edi,(%esp)
  0x01ebb817: mov    0x1c(%esp),%edi
  0x01ebb81b: mov    %edi,0x4(%esp)
  0x01ebb81f: mov    0x24(%ebx),%ecx
  0x01ebb822: push   %eax
  0x01ebb823: jmp    *%ecx

AHE@0x018f9b10: 0xaaaabea0 i2c: 0x01ebb8b0 c2i: 0x01ebb97f c2iUV: 0x01ebb95e
i2c argument handler #33 for: receiver (Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;JLjava/security/AccessControlContext;)V (324 bytes generated)
c2i argument handler starts at 01EBB97F
  0x01ebb8b0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebb8b3: mov    $0x1dc2940,%edi
  0x01ebb8b8: cmp    %edi,%eax
  0x01ebb8ba: jbe    0x01ebb8cd
  0x01ebb8c0: mov    $0x1ea2940,%edi
  0x01ebb8c5: cmp    %edi,%eax
  0x01ebb8c7: jb     0x01ebb912
  0x01ebb8cd: mov    $0x1dc0340,%edi
  0x01ebb8d2: cmp    %edi,%eax
  0x01ebb8d4: jbe    0x01ebb8e7
  0x01ebb8da: mov    $0x1dc2668,%edi
  0x01ebb8df: cmp    %edi,%eax
  0x01ebb8e1: jb     0x01ebb912
  0x01ebb8e7: mov    $0x1ead380,%edi
  0x01ebb8ec: cmp    %edi,%eax
  0x01ebb8ee: jbe    0x01ebb901
  0x01ebb8f4: mov    $0x1eb2970,%edi
  0x01ebb8f9: cmp    %edi,%eax
  0x01ebb8fb: jb     0x01ebb912
  ;; i2c adapter must return to an interpreter frame
  0x01ebb901: push   $0x55ce723c
  0x01ebb906: call   0x01ebb90b
  0x01ebb90b: pusha  
  0x01ebb90c: call   0x557bdbf0
  0x01ebb911: hlt    
  ;; } verify_i2ce 
  0x01ebb912: mov    %esp,%edi
  0x01ebb914: sub    $0x18,%esp
  0x01ebb917: and    $0xfffffff0,%esp
  0x01ebb91a: push   %eax
  0x01ebb91b: mov    %edi,%eax
  0x01ebb91d: mov    0x2c(%ebx),%edi
  0x01ebb920: mov    0x1c(%eax),%ecx
  0x01ebb923: mov    0x18(%eax),%edx
  0x01ebb926: mov    0x14(%eax),%esi
  0x01ebb929: mov    %esi,0xc(%esp)
  0x01ebb92d: mov    0x10(%eax),%esi
  0x01ebb930: mov    %esi,0x10(%esp)
  0x01ebb934: mov    0x8(%eax),%esi
  0x01ebb937: mov    %esi,0x4(%esp)
  0x01ebb93b: mov    0xc(%eax),%esi
  0x01ebb93e: mov    %esi,0x8(%esp)
  0x01ebb942: mov    0x4(%eax),%esi
  0x01ebb945: mov    %esi,0x14(%esp)
  0x01ebb949: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebb951: mov    -0xc(%eax),%eax
  0x01ebb954: mov    %ebx,0x168(%eax)
  0x01ebb95a: mov    %ebx,%eax
  0x01ebb95c: jmp    *%edi
  0x01ebb95e: mov    0x4(%ecx),%ebx
  0x01ebb961: cmp    0x8(%eax),%ebx
  0x01ebb964: mov    0x4(%eax),%ebx
  0x01ebb967: jne    0x01ebb97a
  0x01ebb96d: cmpl   $0x0,0x30(%ebx)
  0x01ebb974: je     0x01ebb9b9
  0x01ebb97a: jmp    0x01ea32d0
  0x01ebb97f: cmpl   $0x0,0x30(%ebx)
  0x01ebb986: je     0x01ebb9b9
  0x01ebb98c: mov    (%esp),%eax
  0x01ebb98f: pusha  
  0x01ebb990: pushf  
  0x01ebb991: sub    $0x10,%esp
  0x01ebb994: movsd  %xmm0,(%esp)
  0x01ebb999: movsd  %xmm1,0x8(%esp)
  0x01ebb99f: push   %eax
  0x01ebb9a0: push   %ebx
  0x01ebb9a1: call   0x55be79d0
  0x01ebb9a6: add    $0x8,%esp
  0x01ebb9a9: movsd  (%esp),%xmm0
  0x01ebb9ae: movsd  0x8(%esp),%xmm1
  0x01ebb9b4: add    $0x10,%esp
  0x01ebb9b7: popf   
  0x01ebb9b8: popa   
  0x01ebb9b9: pop    %eax
  0x01ebb9ba: mov    %esp,%esi
  0x01ebb9bc: sub    $0x1c,%esp
  0x01ebb9bf: mov    %ecx,0x18(%esp)
  0x01ebb9c3: mov    %edx,0x14(%esp)
  0x01ebb9c7: mov    0x24(%esp),%edi
  0x01ebb9cb: mov    %edi,0x10(%esp)
  0x01ebb9cf: mov    0x28(%esp),%edi
  0x01ebb9d3: mov    %edi,0xc(%esp)
  0x01ebb9d7: mov    0x1c(%esp),%edi
  0x01ebb9db: mov    %edi,0x4(%esp)
  0x01ebb9df: mov    0x20(%esp),%edi
  0x01ebb9e3: mov    %edi,0x8(%esp)
  0x01ebb9e7: mov    0x2c(%esp),%edi
  0x01ebb9eb: mov    %edi,(%esp)
  0x01ebb9ee: mov    0x24(%ebx),%ecx
  0x01ebb9f1: push   %eax
  0x01ebb9f2: jmp    *%ecx

AHE@0x018f9b3c: 0xaaaaaaaaaaaa0000 i2c: 0x01ebba70 c2i: 0x01ebbb62 c2iUV: 0x01ebbb41
i2c argument handler #34 for: receiver (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;IILjava/lang/String;[B[B[B)V (399 bytes generated)
c2i argument handler starts at 01EBBB62
  0x01ebba70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebba73: mov    $0x1dc2940,%edi
  0x01ebba78: cmp    %edi,%eax
  0x01ebba7a: jbe    0x01ebba8d
  0x01ebba80: mov    $0x1ea2940,%edi
  0x01ebba85: cmp    %edi,%eax
  0x01ebba87: jb     0x01ebbad2
  0x01ebba8d: mov    $0x1dc0340,%edi
  0x01ebba92: cmp    %edi,%eax
  0x01ebba94: jbe    0x01ebbaa7
  0x01ebba9a: mov    $0x1dc2668,%edi
  0x01ebba9f: cmp    %edi,%eax
  0x01ebbaa1: jb     0x01ebbad2
  0x01ebbaa7: mov    $0x1ead380,%edi
  0x01ebbaac: cmp    %edi,%eax
  0x01ebbaae: jbe    0x01ebbac1
  0x01ebbab4: mov    $0x1eb2970,%edi
  0x01ebbab9: cmp    %edi,%eax
  0x01ebbabb: jb     0x01ebbad2
  ;; i2c adapter must return to an interpreter frame
  0x01ebbac1: push   $0x55ce723c
  0x01ebbac6: call   0x01ebbacb
  0x01ebbacb: pusha  
  0x01ebbacc: call   0x557bdbf0
  0x01ebbad1: hlt    
  ;; } verify_i2ce 
  0x01ebbad2: mov    %esp,%edi
  0x01ebbad4: sub    $0x28,%esp
  0x01ebbad7: and    $0xfffffff0,%esp
  0x01ebbada: push   %eax
  0x01ebbadb: mov    %edi,%eax
  0x01ebbadd: mov    0x2c(%ebx),%edi
  0x01ebbae0: mov    0x30(%eax),%ecx
  0x01ebbae3: mov    0x2c(%eax),%edx
  0x01ebbae6: mov    0x28(%eax),%esi
  0x01ebbae9: mov    %esi,0x4(%esp)
  0x01ebbaed: mov    0x24(%eax),%esi
  0x01ebbaf0: mov    %esi,0x8(%esp)
  0x01ebbaf4: mov    0x20(%eax),%esi
  0x01ebbaf7: mov    %esi,0xc(%esp)
  0x01ebbafb: mov    0x1c(%eax),%esi
  0x01ebbafe: mov    %esi,0x10(%esp)
  0x01ebbb02: mov    0x18(%eax),%esi
  0x01ebbb05: mov    %esi,0x14(%esp)
  0x01ebbb09: mov    0x14(%eax),%esi
  0x01ebbb0c: mov    %esi,0x18(%esp)
  0x01ebbb10: mov    0x10(%eax),%esi
  0x01ebbb13: mov    %esi,0x1c(%esp)
  0x01ebbb17: mov    0xc(%eax),%esi
  0x01ebbb1a: mov    %esi,0x20(%esp)
  0x01ebbb1e: mov    0x8(%eax),%esi
  0x01ebbb21: mov    %esi,0x24(%esp)
  0x01ebbb25: mov    0x4(%eax),%esi
  0x01ebbb28: mov    %esi,0x28(%esp)
  0x01ebbb2c: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebbb34: mov    -0xc(%eax),%eax
  0x01ebbb37: mov    %ebx,0x168(%eax)
  0x01ebbb3d: mov    %ebx,%eax
  0x01ebbb3f: jmp    *%edi
  0x01ebbb41: mov    0x4(%ecx),%ebx
  0x01ebbb44: cmp    0x8(%eax),%ebx
  0x01ebbb47: mov    0x4(%eax),%ebx
  0x01ebbb4a: jne    0x01ebbb5d
  0x01ebbb50: cmpl   $0x0,0x30(%ebx)
  0x01ebbb57: je     0x01ebbb9c
  0x01ebbb5d: jmp    0x01ea32d0
  0x01ebbb62: cmpl   $0x0,0x30(%ebx)
  0x01ebbb69: je     0x01ebbb9c
  0x01ebbb6f: mov    (%esp),%eax
  0x01ebbb72: pusha  
  0x01ebbb73: pushf  
  0x01ebbb74: sub    $0x10,%esp
  0x01ebbb77: movsd  %xmm0,(%esp)
  0x01ebbb7c: movsd  %xmm1,0x8(%esp)
  0x01ebbb82: push   %eax
  0x01ebbb83: push   %ebx
  0x01ebbb84: call   0x55be79d0
  0x01ebbb89: add    $0x8,%esp
  0x01ebbb8c: movsd  (%esp),%xmm0
  0x01ebbb91: movsd  0x8(%esp),%xmm1
  0x01ebbb97: add    $0x10,%esp
  0x01ebbb9a: popf   
  0x01ebbb9b: popa   
  0x01ebbb9c: pop    %eax
  0x01ebbb9d: mov    %esp,%esi
  0x01ebbb9f: sub    $0x30,%esp
  0x01ebbba2: mov    %ecx,0x2c(%esp)
  0x01ebbba6: mov    %edx,0x28(%esp)
  0x01ebbbaa: mov    0x30(%esp),%edi
  0x01ebbbae: mov    %edi,0x24(%esp)
  0x01ebbbb2: mov    0x34(%esp),%edi
  0x01ebbbb6: mov    %edi,0x20(%esp)
  0x01ebbbba: mov    0x38(%esp),%edi
  0x01ebbbbe: mov    %edi,0x1c(%esp)
  0x01ebbbc2: mov    0x3c(%esp),%edi
  0x01ebbbc6: mov    %edi,0x18(%esp)
  0x01ebbbca: mov    0x40(%esp),%edi
  0x01ebbbce: mov    %edi,0x14(%esp)
  0x01ebbbd2: mov    0x44(%esp),%edi
  0x01ebbbd6: mov    %edi,0x10(%esp)
  0x01ebbbda: mov    0x48(%esp),%edi
  0x01ebbbde: mov    %edi,0xc(%esp)
  0x01ebbbe2: mov    0x4c(%esp),%edi
  0x01ebbbe6: mov    %edi,0x8(%esp)
  0x01ebbbea: mov    0x50(%esp),%edi
  0x01ebbbee: mov    %edi,0x4(%esp)
  0x01ebbbf2: mov    0x54(%esp),%edi
  0x01ebbbf6: mov    %edi,(%esp)
  0x01ebbbf9: mov    0x24(%ebx),%ecx
  0x01ebbbfc: push   %eax
  0x01ebbbfd: jmp    *%ecx

AHE@0x018f9b68: 0xaaaaaaaa i2c: 0x01ebbc70 c2i: 0x01ebbd46 c2iUV: 0x01ebbd25
i2c argument handler #35 for: receiver (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;IILjava/lang/String;[B)Ljava/lang/reflect/Field; (339 bytes generated)
c2i argument handler starts at 01EBBD46
  0x01ebbc70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebbc73: mov    $0x1dc2940,%edi
  0x01ebbc78: cmp    %edi,%eax
  0x01ebbc7a: jbe    0x01ebbc8d
  0x01ebbc80: mov    $0x1ea2940,%edi
  0x01ebbc85: cmp    %edi,%eax
  0x01ebbc87: jb     0x01ebbcd2
  0x01ebbc8d: mov    $0x1dc0340,%edi
  0x01ebbc92: cmp    %edi,%eax
  0x01ebbc94: jbe    0x01ebbca7
  0x01ebbc9a: mov    $0x1dc2668,%edi
  0x01ebbc9f: cmp    %edi,%eax
  0x01ebbca1: jb     0x01ebbcd2
  0x01ebbca7: mov    $0x1ead380,%edi
  0x01ebbcac: cmp    %edi,%eax
  0x01ebbcae: jbe    0x01ebbcc1
  0x01ebbcb4: mov    $0x1eb2970,%edi
  0x01ebbcb9: cmp    %edi,%eax
  0x01ebbcbb: jb     0x01ebbcd2
  ;; i2c adapter must return to an interpreter frame
  0x01ebbcc1: push   $0x55ce723c
  0x01ebbcc6: call   0x01ebbccb
  0x01ebbccb: pusha  
  0x01ebbccc: call   0x557bdbf0
  0x01ebbcd1: hlt    
  ;; } verify_i2ce 
  0x01ebbcd2: mov    %esp,%edi
  0x01ebbcd4: sub    $0x18,%esp
  0x01ebbcd7: and    $0xfffffff0,%esp
  0x01ebbcda: push   %eax
  0x01ebbcdb: mov    %edi,%eax
  0x01ebbcdd: mov    0x2c(%ebx),%edi
  0x01ebbce0: mov    0x20(%eax),%ecx
  0x01ebbce3: mov    0x1c(%eax),%edx
  0x01ebbce6: mov    0x18(%eax),%esi
  0x01ebbce9: mov    %esi,0x4(%esp)
  0x01ebbced: mov    0x14(%eax),%esi
  0x01ebbcf0: mov    %esi,0x8(%esp)
  0x01ebbcf4: mov    0x10(%eax),%esi
  0x01ebbcf7: mov    %esi,0xc(%esp)
  0x01ebbcfb: mov    0xc(%eax),%esi
  0x01ebbcfe: mov    %esi,0x10(%esp)
  0x01ebbd02: mov    0x8(%eax),%esi
  0x01ebbd05: mov    %esi,0x14(%esp)
  0x01ebbd09: mov    0x4(%eax),%esi
  0x01ebbd0c: mov    %esi,0x18(%esp)
  0x01ebbd10: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebbd18: mov    -0xc(%eax),%eax
  0x01ebbd1b: mov    %ebx,0x168(%eax)
  0x01ebbd21: mov    %ebx,%eax
  0x01ebbd23: jmp    *%edi
  0x01ebbd25: mov    0x4(%ecx),%ebx
  0x01ebbd28: cmp    0x8(%eax),%ebx
  0x01ebbd2b: mov    0x4(%eax),%ebx
  0x01ebbd2e: jne    0x01ebbd41
  0x01ebbd34: cmpl   $0x0,0x30(%ebx)
  0x01ebbd3b: je     0x01ebbd80
  0x01ebbd41: jmp    0x01ea32d0
  0x01ebbd46: cmpl   $0x0,0x30(%ebx)
  0x01ebbd4d: je     0x01ebbd80
  0x01ebbd53: mov    (%esp),%eax
  0x01ebbd56: pusha  
  0x01ebbd57: pushf  
  0x01ebbd58: sub    $0x10,%esp
  0x01ebbd5b: movsd  %xmm0,(%esp)
  0x01ebbd60: movsd  %xmm1,0x8(%esp)
  0x01ebbd66: push   %eax
  0x01ebbd67: push   %ebx
  0x01ebbd68: call   0x55be79d0
  0x01ebbd6d: add    $0x8,%esp
  0x01ebbd70: movsd  (%esp),%xmm0
  0x01ebbd75: movsd  0x8(%esp),%xmm1
  0x01ebbd7b: add    $0x10,%esp
  0x01ebbd7e: popf   
  0x01ebbd7f: popa   
  0x01ebbd80: pop    %eax
  0x01ebbd81: mov    %esp,%esi
  0x01ebbd83: sub    $0x20,%esp
  0x01ebbd86: mov    %ecx,0x1c(%esp)
  0x01ebbd8a: mov    %edx,0x18(%esp)
  0x01ebbd8e: mov    0x20(%esp),%edi
  0x01ebbd92: mov    %edi,0x14(%esp)
  0x01ebbd96: mov    0x24(%esp),%edi
  0x01ebbd9a: mov    %edi,0x10(%esp)
  0x01ebbd9e: mov    0x28(%esp),%edi
  0x01ebbda2: mov    %edi,0xc(%esp)
  0x01ebbda6: mov    0x2c(%esp),%edi
  0x01ebbdaa: mov    %edi,0x8(%esp)
  0x01ebbdae: mov    0x30(%esp),%edi
  0x01ebbdb2: mov    %edi,0x4(%esp)
  0x01ebbdb6: mov    0x34(%esp),%edi
  0x01ebbdba: mov    %edi,(%esp)
  0x01ebbdbd: mov    0x24(%ebx),%ecx
  0x01ebbdc0: push   %eax
  0x01ebbdc1: jmp    *%ecx

AHE@0x018f9b94: 0xaa600000 i2c: 0x01ebbe70 c2i: 0x01ebbf1e c2iUV: 0x01ebbefd
i2c argument handler #36 for: receiver (IF)V (257 bytes generated)
c2i argument handler starts at 01EBBF1E
  0x01ebbe70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebbe73: mov    $0x1dc2940,%edi
  0x01ebbe78: cmp    %edi,%eax
  0x01ebbe7a: jbe    0x01ebbe8d
  0x01ebbe80: mov    $0x1ea2940,%edi
  0x01ebbe85: cmp    %edi,%eax
  0x01ebbe87: jb     0x01ebbed2
  0x01ebbe8d: mov    $0x1dc0340,%edi
  0x01ebbe92: cmp    %edi,%eax
  0x01ebbe94: jbe    0x01ebbea7
  0x01ebbe9a: mov    $0x1dc2668,%edi
  0x01ebbe9f: cmp    %edi,%eax
  0x01ebbea1: jb     0x01ebbed2
  0x01ebbea7: mov    $0x1ead380,%edi
  0x01ebbeac: cmp    %edi,%eax
  0x01ebbeae: jbe    0x01ebbec1
  0x01ebbeb4: mov    $0x1eb2970,%edi
  0x01ebbeb9: cmp    %edi,%eax
  0x01ebbebb: jb     0x01ebbed2
  ;; i2c adapter must return to an interpreter frame
  0x01ebbec1: push   $0x55ce723c
  0x01ebbec6: call   0x01ebbecb
  0x01ebbecb: pusha  
  0x01ebbecc: call   0x557bdbf0
  0x01ebbed1: hlt    
  ;; } verify_i2ce 
  0x01ebbed2: mov    %esp,%edi
  0x01ebbed4: and    $0xfffffff0,%esp
  0x01ebbed7: push   %eax
  0x01ebbed8: mov    %edi,%eax
  0x01ebbeda: mov    0x2c(%ebx),%edi
  0x01ebbedd: mov    0xc(%eax),%ecx
  0x01ebbee0: mov    0x8(%eax),%edx
  0x01ebbee3: movss  0x4(%eax),%xmm0
  0x01ebbee8: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebbef0: mov    -0xc(%eax),%eax
  0x01ebbef3: mov    %ebx,0x168(%eax)
  0x01ebbef9: mov    %ebx,%eax
  0x01ebbefb: jmp    *%edi
  0x01ebbefd: mov    0x4(%ecx),%ebx
  0x01ebbf00: cmp    0x8(%eax),%ebx
  0x01ebbf03: mov    0x4(%eax),%ebx
  0x01ebbf06: jne    0x01ebbf19
  0x01ebbf0c: cmpl   $0x0,0x30(%ebx)
  0x01ebbf13: je     0x01ebbf58
  0x01ebbf19: jmp    0x01ea32d0
  0x01ebbf1e: cmpl   $0x0,0x30(%ebx)
  0x01ebbf25: je     0x01ebbf58
  0x01ebbf2b: mov    (%esp),%eax
  0x01ebbf2e: pusha  
  0x01ebbf2f: pushf  
  0x01ebbf30: sub    $0x10,%esp
  0x01ebbf33: movsd  %xmm0,(%esp)
  0x01ebbf38: movsd  %xmm1,0x8(%esp)
  0x01ebbf3e: push   %eax
  0x01ebbf3f: push   %ebx
  0x01ebbf40: call   0x55be79d0
  0x01ebbf45: add    $0x8,%esp
  0x01ebbf48: movsd  (%esp),%xmm0
  0x01ebbf4d: movsd  0x8(%esp),%xmm1
  0x01ebbf53: add    $0x10,%esp
  0x01ebbf56: popf   
  0x01ebbf57: popa   
  0x01ebbf58: pop    %eax
  0x01ebbf59: mov    %esp,%esi
  0x01ebbf5b: sub    $0xc,%esp
  0x01ebbf5e: mov    %ecx,0x8(%esp)
  0x01ebbf62: mov    %edx,0x4(%esp)
  0x01ebbf66: movss  %xmm0,(%esp)
  0x01ebbf6b: mov    0x24(%ebx),%ecx
  0x01ebbf6e: push   %eax
  0x01ebbf6f: jmp    *%ecx

AHE@0x018f9bc0: 0x66000000 i2c: 0x01ebbff0 c2i: 0x01ebc09d c2iUV: 0x01ebc07c
i2c argument handler #37 for: static (FF)F (254 bytes generated)
c2i argument handler starts at 01EBC09D
  0x01ebbff0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebbff3: mov    $0x1dc2940,%edi
  0x01ebbff8: cmp    %edi,%eax
  0x01ebbffa: jbe    0x01ebc00d
  0x01ebc000: mov    $0x1ea2940,%edi
  0x01ebc005: cmp    %edi,%eax
  0x01ebc007: jb     0x01ebc052
  0x01ebc00d: mov    $0x1dc0340,%edi
  0x01ebc012: cmp    %edi,%eax
  0x01ebc014: jbe    0x01ebc027
  0x01ebc01a: mov    $0x1dc2668,%edi
  0x01ebc01f: cmp    %edi,%eax
  0x01ebc021: jb     0x01ebc052
  0x01ebc027: mov    $0x1ead380,%edi
  0x01ebc02c: cmp    %edi,%eax
  0x01ebc02e: jbe    0x01ebc041
  0x01ebc034: mov    $0x1eb2970,%edi
  0x01ebc039: cmp    %edi,%eax
  0x01ebc03b: jb     0x01ebc052
  ;; i2c adapter must return to an interpreter frame
  0x01ebc041: push   $0x55ce723c
  0x01ebc046: call   0x01ebc04b
  0x01ebc04b: pusha  
  0x01ebc04c: call   0x557bdbf0
  0x01ebc051: hlt    
  ;; } verify_i2ce 
  0x01ebc052: mov    %esp,%edi
  0x01ebc054: and    $0xfffffff0,%esp
  0x01ebc057: push   %eax
  0x01ebc058: mov    %edi,%eax
  0x01ebc05a: mov    0x2c(%ebx),%edi
  0x01ebc05d: movss  0x8(%eax),%xmm0
  0x01ebc062: movss  0x4(%eax),%xmm1
  0x01ebc067: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebc06f: mov    -0xc(%eax),%eax
  0x01ebc072: mov    %ebx,0x168(%eax)
  0x01ebc078: mov    %ebx,%eax
  0x01ebc07a: jmp    *%edi
  0x01ebc07c: mov    0x4(%ecx),%ebx
  0x01ebc07f: cmp    0x8(%eax),%ebx
  0x01ebc082: mov    0x4(%eax),%ebx
  0x01ebc085: jne    0x01ebc098
  0x01ebc08b: cmpl   $0x0,0x30(%ebx)
  0x01ebc092: je     0x01ebc0d7
  0x01ebc098: jmp    0x01ea32d0
  0x01ebc09d: cmpl   $0x0,0x30(%ebx)
  0x01ebc0a4: je     0x01ebc0d7
  0x01ebc0aa: mov    (%esp),%eax
  0x01ebc0ad: pusha  
  0x01ebc0ae: pushf  
  0x01ebc0af: sub    $0x10,%esp
  0x01ebc0b2: movsd  %xmm0,(%esp)
  0x01ebc0b7: movsd  %xmm1,0x8(%esp)
  0x01ebc0bd: push   %eax
  0x01ebc0be: push   %ebx
  0x01ebc0bf: call   0x55be79d0
  0x01ebc0c4: add    $0x8,%esp
  0x01ebc0c7: movsd  (%esp),%xmm0
  0x01ebc0cc: movsd  0x8(%esp),%xmm1
  0x01ebc0d2: add    $0x10,%esp
  0x01ebc0d5: popf   
  0x01ebc0d6: popa   
  0x01ebc0d7: pop    %eax
  0x01ebc0d8: mov    %esp,%esi
  0x01ebc0da: sub    $0x8,%esp
  0x01ebc0dd: movss  %xmm0,0x4(%esp)
  0x01ebc0e3: movss  %xmm1,(%esp)
  0x01ebc0e8: mov    0x24(%ebx),%ecx
  0x01ebc0eb: push   %eax
  0x01ebc0ec: jmp    *%ecx

AHE@0x018f9bec: 0xa6000000 i2c: 0x01ebc170 c2i: 0x01ebc21b c2iUV: 0x01ebc1fa
i2c argument handler #38 for: receiver (F)V (250 bytes generated)
c2i argument handler starts at 01EBC21B
  0x01ebc170: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebc173: mov    $0x1dc2940,%edi
  0x01ebc178: cmp    %edi,%eax
  0x01ebc17a: jbe    0x01ebc18d
  0x01ebc180: mov    $0x1ea2940,%edi
  0x01ebc185: cmp    %edi,%eax
  0x01ebc187: jb     0x01ebc1d2
  0x01ebc18d: mov    $0x1dc0340,%edi
  0x01ebc192: cmp    %edi,%eax
  0x01ebc194: jbe    0x01ebc1a7
  0x01ebc19a: mov    $0x1dc2668,%edi
  0x01ebc19f: cmp    %edi,%eax
  0x01ebc1a1: jb     0x01ebc1d2
  0x01ebc1a7: mov    $0x1ead380,%edi
  0x01ebc1ac: cmp    %edi,%eax
  0x01ebc1ae: jbe    0x01ebc1c1
  0x01ebc1b4: mov    $0x1eb2970,%edi
  0x01ebc1b9: cmp    %edi,%eax
  0x01ebc1bb: jb     0x01ebc1d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebc1c1: push   $0x55ce723c
  0x01ebc1c6: call   0x01ebc1cb
  0x01ebc1cb: pusha  
  0x01ebc1cc: call   0x557bdbf0
  0x01ebc1d1: hlt    
  ;; } verify_i2ce 
  0x01ebc1d2: mov    %esp,%edi
  0x01ebc1d4: and    $0xfffffff0,%esp
  0x01ebc1d7: push   %eax
  0x01ebc1d8: mov    %edi,%eax
  0x01ebc1da: mov    0x2c(%ebx),%edi
  0x01ebc1dd: mov    0x8(%eax),%ecx
  0x01ebc1e0: movss  0x4(%eax),%xmm0
  0x01ebc1e5: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebc1ed: mov    -0xc(%eax),%eax
  0x01ebc1f0: mov    %ebx,0x168(%eax)
  0x01ebc1f6: mov    %ebx,%eax
  0x01ebc1f8: jmp    *%edi
  0x01ebc1fa: mov    0x4(%ecx),%ebx
  0x01ebc1fd: cmp    0x8(%eax),%ebx
  0x01ebc200: mov    0x4(%eax),%ebx
  0x01ebc203: jne    0x01ebc216
  0x01ebc209: cmpl   $0x0,0x30(%ebx)
  0x01ebc210: je     0x01ebc255
  0x01ebc216: jmp    0x01ea32d0
  0x01ebc21b: cmpl   $0x0,0x30(%ebx)
  0x01ebc222: je     0x01ebc255
  0x01ebc228: mov    (%esp),%eax
  0x01ebc22b: pusha  
  0x01ebc22c: pushf  
  0x01ebc22d: sub    $0x10,%esp
  0x01ebc230: movsd  %xmm0,(%esp)
  0x01ebc235: movsd  %xmm1,0x8(%esp)
  0x01ebc23b: push   %eax
  0x01ebc23c: push   %ebx
  0x01ebc23d: call   0x55be79d0
  0x01ebc242: add    $0x8,%esp
  0x01ebc245: movsd  (%esp),%xmm0
  0x01ebc24a: movsd  0x8(%esp),%xmm1
  0x01ebc250: add    $0x10,%esp
  0x01ebc253: popf   
  0x01ebc254: popa   
  0x01ebc255: pop    %eax
  0x01ebc256: mov    %esp,%esi
  0x01ebc258: sub    $0x8,%esp
  0x01ebc25b: mov    %ecx,0x4(%esp)
  0x01ebc25f: movss  %xmm0,(%esp)
  0x01ebc264: mov    0x24(%ebx),%ecx
  0x01ebc267: push   %eax
  0x01ebc268: jmp    *%ecx

AHE@0x018f9c18: 0xa7e00000 i2c: 0x01ebc2f0 c2i: 0x01ebc39b c2iUV: 0x01ebc37a
i2c argument handler #39 for: receiver (D)V (250 bytes generated)
c2i argument handler starts at 01EBC39B
  0x01ebc2f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebc2f3: mov    $0x1dc2940,%edi
  0x01ebc2f8: cmp    %edi,%eax
  0x01ebc2fa: jbe    0x01ebc30d
  0x01ebc300: mov    $0x1ea2940,%edi
  0x01ebc305: cmp    %edi,%eax
  0x01ebc307: jb     0x01ebc352
  0x01ebc30d: mov    $0x1dc0340,%edi
  0x01ebc312: cmp    %edi,%eax
  0x01ebc314: jbe    0x01ebc327
  0x01ebc31a: mov    $0x1dc2668,%edi
  0x01ebc31f: cmp    %edi,%eax
  0x01ebc321: jb     0x01ebc352
  0x01ebc327: mov    $0x1ead380,%edi
  0x01ebc32c: cmp    %edi,%eax
  0x01ebc32e: jbe    0x01ebc341
  0x01ebc334: mov    $0x1eb2970,%edi
  0x01ebc339: cmp    %edi,%eax
  0x01ebc33b: jb     0x01ebc352
  ;; i2c adapter must return to an interpreter frame
  0x01ebc341: push   $0x55ce723c
  0x01ebc346: call   0x01ebc34b
  0x01ebc34b: pusha  
  0x01ebc34c: call   0x557bdbf0
  0x01ebc351: hlt    
  ;; } verify_i2ce 
  0x01ebc352: mov    %esp,%edi
  0x01ebc354: and    $0xfffffff0,%esp
  0x01ebc357: push   %eax
  0x01ebc358: mov    %edi,%eax
  0x01ebc35a: mov    0x2c(%ebx),%edi
  0x01ebc35d: mov    0xc(%eax),%ecx
  0x01ebc360: movsd  0x4(%eax),%xmm0
  0x01ebc365: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebc36d: mov    -0xc(%eax),%eax
  0x01ebc370: mov    %ebx,0x168(%eax)
  0x01ebc376: mov    %ebx,%eax
  0x01ebc378: jmp    *%edi
  0x01ebc37a: mov    0x4(%ecx),%ebx
  0x01ebc37d: cmp    0x8(%eax),%ebx
  0x01ebc380: mov    0x4(%eax),%ebx
  0x01ebc383: jne    0x01ebc396
  0x01ebc389: cmpl   $0x0,0x30(%ebx)
  0x01ebc390: je     0x01ebc3d5
  0x01ebc396: jmp    0x01ea32d0
  0x01ebc39b: cmpl   $0x0,0x30(%ebx)
  0x01ebc3a2: je     0x01ebc3d5
  0x01ebc3a8: mov    (%esp),%eax
  0x01ebc3ab: pusha  
  0x01ebc3ac: pushf  
  0x01ebc3ad: sub    $0x10,%esp
  0x01ebc3b0: movsd  %xmm0,(%esp)
  0x01ebc3b5: movsd  %xmm1,0x8(%esp)
  0x01ebc3bb: push   %eax
  0x01ebc3bc: push   %ebx
  0x01ebc3bd: call   0x55be79d0
  0x01ebc3c2: add    $0x8,%esp
  0x01ebc3c5: movsd  (%esp),%xmm0
  0x01ebc3ca: movsd  0x8(%esp),%xmm1
  0x01ebc3d0: add    $0x10,%esp
  0x01ebc3d3: popf   
  0x01ebc3d4: popa   
  0x01ebc3d5: pop    %eax
  0x01ebc3d6: mov    %esp,%esi
  0x01ebc3d8: sub    $0xc,%esp
  0x01ebc3db: mov    %ecx,0x8(%esp)
  0x01ebc3df: movsd  %xmm0,(%esp)
  0x01ebc3e4: mov    0x24(%ebx),%ecx
  0x01ebc3e7: push   %eax
  0x01ebc3e8: jmp    *%ecx

AHE@0x018f9c44: 0x7e7e0000 i2c: 0x01ebc470 c2i: 0x01ebc51d c2iUV: 0x01ebc4fc
i2c argument handler #40 for: static (DD)D (254 bytes generated)
c2i argument handler starts at 01EBC51D
  0x01ebc470: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebc473: mov    $0x1dc2940,%edi
  0x01ebc478: cmp    %edi,%eax
  0x01ebc47a: jbe    0x01ebc48d
  0x01ebc480: mov    $0x1ea2940,%edi
  0x01ebc485: cmp    %edi,%eax
  0x01ebc487: jb     0x01ebc4d2
  0x01ebc48d: mov    $0x1dc0340,%edi
  0x01ebc492: cmp    %edi,%eax
  0x01ebc494: jbe    0x01ebc4a7
  0x01ebc49a: mov    $0x1dc2668,%edi
  0x01ebc49f: cmp    %edi,%eax
  0x01ebc4a1: jb     0x01ebc4d2
  0x01ebc4a7: mov    $0x1ead380,%edi
  0x01ebc4ac: cmp    %edi,%eax
  0x01ebc4ae: jbe    0x01ebc4c1
  0x01ebc4b4: mov    $0x1eb2970,%edi
  0x01ebc4b9: cmp    %edi,%eax
  0x01ebc4bb: jb     0x01ebc4d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebc4c1: push   $0x55ce723c
  0x01ebc4c6: call   0x01ebc4cb
  0x01ebc4cb: pusha  
  0x01ebc4cc: call   0x557bdbf0
  0x01ebc4d1: hlt    
  ;; } verify_i2ce 
  0x01ebc4d2: mov    %esp,%edi
  0x01ebc4d4: and    $0xfffffff0,%esp
  0x01ebc4d7: push   %eax
  0x01ebc4d8: mov    %edi,%eax
  0x01ebc4da: mov    0x2c(%ebx),%edi
  0x01ebc4dd: movsd  0xc(%eax),%xmm0
  0x01ebc4e2: movsd  0x4(%eax),%xmm1
  0x01ebc4e7: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebc4ef: mov    -0xc(%eax),%eax
  0x01ebc4f2: mov    %ebx,0x168(%eax)
  0x01ebc4f8: mov    %ebx,%eax
  0x01ebc4fa: jmp    *%edi
  0x01ebc4fc: mov    0x4(%ecx),%ebx
  0x01ebc4ff: cmp    0x8(%eax),%ebx
  0x01ebc502: mov    0x4(%eax),%ebx
  0x01ebc505: jne    0x01ebc518
  0x01ebc50b: cmpl   $0x0,0x30(%ebx)
  0x01ebc512: je     0x01ebc557
  0x01ebc518: jmp    0x01ea32d0
  0x01ebc51d: cmpl   $0x0,0x30(%ebx)
  0x01ebc524: je     0x01ebc557
  0x01ebc52a: mov    (%esp),%eax
  0x01ebc52d: pusha  
  0x01ebc52e: pushf  
  0x01ebc52f: sub    $0x10,%esp
  0x01ebc532: movsd  %xmm0,(%esp)
  0x01ebc537: movsd  %xmm1,0x8(%esp)
  0x01ebc53d: push   %eax
  0x01ebc53e: push   %ebx
  0x01ebc53f: call   0x55be79d0
  0x01ebc544: add    $0x8,%esp
  0x01ebc547: movsd  (%esp),%xmm0
  0x01ebc54c: movsd  0x8(%esp),%xmm1
  0x01ebc552: add    $0x10,%esp
  0x01ebc555: popf   
  0x01ebc556: popa   
  0x01ebc557: pop    %eax
  0x01ebc558: mov    %esp,%esi
  0x01ebc55a: sub    $0x10,%esp
  0x01ebc55d: movsd  %xmm0,0x8(%esp)
  0x01ebc563: movsd  %xmm1,(%esp)
  0x01ebc568: mov    0x24(%ebx),%ecx
  0x01ebc56b: push   %eax
  0x01ebc56c: jmp    *%ecx

AHE@0x018f9c70: 0x67e00000 i2c: 0x01ebc5f0 c2i: 0x01ebc69d c2iUV: 0x01ebc67c
i2c argument handler #41 for: static (FD)F (254 bytes generated)
c2i argument handler starts at 01EBC69D
  0x01ebc5f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebc5f3: mov    $0x1dc2940,%edi
  0x01ebc5f8: cmp    %edi,%eax
  0x01ebc5fa: jbe    0x01ebc60d
  0x01ebc600: mov    $0x1ea2940,%edi
  0x01ebc605: cmp    %edi,%eax
  0x01ebc607: jb     0x01ebc652
  0x01ebc60d: mov    $0x1dc0340,%edi
  0x01ebc612: cmp    %edi,%eax
  0x01ebc614: jbe    0x01ebc627
  0x01ebc61a: mov    $0x1dc2668,%edi
  0x01ebc61f: cmp    %edi,%eax
  0x01ebc621: jb     0x01ebc652
  0x01ebc627: mov    $0x1ead380,%edi
  0x01ebc62c: cmp    %edi,%eax
  0x01ebc62e: jbe    0x01ebc641
  0x01ebc634: mov    $0x1eb2970,%edi
  0x01ebc639: cmp    %edi,%eax
  0x01ebc63b: jb     0x01ebc652
  ;; i2c adapter must return to an interpreter frame
  0x01ebc641: push   $0x55ce723c
  0x01ebc646: call   0x01ebc64b
  0x01ebc64b: pusha  
  0x01ebc64c: call   0x557bdbf0
  0x01ebc651: hlt    
  ;; } verify_i2ce 
  0x01ebc652: mov    %esp,%edi
  0x01ebc654: and    $0xfffffff0,%esp
  0x01ebc657: push   %eax
  0x01ebc658: mov    %edi,%eax
  0x01ebc65a: mov    0x2c(%ebx),%edi
  0x01ebc65d: movss  0xc(%eax),%xmm1
  0x01ebc662: movsd  0x4(%eax),%xmm0
  0x01ebc667: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebc66f: mov    -0xc(%eax),%eax
  0x01ebc672: mov    %ebx,0x168(%eax)
  0x01ebc678: mov    %ebx,%eax
  0x01ebc67a: jmp    *%edi
  0x01ebc67c: mov    0x4(%ecx),%ebx
  0x01ebc67f: cmp    0x8(%eax),%ebx
  0x01ebc682: mov    0x4(%eax),%ebx
  0x01ebc685: jne    0x01ebc698
  0x01ebc68b: cmpl   $0x0,0x30(%ebx)
  0x01ebc692: je     0x01ebc6d7
  0x01ebc698: jmp    0x01ea32d0
  0x01ebc69d: cmpl   $0x0,0x30(%ebx)
  0x01ebc6a4: je     0x01ebc6d7
  0x01ebc6aa: mov    (%esp),%eax
  0x01ebc6ad: pusha  
  0x01ebc6ae: pushf  
  0x01ebc6af: sub    $0x10,%esp
  0x01ebc6b2: movsd  %xmm0,(%esp)
  0x01ebc6b7: movsd  %xmm1,0x8(%esp)
  0x01ebc6bd: push   %eax
  0x01ebc6be: push   %ebx
  0x01ebc6bf: call   0x55be79d0
  0x01ebc6c4: add    $0x8,%esp
  0x01ebc6c7: movsd  (%esp),%xmm0
  0x01ebc6cc: movsd  0x8(%esp),%xmm1
  0x01ebc6d2: add    $0x10,%esp
  0x01ebc6d5: popf   
  0x01ebc6d6: popa   
  0x01ebc6d7: pop    %eax
  0x01ebc6d8: mov    %esp,%esi
  0x01ebc6da: sub    $0xc,%esp
  0x01ebc6dd: movss  %xmm1,0x8(%esp)
  0x01ebc6e3: movsd  %xmm0,(%esp)
  0x01ebc6e8: mov    0x24(%ebx),%ecx
  0x01ebc6eb: push   %eax
  0x01ebc6ec: jmp    *%ecx

AHE@0x018f9c9c: 0xbebe0000 i2c: 0x01ebc770 c2i: 0x01ebc832 c2iUV: 0x01ebc811
i2c argument handler #42 for: static (JJ)J (295 bytes generated)
c2i argument handler starts at 01EBC832
  0x01ebc770: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebc773: mov    $0x1dc2940,%edi
  0x01ebc778: cmp    %edi,%eax
  0x01ebc77a: jbe    0x01ebc78d
  0x01ebc780: mov    $0x1ea2940,%edi
  0x01ebc785: cmp    %edi,%eax
  0x01ebc787: jb     0x01ebc7d2
  0x01ebc78d: mov    $0x1dc0340,%edi
  0x01ebc792: cmp    %edi,%eax
  0x01ebc794: jbe    0x01ebc7a7
  0x01ebc79a: mov    $0x1dc2668,%edi
  0x01ebc79f: cmp    %edi,%eax
  0x01ebc7a1: jb     0x01ebc7d2
  0x01ebc7a7: mov    $0x1ead380,%edi
  0x01ebc7ac: cmp    %edi,%eax
  0x01ebc7ae: jbe    0x01ebc7c1
  0x01ebc7b4: mov    $0x1eb2970,%edi
  0x01ebc7b9: cmp    %edi,%eax
  0x01ebc7bb: jb     0x01ebc7d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebc7c1: push   $0x55ce723c
  0x01ebc7c6: call   0x01ebc7cb
  0x01ebc7cb: pusha  
  0x01ebc7cc: call   0x557bdbf0
  0x01ebc7d1: hlt    
  ;; } verify_i2ce 
  0x01ebc7d2: mov    %esp,%edi
  0x01ebc7d4: sub    $0x10,%esp
  0x01ebc7d7: and    $0xfffffff0,%esp
  0x01ebc7da: push   %eax
  0x01ebc7db: mov    %edi,%eax
  0x01ebc7dd: mov    0x2c(%ebx),%edi
  0x01ebc7e0: mov    0xc(%eax),%esi
  0x01ebc7e3: mov    %esi,0x4(%esp)
  0x01ebc7e7: mov    0x10(%eax),%esi
  0x01ebc7ea: mov    %esi,0x8(%esp)
  0x01ebc7ee: mov    0x4(%eax),%esi
  0x01ebc7f1: mov    %esi,0xc(%esp)
  0x01ebc7f5: mov    0x8(%eax),%esi
  0x01ebc7f8: mov    %esi,0x10(%esp)
  0x01ebc7fc: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebc804: mov    -0xc(%eax),%eax
  0x01ebc807: mov    %ebx,0x168(%eax)
  0x01ebc80d: mov    %ebx,%eax
  0x01ebc80f: jmp    *%edi
  0x01ebc811: mov    0x4(%ecx),%ebx
  0x01ebc814: cmp    0x8(%eax),%ebx
  0x01ebc817: mov    0x4(%eax),%ebx
  0x01ebc81a: jne    0x01ebc82d
  0x01ebc820: cmpl   $0x0,0x30(%ebx)
  0x01ebc827: je     0x01ebc86c
  0x01ebc82d: jmp    0x01ea32d0
  0x01ebc832: cmpl   $0x0,0x30(%ebx)
  0x01ebc839: je     0x01ebc86c
  0x01ebc83f: mov    (%esp),%eax
  0x01ebc842: pusha  
  0x01ebc843: pushf  
  0x01ebc844: sub    $0x10,%esp
  0x01ebc847: movsd  %xmm0,(%esp)
  0x01ebc84c: movsd  %xmm1,0x8(%esp)
  0x01ebc852: push   %eax
  0x01ebc853: push   %ebx
  0x01ebc854: call   0x55be79d0
  0x01ebc859: add    $0x8,%esp
  0x01ebc85c: movsd  (%esp),%xmm0
  0x01ebc861: movsd  0x8(%esp),%xmm1
  0x01ebc867: add    $0x10,%esp
  0x01ebc86a: popf   
  0x01ebc86b: popa   
  0x01ebc86c: pop    %eax
  0x01ebc86d: mov    %esp,%esi
  0x01ebc86f: sub    $0x10,%esp
  0x01ebc872: mov    0x10(%esp),%edi
  0x01ebc876: mov    %edi,0x8(%esp)
  0x01ebc87a: mov    0x14(%esp),%edi
  0x01ebc87e: mov    %edi,0xc(%esp)
  0x01ebc882: mov    0x18(%esp),%edi
  0x01ebc886: mov    %edi,(%esp)
  0x01ebc889: mov    0x1c(%esp),%edi
  0x01ebc88d: mov    %edi,0x4(%esp)
  0x01ebc891: mov    0x24(%ebx),%ecx
  0x01ebc894: push   %eax
  0x01ebc895: jmp    *%ecx

AHE@0x018f9cc8: 0x6a000000 i2c: 0x01ebc930 c2i: 0x01ebc9db c2iUV: 0x01ebc9ba
i2c argument handler #43 for: static (FI)F (250 bytes generated)
c2i argument handler starts at 01EBC9DB
  0x01ebc930: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebc933: mov    $0x1dc2940,%edi
  0x01ebc938: cmp    %edi,%eax
  0x01ebc93a: jbe    0x01ebc94d
  0x01ebc940: mov    $0x1ea2940,%edi
  0x01ebc945: cmp    %edi,%eax
  0x01ebc947: jb     0x01ebc992
  0x01ebc94d: mov    $0x1dc0340,%edi
  0x01ebc952: cmp    %edi,%eax
  0x01ebc954: jbe    0x01ebc967
  0x01ebc95a: mov    $0x1dc2668,%edi
  0x01ebc95f: cmp    %edi,%eax
  0x01ebc961: jb     0x01ebc992
  0x01ebc967: mov    $0x1ead380,%edi
  0x01ebc96c: cmp    %edi,%eax
  0x01ebc96e: jbe    0x01ebc981
  0x01ebc974: mov    $0x1eb2970,%edi
  0x01ebc979: cmp    %edi,%eax
  0x01ebc97b: jb     0x01ebc992
  ;; i2c adapter must return to an interpreter frame
  0x01ebc981: push   $0x55ce723c
  0x01ebc986: call   0x01ebc98b
  0x01ebc98b: pusha  
  0x01ebc98c: call   0x557bdbf0
  0x01ebc991: hlt    
  ;; } verify_i2ce 
  0x01ebc992: mov    %esp,%edi
  0x01ebc994: and    $0xfffffff0,%esp
  0x01ebc997: push   %eax
  0x01ebc998: mov    %edi,%eax
  0x01ebc99a: mov    0x2c(%ebx),%edi
  0x01ebc99d: movss  0x8(%eax),%xmm0
  0x01ebc9a2: mov    0x4(%eax),%ecx
  0x01ebc9a5: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebc9ad: mov    -0xc(%eax),%eax
  0x01ebc9b0: mov    %ebx,0x168(%eax)
  0x01ebc9b6: mov    %ebx,%eax
  0x01ebc9b8: jmp    *%edi
  0x01ebc9ba: mov    0x4(%ecx),%ebx
  0x01ebc9bd: cmp    0x8(%eax),%ebx
  0x01ebc9c0: mov    0x4(%eax),%ebx
  0x01ebc9c3: jne    0x01ebc9d6
  0x01ebc9c9: cmpl   $0x0,0x30(%ebx)
  0x01ebc9d0: je     0x01ebca15
  0x01ebc9d6: jmp    0x01ea32d0
  0x01ebc9db: cmpl   $0x0,0x30(%ebx)
  0x01ebc9e2: je     0x01ebca15
  0x01ebc9e8: mov    (%esp),%eax
  0x01ebc9eb: pusha  
  0x01ebc9ec: pushf  
  0x01ebc9ed: sub    $0x10,%esp
  0x01ebc9f0: movsd  %xmm0,(%esp)
  0x01ebc9f5: movsd  %xmm1,0x8(%esp)
  0x01ebc9fb: push   %eax
  0x01ebc9fc: push   %ebx
  0x01ebc9fd: call   0x55be79d0
  0x01ebca02: add    $0x8,%esp
  0x01ebca05: movsd  (%esp),%xmm0
  0x01ebca0a: movsd  0x8(%esp),%xmm1
  0x01ebca10: add    $0x10,%esp
  0x01ebca13: popf   
  0x01ebca14: popa   
  0x01ebca15: pop    %eax
  0x01ebca16: mov    %esp,%esi
  0x01ebca18: sub    $0x8,%esp
  0x01ebca1b: movss  %xmm0,0x4(%esp)
  0x01ebca21: mov    %ecx,(%esp)
  0x01ebca24: mov    0x24(%ebx),%ecx
  0x01ebca27: push   %eax
  0x01ebca28: jmp    *%ecx

AHE@0x018f9cf4: 0x7ea00000 i2c: 0x01ebcab0 c2i: 0x01ebcb5b c2iUV: 0x01ebcb3a
i2c argument handler #44 for: static (DI)D (250 bytes generated)
c2i argument handler starts at 01EBCB5B
  0x01ebcab0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebcab3: mov    $0x1dc2940,%edi
  0x01ebcab8: cmp    %edi,%eax
  0x01ebcaba: jbe    0x01ebcacd
  0x01ebcac0: mov    $0x1ea2940,%edi
  0x01ebcac5: cmp    %edi,%eax
  0x01ebcac7: jb     0x01ebcb12
  0x01ebcacd: mov    $0x1dc0340,%edi
  0x01ebcad2: cmp    %edi,%eax
  0x01ebcad4: jbe    0x01ebcae7
  0x01ebcada: mov    $0x1dc2668,%edi
  0x01ebcadf: cmp    %edi,%eax
  0x01ebcae1: jb     0x01ebcb12
  0x01ebcae7: mov    $0x1ead380,%edi
  0x01ebcaec: cmp    %edi,%eax
  0x01ebcaee: jbe    0x01ebcb01
  0x01ebcaf4: mov    $0x1eb2970,%edi
  0x01ebcaf9: cmp    %edi,%eax
  0x01ebcafb: jb     0x01ebcb12
  ;; i2c adapter must return to an interpreter frame
  0x01ebcb01: push   $0x55ce723c
  0x01ebcb06: call   0x01ebcb0b
  0x01ebcb0b: pusha  
  0x01ebcb0c: call   0x557bdbf0
  0x01ebcb11: hlt    
  ;; } verify_i2ce 
  0x01ebcb12: mov    %esp,%edi
  0x01ebcb14: and    $0xfffffff0,%esp
  0x01ebcb17: push   %eax
  0x01ebcb18: mov    %edi,%eax
  0x01ebcb1a: mov    0x2c(%ebx),%edi
  0x01ebcb1d: movsd  0x8(%eax),%xmm0
  0x01ebcb22: mov    0x4(%eax),%ecx
  0x01ebcb25: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebcb2d: mov    -0xc(%eax),%eax
  0x01ebcb30: mov    %ebx,0x168(%eax)
  0x01ebcb36: mov    %ebx,%eax
  0x01ebcb38: jmp    *%edi
  0x01ebcb3a: mov    0x4(%ecx),%ebx
  0x01ebcb3d: cmp    0x8(%eax),%ebx
  0x01ebcb40: mov    0x4(%eax),%ebx
  0x01ebcb43: jne    0x01ebcb56
  0x01ebcb49: cmpl   $0x0,0x30(%ebx)
  0x01ebcb50: je     0x01ebcb95
  0x01ebcb56: jmp    0x01ea32d0
  0x01ebcb5b: cmpl   $0x0,0x30(%ebx)
  0x01ebcb62: je     0x01ebcb95
  0x01ebcb68: mov    (%esp),%eax
  0x01ebcb6b: pusha  
  0x01ebcb6c: pushf  
  0x01ebcb6d: sub    $0x10,%esp
  0x01ebcb70: movsd  %xmm0,(%esp)
  0x01ebcb75: movsd  %xmm1,0x8(%esp)
  0x01ebcb7b: push   %eax
  0x01ebcb7c: push   %ebx
  0x01ebcb7d: call   0x55be79d0
  0x01ebcb82: add    $0x8,%esp
  0x01ebcb85: movsd  (%esp),%xmm0
  0x01ebcb8a: movsd  0x8(%esp),%xmm1
  0x01ebcb90: add    $0x10,%esp
  0x01ebcb93: popf   
  0x01ebcb94: popa   
  0x01ebcb95: pop    %eax
  0x01ebcb96: mov    %esp,%esi
  0x01ebcb98: sub    $0xc,%esp
  0x01ebcb9b: movsd  %xmm0,0x4(%esp)
  0x01ebcba1: mov    %ecx,(%esp)
  0x01ebcba4: mov    0x24(%ebx),%ecx
  0x01ebcba7: push   %eax
  0x01ebcba8: jmp    *%ecx

AHE@0x018f9d20: 0xaa7e0000 i2c: 0x01ebcc30 c2i: 0x01ebccde c2iUV: 0x01ebccbd
i2c argument handler #45 for: receiver (Ljava/lang/Object;D)V (257 bytes generated)
c2i argument handler starts at 01EBCCDE
  0x01ebcc30: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebcc33: mov    $0x1dc2940,%edi
  0x01ebcc38: cmp    %edi,%eax
  0x01ebcc3a: jbe    0x01ebcc4d
  0x01ebcc40: mov    $0x1ea2940,%edi
  0x01ebcc45: cmp    %edi,%eax
  0x01ebcc47: jb     0x01ebcc92
  0x01ebcc4d: mov    $0x1dc0340,%edi
  0x01ebcc52: cmp    %edi,%eax
  0x01ebcc54: jbe    0x01ebcc67
  0x01ebcc5a: mov    $0x1dc2668,%edi
  0x01ebcc5f: cmp    %edi,%eax
  0x01ebcc61: jb     0x01ebcc92
  0x01ebcc67: mov    $0x1ead380,%edi
  0x01ebcc6c: cmp    %edi,%eax
  0x01ebcc6e: jbe    0x01ebcc81
  0x01ebcc74: mov    $0x1eb2970,%edi
  0x01ebcc79: cmp    %edi,%eax
  0x01ebcc7b: jb     0x01ebcc92
  ;; i2c adapter must return to an interpreter frame
  0x01ebcc81: push   $0x55ce723c
  0x01ebcc86: call   0x01ebcc8b
  0x01ebcc8b: pusha  
  0x01ebcc8c: call   0x557bdbf0
  0x01ebcc91: hlt    
  ;; } verify_i2ce 
  0x01ebcc92: mov    %esp,%edi
  0x01ebcc94: and    $0xfffffff0,%esp
  0x01ebcc97: push   %eax
  0x01ebcc98: mov    %edi,%eax
  0x01ebcc9a: mov    0x2c(%ebx),%edi
  0x01ebcc9d: mov    0x10(%eax),%ecx
  0x01ebcca0: mov    0xc(%eax),%edx
  0x01ebcca3: movsd  0x4(%eax),%xmm0
  0x01ebcca8: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebccb0: mov    -0xc(%eax),%eax
  0x01ebccb3: mov    %ebx,0x168(%eax)
  0x01ebccb9: mov    %ebx,%eax
  0x01ebccbb: jmp    *%edi
  0x01ebccbd: mov    0x4(%ecx),%ebx
  0x01ebccc0: cmp    0x8(%eax),%ebx
  0x01ebccc3: mov    0x4(%eax),%ebx
  0x01ebccc6: jne    0x01ebccd9
  0x01ebcccc: cmpl   $0x0,0x30(%ebx)
  0x01ebccd3: je     0x01ebcd18
  0x01ebccd9: jmp    0x01ea32d0
  0x01ebccde: cmpl   $0x0,0x30(%ebx)
  0x01ebcce5: je     0x01ebcd18
  0x01ebcceb: mov    (%esp),%eax
  0x01ebccee: pusha  
  0x01ebccef: pushf  
  0x01ebccf0: sub    $0x10,%esp
  0x01ebccf3: movsd  %xmm0,(%esp)
  0x01ebccf8: movsd  %xmm1,0x8(%esp)
  0x01ebccfe: push   %eax
  0x01ebccff: push   %ebx
  0x01ebcd00: call   0x55be79d0
  0x01ebcd05: add    $0x8,%esp
  0x01ebcd08: movsd  (%esp),%xmm0
  0x01ebcd0d: movsd  0x8(%esp),%xmm1
  0x01ebcd13: add    $0x10,%esp
  0x01ebcd16: popf   
  0x01ebcd17: popa   
  0x01ebcd18: pop    %eax
  0x01ebcd19: mov    %esp,%esi
  0x01ebcd1b: sub    $0x10,%esp
  0x01ebcd1e: mov    %ecx,0xc(%esp)
  0x01ebcd22: mov    %edx,0x8(%esp)
  0x01ebcd26: movsd  %xmm0,(%esp)
  0x01ebcd2b: mov    0x24(%ebx),%ecx
  0x01ebcd2e: push   %eax
  0x01ebcd2f: jmp    *%ecx

AHE@0x018f9d4c: 0xaa660000 i2c: 0x01ebcdb0 c2i: 0x01ebce63 c2iUV: 0x01ebce42
i2c argument handler #46 for: receiver (Ljava/nio/charset/Charset;FF)V (268 bytes generated)
c2i argument handler starts at 01EBCE63
  0x01ebcdb0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebcdb3: mov    $0x1dc2940,%edi
  0x01ebcdb8: cmp    %edi,%eax
  0x01ebcdba: jbe    0x01ebcdcd
  0x01ebcdc0: mov    $0x1ea2940,%edi
  0x01ebcdc5: cmp    %edi,%eax
  0x01ebcdc7: jb     0x01ebce12
  0x01ebcdcd: mov    $0x1dc0340,%edi
  0x01ebcdd2: cmp    %edi,%eax
  0x01ebcdd4: jbe    0x01ebcde7
  0x01ebcdda: mov    $0x1dc2668,%edi
  0x01ebcddf: cmp    %edi,%eax
  0x01ebcde1: jb     0x01ebce12
  0x01ebcde7: mov    $0x1ead380,%edi
  0x01ebcdec: cmp    %edi,%eax
  0x01ebcdee: jbe    0x01ebce01
  0x01ebcdf4: mov    $0x1eb2970,%edi
  0x01ebcdf9: cmp    %edi,%eax
  0x01ebcdfb: jb     0x01ebce12
  ;; i2c adapter must return to an interpreter frame
  0x01ebce01: push   $0x55ce723c
  0x01ebce06: call   0x01ebce0b
  0x01ebce0b: pusha  
  0x01ebce0c: call   0x557bdbf0
  0x01ebce11: hlt    
  ;; } verify_i2ce 
  0x01ebce12: mov    %esp,%edi
  0x01ebce14: and    $0xfffffff0,%esp
  0x01ebce17: push   %eax
  0x01ebce18: mov    %edi,%eax
  0x01ebce1a: mov    0x2c(%ebx),%edi
  0x01ebce1d: mov    0x10(%eax),%ecx
  0x01ebce20: mov    0xc(%eax),%edx
  0x01ebce23: movss  0x8(%eax),%xmm0
  0x01ebce28: movss  0x4(%eax),%xmm1
  0x01ebce2d: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebce35: mov    -0xc(%eax),%eax
  0x01ebce38: mov    %ebx,0x168(%eax)
  0x01ebce3e: mov    %ebx,%eax
  0x01ebce40: jmp    *%edi
  0x01ebce42: mov    0x4(%ecx),%ebx
  0x01ebce45: cmp    0x8(%eax),%ebx
  0x01ebce48: mov    0x4(%eax),%ebx
  0x01ebce4b: jne    0x01ebce5e
  0x01ebce51: cmpl   $0x0,0x30(%ebx)
  0x01ebce58: je     0x01ebce9d
  0x01ebce5e: jmp    0x01ea32d0
  0x01ebce63: cmpl   $0x0,0x30(%ebx)
  0x01ebce6a: je     0x01ebce9d
  0x01ebce70: mov    (%esp),%eax
  0x01ebce73: pusha  
  0x01ebce74: pushf  
  0x01ebce75: sub    $0x10,%esp
  0x01ebce78: movsd  %xmm0,(%esp)
  0x01ebce7d: movsd  %xmm1,0x8(%esp)
  0x01ebce83: push   %eax
  0x01ebce84: push   %ebx
  0x01ebce85: call   0x55be79d0
  0x01ebce8a: add    $0x8,%esp
  0x01ebce8d: movsd  (%esp),%xmm0
  0x01ebce92: movsd  0x8(%esp),%xmm1
  0x01ebce98: add    $0x10,%esp
  0x01ebce9b: popf   
  0x01ebce9c: popa   
  0x01ebce9d: pop    %eax
  0x01ebce9e: mov    %esp,%esi
  0x01ebcea0: sub    $0x10,%esp
  0x01ebcea3: mov    %ecx,0xc(%esp)
  0x01ebcea7: mov    %edx,0x8(%esp)
  0x01ebceab: movss  %xmm0,0x4(%esp)
  0x01ebceb1: movss  %xmm1,(%esp)
  0x01ebceb6: mov    0x24(%ebx),%ecx
  0x01ebceb9: push   %eax
  0x01ebceba: jmp    *%ecx

AHE@0x018f9d78: 0xaa66a000 i2c: 0x01ebcf30 c2i: 0x01ebcfed c2iUV: 0x01ebcfcc
i2c argument handler #47 for: receiver (Ljava/nio/charset/Charset;FFLjava/lang/String;)V (286 bytes generated)
c2i argument handler starts at 01EBCFED
  0x01ebcf30: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebcf33: mov    $0x1dc2940,%edi
  0x01ebcf38: cmp    %edi,%eax
  0x01ebcf3a: jbe    0x01ebcf4d
  0x01ebcf40: mov    $0x1ea2940,%edi
  0x01ebcf45: cmp    %edi,%eax
  0x01ebcf47: jb     0x01ebcf92
  0x01ebcf4d: mov    $0x1dc0340,%edi
  0x01ebcf52: cmp    %edi,%eax
  0x01ebcf54: jbe    0x01ebcf67
  0x01ebcf5a: mov    $0x1dc2668,%edi
  0x01ebcf5f: cmp    %edi,%eax
  0x01ebcf61: jb     0x01ebcf92
  0x01ebcf67: mov    $0x1ead380,%edi
  0x01ebcf6c: cmp    %edi,%eax
  0x01ebcf6e: jbe    0x01ebcf81
  0x01ebcf74: mov    $0x1eb2970,%edi
  0x01ebcf79: cmp    %edi,%eax
  0x01ebcf7b: jb     0x01ebcf92
  ;; i2c adapter must return to an interpreter frame
  0x01ebcf81: push   $0x55ce723c
  0x01ebcf86: call   0x01ebcf8b
  0x01ebcf8b: pusha  
  0x01ebcf8c: call   0x557bdbf0
  0x01ebcf91: hlt    
  ;; } verify_i2ce 
  0x01ebcf92: mov    %esp,%edi
  0x01ebcf94: sub    $0x8,%esp
  0x01ebcf97: and    $0xfffffff0,%esp
  0x01ebcf9a: push   %eax
  0x01ebcf9b: mov    %edi,%eax
  0x01ebcf9d: mov    0x2c(%ebx),%edi
  0x01ebcfa0: mov    0x14(%eax),%ecx
  0x01ebcfa3: mov    0x10(%eax),%edx
  0x01ebcfa6: movss  0xc(%eax),%xmm0
  0x01ebcfab: movss  0x8(%eax),%xmm1
  0x01ebcfb0: mov    0x4(%eax),%esi
  0x01ebcfb3: mov    %esi,0x4(%esp)
  0x01ebcfb7: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebcfbf: mov    -0xc(%eax),%eax
  0x01ebcfc2: mov    %ebx,0x168(%eax)
  0x01ebcfc8: mov    %ebx,%eax
  0x01ebcfca: jmp    *%edi
  0x01ebcfcc: mov    0x4(%ecx),%ebx
  0x01ebcfcf: cmp    0x8(%eax),%ebx
  0x01ebcfd2: mov    0x4(%eax),%ebx
  0x01ebcfd5: jne    0x01ebcfe8
  0x01ebcfdb: cmpl   $0x0,0x30(%ebx)
  0x01ebcfe2: je     0x01ebd027
  0x01ebcfe8: jmp    0x01ea32d0
  0x01ebcfed: cmpl   $0x0,0x30(%ebx)
  0x01ebcff4: je     0x01ebd027
  0x01ebcffa: mov    (%esp),%eax
  0x01ebcffd: pusha  
  0x01ebcffe: pushf  
  0x01ebcfff: sub    $0x10,%esp
  0x01ebd002: movsd  %xmm0,(%esp)
  0x01ebd007: movsd  %xmm1,0x8(%esp)
  0x01ebd00d: push   %eax
  0x01ebd00e: push   %ebx
  0x01ebd00f: call   0x55be79d0
  0x01ebd014: add    $0x8,%esp
  0x01ebd017: movsd  (%esp),%xmm0
  0x01ebd01c: movsd  0x8(%esp),%xmm1
  0x01ebd022: add    $0x10,%esp
  0x01ebd025: popf   
  0x01ebd026: popa   
  0x01ebd027: pop    %eax
  0x01ebd028: mov    %esp,%esi
  0x01ebd02a: sub    $0x14,%esp
  0x01ebd02d: mov    %ecx,0x10(%esp)
  0x01ebd031: mov    %edx,0xc(%esp)
  0x01ebd035: movss  %xmm0,0x8(%esp)
  0x01ebd03b: movss  %xmm1,0x4(%esp)
  0x01ebd041: mov    0x14(%esp),%edi
  0x01ebd045: mov    %edi,(%esp)
  0x01ebd048: mov    0x24(%ebx),%ecx
  0x01ebd04b: push   %eax
  0x01ebd04c: jmp    *%ecx

AHE@0x018f9da4: 0xaa66aaaa i2c: 0x01ebd0f0 c2i: 0x01ebd1c2 c2iUV: 0x01ebd1a1
i2c argument handler #48 for: receiver (Ljava/nio/charset/Charset;FF[[C[CII)V (331 bytes generated)
c2i argument handler starts at 01EBD1C2
  0x01ebd0f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebd0f3: mov    $0x1dc2940,%edi
  0x01ebd0f8: cmp    %edi,%eax
  0x01ebd0fa: jbe    0x01ebd10d
  0x01ebd100: mov    $0x1ea2940,%edi
  0x01ebd105: cmp    %edi,%eax
  0x01ebd107: jb     0x01ebd152
  0x01ebd10d: mov    $0x1dc0340,%edi
  0x01ebd112: cmp    %edi,%eax
  0x01ebd114: jbe    0x01ebd127
  0x01ebd11a: mov    $0x1dc2668,%edi
  0x01ebd11f: cmp    %edi,%eax
  0x01ebd121: jb     0x01ebd152
  0x01ebd127: mov    $0x1ead380,%edi
  0x01ebd12c: cmp    %edi,%eax
  0x01ebd12e: jbe    0x01ebd141
  0x01ebd134: mov    $0x1eb2970,%edi
  0x01ebd139: cmp    %edi,%eax
  0x01ebd13b: jb     0x01ebd152
  ;; i2c adapter must return to an interpreter frame
  0x01ebd141: push   $0x55ce723c
  0x01ebd146: call   0x01ebd14b
  0x01ebd14b: pusha  
  0x01ebd14c: call   0x557bdbf0
  0x01ebd151: hlt    
  ;; } verify_i2ce 
  0x01ebd152: mov    %esp,%edi
  0x01ebd154: sub    $0x10,%esp
  0x01ebd157: and    $0xfffffff0,%esp
  0x01ebd15a: push   %eax
  0x01ebd15b: mov    %edi,%eax
  0x01ebd15d: mov    0x2c(%ebx),%edi
  0x01ebd160: mov    0x20(%eax),%ecx
  0x01ebd163: mov    0x1c(%eax),%edx
  0x01ebd166: movss  0x18(%eax),%xmm0
  0x01ebd16b: movss  0x14(%eax),%xmm1
  0x01ebd170: mov    0x10(%eax),%esi
  0x01ebd173: mov    %esi,0x4(%esp)
  0x01ebd177: mov    0xc(%eax),%esi
  0x01ebd17a: mov    %esi,0x8(%esp)
  0x01ebd17e: mov    0x8(%eax),%esi
  0x01ebd181: mov    %esi,0xc(%esp)
  0x01ebd185: mov    0x4(%eax),%esi
  0x01ebd188: mov    %esi,0x10(%esp)
  0x01ebd18c: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebd194: mov    -0xc(%eax),%eax
  0x01ebd197: mov    %ebx,0x168(%eax)
  0x01ebd19d: mov    %ebx,%eax
  0x01ebd19f: jmp    *%edi
  0x01ebd1a1: mov    0x4(%ecx),%ebx
  0x01ebd1a4: cmp    0x8(%eax),%ebx
  0x01ebd1a7: mov    0x4(%eax),%ebx
  0x01ebd1aa: jne    0x01ebd1bd
  0x01ebd1b0: cmpl   $0x0,0x30(%ebx)
  0x01ebd1b7: je     0x01ebd1fc
  0x01ebd1bd: jmp    0x01ea32d0
  0x01ebd1c2: cmpl   $0x0,0x30(%ebx)
  0x01ebd1c9: je     0x01ebd1fc
  0x01ebd1cf: mov    (%esp),%eax
  0x01ebd1d2: pusha  
  0x01ebd1d3: pushf  
  0x01ebd1d4: sub    $0x10,%esp
  0x01ebd1d7: movsd  %xmm0,(%esp)
  0x01ebd1dc: movsd  %xmm1,0x8(%esp)
  0x01ebd1e2: push   %eax
  0x01ebd1e3: push   %ebx
  0x01ebd1e4: call   0x55be79d0
  0x01ebd1e9: add    $0x8,%esp
  0x01ebd1ec: movsd  (%esp),%xmm0
  0x01ebd1f1: movsd  0x8(%esp),%xmm1
  0x01ebd1f7: add    $0x10,%esp
  0x01ebd1fa: popf   
  0x01ebd1fb: popa   
  0x01ebd1fc: pop    %eax
  0x01ebd1fd: mov    %esp,%esi
  0x01ebd1ff: sub    $0x20,%esp
  0x01ebd202: mov    %ecx,0x1c(%esp)
  0x01ebd206: mov    %edx,0x18(%esp)
  0x01ebd20a: movss  %xmm0,0x14(%esp)
  0x01ebd210: movss  %xmm1,0x10(%esp)
  0x01ebd216: mov    0x20(%esp),%edi
  0x01ebd21a: mov    %edi,0xc(%esp)
  0x01ebd21e: mov    0x24(%esp),%edi
  0x01ebd222: mov    %edi,0x8(%esp)
  0x01ebd226: mov    0x28(%esp),%edi
  0x01ebd22a: mov    %edi,0x4(%esp)
  0x01ebd22e: mov    0x2c(%esp),%edi
  0x01ebd232: mov    %edi,(%esp)
  0x01ebd235: mov    0x24(%ebx),%ecx
  0x01ebd238: push   %eax
  0x01ebd239: jmp    *%ecx

AHE@0x018f9dd0: 0xaa66aaa0 i2c: 0x01ebd2b0 c2i: 0x01ebd37b c2iUV: 0x01ebd35a
i2c argument handler #49 for: receiver (Ljava/nio/charset/Charset;FF[B[C[C)V (316 bytes generated)
c2i argument handler starts at 01EBD37B
  0x01ebd2b0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebd2b3: mov    $0x1dc2940,%edi
  0x01ebd2b8: cmp    %edi,%eax
  0x01ebd2ba: jbe    0x01ebd2cd
  0x01ebd2c0: mov    $0x1ea2940,%edi
  0x01ebd2c5: cmp    %edi,%eax
  0x01ebd2c7: jb     0x01ebd312
  0x01ebd2cd: mov    $0x1dc0340,%edi
  0x01ebd2d2: cmp    %edi,%eax
  0x01ebd2d4: jbe    0x01ebd2e7
  0x01ebd2da: mov    $0x1dc2668,%edi
  0x01ebd2df: cmp    %edi,%eax
  0x01ebd2e1: jb     0x01ebd312
  0x01ebd2e7: mov    $0x1ead380,%edi
  0x01ebd2ec: cmp    %edi,%eax
  0x01ebd2ee: jbe    0x01ebd301
  0x01ebd2f4: mov    $0x1eb2970,%edi
  0x01ebd2f9: cmp    %edi,%eax
  0x01ebd2fb: jb     0x01ebd312
  ;; i2c adapter must return to an interpreter frame
  0x01ebd301: push   $0x55ce723c
  0x01ebd306: call   0x01ebd30b
  0x01ebd30b: pusha  
  0x01ebd30c: call   0x557bdbf0
  0x01ebd311: hlt    
  ;; } verify_i2ce 
  0x01ebd312: mov    %esp,%edi
  0x01ebd314: sub    $0x10,%esp
  0x01ebd317: and    $0xfffffff0,%esp
  0x01ebd31a: push   %eax
  0x01ebd31b: mov    %edi,%eax
  0x01ebd31d: mov    0x2c(%ebx),%edi
  0x01ebd320: mov    0x1c(%eax),%ecx
  0x01ebd323: mov    0x18(%eax),%edx
  0x01ebd326: movss  0x14(%eax),%xmm0
  0x01ebd32b: movss  0x10(%eax),%xmm1
  0x01ebd330: mov    0xc(%eax),%esi
  0x01ebd333: mov    %esi,0x4(%esp)
  0x01ebd337: mov    0x8(%eax),%esi
  0x01ebd33a: mov    %esi,0x8(%esp)
  0x01ebd33e: mov    0x4(%eax),%esi
  0x01ebd341: mov    %esi,0xc(%esp)
  0x01ebd345: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebd34d: mov    -0xc(%eax),%eax
  0x01ebd350: mov    %ebx,0x168(%eax)
  0x01ebd356: mov    %ebx,%eax
  0x01ebd358: jmp    *%edi
  0x01ebd35a: mov    0x4(%ecx),%ebx
  0x01ebd35d: cmp    0x8(%eax),%ebx
  0x01ebd360: mov    0x4(%eax),%ebx
  0x01ebd363: jne    0x01ebd376
  0x01ebd369: cmpl   $0x0,0x30(%ebx)
  0x01ebd370: je     0x01ebd3b5
  0x01ebd376: jmp    0x01ea32d0
  0x01ebd37b: cmpl   $0x0,0x30(%ebx)
  0x01ebd382: je     0x01ebd3b5
  0x01ebd388: mov    (%esp),%eax
  0x01ebd38b: pusha  
  0x01ebd38c: pushf  
  0x01ebd38d: sub    $0x10,%esp
  0x01ebd390: movsd  %xmm0,(%esp)
  0x01ebd395: movsd  %xmm1,0x8(%esp)
  0x01ebd39b: push   %eax
  0x01ebd39c: push   %ebx
  0x01ebd39d: call   0x55be79d0
  0x01ebd3a2: add    $0x8,%esp
  0x01ebd3a5: movsd  (%esp),%xmm0
  0x01ebd3aa: movsd  0x8(%esp),%xmm1
  0x01ebd3b0: add    $0x10,%esp
  0x01ebd3b3: popf   
  0x01ebd3b4: popa   
  0x01ebd3b5: pop    %eax
  0x01ebd3b6: mov    %esp,%esi
  0x01ebd3b8: sub    $0x1c,%esp
  0x01ebd3bb: mov    %ecx,0x18(%esp)
  0x01ebd3bf: mov    %edx,0x14(%esp)
  0x01ebd3c3: movss  %xmm0,0x10(%esp)
  0x01ebd3c9: movss  %xmm1,0xc(%esp)
  0x01ebd3cf: mov    0x1c(%esp),%edi
  0x01ebd3d3: mov    %edi,0x8(%esp)
  0x01ebd3d7: mov    0x20(%esp),%edi
  0x01ebd3db: mov    %edi,0x4(%esp)
  0x01ebd3df: mov    0x24(%esp),%edi
  0x01ebd3e3: mov    %edi,(%esp)
  0x01ebd3e6: mov    0x24(%ebx),%ecx
  0x01ebd3e9: push   %eax
  0x01ebd3ea: jmp    *%ecx

AHE@0x018f9dfc: 0xbe600000 i2c: 0x01ebd470 c2i: 0x01ebd529 c2iUV: 0x01ebd508
i2c argument handler #50 for: static (JF)V (276 bytes generated)
c2i argument handler starts at 01EBD529
  0x01ebd470: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebd473: mov    $0x1dc2940,%edi
  0x01ebd478: cmp    %edi,%eax
  0x01ebd47a: jbe    0x01ebd48d
  0x01ebd480: mov    $0x1ea2940,%edi
  0x01ebd485: cmp    %edi,%eax
  0x01ebd487: jb     0x01ebd4d2
  0x01ebd48d: mov    $0x1dc0340,%edi
  0x01ebd492: cmp    %edi,%eax
  0x01ebd494: jbe    0x01ebd4a7
  0x01ebd49a: mov    $0x1dc2668,%edi
  0x01ebd49f: cmp    %edi,%eax
  0x01ebd4a1: jb     0x01ebd4d2
  0x01ebd4a7: mov    $0x1ead380,%edi
  0x01ebd4ac: cmp    %edi,%eax
  0x01ebd4ae: jbe    0x01ebd4c1
  0x01ebd4b4: mov    $0x1eb2970,%edi
  0x01ebd4b9: cmp    %edi,%eax
  0x01ebd4bb: jb     0x01ebd4d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebd4c1: push   $0x55ce723c
  0x01ebd4c6: call   0x01ebd4cb
  0x01ebd4cb: pusha  
  0x01ebd4cc: call   0x557bdbf0
  0x01ebd4d1: hlt    
  ;; } verify_i2ce 
  0x01ebd4d2: mov    %esp,%edi
  0x01ebd4d4: sub    $0x8,%esp
  0x01ebd4d7: and    $0xfffffff0,%esp
  0x01ebd4da: push   %eax
  0x01ebd4db: mov    %edi,%eax
  0x01ebd4dd: mov    0x2c(%ebx),%edi
  0x01ebd4e0: mov    0x8(%eax),%esi
  0x01ebd4e3: mov    %esi,0x4(%esp)
  0x01ebd4e7: mov    0xc(%eax),%esi
  0x01ebd4ea: mov    %esi,0x8(%esp)
  0x01ebd4ee: movss  0x4(%eax),%xmm0
  0x01ebd4f3: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebd4fb: mov    -0xc(%eax),%eax
  0x01ebd4fe: mov    %ebx,0x168(%eax)
  0x01ebd504: mov    %ebx,%eax
  0x01ebd506: jmp    *%edi
  0x01ebd508: mov    0x4(%ecx),%ebx
  0x01ebd50b: cmp    0x8(%eax),%ebx
  0x01ebd50e: mov    0x4(%eax),%ebx
  0x01ebd511: jne    0x01ebd524
  0x01ebd517: cmpl   $0x0,0x30(%ebx)
  0x01ebd51e: je     0x01ebd563
  0x01ebd524: jmp    0x01ea32d0
  0x01ebd529: cmpl   $0x0,0x30(%ebx)
  0x01ebd530: je     0x01ebd563
  0x01ebd536: mov    (%esp),%eax
  0x01ebd539: pusha  
  0x01ebd53a: pushf  
  0x01ebd53b: sub    $0x10,%esp
  0x01ebd53e: movsd  %xmm0,(%esp)
  0x01ebd543: movsd  %xmm1,0x8(%esp)
  0x01ebd549: push   %eax
  0x01ebd54a: push   %ebx
  0x01ebd54b: call   0x55be79d0
  0x01ebd550: add    $0x8,%esp
  0x01ebd553: movsd  (%esp),%xmm0
  0x01ebd558: movsd  0x8(%esp),%xmm1
  0x01ebd55e: add    $0x10,%esp
  0x01ebd561: popf   
  0x01ebd562: popa   
  0x01ebd563: pop    %eax
  0x01ebd564: mov    %esp,%esi
  0x01ebd566: sub    $0xc,%esp
  0x01ebd569: mov    0xc(%esp),%edi
  0x01ebd56d: mov    %edi,0x4(%esp)
  0x01ebd571: mov    0x10(%esp),%edi
  0x01ebd575: mov    %edi,0x8(%esp)
  0x01ebd579: movss  %xmm0,(%esp)
  0x01ebd57e: mov    0x24(%ebx),%ecx
  0x01ebd581: push   %eax
  0x01ebd582: jmp    *%ecx

AHE@0x018f9e28: 0xbe7e0000 i2c: 0x01ebd630 c2i: 0x01ebd6e9 c2iUV: 0x01ebd6c8
i2c argument handler #51 for: static (JD)V (276 bytes generated)
c2i argument handler starts at 01EBD6E9
  0x01ebd630: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebd633: mov    $0x1dc2940,%edi
  0x01ebd638: cmp    %edi,%eax
  0x01ebd63a: jbe    0x01ebd64d
  0x01ebd640: mov    $0x1ea2940,%edi
  0x01ebd645: cmp    %edi,%eax
  0x01ebd647: jb     0x01ebd692
  0x01ebd64d: mov    $0x1dc0340,%edi
  0x01ebd652: cmp    %edi,%eax
  0x01ebd654: jbe    0x01ebd667
  0x01ebd65a: mov    $0x1dc2668,%edi
  0x01ebd65f: cmp    %edi,%eax
  0x01ebd661: jb     0x01ebd692
  0x01ebd667: mov    $0x1ead380,%edi
  0x01ebd66c: cmp    %edi,%eax
  0x01ebd66e: jbe    0x01ebd681
  0x01ebd674: mov    $0x1eb2970,%edi
  0x01ebd679: cmp    %edi,%eax
  0x01ebd67b: jb     0x01ebd692
  ;; i2c adapter must return to an interpreter frame
  0x01ebd681: push   $0x55ce723c
  0x01ebd686: call   0x01ebd68b
  0x01ebd68b: pusha  
  0x01ebd68c: call   0x557bdbf0
  0x01ebd691: hlt    
  ;; } verify_i2ce 
  0x01ebd692: mov    %esp,%edi
  0x01ebd694: sub    $0x8,%esp
  0x01ebd697: and    $0xfffffff0,%esp
  0x01ebd69a: push   %eax
  0x01ebd69b: mov    %edi,%eax
  0x01ebd69d: mov    0x2c(%ebx),%edi
  0x01ebd6a0: mov    0xc(%eax),%esi
  0x01ebd6a3: mov    %esi,0x4(%esp)
  0x01ebd6a7: mov    0x10(%eax),%esi
  0x01ebd6aa: mov    %esi,0x8(%esp)
  0x01ebd6ae: movsd  0x4(%eax),%xmm0
  0x01ebd6b3: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebd6bb: mov    -0xc(%eax),%eax
  0x01ebd6be: mov    %ebx,0x168(%eax)
  0x01ebd6c4: mov    %ebx,%eax
  0x01ebd6c6: jmp    *%edi
  0x01ebd6c8: mov    0x4(%ecx),%ebx
  0x01ebd6cb: cmp    0x8(%eax),%ebx
  0x01ebd6ce: mov    0x4(%eax),%ebx
  0x01ebd6d1: jne    0x01ebd6e4
  0x01ebd6d7: cmpl   $0x0,0x30(%ebx)
  0x01ebd6de: je     0x01ebd723
  0x01ebd6e4: jmp    0x01ea32d0
  0x01ebd6e9: cmpl   $0x0,0x30(%ebx)
  0x01ebd6f0: je     0x01ebd723
  0x01ebd6f6: mov    (%esp),%eax
  0x01ebd6f9: pusha  
  0x01ebd6fa: pushf  
  0x01ebd6fb: sub    $0x10,%esp
  0x01ebd6fe: movsd  %xmm0,(%esp)
  0x01ebd703: movsd  %xmm1,0x8(%esp)
  0x01ebd709: push   %eax
  0x01ebd70a: push   %ebx
  0x01ebd70b: call   0x55be79d0
  0x01ebd710: add    $0x8,%esp
  0x01ebd713: movsd  (%esp),%xmm0
  0x01ebd718: movsd  0x8(%esp),%xmm1
  0x01ebd71e: add    $0x10,%esp
  0x01ebd721: popf   
  0x01ebd722: popa   
  0x01ebd723: pop    %eax
  0x01ebd724: mov    %esp,%esi
  0x01ebd726: sub    $0x10,%esp
  0x01ebd729: mov    0x10(%esp),%edi
  0x01ebd72d: mov    %edi,0x8(%esp)
  0x01ebd731: mov    0x14(%esp),%edi
  0x01ebd735: mov    %edi,0xc(%esp)
  0x01ebd739: movsd  %xmm0,(%esp)
  0x01ebd73e: mov    0x24(%ebx),%ecx
  0x01ebd741: push   %eax
  0x01ebd742: jmp    *%ecx

AHE@0x018f9e54: 0xbeabebe0 i2c: 0x01ebd7f0 c2i: 0x01ebd8c3 c2iUV: 0x01ebd8a2
i2c argument handler #52 for: static (JLjava/lang/Object;JJ)V (332 bytes generated)
c2i argument handler starts at 01EBD8C3
  0x01ebd7f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebd7f3: mov    $0x1dc2940,%edi
  0x01ebd7f8: cmp    %edi,%eax
  0x01ebd7fa: jbe    0x01ebd80d
  0x01ebd800: mov    $0x1ea2940,%edi
  0x01ebd805: cmp    %edi,%eax
  0x01ebd807: jb     0x01ebd852
  0x01ebd80d: mov    $0x1dc0340,%edi
  0x01ebd812: cmp    %edi,%eax
  0x01ebd814: jbe    0x01ebd827
  0x01ebd81a: mov    $0x1dc2668,%edi
  0x01ebd81f: cmp    %edi,%eax
  0x01ebd821: jb     0x01ebd852
  0x01ebd827: mov    $0x1ead380,%edi
  0x01ebd82c: cmp    %edi,%eax
  0x01ebd82e: jbe    0x01ebd841
  0x01ebd834: mov    $0x1eb2970,%edi
  0x01ebd839: cmp    %edi,%eax
  0x01ebd83b: jb     0x01ebd852
  ;; i2c adapter must return to an interpreter frame
  0x01ebd841: push   $0x55ce723c
  0x01ebd846: call   0x01ebd84b
  0x01ebd84b: pusha  
  0x01ebd84c: call   0x557bdbf0
  0x01ebd851: hlt    
  ;; } verify_i2ce 
  0x01ebd852: mov    %esp,%edi
  0x01ebd854: sub    $0x18,%esp
  0x01ebd857: and    $0xfffffff0,%esp
  0x01ebd85a: push   %eax
  0x01ebd85b: mov    %edi,%eax
  0x01ebd85d: mov    0x2c(%ebx),%edi
  0x01ebd860: mov    0x18(%eax),%esi
  0x01ebd863: mov    %esi,0x4(%esp)
  0x01ebd867: mov    0x1c(%eax),%esi
  0x01ebd86a: mov    %esi,0x8(%esp)
  0x01ebd86e: mov    0x14(%eax),%ecx
  0x01ebd871: mov    0xc(%eax),%esi
  0x01ebd874: mov    %esi,0xc(%esp)
  0x01ebd878: mov    0x10(%eax),%esi
  0x01ebd87b: mov    %esi,0x10(%esp)
  0x01ebd87f: mov    0x4(%eax),%esi
  0x01ebd882: mov    %esi,0x14(%esp)
  0x01ebd886: mov    0x8(%eax),%esi
  0x01ebd889: mov    %esi,0x18(%esp)
  0x01ebd88d: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebd895: mov    -0xc(%eax),%eax
  0x01ebd898: mov    %ebx,0x168(%eax)
  0x01ebd89e: mov    %ebx,%eax
  0x01ebd8a0: jmp    *%edi
  0x01ebd8a2: mov    0x4(%ecx),%ebx
  0x01ebd8a5: cmp    0x8(%eax),%ebx
  0x01ebd8a8: mov    0x4(%eax),%ebx
  0x01ebd8ab: jne    0x01ebd8be
  0x01ebd8b1: cmpl   $0x0,0x30(%ebx)
  0x01ebd8b8: je     0x01ebd8fd
  0x01ebd8be: jmp    0x01ea32d0
  0x01ebd8c3: cmpl   $0x0,0x30(%ebx)
  0x01ebd8ca: je     0x01ebd8fd
  0x01ebd8d0: mov    (%esp),%eax
  0x01ebd8d3: pusha  
  0x01ebd8d4: pushf  
  0x01ebd8d5: sub    $0x10,%esp
  0x01ebd8d8: movsd  %xmm0,(%esp)
  0x01ebd8dd: movsd  %xmm1,0x8(%esp)
  0x01ebd8e3: push   %eax
  0x01ebd8e4: push   %ebx
  0x01ebd8e5: call   0x55be79d0
  0x01ebd8ea: add    $0x8,%esp
  0x01ebd8ed: movsd  (%esp),%xmm0
  0x01ebd8f2: movsd  0x8(%esp),%xmm1
  0x01ebd8f8: add    $0x10,%esp
  0x01ebd8fb: popf   
  0x01ebd8fc: popa   
  0x01ebd8fd: pop    %eax
  0x01ebd8fe: mov    %esp,%esi
  0x01ebd900: sub    $0x1c,%esp
  0x01ebd903: mov    0x1c(%esp),%edi
  0x01ebd907: mov    %edi,0x14(%esp)
  0x01ebd90b: mov    0x20(%esp),%edi
  0x01ebd90f: mov    %edi,0x18(%esp)
  0x01ebd913: mov    %ecx,0x10(%esp)
  0x01ebd917: mov    0x24(%esp),%edi
  0x01ebd91b: mov    %edi,0x8(%esp)
  0x01ebd91f: mov    0x28(%esp),%edi
  0x01ebd923: mov    %edi,0xc(%esp)
  0x01ebd927: mov    0x2c(%esp),%edi
  0x01ebd92b: mov    %edi,(%esp)
  0x01ebd92e: mov    0x30(%esp),%edi
  0x01ebd932: mov    %edi,0x4(%esp)
  0x01ebd936: mov    0x24(%ebx),%ecx
  0x01ebd939: push   %eax
  0x01ebd93a: jmp    *%ecx

AHE@0x018f9e80: 0xbeabebebe0000000 i2c: 0x01ebd9b0 c2i: 0x01ebda91 c2iUV: 0x01ebda70
i2c argument handler #53 for: static (JLjava/lang/Object;JJJ)V (362 bytes generated)
c2i argument handler starts at 01EBDA91
  0x01ebd9b0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebd9b3: mov    $0x1dc2940,%edi
  0x01ebd9b8: cmp    %edi,%eax
  0x01ebd9ba: jbe    0x01ebd9cd
  0x01ebd9c0: mov    $0x1ea2940,%edi
  0x01ebd9c5: cmp    %edi,%eax
  0x01ebd9c7: jb     0x01ebda12
  0x01ebd9cd: mov    $0x1dc0340,%edi
  0x01ebd9d2: cmp    %edi,%eax
  0x01ebd9d4: jbe    0x01ebd9e7
  0x01ebd9da: mov    $0x1dc2668,%edi
  0x01ebd9df: cmp    %edi,%eax
  0x01ebd9e1: jb     0x01ebda12
  0x01ebd9e7: mov    $0x1ead380,%edi
  0x01ebd9ec: cmp    %edi,%eax
  0x01ebd9ee: jbe    0x01ebda01
  0x01ebd9f4: mov    $0x1eb2970,%edi
  0x01ebd9f9: cmp    %edi,%eax
  0x01ebd9fb: jb     0x01ebda12
  ;; i2c adapter must return to an interpreter frame
  0x01ebda01: push   $0x55ce723c
  0x01ebda06: call   0x01ebda0b
  0x01ebda0b: pusha  
  0x01ebda0c: call   0x557bdbf0
  0x01ebda11: hlt    
  ;; } verify_i2ce 
  0x01ebda12: mov    %esp,%edi
  0x01ebda14: sub    $0x20,%esp
  0x01ebda17: and    $0xfffffff0,%esp
  0x01ebda1a: push   %eax
  0x01ebda1b: mov    %edi,%eax
  0x01ebda1d: mov    0x2c(%ebx),%edi
  0x01ebda20: mov    0x20(%eax),%esi
  0x01ebda23: mov    %esi,0x4(%esp)
  0x01ebda27: mov    0x24(%eax),%esi
  0x01ebda2a: mov    %esi,0x8(%esp)
  0x01ebda2e: mov    0x1c(%eax),%ecx
  0x01ebda31: mov    0x14(%eax),%esi
  0x01ebda34: mov    %esi,0xc(%esp)
  0x01ebda38: mov    0x18(%eax),%esi
  0x01ebda3b: mov    %esi,0x10(%esp)
  0x01ebda3f: mov    0xc(%eax),%esi
  0x01ebda42: mov    %esi,0x14(%esp)
  0x01ebda46: mov    0x10(%eax),%esi
  0x01ebda49: mov    %esi,0x18(%esp)
  0x01ebda4d: mov    0x4(%eax),%esi
  0x01ebda50: mov    %esi,0x1c(%esp)
  0x01ebda54: mov    0x8(%eax),%esi
  0x01ebda57: mov    %esi,0x20(%esp)
  0x01ebda5b: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebda63: mov    -0xc(%eax),%eax
  0x01ebda66: mov    %ebx,0x168(%eax)
  0x01ebda6c: mov    %ebx,%eax
  0x01ebda6e: jmp    *%edi
  0x01ebda70: mov    0x4(%ecx),%ebx
  0x01ebda73: cmp    0x8(%eax),%ebx
  0x01ebda76: mov    0x4(%eax),%ebx
  0x01ebda79: jne    0x01ebda8c
  0x01ebda7f: cmpl   $0x0,0x30(%ebx)
  0x01ebda86: je     0x01ebdacb
  0x01ebda8c: jmp    0x01ea32d0
  0x01ebda91: cmpl   $0x0,0x30(%ebx)
  0x01ebda98: je     0x01ebdacb
  0x01ebda9e: mov    (%esp),%eax
  0x01ebdaa1: pusha  
  0x01ebdaa2: pushf  
  0x01ebdaa3: sub    $0x10,%esp
  0x01ebdaa6: movsd  %xmm0,(%esp)
  0x01ebdaab: movsd  %xmm1,0x8(%esp)
  0x01ebdab1: push   %eax
  0x01ebdab2: push   %ebx
  0x01ebdab3: call   0x55be79d0
  0x01ebdab8: add    $0x8,%esp
  0x01ebdabb: movsd  (%esp),%xmm0
  0x01ebdac0: movsd  0x8(%esp),%xmm1
  0x01ebdac6: add    $0x10,%esp
  0x01ebdac9: popf   
  0x01ebdaca: popa   
  0x01ebdacb: pop    %eax
  0x01ebdacc: mov    %esp,%esi
  0x01ebdace: sub    $0x24,%esp
  0x01ebdad1: mov    0x24(%esp),%edi
  0x01ebdad5: mov    %edi,0x1c(%esp)
  0x01ebdad9: mov    0x28(%esp),%edi
  0x01ebdadd: mov    %edi,0x20(%esp)
  0x01ebdae1: mov    %ecx,0x18(%esp)
  0x01ebdae5: mov    0x2c(%esp),%edi
  0x01ebdae9: mov    %edi,0x10(%esp)
  0x01ebdaed: mov    0x30(%esp),%edi
  0x01ebdaf1: mov    %edi,0x14(%esp)
  0x01ebdaf5: mov    0x34(%esp),%edi
  0x01ebdaf9: mov    %edi,0x8(%esp)
  0x01ebdafd: mov    0x38(%esp),%edi
  0x01ebdb01: mov    %edi,0xc(%esp)
  0x01ebdb05: mov    0x3c(%esp),%edi
  0x01ebdb09: mov    %edi,(%esp)
  0x01ebdb0c: mov    0x40(%esp),%edi
  0x01ebdb10: mov    %edi,0x4(%esp)
  0x01ebdb14: mov    0x24(%ebx),%ecx
  0x01ebdb17: push   %eax
  0x01ebdb18: jmp    *%ecx

AHE@0x018f9eac: 0xabebebebe0000000 i2c: 0x01ebdbb0 c2i: 0x01ebdc91 c2iUV: 0x01ebdc70
i2c argument handler #54 for: static (Ljava/lang/Object;JJJJ)V (362 bytes generated)
c2i argument handler starts at 01EBDC91
  0x01ebdbb0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebdbb3: mov    $0x1dc2940,%edi
  0x01ebdbb8: cmp    %edi,%eax
  0x01ebdbba: jbe    0x01ebdbcd
  0x01ebdbc0: mov    $0x1ea2940,%edi
  0x01ebdbc5: cmp    %edi,%eax
  0x01ebdbc7: jb     0x01ebdc12
  0x01ebdbcd: mov    $0x1dc0340,%edi
  0x01ebdbd2: cmp    %edi,%eax
  0x01ebdbd4: jbe    0x01ebdbe7
  0x01ebdbda: mov    $0x1dc2668,%edi
  0x01ebdbdf: cmp    %edi,%eax
  0x01ebdbe1: jb     0x01ebdc12
  0x01ebdbe7: mov    $0x1ead380,%edi
  0x01ebdbec: cmp    %edi,%eax
  0x01ebdbee: jbe    0x01ebdc01
  0x01ebdbf4: mov    $0x1eb2970,%edi
  0x01ebdbf9: cmp    %edi,%eax
  0x01ebdbfb: jb     0x01ebdc12
  ;; i2c adapter must return to an interpreter frame
  0x01ebdc01: push   $0x55ce723c
  0x01ebdc06: call   0x01ebdc0b
  0x01ebdc0b: pusha  
  0x01ebdc0c: call   0x557bdbf0
  0x01ebdc11: hlt    
  ;; } verify_i2ce 
  0x01ebdc12: mov    %esp,%edi
  0x01ebdc14: sub    $0x20,%esp
  0x01ebdc17: and    $0xfffffff0,%esp
  0x01ebdc1a: push   %eax
  0x01ebdc1b: mov    %edi,%eax
  0x01ebdc1d: mov    0x2c(%ebx),%edi
  0x01ebdc20: mov    0x24(%eax),%ecx
  0x01ebdc23: mov    0x1c(%eax),%esi
  0x01ebdc26: mov    %esi,0x4(%esp)
  0x01ebdc2a: mov    0x20(%eax),%esi
  0x01ebdc2d: mov    %esi,0x8(%esp)
  0x01ebdc31: mov    0x14(%eax),%esi
  0x01ebdc34: mov    %esi,0xc(%esp)
  0x01ebdc38: mov    0x18(%eax),%esi
  0x01ebdc3b: mov    %esi,0x10(%esp)
  0x01ebdc3f: mov    0xc(%eax),%esi
  0x01ebdc42: mov    %esi,0x14(%esp)
  0x01ebdc46: mov    0x10(%eax),%esi
  0x01ebdc49: mov    %esi,0x18(%esp)
  0x01ebdc4d: mov    0x4(%eax),%esi
  0x01ebdc50: mov    %esi,0x1c(%esp)
  0x01ebdc54: mov    0x8(%eax),%esi
  0x01ebdc57: mov    %esi,0x20(%esp)
  0x01ebdc5b: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebdc63: mov    -0xc(%eax),%eax
  0x01ebdc66: mov    %ebx,0x168(%eax)
  0x01ebdc6c: mov    %ebx,%eax
  0x01ebdc6e: jmp    *%edi
  0x01ebdc70: mov    0x4(%ecx),%ebx
  0x01ebdc73: cmp    0x8(%eax),%ebx
  0x01ebdc76: mov    0x4(%eax),%ebx
  0x01ebdc79: jne    0x01ebdc8c
  0x01ebdc7f: cmpl   $0x0,0x30(%ebx)
  0x01ebdc86: je     0x01ebdccb
  0x01ebdc8c: jmp    0x01ea32d0
  0x01ebdc91: cmpl   $0x0,0x30(%ebx)
  0x01ebdc98: je     0x01ebdccb
  0x01ebdc9e: mov    (%esp),%eax
  0x01ebdca1: pusha  
  0x01ebdca2: pushf  
  0x01ebdca3: sub    $0x10,%esp
  0x01ebdca6: movsd  %xmm0,(%esp)
  0x01ebdcab: movsd  %xmm1,0x8(%esp)
  0x01ebdcb1: push   %eax
  0x01ebdcb2: push   %ebx
  0x01ebdcb3: call   0x55be79d0
  0x01ebdcb8: add    $0x8,%esp
  0x01ebdcbb: movsd  (%esp),%xmm0
  0x01ebdcc0: movsd  0x8(%esp),%xmm1
  0x01ebdcc6: add    $0x10,%esp
  0x01ebdcc9: popf   
  0x01ebdcca: popa   
  0x01ebdccb: pop    %eax
  0x01ebdccc: mov    %esp,%esi
  0x01ebdcce: sub    $0x24,%esp
  0x01ebdcd1: mov    %ecx,0x20(%esp)
  0x01ebdcd5: mov    0x24(%esp),%edi
  0x01ebdcd9: mov    %edi,0x18(%esp)
  0x01ebdcdd: mov    0x28(%esp),%edi
  0x01ebdce1: mov    %edi,0x1c(%esp)
  0x01ebdce5: mov    0x2c(%esp),%edi
  0x01ebdce9: mov    %edi,0x10(%esp)
  0x01ebdced: mov    0x30(%esp),%edi
  0x01ebdcf1: mov    %edi,0x14(%esp)
  0x01ebdcf5: mov    0x34(%esp),%edi
  0x01ebdcf9: mov    %edi,0x8(%esp)
  0x01ebdcfd: mov    0x38(%esp),%edi
  0x01ebdd01: mov    %edi,0xc(%esp)
  0x01ebdd05: mov    0x3c(%esp),%edi
  0x01ebdd09: mov    %edi,(%esp)
  0x01ebdd0c: mov    0x40(%esp),%edi
  0x01ebdd10: mov    %edi,0x4(%esp)
  0x01ebdd14: mov    0x24(%ebx),%ecx
  0x01ebdd17: push   %eax
  0x01ebdd18: jmp    *%ecx

AHE@0x018f9ed8: 0xaa7ea000 i2c: 0x01ebddb0 c2i: 0x01ebde68 c2iUV: 0x01ebde47
i2c argument handler #55 for: static (Ljava/nio/ByteBuffer;IDZ)V (275 bytes generated)
c2i argument handler starts at 01EBDE68
  0x01ebddb0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebddb3: mov    $0x1dc2940,%edi
  0x01ebddb8: cmp    %edi,%eax
  0x01ebddba: jbe    0x01ebddcd
  0x01ebddc0: mov    $0x1ea2940,%edi
  0x01ebddc5: cmp    %edi,%eax
  0x01ebddc7: jb     0x01ebde12
  0x01ebddcd: mov    $0x1dc0340,%edi
  0x01ebddd2: cmp    %edi,%eax
  0x01ebddd4: jbe    0x01ebdde7
  0x01ebddda: mov    $0x1dc2668,%edi
  0x01ebdddf: cmp    %edi,%eax
  0x01ebdde1: jb     0x01ebde12
  0x01ebdde7: mov    $0x1ead380,%edi
  0x01ebddec: cmp    %edi,%eax
  0x01ebddee: jbe    0x01ebde01
  0x01ebddf4: mov    $0x1eb2970,%edi
  0x01ebddf9: cmp    %edi,%eax
  0x01ebddfb: jb     0x01ebde12
  ;; i2c adapter must return to an interpreter frame
  0x01ebde01: push   $0x55ce723c
  0x01ebde06: call   0x01ebde0b
  0x01ebde0b: pusha  
  0x01ebde0c: call   0x557bdbf0
  0x01ebde11: hlt    
  ;; } verify_i2ce 
  0x01ebde12: mov    %esp,%edi
  0x01ebde14: sub    $0x8,%esp
  0x01ebde17: and    $0xfffffff0,%esp
  0x01ebde1a: push   %eax
  0x01ebde1b: mov    %edi,%eax
  0x01ebde1d: mov    0x2c(%ebx),%edi
  0x01ebde20: mov    0x14(%eax),%ecx
  0x01ebde23: mov    0x10(%eax),%edx
  0x01ebde26: movsd  0x8(%eax),%xmm0
  0x01ebde2b: mov    0x4(%eax),%esi
  0x01ebde2e: mov    %esi,0x4(%esp)
  0x01ebde32: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebde3a: mov    -0xc(%eax),%eax
  0x01ebde3d: mov    %ebx,0x168(%eax)
  0x01ebde43: mov    %ebx,%eax
  0x01ebde45: jmp    *%edi
  0x01ebde47: mov    0x4(%ecx),%ebx
  0x01ebde4a: cmp    0x8(%eax),%ebx
  0x01ebde4d: mov    0x4(%eax),%ebx
  0x01ebde50: jne    0x01ebde63
  0x01ebde56: cmpl   $0x0,0x30(%ebx)
  0x01ebde5d: je     0x01ebdea2
  0x01ebde63: jmp    0x01ea32d0
  0x01ebde68: cmpl   $0x0,0x30(%ebx)
  0x01ebde6f: je     0x01ebdea2
  0x01ebde75: mov    (%esp),%eax
  0x01ebde78: pusha  
  0x01ebde79: pushf  
  0x01ebde7a: sub    $0x10,%esp
  0x01ebde7d: movsd  %xmm0,(%esp)
  0x01ebde82: movsd  %xmm1,0x8(%esp)
  0x01ebde88: push   %eax
  0x01ebde89: push   %ebx
  0x01ebde8a: call   0x55be79d0
  0x01ebde8f: add    $0x8,%esp
  0x01ebde92: movsd  (%esp),%xmm0
  0x01ebde97: movsd  0x8(%esp),%xmm1
  0x01ebde9d: add    $0x10,%esp
  0x01ebdea0: popf   
  0x01ebdea1: popa   
  0x01ebdea2: pop    %eax
  0x01ebdea3: mov    %esp,%esi
  0x01ebdea5: sub    $0x14,%esp
  0x01ebdea8: mov    %ecx,0x10(%esp)
  0x01ebdeac: mov    %edx,0xc(%esp)
  0x01ebdeb0: movsd  %xmm0,0x4(%esp)
  0x01ebdeb6: mov    0x14(%esp),%edi
  0x01ebdeba: mov    %edi,(%esp)
  0x01ebdebd: mov    0x24(%ebx),%ecx
  0x01ebdec0: push   %eax
  0x01ebdec1: jmp    *%ecx

AHE@0x018f9f04: 0xbe7ea000 i2c: 0x01ebdf70 c2i: 0x01ebe02c c2iUV: 0x01ebe00b
i2c argument handler #56 for: static (JDZ)V (283 bytes generated)
c2i argument handler starts at 01EBE02C
  0x01ebdf70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebdf73: mov    $0x1dc2940,%edi
  0x01ebdf78: cmp    %edi,%eax
  0x01ebdf7a: jbe    0x01ebdf8d
  0x01ebdf80: mov    $0x1ea2940,%edi
  0x01ebdf85: cmp    %edi,%eax
  0x01ebdf87: jb     0x01ebdfd2
  0x01ebdf8d: mov    $0x1dc0340,%edi
  0x01ebdf92: cmp    %edi,%eax
  0x01ebdf94: jbe    0x01ebdfa7
  0x01ebdf9a: mov    $0x1dc2668,%edi
  0x01ebdf9f: cmp    %edi,%eax
  0x01ebdfa1: jb     0x01ebdfd2
  0x01ebdfa7: mov    $0x1ead380,%edi
  0x01ebdfac: cmp    %edi,%eax
  0x01ebdfae: jbe    0x01ebdfc1
  0x01ebdfb4: mov    $0x1eb2970,%edi
  0x01ebdfb9: cmp    %edi,%eax
  0x01ebdfbb: jb     0x01ebdfd2
  ;; i2c adapter must return to an interpreter frame
  0x01ebdfc1: push   $0x55ce723c
  0x01ebdfc6: call   0x01ebdfcb
  0x01ebdfcb: pusha  
  0x01ebdfcc: call   0x557bdbf0
  0x01ebdfd1: hlt    
  ;; } verify_i2ce 
  0x01ebdfd2: mov    %esp,%edi
  0x01ebdfd4: sub    $0x8,%esp
  0x01ebdfd7: and    $0xfffffff0,%esp
  0x01ebdfda: push   %eax
  0x01ebdfdb: mov    %edi,%eax
  0x01ebdfdd: mov    0x2c(%ebx),%edi
  0x01ebdfe0: mov    0x10(%eax),%esi
  0x01ebdfe3: mov    %esi,0x4(%esp)
  0x01ebdfe7: mov    0x14(%eax),%esi
  0x01ebdfea: mov    %esi,0x8(%esp)
  0x01ebdfee: movsd  0x8(%eax),%xmm0
  0x01ebdff3: mov    0x4(%eax),%ecx
  0x01ebdff6: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebdffe: mov    -0xc(%eax),%eax
  0x01ebe001: mov    %ebx,0x168(%eax)
  0x01ebe007: mov    %ebx,%eax
  0x01ebe009: jmp    *%edi
  0x01ebe00b: mov    0x4(%ecx),%ebx
  0x01ebe00e: cmp    0x8(%eax),%ebx
  0x01ebe011: mov    0x4(%eax),%ebx
  0x01ebe014: jne    0x01ebe027
  0x01ebe01a: cmpl   $0x0,0x30(%ebx)
  0x01ebe021: je     0x01ebe066
  0x01ebe027: jmp    0x01ea32d0
  0x01ebe02c: cmpl   $0x0,0x30(%ebx)
  0x01ebe033: je     0x01ebe066
  0x01ebe039: mov    (%esp),%eax
  0x01ebe03c: pusha  
  0x01ebe03d: pushf  
  0x01ebe03e: sub    $0x10,%esp
  0x01ebe041: movsd  %xmm0,(%esp)
  0x01ebe046: movsd  %xmm1,0x8(%esp)
  0x01ebe04c: push   %eax
  0x01ebe04d: push   %ebx
  0x01ebe04e: call   0x55be79d0
  0x01ebe053: add    $0x8,%esp
  0x01ebe056: movsd  (%esp),%xmm0
  0x01ebe05b: movsd  0x8(%esp),%xmm1
  0x01ebe061: add    $0x10,%esp
  0x01ebe064: popf   
  0x01ebe065: popa   
  0x01ebe066: pop    %eax
  0x01ebe067: mov    %esp,%esi
  0x01ebe069: sub    $0x14,%esp
  0x01ebe06c: mov    0x14(%esp),%edi
  0x01ebe070: mov    %edi,0xc(%esp)
  0x01ebe074: mov    0x18(%esp),%edi
  0x01ebe078: mov    %edi,0x10(%esp)
  0x01ebe07c: movsd  %xmm0,0x4(%esp)
  0x01ebe082: mov    %ecx,(%esp)
  0x01ebe085: mov    0x24(%ebx),%ecx
  0x01ebe088: push   %eax
  0x01ebe089: jmp    *%ecx

AHE@0x018f9f30: 0xbe6a0000 i2c: 0x01ebe130 c2i: 0x01ebe1ec c2iUV: 0x01ebe1cb
i2c argument handler #57 for: static (JFZ)V (283 bytes generated)
c2i argument handler starts at 01EBE1EC
  0x01ebe130: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebe133: mov    $0x1dc2940,%edi
  0x01ebe138: cmp    %edi,%eax
  0x01ebe13a: jbe    0x01ebe14d
  0x01ebe140: mov    $0x1ea2940,%edi
  0x01ebe145: cmp    %edi,%eax
  0x01ebe147: jb     0x01ebe192
  0x01ebe14d: mov    $0x1dc0340,%edi
  0x01ebe152: cmp    %edi,%eax
  0x01ebe154: jbe    0x01ebe167
  0x01ebe15a: mov    $0x1dc2668,%edi
  0x01ebe15f: cmp    %edi,%eax
  0x01ebe161: jb     0x01ebe192
  0x01ebe167: mov    $0x1ead380,%edi
  0x01ebe16c: cmp    %edi,%eax
  0x01ebe16e: jbe    0x01ebe181
  0x01ebe174: mov    $0x1eb2970,%edi
  0x01ebe179: cmp    %edi,%eax
  0x01ebe17b: jb     0x01ebe192
  ;; i2c adapter must return to an interpreter frame
  0x01ebe181: push   $0x55ce723c
  0x01ebe186: call   0x01ebe18b
  0x01ebe18b: pusha  
  0x01ebe18c: call   0x557bdbf0
  0x01ebe191: hlt    
  ;; } verify_i2ce 
  0x01ebe192: mov    %esp,%edi
  0x01ebe194: sub    $0x8,%esp
  0x01ebe197: and    $0xfffffff0,%esp
  0x01ebe19a: push   %eax
  0x01ebe19b: mov    %edi,%eax
  0x01ebe19d: mov    0x2c(%ebx),%edi
  0x01ebe1a0: mov    0xc(%eax),%esi
  0x01ebe1a3: mov    %esi,0x4(%esp)
  0x01ebe1a7: mov    0x10(%eax),%esi
  0x01ebe1aa: mov    %esi,0x8(%esp)
  0x01ebe1ae: movss  0x8(%eax),%xmm0
  0x01ebe1b3: mov    0x4(%eax),%ecx
  0x01ebe1b6: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebe1be: mov    -0xc(%eax),%eax
  0x01ebe1c1: mov    %ebx,0x168(%eax)
  0x01ebe1c7: mov    %ebx,%eax
  0x01ebe1c9: jmp    *%edi
  0x01ebe1cb: mov    0x4(%ecx),%ebx
  0x01ebe1ce: cmp    0x8(%eax),%ebx
  0x01ebe1d1: mov    0x4(%eax),%ebx
  0x01ebe1d4: jne    0x01ebe1e7
  0x01ebe1da: cmpl   $0x0,0x30(%ebx)
  0x01ebe1e1: je     0x01ebe226
  0x01ebe1e7: jmp    0x01ea32d0
  0x01ebe1ec: cmpl   $0x0,0x30(%ebx)
  0x01ebe1f3: je     0x01ebe226
  0x01ebe1f9: mov    (%esp),%eax
  0x01ebe1fc: pusha  
  0x01ebe1fd: pushf  
  0x01ebe1fe: sub    $0x10,%esp
  0x01ebe201: movsd  %xmm0,(%esp)
  0x01ebe206: movsd  %xmm1,0x8(%esp)
  0x01ebe20c: push   %eax
  0x01ebe20d: push   %ebx
  0x01ebe20e: call   0x55be79d0
  0x01ebe213: add    $0x8,%esp
  0x01ebe216: movsd  (%esp),%xmm0
  0x01ebe21b: movsd  0x8(%esp),%xmm1
  0x01ebe221: add    $0x10,%esp
  0x01ebe224: popf   
  0x01ebe225: popa   
  0x01ebe226: pop    %eax
  0x01ebe227: mov    %esp,%esi
  0x01ebe229: sub    $0x10,%esp
  0x01ebe22c: mov    0x10(%esp),%edi
  0x01ebe230: mov    %edi,0x8(%esp)
  0x01ebe234: mov    0x14(%esp),%edi
  0x01ebe238: mov    %edi,0xc(%esp)
  0x01ebe23c: movss  %xmm0,0x4(%esp)
  0x01ebe242: mov    %ecx,(%esp)
  0x01ebe245: mov    0x24(%ebx),%ecx
  0x01ebe248: push   %eax
  0x01ebe249: jmp    *%ecx

AHE@0x018f9f5c: 0xaa6a0000 i2c: 0x01ebe2f0 c2i: 0x01ebe3a8 c2iUV: 0x01ebe387
i2c argument handler #58 for: static (Ljava/nio/ByteBuffer;IFZ)V (275 bytes generated)
c2i argument handler starts at 01EBE3A8
  0x01ebe2f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebe2f3: mov    $0x1dc2940,%edi
  0x01ebe2f8: cmp    %edi,%eax
  0x01ebe2fa: jbe    0x01ebe30d
  0x01ebe300: mov    $0x1ea2940,%edi
  0x01ebe305: cmp    %edi,%eax
  0x01ebe307: jb     0x01ebe352
  0x01ebe30d: mov    $0x1dc0340,%edi
  0x01ebe312: cmp    %edi,%eax
  0x01ebe314: jbe    0x01ebe327
  0x01ebe31a: mov    $0x1dc2668,%edi
  0x01ebe31f: cmp    %edi,%eax
  0x01ebe321: jb     0x01ebe352
  0x01ebe327: mov    $0x1ead380,%edi
  0x01ebe32c: cmp    %edi,%eax
  0x01ebe32e: jbe    0x01ebe341
  0x01ebe334: mov    $0x1eb2970,%edi
  0x01ebe339: cmp    %edi,%eax
  0x01ebe33b: jb     0x01ebe352
  ;; i2c adapter must return to an interpreter frame
  0x01ebe341: push   $0x55ce723c
  0x01ebe346: call   0x01ebe34b
  0x01ebe34b: pusha  
  0x01ebe34c: call   0x557bdbf0
  0x01ebe351: hlt    
  ;; } verify_i2ce 
  0x01ebe352: mov    %esp,%edi
  0x01ebe354: sub    $0x8,%esp
  0x01ebe357: and    $0xfffffff0,%esp
  0x01ebe35a: push   %eax
  0x01ebe35b: mov    %edi,%eax
  0x01ebe35d: mov    0x2c(%ebx),%edi
  0x01ebe360: mov    0x10(%eax),%ecx
  0x01ebe363: mov    0xc(%eax),%edx
  0x01ebe366: movss  0x8(%eax),%xmm0
  0x01ebe36b: mov    0x4(%eax),%esi
  0x01ebe36e: mov    %esi,0x4(%esp)
  0x01ebe372: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebe37a: mov    -0xc(%eax),%eax
  0x01ebe37d: mov    %ebx,0x168(%eax)
  0x01ebe383: mov    %ebx,%eax
  0x01ebe385: jmp    *%edi
  0x01ebe387: mov    0x4(%ecx),%ebx
  0x01ebe38a: cmp    0x8(%eax),%ebx
  0x01ebe38d: mov    0x4(%eax),%ebx
  0x01ebe390: jne    0x01ebe3a3
  0x01ebe396: cmpl   $0x0,0x30(%ebx)
  0x01ebe39d: je     0x01ebe3e2
  0x01ebe3a3: jmp    0x01ea32d0
  0x01ebe3a8: cmpl   $0x0,0x30(%ebx)
  0x01ebe3af: je     0x01ebe3e2
  0x01ebe3b5: mov    (%esp),%eax
  0x01ebe3b8: pusha  
  0x01ebe3b9: pushf  
  0x01ebe3ba: sub    $0x10,%esp
  0x01ebe3bd: movsd  %xmm0,(%esp)
  0x01ebe3c2: movsd  %xmm1,0x8(%esp)
  0x01ebe3c8: push   %eax
  0x01ebe3c9: push   %ebx
  0x01ebe3ca: call   0x55be79d0
  0x01ebe3cf: add    $0x8,%esp
  0x01ebe3d2: movsd  (%esp),%xmm0
  0x01ebe3d7: movsd  0x8(%esp),%xmm1
  0x01ebe3dd: add    $0x10,%esp
  0x01ebe3e0: popf   
  0x01ebe3e1: popa   
  0x01ebe3e2: pop    %eax
  0x01ebe3e3: mov    %esp,%esi
  0x01ebe3e5: sub    $0x10,%esp
  0x01ebe3e8: mov    %ecx,0xc(%esp)
  0x01ebe3ec: mov    %edx,0x8(%esp)
  0x01ebe3f0: movss  %xmm0,0x4(%esp)
  0x01ebe3f6: mov    0x10(%esp),%edi
  0x01ebe3fa: mov    %edi,(%esp)
  0x01ebe3fd: mov    0x24(%ebx),%ecx
  0x01ebe400: push   %eax
  0x01ebe401: jmp    *%ecx

AHE@0x018f9f88: 0xbebea000 i2c: 0x01ebe4b0 c2i: 0x01ebe575 c2iUV: 0x01ebe554
i2c argument handler #59 for: static (JJZ)V (302 bytes generated)
c2i argument handler starts at 01EBE575
  0x01ebe4b0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebe4b3: mov    $0x1dc2940,%edi
  0x01ebe4b8: cmp    %edi,%eax
  0x01ebe4ba: jbe    0x01ebe4cd
  0x01ebe4c0: mov    $0x1ea2940,%edi
  0x01ebe4c5: cmp    %edi,%eax
  0x01ebe4c7: jb     0x01ebe512
  0x01ebe4cd: mov    $0x1dc0340,%edi
  0x01ebe4d2: cmp    %edi,%eax
  0x01ebe4d4: jbe    0x01ebe4e7
  0x01ebe4da: mov    $0x1dc2668,%edi
  0x01ebe4df: cmp    %edi,%eax
  0x01ebe4e1: jb     0x01ebe512
  0x01ebe4e7: mov    $0x1ead380,%edi
  0x01ebe4ec: cmp    %edi,%eax
  0x01ebe4ee: jbe    0x01ebe501
  0x01ebe4f4: mov    $0x1eb2970,%edi
  0x01ebe4f9: cmp    %edi,%eax
  0x01ebe4fb: jb     0x01ebe512
  ;; i2c adapter must return to an interpreter frame
  0x01ebe501: push   $0x55ce723c
  0x01ebe506: call   0x01ebe50b
  0x01ebe50b: pusha  
  0x01ebe50c: call   0x557bdbf0
  0x01ebe511: hlt    
  ;; } verify_i2ce 
  0x01ebe512: mov    %esp,%edi
  0x01ebe514: sub    $0x10,%esp
  0x01ebe517: and    $0xfffffff0,%esp
  0x01ebe51a: push   %eax
  0x01ebe51b: mov    %edi,%eax
  0x01ebe51d: mov    0x2c(%ebx),%edi
  0x01ebe520: mov    0x10(%eax),%esi
  0x01ebe523: mov    %esi,0x4(%esp)
  0x01ebe527: mov    0x14(%eax),%esi
  0x01ebe52a: mov    %esi,0x8(%esp)
  0x01ebe52e: mov    0x8(%eax),%esi
  0x01ebe531: mov    %esi,0xc(%esp)
  0x01ebe535: mov    0xc(%eax),%esi
  0x01ebe538: mov    %esi,0x10(%esp)
  0x01ebe53c: mov    0x4(%eax),%ecx
  0x01ebe53f: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebe547: mov    -0xc(%eax),%eax
  0x01ebe54a: mov    %ebx,0x168(%eax)
  0x01ebe550: mov    %ebx,%eax
  0x01ebe552: jmp    *%edi
  0x01ebe554: mov    0x4(%ecx),%ebx
  0x01ebe557: cmp    0x8(%eax),%ebx
  0x01ebe55a: mov    0x4(%eax),%ebx
  0x01ebe55d: jne    0x01ebe570
  0x01ebe563: cmpl   $0x0,0x30(%ebx)
  0x01ebe56a: je     0x01ebe5af
  0x01ebe570: jmp    0x01ea32d0
  0x01ebe575: cmpl   $0x0,0x30(%ebx)
  0x01ebe57c: je     0x01ebe5af
  0x01ebe582: mov    (%esp),%eax
  0x01ebe585: pusha  
  0x01ebe586: pushf  
  0x01ebe587: sub    $0x10,%esp
  0x01ebe58a: movsd  %xmm0,(%esp)
  0x01ebe58f: movsd  %xmm1,0x8(%esp)
  0x01ebe595: push   %eax
  0x01ebe596: push   %ebx
  0x01ebe597: call   0x55be79d0
  0x01ebe59c: add    $0x8,%esp
  0x01ebe59f: movsd  (%esp),%xmm0
  0x01ebe5a4: movsd  0x8(%esp),%xmm1
  0x01ebe5aa: add    $0x10,%esp
  0x01ebe5ad: popf   
  0x01ebe5ae: popa   
  0x01ebe5af: pop    %eax
  0x01ebe5b0: mov    %esp,%esi
  0x01ebe5b2: sub    $0x14,%esp
  0x01ebe5b5: mov    0x14(%esp),%edi
  0x01ebe5b9: mov    %edi,0xc(%esp)
  0x01ebe5bd: mov    0x18(%esp),%edi
  0x01ebe5c1: mov    %edi,0x10(%esp)
  0x01ebe5c5: mov    0x1c(%esp),%edi
  0x01ebe5c9: mov    %edi,0x4(%esp)
  0x01ebe5cd: mov    0x20(%esp),%edi
  0x01ebe5d1: mov    %edi,0x8(%esp)
  0x01ebe5d5: mov    %ecx,(%esp)
  0x01ebe5d8: mov    0x24(%ebx),%ecx
  0x01ebe5db: push   %eax
  0x01ebe5dc: jmp    *%ecx

AHE@0x018f9fb4: 0xbeaa0000 i2c: 0x01ebe670 c2i: 0x01ebe72a c2iUV: 0x01ebe709
i2c argument handler #60 for: static (JIZ)V (279 bytes generated)
c2i argument handler starts at 01EBE72A
  0x01ebe670: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebe673: mov    $0x1dc2940,%edi
  0x01ebe678: cmp    %edi,%eax
  0x01ebe67a: jbe    0x01ebe68d
  0x01ebe680: mov    $0x1ea2940,%edi
  0x01ebe685: cmp    %edi,%eax
  0x01ebe687: jb     0x01ebe6d2
  0x01ebe68d: mov    $0x1dc0340,%edi
  0x01ebe692: cmp    %edi,%eax
  0x01ebe694: jbe    0x01ebe6a7
  0x01ebe69a: mov    $0x1dc2668,%edi
  0x01ebe69f: cmp    %edi,%eax
  0x01ebe6a1: jb     0x01ebe6d2
  0x01ebe6a7: mov    $0x1ead380,%edi
  0x01ebe6ac: cmp    %edi,%eax
  0x01ebe6ae: jbe    0x01ebe6c1
  0x01ebe6b4: mov    $0x1eb2970,%edi
  0x01ebe6b9: cmp    %edi,%eax
  0x01ebe6bb: jb     0x01ebe6d2
  ;; i2c adapter must return to an interpreter frame
  0x01ebe6c1: push   $0x55ce723c
  0x01ebe6c6: call   0x01ebe6cb
  0x01ebe6cb: pusha  
  0x01ebe6cc: call   0x557bdbf0
  0x01ebe6d1: hlt    
  ;; } verify_i2ce 
  0x01ebe6d2: mov    %esp,%edi
  0x01ebe6d4: sub    $0x8,%esp
  0x01ebe6d7: and    $0xfffffff0,%esp
  0x01ebe6da: push   %eax
  0x01ebe6db: mov    %edi,%eax
  0x01ebe6dd: mov    0x2c(%ebx),%edi
  0x01ebe6e0: mov    0xc(%eax),%esi
  0x01ebe6e3: mov    %esi,0x4(%esp)
  0x01ebe6e7: mov    0x10(%eax),%esi
  0x01ebe6ea: mov    %esi,0x8(%esp)
  0x01ebe6ee: mov    0x8(%eax),%ecx
  0x01ebe6f1: mov    0x4(%eax),%edx
  0x01ebe6f4: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebe6fc: mov    -0xc(%eax),%eax
  0x01ebe6ff: mov    %ebx,0x168(%eax)
  0x01ebe705: mov    %ebx,%eax
  0x01ebe707: jmp    *%edi
  0x01ebe709: mov    0x4(%ecx),%ebx
  0x01ebe70c: cmp    0x8(%eax),%ebx
  0x01ebe70f: mov    0x4(%eax),%ebx
  0x01ebe712: jne    0x01ebe725
  0x01ebe718: cmpl   $0x0,0x30(%ebx)
  0x01ebe71f: je     0x01ebe764
  0x01ebe725: jmp    0x01ea32d0
  0x01ebe72a: cmpl   $0x0,0x30(%ebx)
  0x01ebe731: je     0x01ebe764
  0x01ebe737: mov    (%esp),%eax
  0x01ebe73a: pusha  
  0x01ebe73b: pushf  
  0x01ebe73c: sub    $0x10,%esp
  0x01ebe73f: movsd  %xmm0,(%esp)
  0x01ebe744: movsd  %xmm1,0x8(%esp)
  0x01ebe74a: push   %eax
  0x01ebe74b: push   %ebx
  0x01ebe74c: call   0x55be79d0
  0x01ebe751: add    $0x8,%esp
  0x01ebe754: movsd  (%esp),%xmm0
  0x01ebe759: movsd  0x8(%esp),%xmm1
  0x01ebe75f: add    $0x10,%esp
  0x01ebe762: popf   
  0x01ebe763: popa   
  0x01ebe764: pop    %eax
  0x01ebe765: mov    %esp,%esi
  0x01ebe767: sub    $0x10,%esp
  0x01ebe76a: mov    0x10(%esp),%edi
  0x01ebe76e: mov    %edi,0x8(%esp)
  0x01ebe772: mov    0x14(%esp),%edi
  0x01ebe776: mov    %edi,0xc(%esp)
  0x01ebe77a: mov    %ecx,0x4(%esp)
  0x01ebe77e: mov    %edx,(%esp)
  0x01ebe781: mov    0x24(%ebx),%ecx
  0x01ebe784: push   %eax
  0x01ebe785: jmp    *%ecx

AHE@0x018f9fe0: 0xabeaa000 i2c: 0x01ebe830 c2i: 0x01ebe8f1 c2iUV: 0x01ebe8d0
i2c argument handler #61 for: receiver (JILjava/lang/Object;)Ljava/nio/ByteBuffer; (294 bytes generated)
c2i argument handler starts at 01EBE8F1
  0x01ebe830: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebe833: mov    $0x1dc2940,%edi
  0x01ebe838: cmp    %edi,%eax
  0x01ebe83a: jbe    0x01ebe84d
  0x01ebe840: mov    $0x1ea2940,%edi
  0x01ebe845: cmp    %edi,%eax
  0x01ebe847: jb     0x01ebe892
  0x01ebe84d: mov    $0x1dc0340,%edi
  0x01ebe852: cmp    %edi,%eax
  0x01ebe854: jbe    0x01ebe867
  0x01ebe85a: mov    $0x1dc2668,%edi
  0x01ebe85f: cmp    %edi,%eax
  0x01ebe861: jb     0x01ebe892
  0x01ebe867: mov    $0x1ead380,%edi
  0x01ebe86c: cmp    %edi,%eax
  0x01ebe86e: jbe    0x01ebe881
  0x01ebe874: mov    $0x1eb2970,%edi
  0x01ebe879: cmp    %edi,%eax
  0x01ebe87b: jb     0x01ebe892
  ;; i2c adapter must return to an interpreter frame
  0x01ebe881: push   $0x55ce723c
  0x01ebe886: call   0x01ebe88b
  0x01ebe88b: pusha  
  0x01ebe88c: call   0x557bdbf0
  0x01ebe891: hlt    
  ;; } verify_i2ce 
  0x01ebe892: mov    %esp,%edi
  0x01ebe894: sub    $0x10,%esp
  0x01ebe897: and    $0xfffffff0,%esp
  0x01ebe89a: push   %eax
  0x01ebe89b: mov    %edi,%eax
  0x01ebe89d: mov    0x2c(%ebx),%edi
  0x01ebe8a0: mov    0x14(%eax),%ecx
  0x01ebe8a3: mov    0xc(%eax),%esi
  0x01ebe8a6: mov    %esi,0x4(%esp)
  0x01ebe8aa: mov    0x10(%eax),%esi
  0x01ebe8ad: mov    %esi,0x8(%esp)
  0x01ebe8b1: mov    0x8(%eax),%edx
  0x01ebe8b4: mov    0x4(%eax),%esi
  0x01ebe8b7: mov    %esi,0xc(%esp)
  0x01ebe8bb: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebe8c3: mov    -0xc(%eax),%eax
  0x01ebe8c6: mov    %ebx,0x168(%eax)
  0x01ebe8cc: mov    %ebx,%eax
  0x01ebe8ce: jmp    *%edi
  0x01ebe8d0: mov    0x4(%ecx),%ebx
  0x01ebe8d3: cmp    0x8(%eax),%ebx
  0x01ebe8d6: mov    0x4(%eax),%ebx
  0x01ebe8d9: jne    0x01ebe8ec
  0x01ebe8df: cmpl   $0x0,0x30(%ebx)
  0x01ebe8e6: je     0x01ebe92b
  0x01ebe8ec: jmp    0x01ea32d0
  0x01ebe8f1: cmpl   $0x0,0x30(%ebx)
  0x01ebe8f8: je     0x01ebe92b
  0x01ebe8fe: mov    (%esp),%eax
  0x01ebe901: pusha  
  0x01ebe902: pushf  
  0x01ebe903: sub    $0x10,%esp
  0x01ebe906: movsd  %xmm0,(%esp)
  0x01ebe90b: movsd  %xmm1,0x8(%esp)
  0x01ebe911: push   %eax
  0x01ebe912: push   %ebx
  0x01ebe913: call   0x55be79d0
  0x01ebe918: add    $0x8,%esp
  0x01ebe91b: movsd  (%esp),%xmm0
  0x01ebe920: movsd  0x8(%esp),%xmm1
  0x01ebe926: add    $0x10,%esp
  0x01ebe929: popf   
  0x01ebe92a: popa   
  0x01ebe92b: pop    %eax
  0x01ebe92c: mov    %esp,%esi
  0x01ebe92e: sub    $0x14,%esp
  0x01ebe931: mov    %ecx,0x10(%esp)
  0x01ebe935: mov    0x14(%esp),%edi
  0x01ebe939: mov    %edi,0x8(%esp)
  0x01ebe93d: mov    0x18(%esp),%edi
  0x01ebe941: mov    %edi,0xc(%esp)
  0x01ebe945: mov    %edx,0x4(%esp)
  0x01ebe949: mov    0x1c(%esp),%edi
  0x01ebe94d: mov    %edi,(%esp)
  0x01ebe950: mov    0x24(%ebx),%ecx
  0x01ebe953: push   %eax
  0x01ebe954: jmp    *%ecx

AHE@0x018fa00c: 0xabeabea0 i2c: 0x01ebe9f0 c2i: 0x01ebeabf c2iUV: 0x01ebea9e
i2c argument handler #62 for: receiver (JLjava/util/function/ToLongFunction;JLjava/util/function/LongBinaryOperator;)J (324 bytes generated)
c2i argument handler starts at 01EBEABF
  0x01ebe9f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebe9f3: mov    $0x1dc2940,%edi
  0x01ebe9f8: cmp    %edi,%eax
  0x01ebe9fa: jbe    0x01ebea0d
  0x01ebea00: mov    $0x1ea2940,%edi
  0x01ebea05: cmp    %edi,%eax
  0x01ebea07: jb     0x01ebea52
  0x01ebea0d: mov    $0x1dc0340,%edi
  0x01ebea12: cmp    %edi,%eax
  0x01ebea14: jbe    0x01ebea27
  0x01ebea1a: mov    $0x1dc2668,%edi
  0x01ebea1f: cmp    %edi,%eax
  0x01ebea21: jb     0x01ebea52
  0x01ebea27: mov    $0x1ead380,%edi
  0x01ebea2c: cmp    %edi,%eax
  0x01ebea2e: jbe    0x01ebea41
  0x01ebea34: mov    $0x1eb2970,%edi
  0x01ebea39: cmp    %edi,%eax
  0x01ebea3b: jb     0x01ebea52
  ;; i2c adapter must return to an interpreter frame
  0x01ebea41: push   $0x55ce723c
  0x01ebea46: call   0x01ebea4b
  0x01ebea4b: pusha  
  0x01ebea4c: call   0x557bdbf0
  0x01ebea51: hlt    
  ;; } verify_i2ce 
  0x01ebea52: mov    %esp,%edi
  0x01ebea54: sub    $0x18,%esp
  0x01ebea57: and    $0xfffffff0,%esp
  0x01ebea5a: push   %eax
  0x01ebea5b: mov    %edi,%eax
  0x01ebea5d: mov    0x2c(%ebx),%edi
  0x01ebea60: mov    0x1c(%eax),%ecx
  0x01ebea63: mov    0x14(%eax),%esi
  0x01ebea66: mov    %esi,0x4(%esp)
  0x01ebea6a: mov    0x18(%eax),%esi
  0x01ebea6d: mov    %esi,0x8(%esp)
  0x01ebea71: mov    0x10(%eax),%edx
  0x01ebea74: mov    0x8(%eax),%esi
  0x01ebea77: mov    %esi,0xc(%esp)
  0x01ebea7b: mov    0xc(%eax),%esi
  0x01ebea7e: mov    %esi,0x10(%esp)
  0x01ebea82: mov    0x4(%eax),%esi
  0x01ebea85: mov    %esi,0x14(%esp)
  0x01ebea89: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebea91: mov    -0xc(%eax),%eax
  0x01ebea94: mov    %ebx,0x168(%eax)
  0x01ebea9a: mov    %ebx,%eax
  0x01ebea9c: jmp    *%edi
  0x01ebea9e: mov    0x4(%ecx),%ebx
  0x01ebeaa1: cmp    0x8(%eax),%ebx
  0x01ebeaa4: mov    0x4(%eax),%ebx
  0x01ebeaa7: jne    0x01ebeaba
  0x01ebeaad: cmpl   $0x0,0x30(%ebx)
  0x01ebeab4: je     0x01ebeaf9
  0x01ebeaba: jmp    0x01ea32d0
  0x01ebeabf: cmpl   $0x0,0x30(%ebx)
  0x01ebeac6: je     0x01ebeaf9
  0x01ebeacc: mov    (%esp),%eax
  0x01ebeacf: pusha  
  0x01ebead0: pushf  
  0x01ebead1: sub    $0x10,%esp
  0x01ebead4: movsd  %xmm0,(%esp)
  0x01ebead9: movsd  %xmm1,0x8(%esp)
  0x01ebeadf: push   %eax
  0x01ebeae0: push   %ebx
  0x01ebeae1: call   0x55be79d0
  0x01ebeae6: add    $0x8,%esp
  0x01ebeae9: movsd  (%esp),%xmm0
  0x01ebeaee: movsd  0x8(%esp),%xmm1
  0x01ebeaf4: add    $0x10,%esp
  0x01ebeaf7: popf   
  0x01ebeaf8: popa   
  0x01ebeaf9: pop    %eax
  0x01ebeafa: mov    %esp,%esi
  0x01ebeafc: sub    $0x1c,%esp
  0x01ebeaff: mov    %ecx,0x18(%esp)
  0x01ebeb03: mov    0x1c(%esp),%edi
  0x01ebeb07: mov    %edi,0x10(%esp)
  0x01ebeb0b: mov    0x20(%esp),%edi
  0x01ebeb0f: mov    %edi,0x14(%esp)
  0x01ebeb13: mov    %edx,0xc(%esp)
  0x01ebeb17: mov    0x24(%esp),%edi
  0x01ebeb1b: mov    %edi,0x4(%esp)
  0x01ebeb1f: mov    0x28(%esp),%edi
  0x01ebeb23: mov    %edi,0x8(%esp)
  0x01ebeb27: mov    0x2c(%esp),%edi
  0x01ebeb2b: mov    %edi,(%esp)
  0x01ebeb2e: mov    0x24(%ebx),%ecx
  0x01ebeb31: push   %eax
  0x01ebeb32: jmp    *%ecx

AHE@0x018fa038: 0xabeaaa00 i2c: 0x01ebebb0 c2i: 0x01ebec78 c2iUV: 0x01ebec57
i2c argument handler #63 for: receiver (JLjava/util/function/ToIntFunction;ILjava/util/function/IntBinaryOperator;)I (309 bytes generated)
c2i argument handler starts at 01EBEC78
  0x01ebebb0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebebb3: mov    $0x1dc2940,%edi
  0x01ebebb8: cmp    %edi,%eax
  0x01ebebba: jbe    0x01ebebcd
  0x01ebebc0: mov    $0x1ea2940,%edi
  0x01ebebc5: cmp    %edi,%eax
  0x01ebebc7: jb     0x01ebec12
  0x01ebebcd: mov    $0x1dc0340,%edi
  0x01ebebd2: cmp    %edi,%eax
  0x01ebebd4: jbe    0x01ebebe7
  0x01ebebda: mov    $0x1dc2668,%edi
  0x01ebebdf: cmp    %edi,%eax
  0x01ebebe1: jb     0x01ebec12
  0x01ebebe7: mov    $0x1ead380,%edi
  0x01ebebec: cmp    %edi,%eax
  0x01ebebee: jbe    0x01ebec01
  0x01ebebf4: mov    $0x1eb2970,%edi
  0x01ebebf9: cmp    %edi,%eax
  0x01ebebfb: jb     0x01ebec12
  ;; i2c adapter must return to an interpreter frame
  0x01ebec01: push   $0x55ce723c
  0x01ebec06: call   0x01ebec0b
  0x01ebec0b: pusha  
  0x01ebec0c: call   0x557bdbf0
  0x01ebec11: hlt    
  ;; } verify_i2ce 
  0x01ebec12: mov    %esp,%edi
  0x01ebec14: sub    $0x10,%esp
  0x01ebec17: and    $0xfffffff0,%esp
  0x01ebec1a: push   %eax
  0x01ebec1b: mov    %edi,%eax
  0x01ebec1d: mov    0x2c(%ebx),%edi
  0x01ebec20: mov    0x18(%eax),%ecx
  0x01ebec23: mov    0x10(%eax),%esi
  0x01ebec26: mov    %esi,0x4(%esp)
  0x01ebec2a: mov    0x14(%eax),%esi
  0x01ebec2d: mov    %esi,0x8(%esp)
  0x01ebec31: mov    0xc(%eax),%edx
  0x01ebec34: mov    0x8(%eax),%esi
  0x01ebec37: mov    %esi,0xc(%esp)
  0x01ebec3b: mov    0x4(%eax),%esi
  0x01ebec3e: mov    %esi,0x10(%esp)
  0x01ebec42: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebec4a: mov    -0xc(%eax),%eax
  0x01ebec4d: mov    %ebx,0x168(%eax)
  0x01ebec53: mov    %ebx,%eax
  0x01ebec55: jmp    *%edi
  0x01ebec57: mov    0x4(%ecx),%ebx
  0x01ebec5a: cmp    0x8(%eax),%ebx
  0x01ebec5d: mov    0x4(%eax),%ebx
  0x01ebec60: jne    0x01ebec73
  0x01ebec66: cmpl   $0x0,0x30(%ebx)
  0x01ebec6d: je     0x01ebecb2
  0x01ebec73: jmp    0x01ea32d0
  0x01ebec78: cmpl   $0x0,0x30(%ebx)
  0x01ebec7f: je     0x01ebecb2
  0x01ebec85: mov    (%esp),%eax
  0x01ebec88: pusha  
  0x01ebec89: pushf  
  0x01ebec8a: sub    $0x10,%esp
  0x01ebec8d: movsd  %xmm0,(%esp)
  0x01ebec92: movsd  %xmm1,0x8(%esp)
  0x01ebec98: push   %eax
  0x01ebec99: push   %ebx
  0x01ebec9a: call   0x55be79d0
  0x01ebec9f: add    $0x8,%esp
  0x01ebeca2: movsd  (%esp),%xmm0
  0x01ebeca7: movsd  0x8(%esp),%xmm1
  0x01ebecad: add    $0x10,%esp
  0x01ebecb0: popf   
  0x01ebecb1: popa   
  0x01ebecb2: pop    %eax
  0x01ebecb3: mov    %esp,%esi
  0x01ebecb5: sub    $0x18,%esp
  0x01ebecb8: mov    %ecx,0x14(%esp)
  0x01ebecbc: mov    0x18(%esp),%edi
  0x01ebecc0: mov    %edi,0xc(%esp)
  0x01ebecc4: mov    0x1c(%esp),%edi
  0x01ebecc8: mov    %edi,0x10(%esp)
  0x01ebeccc: mov    %edx,0x8(%esp)
  0x01ebecd0: mov    0x20(%esp),%edi
  0x01ebecd4: mov    %edi,0x4(%esp)
  0x01ebecd8: mov    0x24(%esp),%edi
  0x01ebecdc: mov    %edi,(%esp)
  0x01ebecdf: mov    0x24(%ebx),%ecx
  0x01ebece2: push   %eax
  0x01ebece3: jmp    *%ecx

AHE@0x018fa064: 0xabea7ea0 i2c: 0x01ebed70 c2i: 0x01ebee36 c2iUV: 0x01ebee15
i2c argument handler #64 for: receiver (JLjava/util/function/ToDoubleFunction;DLjava/util/function/DoubleBinaryOperator;)D (305 bytes generated)
c2i argument handler starts at 01EBEE36
  0x01ebed70: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebed73: mov    $0x1dc2940,%edi
  0x01ebed78: cmp    %edi,%eax
  0x01ebed7a: jbe    0x01ebed8d
  0x01ebed80: mov    $0x1ea2940,%edi
  0x01ebed85: cmp    %edi,%eax
  0x01ebed87: jb     0x01ebedd2
  0x01ebed8d: mov    $0x1dc0340,%edi
  0x01ebed92: cmp    %edi,%eax
  0x01ebed94: jbe    0x01ebeda7
  0x01ebed9a: mov    $0x1dc2668,%edi
  0x01ebed9f: cmp    %edi,%eax
  0x01ebeda1: jb     0x01ebedd2
  0x01ebeda7: mov    $0x1ead380,%edi
  0x01ebedac: cmp    %edi,%eax
  0x01ebedae: jbe    0x01ebedc1
  0x01ebedb4: mov    $0x1eb2970,%edi
  0x01ebedb9: cmp    %edi,%eax
  0x01ebedbb: jb     0x01ebedd2
  ;; i2c adapter must return to an interpreter frame
  0x01ebedc1: push   $0x55ce723c
  0x01ebedc6: call   0x01ebedcb
  0x01ebedcb: pusha  
  0x01ebedcc: call   0x557bdbf0
  0x01ebedd1: hlt    
  ;; } verify_i2ce 
  0x01ebedd2: mov    %esp,%edi
  0x01ebedd4: sub    $0x10,%esp
  0x01ebedd7: and    $0xfffffff0,%esp
  0x01ebedda: push   %eax
  0x01ebeddb: mov    %edi,%eax
  0x01ebeddd: mov    0x2c(%ebx),%edi
  0x01ebede0: mov    0x1c(%eax),%ecx
  0x01ebede3: mov    0x14(%eax),%esi
  0x01ebede6: mov    %esi,0x4(%esp)
  0x01ebedea: mov    0x18(%eax),%esi
  0x01ebeded: mov    %esi,0x8(%esp)
  0x01ebedf1: mov    0x10(%eax),%edx
  0x01ebedf4: movsd  0x8(%eax),%xmm0
  0x01ebedf9: mov    0x4(%eax),%esi
  0x01ebedfc: mov    %esi,0xc(%esp)
  0x01ebee00: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebee08: mov    -0xc(%eax),%eax
  0x01ebee0b: mov    %ebx,0x168(%eax)
  0x01ebee11: mov    %ebx,%eax
  0x01ebee13: jmp    *%edi
  0x01ebee15: mov    0x4(%ecx),%ebx
  0x01ebee18: cmp    0x8(%eax),%ebx
  0x01ebee1b: mov    0x4(%eax),%ebx
  0x01ebee1e: jne    0x01ebee31
  0x01ebee24: cmpl   $0x0,0x30(%ebx)
  0x01ebee2b: je     0x01ebee70
  0x01ebee31: jmp    0x01ea32d0
  0x01ebee36: cmpl   $0x0,0x30(%ebx)
  0x01ebee3d: je     0x01ebee70
  0x01ebee43: mov    (%esp),%eax
  0x01ebee46: pusha  
  0x01ebee47: pushf  
  0x01ebee48: sub    $0x10,%esp
  0x01ebee4b: movsd  %xmm0,(%esp)
  0x01ebee50: movsd  %xmm1,0x8(%esp)
  0x01ebee56: push   %eax
  0x01ebee57: push   %ebx
  0x01ebee58: call   0x55be79d0
  0x01ebee5d: add    $0x8,%esp
  0x01ebee60: movsd  (%esp),%xmm0
  0x01ebee65: movsd  0x8(%esp),%xmm1
  0x01ebee6b: add    $0x10,%esp
  0x01ebee6e: popf   
  0x01ebee6f: popa   
  0x01ebee70: pop    %eax
  0x01ebee71: mov    %esp,%esi
  0x01ebee73: sub    $0x1c,%esp
  0x01ebee76: mov    %ecx,0x18(%esp)
  0x01ebee7a: mov    0x1c(%esp),%edi
  0x01ebee7e: mov    %edi,0x10(%esp)
  0x01ebee82: mov    0x20(%esp),%edi
  0x01ebee86: mov    %edi,0x14(%esp)
  0x01ebee8a: mov    %edx,0xc(%esp)
  0x01ebee8e: movsd  %xmm0,0x4(%esp)
  0x01ebee94: mov    0x24(%esp),%edi
  0x01ebee98: mov    %edi,(%esp)
  0x01ebee9b: mov    0x24(%ebx),%ecx
  0x01ebee9e: push   %eax
  0x01ebee9f: jmp    *%ecx

AHE@0x018fa090: 0xbeaaaa00 i2c: 0x01ebef30 c2i: 0x01ebeff8 c2iUV: 0x01ebefd7
i2c argument handler #65 for: static (JI[CII)I (309 bytes generated)
c2i argument handler starts at 01EBEFF8
  0x01ebef30: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebef33: mov    $0x1dc2940,%edi
  0x01ebef38: cmp    %edi,%eax
  0x01ebef3a: jbe    0x01ebef4d
  0x01ebef40: mov    $0x1ea2940,%edi
  0x01ebef45: cmp    %edi,%eax
  0x01ebef47: jb     0x01ebef92
  0x01ebef4d: mov    $0x1dc0340,%edi
  0x01ebef52: cmp    %edi,%eax
  0x01ebef54: jbe    0x01ebef67
  0x01ebef5a: mov    $0x1dc2668,%edi
  0x01ebef5f: cmp    %edi,%eax
  0x01ebef61: jb     0x01ebef92
  0x01ebef67: mov    $0x1ead380,%edi
  0x01ebef6c: cmp    %edi,%eax
  0x01ebef6e: jbe    0x01ebef81
  0x01ebef74: mov    $0x1eb2970,%edi
  0x01ebef79: cmp    %edi,%eax
  0x01ebef7b: jb     0x01ebef92
  ;; i2c adapter must return to an interpreter frame
  0x01ebef81: push   $0x55ce723c
  0x01ebef86: call   0x01ebef8b
  0x01ebef8b: pusha  
  0x01ebef8c: call   0x557bdbf0
  0x01ebef91: hlt    
  ;; } verify_i2ce 
  0x01ebef92: mov    %esp,%edi
  0x01ebef94: sub    $0x10,%esp
  0x01ebef97: and    $0xfffffff0,%esp
  0x01ebef9a: push   %eax
  0x01ebef9b: mov    %edi,%eax
  0x01ebef9d: mov    0x2c(%ebx),%edi
  0x01ebefa0: mov    0x14(%eax),%esi
  0x01ebefa3: mov    %esi,0x4(%esp)
  0x01ebefa7: mov    0x18(%eax),%esi
  0x01ebefaa: mov    %esi,0x8(%esp)
  0x01ebefae: mov    0x10(%eax),%ecx
  0x01ebefb1: mov    0xc(%eax),%edx
  0x01ebefb4: mov    0x8(%eax),%esi
  0x01ebefb7: mov    %esi,0xc(%esp)
  0x01ebefbb: mov    0x4(%eax),%esi
  0x01ebefbe: mov    %esi,0x10(%esp)
  0x01ebefc2: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebefca: mov    -0xc(%eax),%eax
  0x01ebefcd: mov    %ebx,0x168(%eax)
  0x01ebefd3: mov    %ebx,%eax
  0x01ebefd5: jmp    *%edi
  0x01ebefd7: mov    0x4(%ecx),%ebx
  0x01ebefda: cmp    0x8(%eax),%ebx
  0x01ebefdd: mov    0x4(%eax),%ebx
  0x01ebefe0: jne    0x01ebeff3
  0x01ebefe6: cmpl   $0x0,0x30(%ebx)
  0x01ebefed: je     0x01ebf032
  0x01ebeff3: jmp    0x01ea32d0
  0x01ebeff8: cmpl   $0x0,0x30(%ebx)
  0x01ebefff: je     0x01ebf032
  0x01ebf005: mov    (%esp),%eax
  0x01ebf008: pusha  
  0x01ebf009: pushf  
  0x01ebf00a: sub    $0x10,%esp
  0x01ebf00d: movsd  %xmm0,(%esp)
  0x01ebf012: movsd  %xmm1,0x8(%esp)
  0x01ebf018: push   %eax
  0x01ebf019: push   %ebx
  0x01ebf01a: call   0x55be79d0
  0x01ebf01f: add    $0x8,%esp
  0x01ebf022: movsd  (%esp),%xmm0
  0x01ebf027: movsd  0x8(%esp),%xmm1
  0x01ebf02d: add    $0x10,%esp
  0x01ebf030: popf   
  0x01ebf031: popa   
  0x01ebf032: pop    %eax
  0x01ebf033: mov    %esp,%esi
  0x01ebf035: sub    $0x18,%esp
  0x01ebf038: mov    0x18(%esp),%edi
  0x01ebf03c: mov    %edi,0x10(%esp)
  0x01ebf040: mov    0x1c(%esp),%edi
  0x01ebf044: mov    %edi,0x14(%esp)
  0x01ebf048: mov    %ecx,0xc(%esp)
  0x01ebf04c: mov    %edx,0x8(%esp)
  0x01ebf050: mov    0x20(%esp),%edi
  0x01ebf054: mov    %edi,0x4(%esp)
  0x01ebf058: mov    0x24(%esp),%edi
  0x01ebf05c: mov    %edi,(%esp)
  0x01ebf05f: mov    0x24(%ebx),%ecx
  0x01ebf062: push   %eax
  0x01ebf063: jmp    *%ecx

AHE@0x018fa0bc: 0xaaaaaaaaaa000000 i2c: 0x01ebf0f0 c2i: 0x01ebf1d4 c2iUV: 0x01ebf1b3
i2c argument handler #66 for: receiver (Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V (369 bytes generated)
c2i argument handler starts at 01EBF1D4
  0x01ebf0f0: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01ebf0f3: mov    $0x1dc2940,%edi
  0x01ebf0f8: cmp    %edi,%eax
  0x01ebf0fa: jbe    0x01ebf10d
  0x01ebf100: mov    $0x1ea2940,%edi
  0x01ebf105: cmp    %edi,%eax
  0x01ebf107: jb     0x01ebf152
  0x01ebf10d: mov    $0x1dc0340,%edi
  0x01ebf112: cmp    %edi,%eax
  0x01ebf114: jbe    0x01ebf127
  0x01ebf11a: mov    $0x1dc2668,%edi
  0x01ebf11f: cmp    %edi,%eax
  0x01ebf121: jb     0x01ebf152
  0x01ebf127: mov    $0x1ead380,%edi
  0x01ebf12c: cmp    %edi,%eax
  0x01ebf12e: jbe    0x01ebf141
  0x01ebf134: mov    $0x1eb2970,%edi
  0x01ebf139: cmp    %edi,%eax
  0x01ebf13b: jb     0x01ebf152
  ;; i2c adapter must return to an interpreter frame
  0x01ebf141: push   $0x55ce723c
  0x01ebf146: call   0x01ebf14b
  0x01ebf14b: pusha  
  0x01ebf14c: call   0x557bdbf0
  0x01ebf151: hlt    
  ;; } verify_i2ce 
  0x01ebf152: mov    %esp,%edi
  0x01ebf154: sub    $0x20,%esp
  0x01ebf157: and    $0xfffffff0,%esp
  0x01ebf15a: push   %eax
  0x01ebf15b: mov    %edi,%eax
  0x01ebf15d: mov    0x2c(%ebx),%edi
  0x01ebf160: mov    0x28(%eax),%ecx
  0x01ebf163: mov    0x24(%eax),%edx
  0x01ebf166: mov    0x20(%eax),%esi
  0x01ebf169: mov    %esi,0x4(%esp)
  0x01ebf16d: mov    0x1c(%eax),%esi
  0x01ebf170: mov    %esi,0x8(%esp)
  0x01ebf174: mov    0x18(%eax),%esi
  0x01ebf177: mov    %esi,0xc(%esp)
  0x01ebf17b: mov    0x14(%eax),%esi
  0x01ebf17e: mov    %esi,0x10(%esp)
  0x01ebf182: mov    0x10(%eax),%esi
  0x01ebf185: mov    %esi,0x14(%esp)
  0x01ebf189: mov    0xc(%eax),%esi
  0x01ebf18c: mov    %esi,0x18(%esp)
  0x01ebf190: mov    0x8(%eax),%esi
  0x01ebf193: mov    %esi,0x1c(%esp)
  0x01ebf197: mov    0x4(%eax),%esi
  0x01ebf19a: mov    %esi,0x20(%esp)
  0x01ebf19e: mov    %fs:0x0(,%eiz,1),%eax
  0x01ebf1a6: mov    -0xc(%eax),%eax
  0x01ebf1a9: mov    %ebx,0x168(%eax)
  0x01ebf1af: mov    %ebx,%eax
  0x01ebf1b1: jmp    *%edi
  0x01ebf1b3: mov    0x4(%ecx),%ebx
  0x01ebf1b6: cmp    0x8(%eax),%ebx
  0x01ebf1b9: mov    0x4(%eax),%ebx
  0x01ebf1bc: jne    0x01ebf1cf
  0x01ebf1c2: cmpl   $0x0,0x30(%ebx)
  0x01ebf1c9: je     0x01ebf20e
  0x01ebf1cf: jmp    0x01ea32d0
  0x01ebf1d4: cmpl   $0x0,0x30(%ebx)
  0x01ebf1db: je     0x01ebf20e
  0x01ebf1e1: mov    (%esp),%eax
  0x01ebf1e4: pusha  
  0x01ebf1e5: pushf  
  0x01ebf1e6: sub    $0x10,%esp
  0x01ebf1e9: movsd  %xmm0,(%esp)
  0x01ebf1ee: movsd  %xmm1,0x8(%esp)
  0x01ebf1f4: push   %eax
  0x01ebf1f5: push   %ebx
  0x01ebf1f6: call   0x55be79d0
  0x01ebf1fb: add    $0x8,%esp
  0x01ebf1fe: movsd  (%esp),%xmm0
  0x01ebf203: movsd  0x8(%esp),%xmm1
  0x01ebf209: add    $0x10,%esp
  0x01ebf20c: popf   
  0x01ebf20d: popa   
  0x01ebf20e: pop    %eax
  0x01ebf20f: mov    %esp,%esi
  0x01ebf211: sub    $0x28,%esp
  0x01ebf214: mov    %ecx,0x24(%esp)
  0x01ebf218: mov    %edx,0x20(%esp)
  0x01ebf21c: mov    0x28(%esp),%edi
  0x01ebf220: mov    %edi,0x1c(%esp)
  0x01ebf224: mov    0x2c(%esp),%edi
  0x01ebf228: mov    %edi,0x18(%esp)
  0x01ebf22c: mov    0x30(%esp),%edi
  0x01ebf230: mov    %edi,0x14(%esp)
  0x01ebf234: mov    0x34(%esp),%edi
  0x01ebf238: mov    %edi,0x10(%esp)
  0x01ebf23c: mov    0x38(%esp),%edi
  0x01ebf240: mov    %edi,0xc(%esp)
  0x01ebf244: mov    0x3c(%esp),%edi
  0x01ebf248: mov    %edi,0x8(%esp)
  0x01ebf24c: mov    0x40(%esp),%edi
  0x01ebf250: mov    %edi,0x4(%esp)
  0x01ebf254: mov    0x44(%esp),%edi
  0x01ebf258: mov    %edi,(%esp)
  0x01ebf25b: mov    0x24(%ebx),%ecx
  0x01ebf25e: push   %eax
  0x01ebf25f: jmp    *%ecx

Decoding RuntimeStub - dtrace_object_alloc Runtime1 stub 0x01f05948
  0x01f05990: push   %ebp
  0x01f05991: mov    %esp,%ebp
  ;; save_live_registers
  0x01f05993: pusha  
  0x01f05994: sub    $0xf0,%esp
  0x01f0599a: movl   $0xfeedbeef,0xec(%esp)
  0x01f059a5: movsd  %xmm0,(%esp)
  0x01f059aa: movsd  %xmm1,0x8(%esp)
  0x01f059b0: movsd  %xmm2,0x10(%esp)
  0x01f059b6: movsd  %xmm3,0x18(%esp)
  0x01f059bc: movsd  %xmm4,0x20(%esp)
  0x01f059c2: movsd  %xmm5,0x28(%esp)
  0x01f059c8: movsd  %xmm6,0x30(%esp)
  0x01f059ce: movsd  %xmm7,0x38(%esp)
  0x01f059d4: push   %eax
  0x01f059d5: call   0x55be5560
  0x01f059da: pop    %eax
  ;; restore_live_registers
  0x01f059db: movsd  (%esp),%xmm0
  0x01f059e0: movsd  0x8(%esp),%xmm1
  0x01f059e6: movsd  0x10(%esp),%xmm2
  0x01f059ec: movsd  0x18(%esp),%xmm3
  0x01f059f2: movsd  0x20(%esp),%xmm4
  0x01f059f8: movsd  0x28(%esp),%xmm5
  0x01f059fe: movsd  0x30(%esp),%xmm6
  0x01f05a04: movsd  0x38(%esp),%xmm7
  0x01f05a0a: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f05a15: je     0x01f05a2c
  0x01f05a1b: push   $0x55cdce30
  0x01f05a20: call   0x01f05a25
  0x01f05a25: pusha  
  0x01f05a26: call   0x557bdbf0
  0x01f05a2b: hlt    
  0x01f05a2c: add    $0xf0,%esp
  0x01f05a32: popa   
  0x01f05a33: mov    %ebp,%esp
  0x01f05a35: pop    %ebp
  0x01f05a36: ret    
  0x01f05a37: nop    

Decoding RuntimeStub - unwind_exception Runtime1 stub 0x01f05a48
  0x01f05aa0: mov    $0xdead,%ebx
  0x01f05aa5: mov    $0xdead,%ecx
  0x01f05aaa: mov    $0xdead,%edx
  0x01f05aaf: mov    $0xdead,%esi
  0x01f05ab4: mov    $0xdead,%edi
  0x01f05ab9: mov    %fs:0x0(,%eiz,1),%edi
  0x01f05ac1: mov    -0xc(%edi),%edi
  0x01f05ac4: cmpl   $0x0,0x1ac(%edi)
  0x01f05ace: je     0x01f05ae5
  0x01f05ad4: push   $0x55cdcf48
  0x01f05ad9: call   0x01f05ade
  0x01f05ade: pusha  
  0x01f05adf: call   0x557bdbf0
  0x01f05ae4: hlt    
  0x01f05ae5: cmpl   $0x0,0x1b0(%edi)
  0x01f05aef: je     0x01f05b06
  0x01f05af5: push   $0x55cdcf64
  0x01f05afa: call   0x01f05aff
  0x01f05aff: pusha  
  0x01f05b00: call   0x557bdbf0
  0x01f05b05: hlt    
  0x01f05b06: emms   
  0x01f05b08: mov    %eax,%esi
  0x01f05b0a: mov    %fs:0x0(,%eiz,1),%edi
  0x01f05b12: mov    -0xc(%edi),%edi
  0x01f05b15: mov    (%esp),%edx
  0x01f05b18: push   %edx
  0x01f05b19: push   %edi
  0x01f05b1a: call   0x55be3a10
  0x01f05b1f: add    $0x8,%esp
  0x01f05b22: mov    $0xdead,%ebx
  0x01f05b27: mov    $0xdead,%ecx
  0x01f05b2c: mov    $0xdead,%edx
  0x01f05b31: mov    $0xdead,%edi
  0x01f05b36: mov    %eax,%ebx
  0x01f05b38: mov    %esi,%eax
  0x01f05b3a: pop    %edx
  0x01f05b3b: mov    %fs:0x0(,%eiz,1),%edi
  0x01f05b43: mov    -0xc(%edi),%edi
  0x01f05b46: cmpl   $0x0,0x1b8(%edi)
  0x01f05b50: cmovne %ebp,%esp
  0x01f05b53: jmp    *%ebx
  0x01f05b55: nop    
  0x01f05b56: nop    
  0x01f05b57: nop    

Decoding RuntimeStub - forward_exception Runtime1 stub 0x01f05b88
  ;; generate_handle_exception
  0x01f05bf0: mov    0x4(%edi),%eax
  0x01f05bf3: movl   $0x0,0x4(%edi)
  0x01f05bfa: mov    0x4(%ebp),%edx
  0x01f05bfd: movl   $0x0,0x16c(%edi)
  0x01f05c07: movl   $0x0,0x170(%edi)
  0x01f05c11: mov    $0xdead,%ebx
  0x01f05c16: mov    $0xdead,%ecx
  0x01f05c1b: mov    $0xdead,%esi
  0x01f05c20: mov    $0xdead,%edi
  0x01f05c25: mov    %fs:0x0(,%eiz,1),%edi
  0x01f05c2d: mov    -0xc(%edi),%edi
  0x01f05c30: cmpl   $0x0,0x1ac(%edi)
  0x01f05c3a: je     0x01f05c51
  0x01f05c40: push   $0x55cdcee4
  0x01f05c45: call   0x01f05c4a
  0x01f05c4a: pusha  
  0x01f05c4b: call   0x557bdbf0
  0x01f05c50: hlt    
  0x01f05c51: cmpl   $0x0,0x1b0(%edi)
  0x01f05c5b: je     0x01f05c72
  0x01f05c61: push   $0x55cdcf00
  0x01f05c66: call   0x01f05c6b
  0x01f05c6b: pusha  
  0x01f05c6c: call   0x557bdbf0
  0x01f05c71: hlt    
  0x01f05c72: mov    %eax,0x1ac(%edi)
  0x01f05c78: mov    %edx,0x1b0(%edi)
  0x01f05c7e: mov    %edx,0x4(%ebp)
  0x01f05c81: mov    %fs:0x0(,%eiz,1),%edi
  0x01f05c89: mov    -0xc(%edi),%edi
  0x01f05c8c: push   %edi
  0x01f05c8d: mov    %ebp,0x144(%edi)
  0x01f05c93: mov    %esp,0x13c(%edi)
  0x01f05c99: call   0x55879c50
  0x01f05c9e: push   %eax
  0x01f05c9f: mov    %fs:0x0(,%eiz,1),%eax
  0x01f05ca7: mov    -0xc(%eax),%eax
  0x01f05caa: cmp    %eax,%edi
  0x01f05cac: je     0x01f05cc4
  0x01f05cb2: int3   
  0x01f05cb3: push   $0x55cdcc08
  0x01f05cb8: call   0x01f05cbd
  0x01f05cbd: pusha  
  0x01f05cbe: call   0x557bdbf0
  0x01f05cc3: hlt    
  0x01f05cc4: pop    %eax
  0x01f05cc5: movl   $0x0,0x13c(%edi)
  0x01f05ccf: movl   $0x0,0x144(%edi)
  0x01f05cd9: add    $0x4,%esp
  0x01f05cdc: cmpl   $0x0,0x4(%edi)
  0x01f05ce3: je     0x01f05cfd
  0x01f05ce9: mov    0x4(%edi),%eax
  0x01f05cec: push   $0x55ccd97c
  0x01f05cf1: call   0x01f05cf6
  0x01f05cf6: pusha  
  0x01f05cf7: call   0x557bdbf0
  0x01f05cfc: hlt    
  0x01f05cfd: mov    $0xdead,%ebx
  0x01f05d02: mov    $0xdead,%ecx
  0x01f05d07: mov    $0xdead,%edx
  0x01f05d0c: mov    $0xdead,%esi
  0x01f05d11: mov    $0xdead,%edi
  0x01f05d16: mov    %eax,0x4(%ebp)
  ;; restore_live_registers
  0x01f05d19: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f05d24: je     0x01f05d3b
  0x01f05d2a: push   $0x55cdce30
  0x01f05d2f: call   0x01f05d34
  0x01f05d34: pusha  
  0x01f05d35: call   0x557bdbf0
  0x01f05d3a: hlt    
  0x01f05d3b: add    $0xf0,%esp
  0x01f05d41: popa   
  0x01f05d42: mov    %ebp,%esp
  0x01f05d44: pop    %ebp
  0x01f05d45: ret    
  0x01f05d46: nop    
  0x01f05d47: nop    

Decoding RuntimeStub - throw_range_check_failed Runtime1 stub 0x01f05d88
  0x01f05de0: push   %ebp
  0x01f05de1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f05de3: pusha  
  0x01f05de4: sub    $0xf0,%esp
  0x01f05dea: movl   $0xfeedbeef,0xec(%esp)
  0x01f05df5: movsd  %xmm0,(%esp)
  0x01f05dfa: movsd  %xmm1,0x8(%esp)
  0x01f05e00: movsd  %xmm2,0x10(%esp)
  0x01f05e06: movsd  %xmm3,0x18(%esp)
  0x01f05e0c: movsd  %xmm4,0x20(%esp)
  0x01f05e12: movsd  %xmm5,0x28(%esp)
  0x01f05e18: movsd  %xmm6,0x30(%esp)
  0x01f05e1e: movsd  %xmm7,0x38(%esp)
  0x01f05e24: mov    $0xdead,%eax
  0x01f05e29: mov    $0xdead,%ebx
  0x01f05e2e: mov    $0xdead,%ecx
  0x01f05e33: mov    $0xdead,%edx
  0x01f05e38: mov    $0xdead,%esi
  0x01f05e3d: mov    $0xdead,%edi
  0x01f05e42: mov    0x8(%ebp),%ebx
  0x01f05e45: push   %ebx
  0x01f05e46: mov    %fs:0x0(,%eiz,1),%edi
  0x01f05e4e: mov    -0xc(%edi),%edi
  0x01f05e51: push   %edi
  0x01f05e52: mov    %ebp,0x144(%edi)
  0x01f05e58: mov    %esp,0x13c(%edi)
  0x01f05e5e: call   0x55879d10
  0x01f05e63: push   %eax
  0x01f05e64: mov    %fs:0x0(,%eiz,1),%eax
  0x01f05e6c: mov    -0xc(%eax),%eax
  0x01f05e6f: cmp    %eax,%edi
  0x01f05e71: je     0x01f05e89
  0x01f05e77: int3   
  0x01f05e78: push   $0x55cdcc08
  0x01f05e7d: call   0x01f05e82
  0x01f05e82: pusha  
  0x01f05e83: call   0x557bdbf0
  0x01f05e88: hlt    
  0x01f05e89: pop    %eax
  0x01f05e8a: movl   $0x0,0x13c(%edi)
  0x01f05e94: movl   $0x0,0x144(%edi)
  0x01f05e9e: add    $0x8,%esp
  0x01f05ea1: cmpl   $0x0,0x4(%edi)
  0x01f05ea8: je     0x01f05eb6
  0x01f05eae: mov    0x4(%edi),%eax
  0x01f05eb1: jmp    0x01f05bf0
  0x01f05eb6: push   $0x55cdce84
  0x01f05ebb: call   0x01f05ec0
  0x01f05ec0: pusha  
  0x01f05ec1: call   0x557bdbf0
  0x01f05ec6: hlt    
  0x01f05ec7: mov    %ebp,%esp
  0x01f05ec9: pop    %ebp
  0x01f05eca: ret    
  0x01f05ecb: nop    

Decoding RuntimeStub - throw_index_exception Runtime1 stub 0x01f05f08
  0x01f05f60: push   %ebp
  0x01f05f61: mov    %esp,%ebp
  ;; save_live_registers
  0x01f05f63: pusha  
  0x01f05f64: sub    $0xf0,%esp
  0x01f05f6a: movl   $0xfeedbeef,0xec(%esp)
  0x01f05f75: movsd  %xmm0,(%esp)
  0x01f05f7a: movsd  %xmm1,0x8(%esp)
  0x01f05f80: movsd  %xmm2,0x10(%esp)
  0x01f05f86: movsd  %xmm3,0x18(%esp)
  0x01f05f8c: movsd  %xmm4,0x20(%esp)
  0x01f05f92: movsd  %xmm5,0x28(%esp)
  0x01f05f98: movsd  %xmm6,0x30(%esp)
  0x01f05f9e: movsd  %xmm7,0x38(%esp)
  0x01f05fa4: mov    $0xdead,%eax
  0x01f05fa9: mov    $0xdead,%ebx
  0x01f05fae: mov    $0xdead,%ecx
  0x01f05fb3: mov    $0xdead,%edx
  0x01f05fb8: mov    $0xdead,%esi
  0x01f05fbd: mov    $0xdead,%edi
  0x01f05fc2: mov    0x8(%ebp),%ebx
  0x01f05fc5: push   %ebx
  0x01f05fc6: mov    %fs:0x0(,%eiz,1),%edi
  0x01f05fce: mov    -0xc(%edi),%edi
  0x01f05fd1: push   %edi
  0x01f05fd2: mov    %ebp,0x144(%edi)
  0x01f05fd8: mov    %esp,0x13c(%edi)
  0x01f05fde: call   0x55879e40
  0x01f05fe3: push   %eax
  0x01f05fe4: mov    %fs:0x0(,%eiz,1),%eax
  0x01f05fec: mov    -0xc(%eax),%eax
  0x01f05fef: cmp    %eax,%edi
  0x01f05ff1: je     0x01f06009
  0x01f05ff7: int3   
  0x01f05ff8: push   $0x55cdcc08
  0x01f05ffd: call   0x01f06002
  0x01f06002: pusha  
  0x01f06003: call   0x557bdbf0
  0x01f06008: hlt    
  0x01f06009: pop    %eax
  0x01f0600a: movl   $0x0,0x13c(%edi)
  0x01f06014: movl   $0x0,0x144(%edi)
  0x01f0601e: add    $0x8,%esp
  0x01f06021: cmpl   $0x0,0x4(%edi)
  0x01f06028: je     0x01f06036
  0x01f0602e: mov    0x4(%edi),%eax
  0x01f06031: jmp    0x01f05bf0
  0x01f06036: push   $0x55cdce84
  0x01f0603b: call   0x01f06040
  0x01f06040: pusha  
  0x01f06041: call   0x557bdbf0
  0x01f06046: hlt    
  0x01f06047: mov    %ebp,%esp
  0x01f06049: pop    %ebp
  0x01f0604a: ret    
  0x01f0604b: nop    

Decoding RuntimeStub - throw_div0_exception Runtime1 stub 0x01f06088
  0x01f060e0: push   %ebp
  0x01f060e1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f060e3: pusha  
  0x01f060e4: sub    $0xf0,%esp
  0x01f060ea: movl   $0xfeedbeef,0xec(%esp)
  0x01f060f5: movsd  %xmm0,(%esp)
  0x01f060fa: movsd  %xmm1,0x8(%esp)
  0x01f06100: movsd  %xmm2,0x10(%esp)
  0x01f06106: movsd  %xmm3,0x18(%esp)
  0x01f0610c: movsd  %xmm4,0x20(%esp)
  0x01f06112: movsd  %xmm5,0x28(%esp)
  0x01f06118: movsd  %xmm6,0x30(%esp)
  0x01f0611e: movsd  %xmm7,0x38(%esp)
  0x01f06124: mov    $0xdead,%eax
  0x01f06129: mov    $0xdead,%ebx
  0x01f0612e: mov    $0xdead,%ecx
  0x01f06133: mov    $0xdead,%edx
  0x01f06138: mov    $0xdead,%esi
  0x01f0613d: mov    $0xdead,%edi
  0x01f06142: mov    %fs:0x0(,%eiz,1),%edi
  0x01f0614a: mov    -0xc(%edi),%edi
  0x01f0614d: push   %edi
  0x01f0614e: mov    %ebp,0x144(%edi)
  0x01f06154: mov    %esp,0x13c(%edi)
  0x01f0615a: call   0x55879f70
  0x01f0615f: push   %eax
  0x01f06160: mov    %fs:0x0(,%eiz,1),%eax
  0x01f06168: mov    -0xc(%eax),%eax
  0x01f0616b: cmp    %eax,%edi
  0x01f0616d: je     0x01f06185
  0x01f06173: int3   
  0x01f06174: push   $0x55cdcc08
  0x01f06179: call   0x01f0617e
  0x01f0617e: pusha  
  0x01f0617f: call   0x557bdbf0
  0x01f06184: hlt    
  0x01f06185: pop    %eax
  0x01f06186: movl   $0x0,0x13c(%edi)
  0x01f06190: movl   $0x0,0x144(%edi)
  0x01f0619a: add    $0x4,%esp
  0x01f0619d: cmpl   $0x0,0x4(%edi)
  0x01f061a4: je     0x01f061b2
  0x01f061aa: mov    0x4(%edi),%eax
  0x01f061ad: jmp    0x01f05bf0
  0x01f061b2: push   $0x55cdce84
  0x01f061b7: call   0x01f061bc
  0x01f061bc: pusha  
  0x01f061bd: call   0x557bdbf0
  0x01f061c2: hlt    
  0x01f061c3: mov    %ebp,%esp
  0x01f061c5: pop    %ebp
  0x01f061c6: ret    
  0x01f061c7: nop    

Decoding RuntimeStub - throw_null_pointer_exception Runtime1 stub 0x01f06208
  0x01f06260: push   %ebp
  0x01f06261: mov    %esp,%ebp
  ;; save_live_registers
  0x01f06263: pusha  
  0x01f06264: sub    $0xf0,%esp
  0x01f0626a: movl   $0xfeedbeef,0xec(%esp)
  0x01f06275: movsd  %xmm0,(%esp)
  0x01f0627a: movsd  %xmm1,0x8(%esp)
  0x01f06280: movsd  %xmm2,0x10(%esp)
  0x01f06286: movsd  %xmm3,0x18(%esp)
  0x01f0628c: movsd  %xmm4,0x20(%esp)
  0x01f06292: movsd  %xmm5,0x28(%esp)
  0x01f06298: movsd  %xmm6,0x30(%esp)
  0x01f0629e: movsd  %xmm7,0x38(%esp)
  0x01f062a4: mov    $0xdead,%eax
  0x01f062a9: mov    $0xdead,%ebx
  0x01f062ae: mov    $0xdead,%ecx
  0x01f062b3: mov    $0xdead,%edx
  0x01f062b8: mov    $0xdead,%esi
  0x01f062bd: mov    $0xdead,%edi
  0x01f062c2: mov    %fs:0x0(,%eiz,1),%edi
  0x01f062ca: mov    -0xc(%edi),%edi
  0x01f062cd: push   %edi
  0x01f062ce: mov    %ebp,0x144(%edi)
  0x01f062d4: mov    %esp,0x13c(%edi)
  0x01f062da: call   0x5587a090
  0x01f062df: push   %eax
  0x01f062e0: mov    %fs:0x0(,%eiz,1),%eax
  0x01f062e8: mov    -0xc(%eax),%eax
  0x01f062eb: cmp    %eax,%edi
  0x01f062ed: je     0x01f06305
  0x01f062f3: int3   
  0x01f062f4: push   $0x55cdcc08
  0x01f062f9: call   0x01f062fe
  0x01f062fe: pusha  
  0x01f062ff: call   0x557bdbf0
  0x01f06304: hlt    
  0x01f06305: pop    %eax
  0x01f06306: movl   $0x0,0x13c(%edi)
  0x01f06310: movl   $0x0,0x144(%edi)
  0x01f0631a: add    $0x4,%esp
  0x01f0631d: cmpl   $0x0,0x4(%edi)
  0x01f06324: je     0x01f06332
  0x01f0632a: mov    0x4(%edi),%eax
  0x01f0632d: jmp    0x01f05bf0
  0x01f06332: push   $0x55cdce84
  0x01f06337: call   0x01f0633c
  0x01f0633c: pusha  
  0x01f0633d: call   0x557bdbf0
  0x01f06342: hlt    
  0x01f06343: mov    %ebp,%esp
  0x01f06345: pop    %ebp
  0x01f06346: ret    
  0x01f06347: nop    

Decoding RuntimeStub - register_finalizer Runtime1 stub 0x01f06388
  0x01f063e0: mov    0x4(%esp),%eax
  0x01f063e4: mov    0x4(%eax),%esi
  0x01f063e7: mov    0x58(%esi),%esi
  0x01f063ea: test   $0x40000000,%esi
  0x01f063f0: jne    0x01f063f7
  0x01f063f6: ret    
  0x01f063f7: push   %ebp
  0x01f063f8: mov    %esp,%ebp
  ;; save_live_registers
  0x01f063fa: pusha  
  0x01f063fb: sub    $0xf0,%esp
  0x01f06401: movl   $0xfeedbeef,0xec(%esp)
  0x01f0640c: movsd  %xmm0,(%esp)
  0x01f06411: movsd  %xmm1,0x8(%esp)
  0x01f06417: movsd  %xmm2,0x10(%esp)
  0x01f0641d: movsd  %xmm3,0x18(%esp)
  0x01f06423: movsd  %xmm4,0x20(%esp)
  0x01f06429: movsd  %xmm5,0x28(%esp)
  0x01f0642f: movsd  %xmm6,0x30(%esp)
  0x01f06435: movsd  %xmm7,0x38(%esp)
  0x01f0643b: push   %eax
  0x01f0643c: mov    %fs:0x0(,%eiz,1),%edi
  0x01f06444: mov    -0xc(%edi),%edi
  0x01f06447: push   %edi
  0x01f06448: mov    %ebp,0x144(%edi)
  0x01f0644e: mov    %esp,0x13c(%edi)
  0x01f06454: call   0x55be53c0
  0x01f06459: push   %eax
  0x01f0645a: mov    %fs:0x0(,%eiz,1),%eax
  0x01f06462: mov    -0xc(%eax),%eax
  0x01f06465: cmp    %eax,%edi
  0x01f06467: je     0x01f0647f
  0x01f0646d: int3   
  0x01f0646e: push   $0x55cdcc08
  0x01f06473: call   0x01f06478
  0x01f06478: pusha  
  0x01f06479: call   0x557bdbf0
  0x01f0647e: hlt    
  0x01f0647f: pop    %eax
  0x01f06480: movl   $0x0,0x13c(%edi)
  0x01f0648a: movl   $0x0,0x144(%edi)
  0x01f06494: add    $0x8,%esp
  0x01f06497: cmpl   $0x0,0x4(%edi)
  0x01f0649e: je     0x01f064ac
  0x01f064a4: mov    0x4(%edi),%eax
  0x01f064a7: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f064ac: movsd  (%esp),%xmm0
  0x01f064b1: movsd  0x8(%esp),%xmm1
  0x01f064b7: movsd  0x10(%esp),%xmm2
  0x01f064bd: movsd  0x18(%esp),%xmm3
  0x01f064c3: movsd  0x20(%esp),%xmm4
  0x01f064c9: movsd  0x28(%esp),%xmm5
  0x01f064cf: movsd  0x30(%esp),%xmm6
  0x01f064d5: movsd  0x38(%esp),%xmm7
  0x01f064db: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f064e6: je     0x01f064fd
  0x01f064ec: push   $0x55cdce30
  0x01f064f1: call   0x01f064f6
  0x01f064f6: pusha  
  0x01f064f7: call   0x557bdbf0
  0x01f064fc: hlt    
  0x01f064fd: add    $0xf0,%esp
  0x01f06503: popa   
  0x01f06504: mov    %ebp,%esp
  0x01f06506: pop    %ebp
  0x01f06507: ret    

Decoding RuntimeStub - new_instance Runtime1 stub 0x01f06548
  0x01f065a0: push   %ebp
  0x01f065a1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f065a3: pusha  
  0x01f065a4: sub    $0xf0,%esp
  0x01f065aa: movl   $0xfeedbeef,0xec(%esp)
  0x01f065b5: movsd  %xmm0,(%esp)
  0x01f065ba: movsd  %xmm1,0x8(%esp)
  0x01f065c0: movsd  %xmm2,0x10(%esp)
  0x01f065c6: movsd  %xmm3,0x18(%esp)
  0x01f065cc: movsd  %xmm4,0x20(%esp)
  0x01f065d2: movsd  %xmm5,0x28(%esp)
  0x01f065d8: movsd  %xmm6,0x30(%esp)
  0x01f065de: movsd  %xmm7,0x38(%esp)
  0x01f065e4: push   %edx
  0x01f065e5: mov    %fs:0x0(,%eiz,1),%edi
  0x01f065ed: mov    -0xc(%edi),%edi
  0x01f065f0: push   %edi
  0x01f065f1: mov    %ebp,0x144(%edi)
  0x01f065f7: mov    %esp,0x13c(%edi)
  0x01f065fd: call   0x558792a0
  0x01f06602: push   %eax
  0x01f06603: mov    %fs:0x0(,%eiz,1),%eax
  0x01f0660b: mov    -0xc(%eax),%eax
  0x01f0660e: cmp    %eax,%edi
  0x01f06610: je     0x01f06628
  0x01f06616: int3   
  0x01f06617: push   $0x55cdcc08
  0x01f0661c: call   0x01f06621
  0x01f06621: pusha  
  0x01f06622: call   0x557bdbf0
  0x01f06627: hlt    
  0x01f06628: pop    %eax
  0x01f06629: movl   $0x0,0x13c(%edi)
  0x01f06633: movl   $0x0,0x144(%edi)
  0x01f0663d: add    $0x8,%esp
  0x01f06640: cmpl   $0x0,0x4(%edi)
  0x01f06647: je     0x01f0665f
  0x01f0664d: mov    0x4(%edi),%eax
  0x01f06650: movl   $0x0,0x16c(%edi)
  0x01f0665a: jmp    0x01f05bf0
  0x01f0665f: mov    0x16c(%edi),%eax
  0x01f06665: movl   $0x0,0x16c(%edi)
  ;; restore_live_registers_except_rax
  0x01f0666f: movsd  (%esp),%xmm0
  0x01f06674: movsd  0x8(%esp),%xmm1
  0x01f0667a: movsd  0x10(%esp),%xmm2
  0x01f06680: movsd  0x18(%esp),%xmm3
  0x01f06686: movsd  0x20(%esp),%xmm4
  0x01f0668c: movsd  0x28(%esp),%xmm5
  0x01f06692: movsd  0x30(%esp),%xmm6
  0x01f06698: movsd  0x38(%esp),%xmm7
  0x01f0669e: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f066a9: je     0x01f066c0
  0x01f066af: push   $0x55cdce30
  0x01f066b4: call   0x01f066b9
  0x01f066b9: pusha  
  0x01f066ba: call   0x557bdbf0
  0x01f066bf: hlt    
  0x01f066c0: add    $0xf0,%esp
  0x01f066c6: pop    %edi
  0x01f066c7: pop    %esi
  0x01f066c8: pop    %ebp
  0x01f066c9: pop    %ebx
  0x01f066ca: pop    %ebx
  0x01f066cb: pop    %edx
  0x01f066cc: pop    %ecx
  0x01f066cd: add    $0x4,%esp
  0x01f066d0: mov    %ebp,%esp
  0x01f066d2: pop    %ebp
  0x01f066d3: ret    

Decoding RuntimeStub - fast_new_instance Runtime1 stub 0x01f06708
  0x01f067d0: push   %edi
  0x01f067d1: push   %ebx
  0x01f067d2: mov    0x8(%edx),%ecx
  0x01f067d5: cmp    $0x0,%ecx
  0x01f067d8: jle    0x01f067ea
  0x01f067de: test   $0x1,%ecx
  0x01f067e4: je     0x01f0680c
  0x01f067ea: push   $0x55cdd17c
  0x01f067ef: call   0x01f067f4
  0x01f067f4: pusha  
  0x01f067f5: call   0x557bdbf0
  0x01f067fa: hlt    
  0x01f067fb: push   $0x55ccd97c
  0x01f06800: call   0x01f06805
  0x01f06805: pusha  
  0x01f06806: call   0x557bdbf0
  0x01f0680b: hlt    
  0x01f0680c: mov    %fs:0x0(,%eiz,1),%edi
  0x01f06814: mov    -0xc(%edi),%edi
  0x01f06817: mov    0x44(%edi),%eax
  0x01f0681a: mov    0x4c(%edi),%ecx
  0x01f0681d: sub    %eax,%ecx
  0x01f0681f: shr    $0x2,%ecx
  0x01f06822: cmp    0x54(%edi),%ecx
  0x01f06825: jle    0x01f0683c
  0x01f0682b: mov    $0x4,%esi
  0x01f06830: add    %esi,0x54(%edi)
  0x01f06833: addl   $0x1,0x68(%edi)
  0x01f06837: jmp    0x01f0695c
  0x01f0683c: addl   $0x1,0x58(%edi)
  0x01f06840: add    %ecx,0x5c(%edi)
  0x01f06843: test   %eax,%eax
  0x01f06845: je     0x01f06878
  0x01f0684b: movl   $0x101,(%eax)
  0x01f06851: sub    $0x3,%ecx
  0x01f06854: add    $0x4,%ecx
  0x01f06857: shl    $0x0,%ecx
  0x01f0685a: mov    %ecx,0x8(%eax)
  0x01f0685d: mov    0x5600111c,%ecx
  0x01f06863: mov    %ecx,0x4(%eax)
  0x01f06866: mov    %eax,%ecx
  0x01f06868: sub    0x40(%edi),%ecx
  0x01f0686b: add    %ecx,0x88(%edi)
  0x01f06871: adcl   $0x0,0x8c(%edi)
  0x01f06878: mov    0x50(%edi),%ecx
  0x01f0687b: shl    $0x2,%ecx
  0x01f0687e: mov    0x4006c0,%eax
  0x01f06884: lea    (%eax,%ecx,1),%esi
  0x01f06887: cmp    %eax,%esi
  0x01f06889: jb     0x01f069e5
  0x01f0688f: cmp    0x400690,%esi
  0x01f06895: ja     0x01f069e5
  0x01f0689b: lock cmpxchg %esi,0x4006c0
  0x01f068a3: jne    0x01f0687e
  0x01f068a5: push   %esi
  0x01f068a6: mov    0x50(%edi),%esi
  0x01f068a9: shl    $0x2,%esi
  0x01f068ac: cmp    %esi,%ecx
  0x01f068ae: je     0x01f068d6
  ;; assert(t1 != tlab size)
  0x01f068b4: push   $0x55ce38fc
  0x01f068b9: call   0x01f068be
  0x01f068be: pusha  
  0x01f068bf: call   0x557bdbf0
  0x01f068c4: hlt    
  0x01f068c5: push   $0x55ccd97c
  0x01f068ca: call   0x01f068cf
  0x01f068cf: pusha  
  0x01f068d0: call   0x557bdbf0
  0x01f068d5: hlt    
  0x01f068d6: pop    %esi
  0x01f068d7: mov    %eax,0x40(%edi)
  0x01f068da: mov    %eax,0x44(%edi)
  0x01f068dd: add    %ecx,%eax
  0x01f068df: sub    $0x10,%eax
  0x01f068e2: mov    %eax,0x4c(%edi)
  0x01f068e5: jmp    0x01f068ea
  0x01f068ea: mov    0x8(%edx),%ecx
  0x01f068ed: mov    %fs:0x0(,%eiz,1),%ebx
  0x01f068f5: mov    -0xc(%ebx),%ebx
  0x01f068f8: mov    0x44(%ebx),%eax
  0x01f068fb: lea    (%eax,%ecx,1),%esi
  0x01f068fe: cmp    0x4c(%ebx),%esi
  0x01f06901: ja     0x01f069e5
  0x01f06907: mov    %esi,0x44(%ebx)
  0x01f0690a: mov    0x68(%edx),%ebx
  0x01f0690d: mov    %ebx,(%eax)
  0x01f0690f: mov    %edx,0x4(%eax)
  0x01f06912: mov    %ecx,%esi
  0x01f06914: sub    $0x8,%esi
  0x01f06917: je     0x01f06959
  0x01f0691d: test   $0x3,%esi
  0x01f06923: je     0x01f0693a
  0x01f06929: push   $0x55cdc488
  0x01f0692e: call   0x01f06933
  0x01f06933: pusha  
  0x01f06934: call   0x557bdbf0
  0x01f06939: hlt    
  0x01f0693a: xor    %ebx,%ebx
  0x01f0693c: shr    $0x3,%esi
  0x01f0693f: jae    0x01f0694f
  0x01f06945: mov    %ebx,0x8(%eax,%esi,8)
  0x01f06949: je     0x01f06959
  0x01f0694f: mov    %ebx,0x4(%eax,%esi,8)
  0x01f06953: mov    %ebx,(%eax,%esi,8)
  0x01f06956: dec    %esi
  0x01f06957: jne    0x01f0694f
  0x01f06959: pop    %ebx
  0x01f0695a: pop    %edi
  0x01f0695b: ret    
  0x01f0695c: mov    0x8(%edx),%ecx
  0x01f0695f: mov    0x4006c0,%eax
  0x01f06965: lea    (%eax,%ecx,1),%ebx
  0x01f06968: cmp    %eax,%ebx
  0x01f0696a: jb     0x01f069e5
  0x01f06970: cmp    0x400690,%ebx
  0x01f06976: ja     0x01f069e5
  0x01f0697c: lock cmpxchg %ebx,0x4006c0
  0x01f06984: jne    0x01f0695f
  0x01f06986: add    %ecx,0x88(%edi)
  0x01f0698c: adcl   $0x0,0x8c(%edi)
  0x01f06993: mov    0x68(%edx),%ebx
  0x01f06996: mov    %ebx,(%eax)
  0x01f06998: mov    %edx,0x4(%eax)
  0x01f0699b: mov    %ecx,%esi
  0x01f0699d: sub    $0x8,%esi
  0x01f069a0: je     0x01f069e2
  0x01f069a6: test   $0x3,%esi
  0x01f069ac: je     0x01f069c3
  0x01f069b2: push   $0x55cdc488
  0x01f069b7: call   0x01f069bc
  0x01f069bc: pusha  
  0x01f069bd: call   0x557bdbf0
  0x01f069c2: hlt    
  0x01f069c3: xor    %ebx,%ebx
  0x01f069c5: shr    $0x3,%esi
  0x01f069c8: jae    0x01f069d8
  0x01f069ce: mov    %ebx,0x8(%eax,%esi,8)
  0x01f069d2: je     0x01f069e2
  0x01f069d8: mov    %ebx,0x4(%eax,%esi,8)
  0x01f069dc: mov    %ebx,(%eax,%esi,8)
  0x01f069df: dec    %esi
  0x01f069e0: jne    0x01f069d8
  0x01f069e2: pop    %ebx
  0x01f069e3: pop    %edi
  0x01f069e4: ret    
  0x01f069e5: pop    %ebx
  0x01f069e6: pop    %edi
  0x01f069e7: push   %ebp
  0x01f069e8: mov    %esp,%ebp
  ;; save_live_registers
  0x01f069ea: pusha  
  0x01f069eb: sub    $0xf0,%esp
  0x01f069f1: movl   $0xfeedbeef,0xec(%esp)
  0x01f069fc: movsd  %xmm0,(%esp)
  0x01f06a01: movsd  %xmm1,0x8(%esp)
  0x01f06a07: movsd  %xmm2,0x10(%esp)
  0x01f06a0d: movsd  %xmm3,0x18(%esp)
  0x01f06a13: movsd  %xmm4,0x20(%esp)
  0x01f06a19: movsd  %xmm5,0x28(%esp)
  0x01f06a1f: movsd  %xmm6,0x30(%esp)
  0x01f06a25: movsd  %xmm7,0x38(%esp)
  0x01f06a2b: push   %edx
  0x01f06a2c: mov    %fs:0x0(,%eiz,1),%edi
  0x01f06a34: mov    -0xc(%edi),%edi
  0x01f06a37: push   %edi
  0x01f06a38: mov    %ebp,0x144(%edi)
  0x01f06a3e: mov    %esp,0x13c(%edi)
  0x01f06a44: call   0x558792a0
  0x01f06a49: push   %eax
  0x01f06a4a: mov    %fs:0x0(,%eiz,1),%eax
  0x01f06a52: mov    -0xc(%eax),%eax
  0x01f06a55: cmp    %eax,%edi
  0x01f06a57: je     0x01f06a6f
  0x01f06a5d: int3   
  0x01f06a5e: push   $0x55cdcc08
  0x01f06a63: call   0x01f06a68
  0x01f06a68: pusha  
  0x01f06a69: call   0x557bdbf0
  0x01f06a6e: hlt    
  0x01f06a6f: pop    %eax
  0x01f06a70: movl   $0x0,0x13c(%edi)
  0x01f06a7a: movl   $0x0,0x144(%edi)
  0x01f06a84: add    $0x8,%esp
  0x01f06a87: cmpl   $0x0,0x4(%edi)
  0x01f06a8e: je     0x01f06aa6
  0x01f06a94: mov    0x4(%edi),%eax
  0x01f06a97: movl   $0x0,0x16c(%edi)
  0x01f06aa1: jmp    0x01f05bf0
  0x01f06aa6: mov    0x16c(%edi),%eax
  0x01f06aac: movl   $0x0,0x16c(%edi)
  ;; restore_live_registers_except_rax
  0x01f06ab6: movsd  (%esp),%xmm0
  0x01f06abb: movsd  0x8(%esp),%xmm1
  0x01f06ac1: movsd  0x10(%esp),%xmm2
  0x01f06ac7: movsd  0x18(%esp),%xmm3
  0x01f06acd: movsd  0x20(%esp),%xmm4
  0x01f06ad3: movsd  0x28(%esp),%xmm5
  0x01f06ad9: movsd  0x30(%esp),%xmm6
  0x01f06adf: movsd  0x38(%esp),%xmm7
  0x01f06ae5: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f06af0: je     0x01f06b07
  0x01f06af6: push   $0x55cdce30
  0x01f06afb: call   0x01f06b00
  0x01f06b00: pusha  
  0x01f06b01: call   0x557bdbf0
  0x01f06b06: hlt    
  0x01f06b07: add    $0xf0,%esp
  0x01f06b0d: pop    %edi
  0x01f06b0e: pop    %esi
  0x01f06b0f: pop    %ebp
  0x01f06b10: pop    %ebx
  0x01f06b11: pop    %ebx
  0x01f06b12: pop    %edx
  0x01f06b13: pop    %ecx
  0x01f06b14: add    $0x4,%esp
  0x01f06b17: mov    %ebp,%esp
  0x01f06b19: pop    %ebp
  0x01f06b1a: ret    
  0x01f06b1b: nop    

Decoding RuntimeStub - fast_new_instance_init_check Runtime1 stub 0x01f06b48
  0x01f06c10: push   %edi
  0x01f06c11: push   %ebx
  0x01f06c12: cmpb   $0x4,0xde(%edx)
  0x01f06c19: jne    0x01f06e32
  0x01f06c1f: mov    0x8(%edx),%ecx
  0x01f06c22: cmp    $0x0,%ecx
  0x01f06c25: jle    0x01f06c37
  0x01f06c2b: test   $0x1,%ecx
  0x01f06c31: je     0x01f06c59
  0x01f06c37: push   $0x55cdd17c
  0x01f06c3c: call   0x01f06c41
  0x01f06c41: pusha  
  0x01f06c42: call   0x557bdbf0
  0x01f06c47: hlt    
  0x01f06c48: push   $0x55ccd97c
  0x01f06c4d: call   0x01f06c52
  0x01f06c52: pusha  
  0x01f06c53: call   0x557bdbf0
  0x01f06c58: hlt    
  0x01f06c59: mov    %fs:0x0(,%eiz,1),%edi
  0x01f06c61: mov    -0xc(%edi),%edi
  0x01f06c64: mov    0x44(%edi),%eax
  0x01f06c67: mov    0x4c(%edi),%ecx
  0x01f06c6a: sub    %eax,%ecx
  0x01f06c6c: shr    $0x2,%ecx
  0x01f06c6f: cmp    0x54(%edi),%ecx
  0x01f06c72: jle    0x01f06c89
  0x01f06c78: mov    $0x4,%esi
  0x01f06c7d: add    %esi,0x54(%edi)
  0x01f06c80: addl   $0x1,0x68(%edi)
  0x01f06c84: jmp    0x01f06da9
  0x01f06c89: addl   $0x1,0x58(%edi)
  0x01f06c8d: add    %ecx,0x5c(%edi)
  0x01f06c90: test   %eax,%eax
  0x01f06c92: je     0x01f06cc5
  0x01f06c98: movl   $0x101,(%eax)
  0x01f06c9e: sub    $0x3,%ecx
  0x01f06ca1: add    $0x4,%ecx
  0x01f06ca4: shl    $0x0,%ecx
  0x01f06ca7: mov    %ecx,0x8(%eax)
  0x01f06caa: mov    0x5600111c,%ecx
  0x01f06cb0: mov    %ecx,0x4(%eax)
  0x01f06cb3: mov    %eax,%ecx
  0x01f06cb5: sub    0x40(%edi),%ecx
  0x01f06cb8: add    %ecx,0x88(%edi)
  0x01f06cbe: adcl   $0x0,0x8c(%edi)
  0x01f06cc5: mov    0x50(%edi),%ecx
  0x01f06cc8: shl    $0x2,%ecx
  0x01f06ccb: mov    0x4006c0,%eax
  0x01f06cd1: lea    (%eax,%ecx,1),%esi
  0x01f06cd4: cmp    %eax,%esi
  0x01f06cd6: jb     0x01f06e32
  0x01f06cdc: cmp    0x400690,%esi
  0x01f06ce2: ja     0x01f06e32
  0x01f06ce8: lock cmpxchg %esi,0x4006c0
  0x01f06cf0: jne    0x01f06ccb
  0x01f06cf2: push   %esi
  0x01f06cf3: mov    0x50(%edi),%esi
  0x01f06cf6: shl    $0x2,%esi
  0x01f06cf9: cmp    %esi,%ecx
  0x01f06cfb: je     0x01f06d23
  ;; assert(t1 != tlab size)
  0x01f06d01: push   $0x55ce38fc
  0x01f06d06: call   0x01f06d0b
  0x01f06d0b: pusha  
  0x01f06d0c: call   0x557bdbf0
  0x01f06d11: hlt    
  0x01f06d12: push   $0x55ccd97c
  0x01f06d17: call   0x01f06d1c
  0x01f06d1c: pusha  
  0x01f06d1d: call   0x557bdbf0
  0x01f06d22: hlt    
  0x01f06d23: pop    %esi
  0x01f06d24: mov    %eax,0x40(%edi)
  0x01f06d27: mov    %eax,0x44(%edi)
  0x01f06d2a: add    %ecx,%eax
  0x01f06d2c: sub    $0x10,%eax
  0x01f06d2f: mov    %eax,0x4c(%edi)
  0x01f06d32: jmp    0x01f06d37
  0x01f06d37: mov    0x8(%edx),%ecx
  0x01f06d3a: mov    %fs:0x0(,%eiz,1),%ebx
  0x01f06d42: mov    -0xc(%ebx),%ebx
  0x01f06d45: mov    0x44(%ebx),%eax
  0x01f06d48: lea    (%eax,%ecx,1),%esi
  0x01f06d4b: cmp    0x4c(%ebx),%esi
  0x01f06d4e: ja     0x01f06e32
  0x01f06d54: mov    %esi,0x44(%ebx)
  0x01f06d57: mov    0x68(%edx),%ebx
  0x01f06d5a: mov    %ebx,(%eax)
  0x01f06d5c: mov    %edx,0x4(%eax)
  0x01f06d5f: mov    %ecx,%esi
  0x01f06d61: sub    $0x8,%esi
  0x01f06d64: je     0x01f06da6
  0x01f06d6a: test   $0x3,%esi
  0x01f06d70: je     0x01f06d87
  0x01f06d76: push   $0x55cdc488
  0x01f06d7b: call   0x01f06d80
  0x01f06d80: pusha  
  0x01f06d81: call   0x557bdbf0
  0x01f06d86: hlt    
  0x01f06d87: xor    %ebx,%ebx
  0x01f06d89: shr    $0x3,%esi
  0x01f06d8c: jae    0x01f06d9c
  0x01f06d92: mov    %ebx,0x8(%eax,%esi,8)
  0x01f06d96: je     0x01f06da6
  0x01f06d9c: mov    %ebx,0x4(%eax,%esi,8)
  0x01f06da0: mov    %ebx,(%eax,%esi,8)
  0x01f06da3: dec    %esi
  0x01f06da4: jne    0x01f06d9c
  0x01f06da6: pop    %ebx
  0x01f06da7: pop    %edi
  0x01f06da8: ret    
  0x01f06da9: mov    0x8(%edx),%ecx
  0x01f06dac: mov    0x4006c0,%eax
  0x01f06db2: lea    (%eax,%ecx,1),%ebx
  0x01f06db5: cmp    %eax,%ebx
  0x01f06db7: jb     0x01f06e32
  0x01f06dbd: cmp    0x400690,%ebx
  0x01f06dc3: ja     0x01f06e32
  0x01f06dc9: lock cmpxchg %ebx,0x4006c0
  0x01f06dd1: jne    0x01f06dac
  0x01f06dd3: add    %ecx,0x88(%edi)
  0x01f06dd9: adcl   $0x0,0x8c(%edi)
  0x01f06de0: mov    0x68(%edx),%ebx
  0x01f06de3: mov    %ebx,(%eax)
  0x01f06de5: mov    %edx,0x4(%eax)
  0x01f06de8: mov    %ecx,%esi
  0x01f06dea: sub    $0x8,%esi
  0x01f06ded: je     0x01f06e2f
  0x01f06df3: test   $0x3,%esi
  0x01f06df9: je     0x01f06e10
  0x01f06dff: push   $0x55cdc488
  0x01f06e04: call   0x01f06e09
  0x01f06e09: pusha  
  0x01f06e0a: call   0x557bdbf0
  0x01f06e0f: hlt    
  0x01f06e10: xor    %ebx,%ebx
  0x01f06e12: shr    $0x3,%esi
  0x01f06e15: jae    0x01f06e25
  0x01f06e1b: mov    %ebx,0x8(%eax,%esi,8)
  0x01f06e1f: je     0x01f06e2f
  0x01f06e25: mov    %ebx,0x4(%eax,%esi,8)
  0x01f06e29: mov    %ebx,(%eax,%esi,8)
  0x01f06e2c: dec    %esi
  0x01f06e2d: jne    0x01f06e25
  0x01f06e2f: pop    %ebx
  0x01f06e30: pop    %edi
  0x01f06e31: ret    
  0x01f06e32: pop    %ebx
  0x01f06e33: pop    %edi
  0x01f06e34: push   %ebp
  0x01f06e35: mov    %esp,%ebp
  ;; save_live_registers
  0x01f06e37: pusha  
  0x01f06e38: sub    $0xf0,%esp
  0x01f06e3e: movl   $0xfeedbeef,0xec(%esp)
  0x01f06e49: movsd  %xmm0,(%esp)
  0x01f06e4e: movsd  %xmm1,0x8(%esp)
  0x01f06e54: movsd  %xmm2,0x10(%esp)
  0x01f06e5a: movsd  %xmm3,0x18(%esp)
  0x01f06e60: movsd  %xmm4,0x20(%esp)
  0x01f06e66: movsd  %xmm5,0x28(%esp)
  0x01f06e6c: movsd  %xmm6,0x30(%esp)
  0x01f06e72: movsd  %xmm7,0x38(%esp)
  0x01f06e78: push   %edx
  0x01f06e79: mov    %fs:0x0(,%eiz,1),%edi
  0x01f06e81: mov    -0xc(%edi),%edi
  0x01f06e84: push   %edi
  0x01f06e85: mov    %ebp,0x144(%edi)
  0x01f06e8b: mov    %esp,0x13c(%edi)
  0x01f06e91: call   0x558792a0
  0x01f06e96: push   %eax
  0x01f06e97: mov    %fs:0x0(,%eiz,1),%eax
  0x01f06e9f: mov    -0xc(%eax),%eax
  0x01f06ea2: cmp    %eax,%edi
  0x01f06ea4: je     0x01f06ebc
  0x01f06eaa: int3   
  0x01f06eab: push   $0x55cdcc08
  0x01f06eb0: call   0x01f06eb5
  0x01f06eb5: pusha  
  0x01f06eb6: call   0x557bdbf0
  0x01f06ebb: hlt    
  0x01f06ebc: pop    %eax
  0x01f06ebd: movl   $0x0,0x13c(%edi)
  0x01f06ec7: movl   $0x0,0x144(%edi)
  0x01f06ed1: add    $0x8,%esp
  0x01f06ed4: cmpl   $0x0,0x4(%edi)
  0x01f06edb: je     0x01f06ef3
  0x01f06ee1: mov    0x4(%edi),%eax
  0x01f06ee4: movl   $0x0,0x16c(%edi)
  0x01f06eee: jmp    0x01f05bf0
  0x01f06ef3: mov    0x16c(%edi),%eax
  0x01f06ef9: movl   $0x0,0x16c(%edi)
  ;; restore_live_registers_except_rax
  0x01f06f03: movsd  (%esp),%xmm0
  0x01f06f08: movsd  0x8(%esp),%xmm1
  0x01f06f0e: movsd  0x10(%esp),%xmm2
  0x01f06f14: movsd  0x18(%esp),%xmm3
  0x01f06f1a: movsd  0x20(%esp),%xmm4
  0x01f06f20: movsd  0x28(%esp),%xmm5
  0x01f06f26: movsd  0x30(%esp),%xmm6
  0x01f06f2c: movsd  0x38(%esp),%xmm7
  0x01f06f32: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f06f3d: je     0x01f06f54
  0x01f06f43: push   $0x55cdce30
  0x01f06f48: call   0x01f06f4d
  0x01f06f4d: pusha  
  0x01f06f4e: call   0x557bdbf0
  0x01f06f53: hlt    
  0x01f06f54: add    $0xf0,%esp
  0x01f06f5a: pop    %edi
  0x01f06f5b: pop    %esi
  0x01f06f5c: pop    %ebp
  0x01f06f5d: pop    %ebx
  0x01f06f5e: pop    %ebx
  0x01f06f5f: pop    %edx
  0x01f06f60: pop    %ecx
  0x01f06f61: add    $0x4,%esp
  0x01f06f64: mov    %ebp,%esp
  0x01f06f66: pop    %ebp
  0x01f06f67: ret    

Decoding RuntimeStub - new_type_array Runtime1 stub 0x01f11008
  0x01f110d0: mov    0x8(%edx),%eax
  0x01f110d3: sar    $0x1e,%eax
  0x01f110d6: cmp    $0xffffffff,%eax
  0x01f110d9: je     0x01f11101
  0x01f110df: push   $0x55cdd1e8
  0x01f110e4: call   0x01f110e9
  0x01f110e9: pusha  
  0x01f110ea: call   0x557bdbf0
  0x01f110ef: hlt    
  0x01f110f0: push   $0x55ccd97c
  0x01f110f5: call   0x01f110fa
  0x01f110fa: pusha  
  0x01f110fb: call   0x557bdbf0
  0x01f11100: hlt    
  0x01f11101: cmp    $0xffffff,%ebx
  0x01f11107: ja     0x01f1132a
  0x01f1110d: mov    %fs:0x0(,%eiz,1),%edi
  0x01f11115: mov    -0xc(%edi),%edi
  0x01f11118: mov    0x44(%edi),%eax
  0x01f1111b: mov    0x4c(%edi),%ecx
  0x01f1111e: sub    %eax,%ecx
  0x01f11120: shr    $0x2,%ecx
  0x01f11123: cmp    0x54(%edi),%ecx
  0x01f11126: jle    0x01f1113d
  0x01f1112c: mov    $0x4,%esi
  0x01f11131: add    %esi,0x54(%edi)
  0x01f11134: addl   $0x1,0x68(%edi)
  0x01f11138: jmp    0x01f1127f
  0x01f1113d: addl   $0x1,0x58(%edi)
  0x01f11141: add    %ecx,0x5c(%edi)
  0x01f11144: test   %eax,%eax
  0x01f11146: je     0x01f11179
  0x01f1114c: movl   $0x101,(%eax)
  0x01f11152: sub    $0x3,%ecx
  0x01f11155: add    $0x4,%ecx
  0x01f11158: shl    $0x0,%ecx
  0x01f1115b: mov    %ecx,0x8(%eax)
  0x01f1115e: mov    0x5600111c,%ecx
  0x01f11164: mov    %ecx,0x4(%eax)
  0x01f11167: mov    %eax,%ecx
  0x01f11169: sub    0x40(%edi),%ecx
  0x01f1116c: add    %ecx,0x88(%edi)
  0x01f11172: adcl   $0x0,0x8c(%edi)
  0x01f11179: mov    0x50(%edi),%ecx
  0x01f1117c: shl    $0x2,%ecx
  0x01f1117f: mov    0x4006c0,%eax
  0x01f11185: lea    (%eax,%ecx,1),%esi
  0x01f11188: cmp    %eax,%esi
  0x01f1118a: jb     0x01f1132a
  0x01f11190: cmp    0x400690,%esi
  0x01f11196: ja     0x01f1132a
  0x01f1119c: lock cmpxchg %esi,0x4006c0
  0x01f111a4: jne    0x01f1117f
  0x01f111a6: push   %esi
  0x01f111a7: mov    0x50(%edi),%esi
  0x01f111aa: shl    $0x2,%esi
  0x01f111ad: cmp    %esi,%ecx
  0x01f111af: je     0x01f111d7
  ;; assert(t1 != tlab size)
  0x01f111b5: push   $0x55ce38fc
  0x01f111ba: call   0x01f111bf
  0x01f111bf: pusha  
  0x01f111c0: call   0x557bdbf0
  0x01f111c5: hlt    
  0x01f111c6: push   $0x55ccd97c
  0x01f111cb: call   0x01f111d0
  0x01f111d0: pusha  
  0x01f111d1: call   0x557bdbf0
  0x01f111d6: hlt    
  0x01f111d7: pop    %esi
  0x01f111d8: mov    %eax,0x40(%edi)
  0x01f111db: mov    %eax,0x44(%edi)
  0x01f111de: add    %ecx,%eax
  0x01f111e0: sub    $0x10,%eax
  0x01f111e3: mov    %eax,0x4c(%edi)
  0x01f111e6: jmp    0x01f111eb
  0x01f111eb: mov    0x8(%edx),%ecx
  0x01f111ee: mov    %ebx,%esi
  0x01f111f0: shl    %cl,%esi
  0x01f111f2: shr    $0x10,%ecx
  0x01f111f5: and    $0xff,%ecx
  0x01f111fb: add    %ecx,%esi
  0x01f111fd: add    $0x7,%esi
  0x01f11200: and    $0xfffffff8,%esi
  0x01f11203: mov    %fs:0x0(,%eiz,1),%ecx
  0x01f1120b: mov    -0xc(%ecx),%ecx
  0x01f1120e: mov    0x44(%ecx),%eax
  0x01f11211: lea    (%eax,%esi,1),%edi
  0x01f11214: cmp    0x4c(%ecx),%edi
  0x01f11217: ja     0x01f1132a
  0x01f1121d: mov    %edi,0x44(%ecx)
  0x01f11220: movl   $0x1,(%eax)
  0x01f11226: mov    %edx,0x4(%eax)
  0x01f11229: mov    %ebx,0x8(%eax)
  0x01f1122c: mov    0xa(%edx),%cl
  0x01f1122f: and    $0xff,%ecx
  0x01f11235: sub    %ecx,%esi
  0x01f11237: add    %eax,%ecx
  0x01f11239: sub    $0x0,%esi
  0x01f1123c: je     0x01f1127e
  0x01f11242: test   $0x3,%esi
  0x01f11248: je     0x01f1125f
  0x01f1124e: push   $0x55cdc488
  0x01f11253: call   0x01f11258
  0x01f11258: pusha  
  0x01f11259: call   0x557bdbf0
  0x01f1125e: hlt    
  0x01f1125f: xor    %edi,%edi
  0x01f11261: shr    $0x3,%esi
  0x01f11264: jae    0x01f11273
  0x01f1126a: mov    %edi,(%ecx,%esi,8)
  0x01f1126d: je     0x01f1127e
  0x01f11273: mov    %edi,-0x4(%ecx,%esi,8)
  0x01f11277: mov    %edi,-0x8(%ecx,%esi,8)
  0x01f1127b: dec    %esi
  0x01f1127c: jne    0x01f11273
  0x01f1127e: ret    
  0x01f1127f: mov    0x8(%edx),%ecx
  0x01f11282: mov    %ebx,%esi
  0x01f11284: shl    %cl,%esi
  0x01f11286: shr    $0x10,%ecx
  0x01f11289: and    $0xff,%ecx
  0x01f1128f: add    %ecx,%esi
  0x01f11291: add    $0x7,%esi
  0x01f11294: and    $0xfffffff8,%esi
  0x01f11297: mov    0x4006c0,%eax
  0x01f1129d: lea    (%eax,%esi,1),%ecx
  0x01f112a0: cmp    %eax,%ecx
  0x01f112a2: jb     0x01f1132a
  0x01f112a8: cmp    0x400690,%ecx
  0x01f112ae: ja     0x01f1132a
  0x01f112b4: lock cmpxchg %ecx,0x4006c0
  0x01f112bc: jne    0x01f11297
  0x01f112be: add    %esi,0x88(%edi)
  0x01f112c4: adcl   $0x0,0x8c(%edi)
  0x01f112cb: movl   $0x1,(%eax)
  0x01f112d1: mov    %edx,0x4(%eax)
  0x01f112d4: mov    %ebx,0x8(%eax)
  0x01f112d7: mov    0xa(%edx),%cl
  0x01f112da: and    $0xff,%ecx
  0x01f112e0: sub    %ecx,%esi
  0x01f112e2: add    %eax,%ecx
  0x01f112e4: sub    $0x0,%esi
  0x01f112e7: je     0x01f11329
  0x01f112ed: test   $0x3,%esi
  0x01f112f3: je     0x01f1130a
  0x01f112f9: push   $0x55cdc488
  0x01f112fe: call   0x01f11303
  0x01f11303: pusha  
  0x01f11304: call   0x557bdbf0
  0x01f11309: hlt    
  0x01f1130a: xor    %edi,%edi
  0x01f1130c: shr    $0x3,%esi
  0x01f1130f: jae    0x01f1131e
  0x01f11315: mov    %edi,(%ecx,%esi,8)
  0x01f11318: je     0x01f11329
  0x01f1131e: mov    %edi,-0x4(%ecx,%esi,8)
  0x01f11322: mov    %edi,-0x8(%ecx,%esi,8)
  0x01f11326: dec    %esi
  0x01f11327: jne    0x01f1131e
  0x01f11329: ret    
  0x01f1132a: push   %ebp
  0x01f1132b: mov    %esp,%ebp
  ;; save_live_registers
  0x01f1132d: pusha  
  0x01f1132e: sub    $0xf0,%esp
  0x01f11334: movl   $0xfeedbeef,0xec(%esp)
  0x01f1133f: movsd  %xmm0,(%esp)
  0x01f11344: movsd  %xmm1,0x8(%esp)
  0x01f1134a: movsd  %xmm2,0x10(%esp)
  0x01f11350: movsd  %xmm3,0x18(%esp)
  0x01f11356: movsd  %xmm4,0x20(%esp)
  0x01f1135c: movsd  %xmm5,0x28(%esp)
  0x01f11362: movsd  %xmm6,0x30(%esp)
  0x01f11368: movsd  %xmm7,0x38(%esp)
  0x01f1136e: push   %ebx
  0x01f1136f: push   %edx
  0x01f11370: mov    %fs:0x0(,%eiz,1),%edi
  0x01f11378: mov    -0xc(%edi),%edi
  0x01f1137b: push   %edi
  0x01f1137c: mov    %ebp,0x144(%edi)
  0x01f11382: mov    %esp,0x13c(%edi)
  0x01f11388: call   0x558794c0
  0x01f1138d: push   %eax
  0x01f1138e: mov    %fs:0x0(,%eiz,1),%eax
  0x01f11396: mov    -0xc(%eax),%eax
  0x01f11399: cmp    %eax,%edi
  0x01f1139b: je     0x01f113b3
  0x01f113a1: int3   
  0x01f113a2: push   $0x55cdcc08
  0x01f113a7: call   0x01f113ac
  0x01f113ac: pusha  
  0x01f113ad: call   0x557bdbf0
  0x01f113b2: hlt    
  0x01f113b3: pop    %eax
  0x01f113b4: movl   $0x0,0x13c(%edi)
  0x01f113be: movl   $0x0,0x144(%edi)
  0x01f113c8: add    $0xc,%esp
  0x01f113cb: cmpl   $0x0,0x4(%edi)
  0x01f113d2: je     0x01f113ea
  0x01f113d8: mov    0x4(%edi),%eax
  0x01f113db: movl   $0x0,0x16c(%edi)
  0x01f113e5: jmp    0x01f05bf0
  0x01f113ea: mov    0x16c(%edi),%eax
  0x01f113f0: movl   $0x0,0x16c(%edi)
  ;; restore_live_registers_except_rax
  0x01f113fa: movsd  (%esp),%xmm0
  0x01f113ff: movsd  0x8(%esp),%xmm1
  0x01f11405: movsd  0x10(%esp),%xmm2
  0x01f1140b: movsd  0x18(%esp),%xmm3
  0x01f11411: movsd  0x20(%esp),%xmm4
  0x01f11417: movsd  0x28(%esp),%xmm5
  0x01f1141d: movsd  0x30(%esp),%xmm6
  0x01f11423: movsd  0x38(%esp),%xmm7
  0x01f11429: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f11434: je     0x01f1144b
  0x01f1143a: push   $0x55cdce30
  0x01f1143f: call   0x01f11444
  0x01f11444: pusha  
  0x01f11445: call   0x557bdbf0
  0x01f1144a: hlt    
  0x01f1144b: add    $0xf0,%esp
  0x01f11451: pop    %edi
  0x01f11452: pop    %esi
  0x01f11453: pop    %ebp
  0x01f11454: pop    %ebx
  0x01f11455: pop    %ebx
  0x01f11456: pop    %edx
  0x01f11457: pop    %ecx
  0x01f11458: add    $0x4,%esp
  0x01f1145b: mov    %ebp,%esp
  0x01f1145d: pop    %ebp
  0x01f1145e: ret    
  0x01f1145f: nop    

Decoding RuntimeStub - new_object_array Runtime1 stub 0x01f11488
  0x01f11550: mov    0x8(%edx),%eax
  0x01f11553: sar    $0x1e,%eax
  0x01f11556: cmp    $0xfffffffe,%eax
  0x01f11559: je     0x01f11581
  0x01f1155f: push   $0x55cdd1e8
  0x01f11564: call   0x01f11569
  0x01f11569: pusha  
  0x01f1156a: call   0x557bdbf0
  0x01f1156f: hlt    
  0x01f11570: push   $0x55ccd97c
  0x01f11575: call   0x01f1157a
  0x01f1157a: pusha  
  0x01f1157b: call   0x557bdbf0
  0x01f11580: hlt    
  0x01f11581: cmp    $0xffffff,%ebx
  0x01f11587: ja     0x01f117aa
  0x01f1158d: mov    %fs:0x0(,%eiz,1),%edi
  0x01f11595: mov    -0xc(%edi),%edi
  0x01f11598: mov    0x44(%edi),%eax
  0x01f1159b: mov    0x4c(%edi),%ecx
  0x01f1159e: sub    %eax,%ecx
  0x01f115a0: shr    $0x2,%ecx
  0x01f115a3: cmp    0x54(%edi),%ecx
  0x01f115a6: jle    0x01f115bd
  0x01f115ac: mov    $0x4,%esi
  0x01f115b1: add    %esi,0x54(%edi)
  0x01f115b4: addl   $0x1,0x68(%edi)
  0x01f115b8: jmp    0x01f116ff
  0x01f115bd: addl   $0x1,0x58(%edi)
  0x01f115c1: add    %ecx,0x5c(%edi)
  0x01f115c4: test   %eax,%eax
  0x01f115c6: je     0x01f115f9
  0x01f115cc: movl   $0x101,(%eax)
  0x01f115d2: sub    $0x3,%ecx
  0x01f115d5: add    $0x4,%ecx
  0x01f115d8: shl    $0x0,%ecx
  0x01f115db: mov    %ecx,0x8(%eax)
  0x01f115de: mov    0x5600111c,%ecx
  0x01f115e4: mov    %ecx,0x4(%eax)
  0x01f115e7: mov    %eax,%ecx
  0x01f115e9: sub    0x40(%edi),%ecx
  0x01f115ec: add    %ecx,0x88(%edi)
  0x01f115f2: adcl   $0x0,0x8c(%edi)
  0x01f115f9: mov    0x50(%edi),%ecx
  0x01f115fc: shl    $0x2,%ecx
  0x01f115ff: mov    0x4006c0,%eax
  0x01f11605: lea    (%eax,%ecx,1),%esi
  0x01f11608: cmp    %eax,%esi
  0x01f1160a: jb     0x01f117aa
  0x01f11610: cmp    0x400690,%esi
  0x01f11616: ja     0x01f117aa
  0x01f1161c: lock cmpxchg %esi,0x4006c0
  0x01f11624: jne    0x01f115ff
  0x01f11626: push   %esi
  0x01f11627: mov    0x50(%edi),%esi
  0x01f1162a: shl    $0x2,%esi
  0x01f1162d: cmp    %esi,%ecx
  0x01f1162f: je     0x01f11657
  ;; assert(t1 != tlab size)
  0x01f11635: push   $0x55ce38fc
  0x01f1163a: call   0x01f1163f
  0x01f1163f: pusha  
  0x01f11640: call   0x557bdbf0
  0x01f11645: hlt    
  0x01f11646: push   $0x55ccd97c
  0x01f1164b: call   0x01f11650
  0x01f11650: pusha  
  0x01f11651: call   0x557bdbf0
  0x01f11656: hlt    
  0x01f11657: pop    %esi
  0x01f11658: mov    %eax,0x40(%edi)
  0x01f1165b: mov    %eax,0x44(%edi)
  0x01f1165e: add    %ecx,%eax
  0x01f11660: sub    $0x10,%eax
  0x01f11663: mov    %eax,0x4c(%edi)
  0x01f11666: jmp    0x01f1166b
  0x01f1166b: mov    0x8(%edx),%ecx
  0x01f1166e: mov    %ebx,%esi
  0x01f11670: shl    %cl,%esi
  0x01f11672: shr    $0x10,%ecx
  0x01f11675: and    $0xff,%ecx
  0x01f1167b: add    %ecx,%esi
  0x01f1167d: add    $0x7,%esi
  0x01f11680: and    $0xfffffff8,%esi
  0x01f11683: mov    %fs:0x0(,%eiz,1),%ecx
  0x01f1168b: mov    -0xc(%ecx),%ecx
  0x01f1168e: mov    0x44(%ecx),%eax
  0x01f11691: lea    (%eax,%esi,1),%edi
  0x01f11694: cmp    0x4c(%ecx),%edi
  0x01f11697: ja     0x01f117aa
  0x01f1169d: mov    %edi,0x44(%ecx)
  0x01f116a0: movl   $0x1,(%eax)
  0x01f116a6: mov    %edx,0x4(%eax)
  0x01f116a9: mov    %ebx,0x8(%eax)
  0x01f116ac: mov    0xa(%edx),%cl
  0x01f116af: and    $0xff,%ecx
  0x01f116b5: sub    %ecx,%esi
  0x01f116b7: add    %eax,%ecx
  0x01f116b9: sub    $0x0,%esi
  0x01f116bc: je     0x01f116fe
  0x01f116c2: test   $0x3,%esi
  0x01f116c8: je     0x01f116df
  0x01f116ce: push   $0x55cdc488
  0x01f116d3: call   0x01f116d8
  0x01f116d8: pusha  
  0x01f116d9: call   0x557bdbf0
  0x01f116de: hlt    
  0x01f116df: xor    %edi,%edi
  0x01f116e1: shr    $0x3,%esi
  0x01f116e4: jae    0x01f116f3
  0x01f116ea: mov    %edi,(%ecx,%esi,8)
  0x01f116ed: je     0x01f116fe
  0x01f116f3: mov    %edi,-0x4(%ecx,%esi,8)
  0x01f116f7: mov    %edi,-0x8(%ecx,%esi,8)
  0x01f116fb: dec    %esi
  0x01f116fc: jne    0x01f116f3
  0x01f116fe: ret    
  0x01f116ff: mov    0x8(%edx),%ecx
  0x01f11702: mov    %ebx,%esi
  0x01f11704: shl    %cl,%esi
  0x01f11706: shr    $0x10,%ecx
  0x01f11709: and    $0xff,%ecx
  0x01f1170f: add    %ecx,%esi
  0x01f11711: add    $0x7,%esi
  0x01f11714: and    $0xfffffff8,%esi
  0x01f11717: mov    0x4006c0,%eax
  0x01f1171d: lea    (%eax,%esi,1),%ecx
  0x01f11720: cmp    %eax,%ecx
  0x01f11722: jb     0x01f117aa
  0x01f11728: cmp    0x400690,%ecx
  0x01f1172e: ja     0x01f117aa
  0x01f11734: lock cmpxchg %ecx,0x4006c0
  0x01f1173c: jne    0x01f11717
  0x01f1173e: add    %esi,0x88(%edi)
  0x01f11744: adcl   $0x0,0x8c(%edi)
  0x01f1174b: movl   $0x1,(%eax)
  0x01f11751: mov    %edx,0x4(%eax)
  0x01f11754: mov    %ebx,0x8(%eax)
  0x01f11757: mov    0xa(%edx),%cl
  0x01f1175a: and    $0xff,%ecx
  0x01f11760: sub    %ecx,%esi
  0x01f11762: add    %eax,%ecx
  0x01f11764: sub    $0x0,%esi
  0x01f11767: je     0x01f117a9
  0x01f1176d: test   $0x3,%esi
  0x01f11773: je     0x01f1178a
  0x01f11779: push   $0x55cdc488
  0x01f1177e: call   0x01f11783
  0x01f11783: pusha  
  0x01f11784: call   0x557bdbf0
  0x01f11789: hlt    
  0x01f1178a: xor    %edi,%edi
  0x01f1178c: shr    $0x3,%esi
  0x01f1178f: jae    0x01f1179e
  0x01f11795: mov    %edi,(%ecx,%esi,8)
  0x01f11798: je     0x01f117a9
  0x01f1179e: mov    %edi,-0x4(%ecx,%esi,8)
  0x01f117a2: mov    %edi,-0x8(%ecx,%esi,8)
  0x01f117a6: dec    %esi
  0x01f117a7: jne    0x01f1179e
  0x01f117a9: ret    
  0x01f117aa: push   %ebp
  0x01f117ab: mov    %esp,%ebp
  ;; save_live_registers
  0x01f117ad: pusha  
  0x01f117ae: sub    $0xf0,%esp
  0x01f117b4: movl   $0xfeedbeef,0xec(%esp)
  0x01f117bf: movsd  %xmm0,(%esp)
  0x01f117c4: movsd  %xmm1,0x8(%esp)
  0x01f117ca: movsd  %xmm2,0x10(%esp)
  0x01f117d0: movsd  %xmm3,0x18(%esp)
  0x01f117d6: movsd  %xmm4,0x20(%esp)
  0x01f117dc: movsd  %xmm5,0x28(%esp)
  0x01f117e2: movsd  %xmm6,0x30(%esp)
  0x01f117e8: movsd  %xmm7,0x38(%esp)
  0x01f117ee: push   %ebx
  0x01f117ef: push   %edx
  0x01f117f0: mov    %fs:0x0(,%eiz,1),%edi
  0x01f117f8: mov    -0xc(%edi),%edi
  0x01f117fb: push   %edi
  0x01f117fc: mov    %ebp,0x144(%edi)
  0x01f11802: mov    %esp,0x13c(%edi)
  0x01f11808: call   0x55879670
  0x01f1180d: push   %eax
  0x01f1180e: mov    %fs:0x0(,%eiz,1),%eax
  0x01f11816: mov    -0xc(%eax),%eax
  0x01f11819: cmp    %eax,%edi
  0x01f1181b: je     0x01f11833
  0x01f11821: int3   
  0x01f11822: push   $0x55cdcc08
  0x01f11827: call   0x01f1182c
  0x01f1182c: pusha  
  0x01f1182d: call   0x557bdbf0
  0x01f11832: hlt    
  0x01f11833: pop    %eax
  0x01f11834: movl   $0x0,0x13c(%edi)
  0x01f1183e: movl   $0x0,0x144(%edi)
  0x01f11848: add    $0xc,%esp
  0x01f1184b: cmpl   $0x0,0x4(%edi)
  0x01f11852: je     0x01f1186a
  0x01f11858: mov    0x4(%edi),%eax
  0x01f1185b: movl   $0x0,0x16c(%edi)
  0x01f11865: jmp    0x01f05bf0
  0x01f1186a: mov    0x16c(%edi),%eax
  0x01f11870: movl   $0x0,0x16c(%edi)
  ;; restore_live_registers_except_rax
  0x01f1187a: movsd  (%esp),%xmm0
  0x01f1187f: movsd  0x8(%esp),%xmm1
  0x01f11885: movsd  0x10(%esp),%xmm2
  0x01f1188b: movsd  0x18(%esp),%xmm3
  0x01f11891: movsd  0x20(%esp),%xmm4
  0x01f11897: movsd  0x28(%esp),%xmm5
  0x01f1189d: movsd  0x30(%esp),%xmm6
  0x01f118a3: movsd  0x38(%esp),%xmm7
  0x01f118a9: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f118b4: je     0x01f118cb
  0x01f118ba: push   $0x55cdce30
  0x01f118bf: call   0x01f118c4
  0x01f118c4: pusha  
  0x01f118c5: call   0x557bdbf0
  0x01f118ca: hlt    
  0x01f118cb: add    $0xf0,%esp
  0x01f118d1: pop    %edi
  0x01f118d2: pop    %esi
  0x01f118d3: pop    %ebp
  0x01f118d4: pop    %ebx
  0x01f118d5: pop    %ebx
  0x01f118d6: pop    %edx
  0x01f118d7: pop    %ecx
  0x01f118d8: add    $0x4,%esp
  0x01f118db: mov    %ebp,%esp
  0x01f118dd: pop    %ebp
  0x01f118de: ret    
  0x01f118df: nop    

Decoding RuntimeStub - new_multi_array Runtime1 stub 0x01f11908
  0x01f11960: push   %ebp
  0x01f11961: mov    %esp,%ebp
  ;; save_live_registers
  0x01f11963: pusha  
  0x01f11964: sub    $0xf0,%esp
  0x01f1196a: movl   $0xfeedbeef,0xec(%esp)
  0x01f11975: movsd  %xmm0,(%esp)
  0x01f1197a: movsd  %xmm1,0x8(%esp)
  0x01f11980: movsd  %xmm2,0x10(%esp)
  0x01f11986: movsd  %xmm3,0x18(%esp)
  0x01f1198c: movsd  %xmm4,0x20(%esp)
  0x01f11992: movsd  %xmm5,0x28(%esp)
  0x01f11998: movsd  %xmm6,0x30(%esp)
  0x01f1199e: movsd  %xmm7,0x38(%esp)
  0x01f119a4: push   %ecx
  0x01f119a5: push   %ebx
  0x01f119a6: push   %eax
  0x01f119a7: mov    %fs:0x0(,%eiz,1),%edi
  0x01f119af: mov    -0xc(%edi),%edi
  0x01f119b2: push   %edi
  0x01f119b3: mov    %ebp,0x144(%edi)
  0x01f119b9: mov    %esp,0x13c(%edi)
  0x01f119bf: call   0x55879820
  0x01f119c4: push   %eax
  0x01f119c5: mov    %fs:0x0(,%eiz,1),%eax
  0x01f119cd: mov    -0xc(%eax),%eax
  0x01f119d0: cmp    %eax,%edi
  0x01f119d2: je     0x01f119ea
  0x01f119d8: int3   
  0x01f119d9: push   $0x55cdcc08
  0x01f119de: call   0x01f119e3
  0x01f119e3: pusha  
  0x01f119e4: call   0x557bdbf0
  0x01f119e9: hlt    
  0x01f119ea: pop    %eax
  0x01f119eb: movl   $0x0,0x13c(%edi)
  0x01f119f5: movl   $0x0,0x144(%edi)
  0x01f119ff: add    $0x10,%esp
  0x01f11a02: cmpl   $0x0,0x4(%edi)
  0x01f11a09: je     0x01f11a21
  0x01f11a0f: mov    0x4(%edi),%eax
  0x01f11a12: movl   $0x0,0x16c(%edi)
  0x01f11a1c: jmp    0x01f05bf0
  0x01f11a21: mov    0x16c(%edi),%eax
  0x01f11a27: movl   $0x0,0x16c(%edi)
  ;; restore_live_registers_except_rax
  0x01f11a31: movsd  (%esp),%xmm0
  0x01f11a36: movsd  0x8(%esp),%xmm1
  0x01f11a3c: movsd  0x10(%esp),%xmm2
  0x01f11a42: movsd  0x18(%esp),%xmm3
  0x01f11a48: movsd  0x20(%esp),%xmm4
  0x01f11a4e: movsd  0x28(%esp),%xmm5
  0x01f11a54: movsd  0x30(%esp),%xmm6
  0x01f11a5a: movsd  0x38(%esp),%xmm7
  0x01f11a60: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f11a6b: je     0x01f11a82
  0x01f11a71: push   $0x55cdce30
  0x01f11a76: call   0x01f11a7b
  0x01f11a7b: pusha  
  0x01f11a7c: call   0x557bdbf0
  0x01f11a81: hlt    
  0x01f11a82: add    $0xf0,%esp
  0x01f11a88: pop    %edi
  0x01f11a89: pop    %esi
  0x01f11a8a: pop    %ebp
  0x01f11a8b: pop    %ebx
  0x01f11a8c: pop    %ebx
  0x01f11a8d: pop    %edx
  0x01f11a8e: pop    %ecx
  0x01f11a8f: add    $0x4,%esp
  0x01f11a92: mov    %ebp,%esp
  0x01f11a94: pop    %ebp
  0x01f11a95: ret    
  0x01f11a96: nop    
  0x01f11a97: nop    

Decoding RuntimeStub - handle_exception_nofpu Runtime1 stub 0x01f11ac8
  0x01f11b30: push   %ebp
  0x01f11b31: mov    %esp,%ebp
  ;; generate_handle_exception
  ;; save_live_registers
  0x01f11b33: pusha  
  0x01f11b34: sub    $0xf0,%esp
  0x01f11b3a: movl   $0xfeedbeef,0xec(%esp)
  0x01f11b45: movsd  %xmm0,(%esp)
  0x01f11b4a: movsd  %xmm1,0x8(%esp)
  0x01f11b50: movsd  %xmm2,0x10(%esp)
  0x01f11b56: movsd  %xmm3,0x18(%esp)
  0x01f11b5c: movsd  %xmm4,0x20(%esp)
  0x01f11b62: movsd  %xmm5,0x28(%esp)
  0x01f11b68: movsd  %xmm6,0x30(%esp)
  0x01f11b6e: movsd  %xmm7,0x38(%esp)
  0x01f11b74: mov    $0xdead,%ebx
  0x01f11b79: mov    $0xdead,%ecx
  0x01f11b7e: mov    $0xdead,%esi
  0x01f11b83: mov    $0xdead,%edi
  0x01f11b88: mov    %fs:0x0(,%eiz,1),%edi
  0x01f11b90: mov    -0xc(%edi),%edi
  0x01f11b93: cmpl   $0x0,0x1ac(%edi)
  0x01f11b9d: je     0x01f11bb4
  0x01f11ba3: push   $0x55cdcee4
  0x01f11ba8: call   0x01f11bad
  0x01f11bad: pusha  
  0x01f11bae: call   0x557bdbf0
  0x01f11bb3: hlt    
  0x01f11bb4: cmpl   $0x0,0x1b0(%edi)
  0x01f11bbe: je     0x01f11bd5
  0x01f11bc4: push   $0x55cdcf00
  0x01f11bc9: call   0x01f11bce
  0x01f11bce: pusha  
  0x01f11bcf: call   0x557bdbf0
  0x01f11bd4: hlt    
  0x01f11bd5: mov    %eax,0x1ac(%edi)
  0x01f11bdb: mov    %edx,0x1b0(%edi)
  0x01f11be1: mov    %edx,0x4(%ebp)
  0x01f11be4: mov    %fs:0x0(,%eiz,1),%edi
  0x01f11bec: mov    -0xc(%edi),%edi
  0x01f11bef: push   %edi
  0x01f11bf0: mov    %ebp,0x144(%edi)
  0x01f11bf6: mov    %esp,0x13c(%edi)
  0x01f11bfc: call   0x55879c50
  0x01f11c01: push   %eax
  0x01f11c02: mov    %fs:0x0(,%eiz,1),%eax
  0x01f11c0a: mov    -0xc(%eax),%eax
  0x01f11c0d: cmp    %eax,%edi
  0x01f11c0f: je     0x01f11c27
  0x01f11c15: int3   
  0x01f11c16: push   $0x55cdcc08
  0x01f11c1b: call   0x01f11c20
  0x01f11c20: pusha  
  0x01f11c21: call   0x557bdbf0
  0x01f11c26: hlt    
  0x01f11c27: pop    %eax
  0x01f11c28: movl   $0x0,0x13c(%edi)
  0x01f11c32: movl   $0x0,0x144(%edi)
  0x01f11c3c: add    $0x4,%esp
  0x01f11c3f: cmpl   $0x0,0x4(%edi)
  0x01f11c46: je     0x01f11c54
  0x01f11c4c: mov    0x4(%edi),%eax
  0x01f11c4f: jmp    0x01f05bf0
  0x01f11c54: mov    $0xdead,%ebx
  0x01f11c59: mov    $0xdead,%ecx
  0x01f11c5e: mov    $0xdead,%edx
  0x01f11c63: mov    $0xdead,%esi
  0x01f11c68: mov    $0xdead,%edi
  0x01f11c6d: mov    %eax,0x4(%ebp)
  ;; restore_live_registers
  0x01f11c70: movsd  (%esp),%xmm0
  0x01f11c75: movsd  0x8(%esp),%xmm1
  0x01f11c7b: movsd  0x10(%esp),%xmm2
  0x01f11c81: movsd  0x18(%esp),%xmm3
  0x01f11c87: movsd  0x20(%esp),%xmm4
  0x01f11c8d: movsd  0x28(%esp),%xmm5
  0x01f11c93: movsd  0x30(%esp),%xmm6
  0x01f11c99: movsd  0x38(%esp),%xmm7
  0x01f11c9f: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f11caa: je     0x01f11cc1
  0x01f11cb0: push   $0x55cdce30
  0x01f11cb5: call   0x01f11cba
  0x01f11cba: pusha  
  0x01f11cbb: call   0x557bdbf0
  0x01f11cc0: hlt    
  0x01f11cc1: add    $0xf0,%esp
  0x01f11cc7: popa   
  0x01f11cc8: mov    %ebp,%esp
  0x01f11cca: pop    %ebp
  0x01f11ccb: ret    

Decoding RuntimeStub - handle_exception Runtime1 stub 0x01f11d08
  0x01f11d70: push   %ebp
  0x01f11d71: mov    %esp,%ebp
  ;; generate_handle_exception
  ;; save_live_registers
  0x01f11d73: pusha  
  0x01f11d74: sub    $0xf0,%esp
  0x01f11d7a: movl   $0xfeedbeef,0xec(%esp)
  0x01f11d85: mov    $0xdead,%ebx
  0x01f11d8a: mov    $0xdead,%ecx
  0x01f11d8f: mov    $0xdead,%esi
  0x01f11d94: mov    $0xdead,%edi
  0x01f11d99: mov    %fs:0x0(,%eiz,1),%edi
  0x01f11da1: mov    -0xc(%edi),%edi
  0x01f11da4: cmpl   $0x0,0x1ac(%edi)
  0x01f11dae: je     0x01f11dc5
  0x01f11db4: push   $0x55cdcee4
  0x01f11db9: call   0x01f11dbe
  0x01f11dbe: pusha  
  0x01f11dbf: call   0x557bdbf0
  0x01f11dc4: hlt    
  0x01f11dc5: cmpl   $0x0,0x1b0(%edi)
  0x01f11dcf: je     0x01f11de6
  0x01f11dd5: push   $0x55cdcf00
  0x01f11dda: call   0x01f11ddf
  0x01f11ddf: pusha  
  0x01f11de0: call   0x557bdbf0
  0x01f11de5: hlt    
  0x01f11de6: mov    %eax,0x1ac(%edi)
  0x01f11dec: mov    %edx,0x1b0(%edi)
  0x01f11df2: mov    %edx,0x4(%ebp)
  0x01f11df5: mov    %fs:0x0(,%eiz,1),%edi
  0x01f11dfd: mov    -0xc(%edi),%edi
  0x01f11e00: push   %edi
  0x01f11e01: mov    %ebp,0x144(%edi)
  0x01f11e07: mov    %esp,0x13c(%edi)
  0x01f11e0d: call   0x55879c50
  0x01f11e12: push   %eax
  0x01f11e13: mov    %fs:0x0(,%eiz,1),%eax
  0x01f11e1b: mov    -0xc(%eax),%eax
  0x01f11e1e: cmp    %eax,%edi
  0x01f11e20: je     0x01f11e38
  0x01f11e26: int3   
  0x01f11e27: push   $0x55cdcc08
  0x01f11e2c: call   0x01f11e31
  0x01f11e31: pusha  
  0x01f11e32: call   0x557bdbf0
  0x01f11e37: hlt    
  0x01f11e38: pop    %eax
  0x01f11e39: movl   $0x0,0x13c(%edi)
  0x01f11e43: movl   $0x0,0x144(%edi)
  0x01f11e4d: add    $0x4,%esp
  0x01f11e50: cmpl   $0x0,0x4(%edi)
  0x01f11e57: je     0x01f11e65
  0x01f11e5d: mov    0x4(%edi),%eax
  0x01f11e60: jmp    0x01f05bf0
  0x01f11e65: mov    $0xdead,%ebx
  0x01f11e6a: mov    $0xdead,%ecx
  0x01f11e6f: mov    $0xdead,%edx
  0x01f11e74: mov    $0xdead,%esi
  0x01f11e79: mov    $0xdead,%edi
  0x01f11e7e: mov    %eax,0x4(%ebp)
  ;; restore_live_registers
  0x01f11e81: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f11e8c: je     0x01f11ea3
  0x01f11e92: push   $0x55cdce30
  0x01f11e97: call   0x01f11e9c
  0x01f11e9c: pusha  
  0x01f11e9d: call   0x557bdbf0
  0x01f11ea2: hlt    
  0x01f11ea3: add    $0xf0,%esp
  0x01f11ea9: popa   
  0x01f11eaa: mov    %ebp,%esp
  0x01f11eac: pop    %ebp
  0x01f11ead: ret    
  0x01f11eae: nop    
  0x01f11eaf: nop    

Decoding RuntimeStub - handle_exception_from_callee Runtime1 stub 0x01f11ec8
  0x01f11f20: push   %ebp
  0x01f11f21: mov    %esp,%ebp
  ;; generate_handle_exception
  0x01f11f23: mov    $0xdead,%ebx
  0x01f11f28: mov    $0xdead,%ecx
  0x01f11f2d: mov    $0xdead,%esi
  0x01f11f32: mov    $0xdead,%edi
  0x01f11f37: mov    %fs:0x0(,%eiz,1),%edi
  0x01f11f3f: mov    -0xc(%edi),%edi
  0x01f11f42: cmpl   $0x0,0x1ac(%edi)
  0x01f11f4c: je     0x01f11f63
  0x01f11f52: push   $0x55cdcee4
  0x01f11f57: call   0x01f11f5c
  0x01f11f5c: pusha  
  0x01f11f5d: call   0x557bdbf0
  0x01f11f62: hlt    
  0x01f11f63: cmpl   $0x0,0x1b0(%edi)
  0x01f11f6d: je     0x01f11f84
  0x01f11f73: push   $0x55cdcf00
  0x01f11f78: call   0x01f11f7d
  0x01f11f7d: pusha  
  0x01f11f7e: call   0x557bdbf0
  0x01f11f83: hlt    
  0x01f11f84: mov    %eax,0x1ac(%edi)
  0x01f11f8a: mov    %edx,0x1b0(%edi)
  0x01f11f90: mov    %edx,0x4(%ebp)
  0x01f11f93: mov    %fs:0x0(,%eiz,1),%edi
  0x01f11f9b: mov    -0xc(%edi),%edi
  0x01f11f9e: push   %edi
  0x01f11f9f: mov    %ebp,0x144(%edi)
  0x01f11fa5: mov    %esp,0x13c(%edi)
  0x01f11fab: call   0x55879c50
  0x01f11fb0: push   %eax
  0x01f11fb1: mov    %fs:0x0(,%eiz,1),%eax
  0x01f11fb9: mov    -0xc(%eax),%eax
  0x01f11fbc: cmp    %eax,%edi
  0x01f11fbe: je     0x01f11fd6
  0x01f11fc4: int3   
  0x01f11fc5: push   $0x55cdcc08
  0x01f11fca: call   0x01f11fcf
  0x01f11fcf: pusha  
  0x01f11fd0: call   0x557bdbf0
  0x01f11fd5: hlt    
  0x01f11fd6: pop    %eax
  0x01f11fd7: movl   $0x0,0x13c(%edi)
  0x01f11fe1: movl   $0x0,0x144(%edi)
  0x01f11feb: add    $0x4,%esp
  0x01f11fee: cmpl   $0x0,0x4(%edi)
  0x01f11ff5: je     0x01f12003
  0x01f11ffb: mov    0x4(%edi),%eax
  0x01f11ffe: jmp    0x01f05bf0
  0x01f12003: mov    $0xdead,%ebx
  0x01f12008: mov    $0xdead,%ecx
  0x01f1200d: mov    $0xdead,%edx
  0x01f12012: mov    $0xdead,%esi
  0x01f12017: mov    $0xdead,%edi
  0x01f1201c: mov    %eax,0x4(%ebp)
  0x01f1201f: mov    %ebp,%esp
  0x01f12021: pop    %ebp
  0x01f12022: pop    %ecx
  0x01f12023: mov    %fs:0x0(,%eiz,1),%edi
  0x01f1202b: mov    -0xc(%edi),%edi
  0x01f1202e: cmpl   $0x0,0x1b8(%edi)
  0x01f12038: cmovne %ebp,%esp
  0x01f1203b: jmp    *%ecx
  0x01f1203d: mov    %ebp,%esp
  0x01f1203f: pop    %ebp
  0x01f12040: ret    
  0x01f12041: nop    
  0x01f12042: nop    
  0x01f12043: nop    

Decoding RuntimeStub - throw_array_store_exception Runtime1 stub 0x01f12088
  0x01f120e0: push   %ebp
  0x01f120e1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f120e3: pusha  
  0x01f120e4: sub    $0xf0,%esp
  0x01f120ea: movl   $0xfeedbeef,0xec(%esp)
  0x01f120f5: movsd  %xmm0,(%esp)
  0x01f120fa: movsd  %xmm1,0x8(%esp)
  0x01f12100: movsd  %xmm2,0x10(%esp)
  0x01f12106: movsd  %xmm3,0x18(%esp)
  0x01f1210c: movsd  %xmm4,0x20(%esp)
  0x01f12112: movsd  %xmm5,0x28(%esp)
  0x01f12118: movsd  %xmm6,0x30(%esp)
  0x01f1211e: movsd  %xmm7,0x38(%esp)
  0x01f12124: mov    $0xdead,%eax
  0x01f12129: mov    $0xdead,%ebx
  0x01f1212e: mov    $0xdead,%ecx
  0x01f12133: mov    $0xdead,%edx
  0x01f12138: mov    $0xdead,%esi
  0x01f1213d: mov    $0xdead,%edi
  0x01f12142: mov    0x8(%ebp),%ebx
  0x01f12145: push   %ebx
  0x01f12146: mov    %fs:0x0(,%eiz,1),%edi
  0x01f1214e: mov    -0xc(%edi),%edi
  0x01f12151: push   %edi
  0x01f12152: mov    %ebp,0x144(%edi)
  0x01f12158: mov    %esp,0x13c(%edi)
  0x01f1215e: call   0x5587a430
  0x01f12163: push   %eax
  0x01f12164: mov    %fs:0x0(,%eiz,1),%eax
  0x01f1216c: mov    -0xc(%eax),%eax
  0x01f1216f: cmp    %eax,%edi
  0x01f12171: je     0x01f12189
  0x01f12177: int3   
  0x01f12178: push   $0x55cdcc08
  0x01f1217d: call   0x01f12182
  0x01f12182: pusha  
  0x01f12183: call   0x557bdbf0
  0x01f12188: hlt    
  0x01f12189: pop    %eax
  0x01f1218a: movl   $0x0,0x13c(%edi)
  0x01f12194: movl   $0x0,0x144(%edi)
  0x01f1219e: add    $0x8,%esp
  0x01f121a1: cmpl   $0x0,0x4(%edi)
  0x01f121a8: je     0x01f121b6
  0x01f121ae: mov    0x4(%edi),%eax
  0x01f121b1: jmp    0x01f05bf0
  0x01f121b6: push   $0x55cdce84
  0x01f121bb: call   0x01f121c0
  0x01f121c0: pusha  
  0x01f121c1: call   0x557bdbf0
  0x01f121c6: hlt    
  0x01f121c7: mov    %ebp,%esp
  0x01f121c9: pop    %ebp
  0x01f121ca: ret    
  0x01f121cb: nop    

MethodHandle::interpreter_entry::_invokeGeneric [0x01f06fc0, 0x01f06fc1[ (1 bytes)
Decoding RuntimeStub - throw_class_cast_exception Runtime1 stub 0x01f12208
  0x01f12260: push   %ebp
  0x01f12261: mov    %esp,%ebp
  ;; save_live_registers
  0x01f12263: pusha  
  0x01f12264: sub    $0xf0,%esp
  0x01f1226a: movl   $0xfeedbeef,0xec(%esp)
  0x01f12275: movsd  %xmm0,(%esp)
  0x01f1227a: movsd  %xmm1,0x8(%esp)
  0x01f12280: movsd  %xmm2,0x10(%esp)
  0x01f12286: movsd  %xmm3,0x18(%esp)
  0x01f1228c: movsd  %xmm4,0x20(%esp)
  0x01f12292: movsd  %xmm5,0x28(%esp)
  0x01f12298: movsd  %xmm6,0x30(%esp)
  0x01f1229e: movsd  %xmm7,0x38(%esp)
  0x01f122a4: mov    $0xdead,%eax
  0x01f122a9: mov    $0xdead,%ebx
  0x01f122ae: mov    $0xdead,%ecx
  0x01f122b3: mov    $0xdead,%edx
  0x01f122b8: mov    $0xdead,%esi
  0x01f122bd: mov    $0xdead,%edi
  0x01f122c2: mov    0x8(%ebp),%ebx
  0x01f122c5: push   %ebx
  0x01f122c6: mov    %fs:0x0(,%eiz,1),%edi
  0x01f122ce: mov    -0xc(%edi),%edi
  0x01f122d1: push   %edi
  0x01f122d2: mov    %ebp,0x144(%edi)
  0x01f122d8: mov    %esp,0x13c(%edi)
  0x01f122de: call   0x5587a1b0
  0x01f122e3: push   %eax
  0x01f122e4: mov    %fs:0x0(,%eiz,1),%eax
  0x01f122ec: mov    -0xc(%eax),%eax
  0x01f122ef: cmp    %eax,%edi
  0x01f122f1: je     0x01f12309
  0x01f122f7: int3   
  0x01f122f8: push   $0x55cdcc08
  0x01f122fd: call   0x01f12302
  0x01f12302: pusha  
  0x01f12303: call   0x557bdbf0
  0x01f12308: hlt    
  0x01f12309: pop    %eax
  0x01f1230a: movl   $0x0,0x13c(%edi)
  0x01f12314: movl   $0x0,0x144(%edi)
  0x01f1231e: add    $0x8,%esp
  0x01f12321: cmpl   $0x0,0x4(%edi)
  0x01f12328: je     0x01f12336
  0x01f1232e: mov    0x4(%edi),%eax
  0x01f12331: jmp    0x01f05bf0
  0x01f12336: push   $0x55cdce84
  0x01f1233b: call   0x01f12340
  0x01f12340: pusha  
  0x01f12341: call   0x557bdbf0
  0x01f12346: hlt    
  0x01f12347: mov    %ebp,%esp
  0x01f12349: pop    %ebp
  0x01f1234a: ret    
  0x01f1234b: nop    

  0x01f06fc0: hlt    

MethodHandle::interpreter_entry::_invokeBasic [0x01f06fc1, 0x01f07032[ (113 bytes)Decoding RuntimeStub - throw_incompatible_class_change_error Runtime1 stub 0x01f12388
  0x01f123e0: push   %ebp
  0x01f123e1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f123e3: pusha  
  0x01f123e4: sub    $0xf0,%esp
  0x01f123ea: movl   $0xfeedbeef,0xec(%esp)
  0x01f123f5: movsd  %xmm0,(%esp)
  0x01f123fa: movsd  %xmm1,0x8(%esp)
  0x01f12400: movsd  %xmm2,0x10(%esp)
  0x01f12406: movsd  %xmm3,0x18(%esp)
  0x01f1240c: movsd  %xmm4,0x20(%esp)
  0x01f12412: movsd  %xmm5,0x28(%esp)
  0x01f12418: movsd  %xmm6,0x30(%esp)
  0x01f1241e: movsd  %xmm7,0x38(%esp)
  0x01f12424: mov    $0xdead,%eax
  0x01f12429: mov    $0xdead,%ebx
  0x01f1242e: mov    $0xdead,%ecx
  0x01f12433: mov    $0xdead,%edx
  0x01f12438: mov    $0xdead,%esi
  0x01f1243d: mov    $0xdead,%edi
  0x01f12442: mov    %fs:0x0(,%eiz,1),%edi
  0x01f1244a: mov    -0xc(%edi),%edi
  0x01f1244d: push   %edi
  0x01f1244e: mov    %ebp,0x144(%edi)
  0x01f12454: mov    %esp,0x13c(%edi)
  0x01f1245a: call   0x5587a300
  0x01f1245f: push   %eax
  0x01f12460: mov    %fs:0x0(,%eiz,1),%eax
  0x01f12468: mov    -0xc(%eax),%eax
  0x01f1246b: cmp    %eax,%edi
  0x01f1246d: je     0x01f12485
  0x01f12473: int3   
  0x01f12474: push   $0x55cdcc08
  0x01f12479: call   0x01f1247e
  0x01f1247e: pusha  
  0x01f1247f: call   0x557bdbf0
  0x01f12484: hlt    
  0x01f12485: pop    %eax
  0x01f12486: movl   $0x0,0x13c(%edi)
  0x01f12490: movl   $0x0,0x144(%edi)
  0x01f1249a: add    $0x4,%esp
  0x01f1249d: cmpl   $0x0,0x4(%edi)
  0x01f124a4: je     0x01f124b2
  0x01f124aa: mov    0x4(%edi),%eax
  0x01f124ad: jmp    0x01f05bf0
  0x01f124b2: push   $0x55cdce84
  0x01f124b7: call   0x01f124bc
  0x01f124bc: pusha  
  0x01f124bd: call   0x557bdbf0
  0x01f124c2: hlt    
  0x01f124c3: mov    %ebp,%esp
  0x01f124c5: pop    %ebp
  0x01f124c6: ret    
  0x01f124c7: nop    


Decoding RuntimeStub - slow_subtype_check Runtime1 stub 0x01f12508
  0x01f12550: push   %edi
  0x01f12551: push   %esi
  0x01f12552: push   %ecx
  0x01f12553: push   %eax
  0x01f12554: mov    0x18(%esp),%esi
  0x01f12558: mov    0x14(%esp),%eax
  0x01f1255c: incl   0x560049a0
  0x01f12562: mov    0x18(%esi),%edi
  0x01f12565: mov    (%edi),%ecx
  0x01f12567: add    $0x4,%edi
  0x01f1256a: test   %eax,%eax
  0x01f1256c: repnz scas %es:(%edi),%eax
  0x01f1256e: jne    0x01f12584
  0x01f12574: mov    %eax,0x14(%esi)
  0x01f12577: movl   $0x1,0x18(%esp)
  0x01f1257f: pop    %eax
  0x01f12580: pop    %ecx
  0x01f12581: pop    %esi
  0x01f12582: pop    %edi
  0x01f12583: ret    
  0x01f12584: movl   $0x0,0x18(%esp)
  0x01f1258c: pop    %eax
  0x01f1258d: pop    %ecx
  0x01f1258e: pop    %esi
  0x01f1258f: pop    %edi
  0x01f12590: ret    
  0x01f12591: nop    
  0x01f12592: nop    
  0x01f12593: nop    

  0x01f06fc1: nop    
  0x01f06fc2: nop    
  0x01f06fc3: nop    
Decoding RuntimeStub - monitorenter Runtime1 stub 0x01f125c8
  0x01f12620: push   %ebp
  0x01f12621: mov    %esp,%ebp
  ;; save_live_registers
  0x01f12623: pusha  
  0x01f12624: sub    $0xf0,%esp
  0x01f1262a: movl   $0xfeedbeef,0xec(%esp)
  0x01f12635: movsd  %xmm0,(%esp)
  0x01f1263a: movsd  %xmm1,0x8(%esp)
  0x01f12640: movsd  %xmm2,0x10(%esp)
  0x01f12646: movsd  %xmm3,0x18(%esp)
  0x01f1264c: movsd  %xmm4,0x20(%esp)
  0x01f12652: movsd  %xmm5,0x28(%esp)
  0x01f12658: movsd  %xmm6,0x30(%esp)
  0x01f1265e: movsd  %xmm7,0x38(%esp)
  0x01f12664: mov    0xc(%ebp),%eax
  0x01f12667: mov    0x8(%ebp),%ebx
  0x01f1266a: push   %ebx
  0x01f1266b: push   %eax
  0x01f1266c: mov    %fs:0x0(,%eiz,1),%edi
  0x01f12674: mov    -0xc(%edi),%edi
  0x01f12677: push   %edi
  0x01f12678: mov    %ebp,0x144(%edi)
  0x01f1267e: mov    %esp,0x13c(%edi)
  0x01f12684: call   0x5587a560
  0x01f12689: push   %eax
  0x01f1268a: mov    %fs:0x0(,%eiz,1),%eax
  0x01f12692: mov    -0xc(%eax),%eax
  0x01f12695: cmp    %eax,%edi
  0x01f12697: je     0x01f126af
  0x01f1269d: int3   
  0x01f1269e: push   $0x55cdcc08
  0x01f126a3: call   0x01f126a8
  0x01f126a8: pusha  
  0x01f126a9: call   0x557bdbf0
  0x01f126ae: hlt    
  0x01f126af: pop    %eax
  0x01f126b0: movl   $0x0,0x13c(%edi)
  0x01f126ba: movl   $0x0,0x144(%edi)
  0x01f126c4: add    $0xc,%esp
  0x01f126c7: cmpl   $0x0,0x4(%edi)
  0x01f126ce: je     0x01f126dc
  0x01f126d4: mov    0x4(%edi),%eax
  0x01f126d7: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f126dc: movsd  (%esp),%xmm0
  0x01f126e1: movsd  0x8(%esp),%xmm1
  0x01f126e7: movsd  0x10(%esp),%xmm2
  0x01f126ed: movsd  0x18(%esp),%xmm3
  0x01f126f3: movsd  0x20(%esp),%xmm4
  0x01f126f9: movsd  0x28(%esp),%xmm5
  0x01f126ff: movsd  0x30(%esp),%xmm6
  0x01f12705: movsd  0x38(%esp),%xmm7
  0x01f1270b: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f12716: je     0x01f1272d
  0x01f1271c: push   $0x55cdce30
  0x01f12721: call   0x01f12726
  0x01f12726: pusha  
  0x01f12727: call   0x557bdbf0
  0x01f1272c: hlt    
  0x01f1272d: add    $0xf0,%esp
  0x01f12733: popa   
  0x01f12734: mov    %ebp,%esp
  0x01f12736: pop    %ebp
  0x01f12737: ret    

  0x01f06fc4: nop    
  0x01f06fc5: nop    
Decoding RuntimeStub - monitorenter_nofpu Runtime1 stub 0x01f12748
  0x01f127a0: push   %ebp
  0x01f127a1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f127a3: pusha  
  0x01f127a4: sub    $0xf0,%esp
  0x01f127aa: movl   $0xfeedbeef,0xec(%esp)
  0x01f127b5: mov    0xc(%ebp),%eax
  0x01f127b8: mov    0x8(%ebp),%ebx
  0x01f127bb: push   %ebx
  0x01f127bc: push   %eax
  0x01f127bd: mov    %fs:0x0(,%eiz,1),%edi
  0x01f127c5: mov    -0xc(%edi),%edi
  0x01f127c8: push   %edi
  0x01f127c9: mov    %ebp,0x144(%edi)
  0x01f127cf: mov    %esp,0x13c(%edi)
  0x01f127d5: call   0x5587a560
  0x01f127da: push   %eax
  0x01f127db: mov    %fs:0x0(,%eiz,1),%eax
  0x01f127e3: mov    -0xc(%eax),%eax
  0x01f127e6: cmp    %eax,%edi
  0x01f127e8: je     0x01f12800
  0x01f127ee: int3   
  0x01f127ef: push   $0x55cdcc08
  0x01f127f4: call   0x01f127f9
  0x01f127f9: pusha  
  0x01f127fa: call   0x557bdbf0
  0x01f127ff: hlt    
  0x01f12800: pop    %eax
  0x01f12801: movl   $0x0,0x13c(%edi)
  0x01f1280b: movl   $0x0,0x144(%edi)
  0x01f12815: add    $0xc,%esp
  0x01f12818: cmpl   $0x0,0x4(%edi)
  0x01f1281f: je     0x01f1282d
  0x01f12825: mov    0x4(%edi),%eax
  0x01f12828: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f1282d: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f12838: je     0x01f1284f
  0x01f1283e: push   $0x55cdce30
  0x01f12843: call   0x01f12848
  0x01f12848: pusha  
  0x01f12849: call   0x557bdbf0
  0x01f1284e: hlt    
  0x01f1284f: add    $0xf0,%esp
  0x01f12855: popa   
  0x01f12856: mov    %ebp,%esp
  0x01f12858: pop    %ebp
  0x01f12859: ret    
  0x01f1285a: nop    
  0x01f1285b: nop    

  0x01f06fc6: nop    
  0x01f06fc7: nop    
  0x01f06fc8: nop    
  0x01f06fc9: nop    
  0x01f06fca: nop    
  0x01f06fcb: nop    
  0x01f06fcc: Decoding RuntimeStub - monitorexit Runtime1 stub 0x01f12888
  0x01f128e0: push   %ebp
  0x01f128e1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f128e3: pusha  
  0x01f128e4: sub    $0xf0,%esp
  0x01f128ea: movl   $0xfeedbeef,0xec(%esp)
  0x01f128f5: movsd  %xmm0,(%esp)
  0x01f128fa: movsd  %xmm1,0x8(%esp)
  0x01f12900: movsd  %xmm2,0x10(%esp)
  0x01f12906: movsd  %xmm3,0x18(%esp)
  0x01f1290c: movsd  %xmm4,0x20(%esp)
  0x01f12912: movsd  %xmm5,0x28(%esp)
  0x01f12918: movsd  %xmm6,0x30(%esp)
  0x01f1291e: movsd  %xmm7,0x38(%esp)
  0x01f12924: mov    0x8(%ebp),%eax
  0x01f12927: push   %eax
  0x01f12928: mov    %fs:0x0(,%eiz,1),%edi
  0x01f12930: mov    -0xc(%edi),%edi
  0x01f12933: push   %edi
  0x01f12934: mov    %ebp,0x144(%edi)
  0x01f1293a: mov    %esp,0x13c(%edi)
  0x01f12940: call   0x5587a790
  0x01f12945: push   %eax
  0x01f12946: mov    %fs:0x0(,%eiz,1),%eax
  0x01f1294e: mov    -0xc(%eax),%eax
  0x01f12951: cmp    %eax,%edi
  0x01f12953: je     0x01f1296b
  0x01f12959: int3   
  0x01f1295a: push   $0x55cdcc08
  0x01f1295f: call   0x01f12964
  0x01f12964: pusha  
  0x01f12965: call   0x557bdbf0
  0x01f1296a: hlt    
  0x01f1296b: pop    %eax
  0x01f1296c: movl   $0x0,0x13c(%edi)
  0x01f12976: movl   $0x0,0x144(%edi)
  0x01f12980: add    $0x8,%esp
  0x01f12983: cmpl   $0x0,0x4(%edi)
  0x01f1298a: je     0x01f12998
  0x01f12990: mov    0x4(%edi),%eax
  0x01f12993: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f12998: movsd  (%esp),%xmm0
  0x01f1299d: movsd  0x8(%esp),%xmm1
  0x01f129a3: movsd  0x10(%esp),%xmm2
  0x01f129a9: movsd  0x18(%esp),%xmm3
  0x01f129af: movsd  0x20(%esp),%xmm4
  0x01f129b5: movsd  0x28(%esp),%xmm5
  0x01f129bb: movsd  0x30(%esp),%xmm6
  0x01f129c1: movsd  0x38(%esp),%xmm7
  0x01f129c7: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f129d2: je     0x01f129e9
  0x01f129d8: push   $0x55cdce30
  0x01f129dd: call   0x01f129e2
  0x01f129e2: pusha  
  0x01f129e3: call   0x557bdbf0
  0x01f129e8: hlt    
  0x01f129e9: add    $0xf0,%esp
  0x01f129ef: popa   
  0x01f129f0: mov    %ebp,%esp
  0x01f129f2: pop    %ebp
  0x01f129f3: ret    

ret    

MethodHandle::interpreter_entry::_linkToVirtual [0x01f07032, 0x01f0718c[ (346 bytes)
  ;; } jump_to_lambda_form
  0x01f07032: nop    
  0x01f07033: Decoding RuntimeStub - monitorexit_nofpu Runtime1 stub 0x01f12a08
  0x01f12a60: push   %ebp
  0x01f12a61: mov    %esp,%ebp
  ;; save_live_registers
  0x01f12a63: pusha  
  0x01f12a64: sub    $0xf0,%esp
  0x01f12a6a: movl   $0xfeedbeef,0xec(%esp)
  0x01f12a75: mov    0x8(%ebp),%eax
  0x01f12a78: push   %eax
  0x01f12a79: mov    %fs:0x0(,%eiz,1),%edi
  0x01f12a81: mov    -0xc(%edi),%edi
  0x01f12a84: push   %edi
  0x01f12a85: mov    %ebp,0x144(%edi)
  0x01f12a8b: mov    %esp,0x13c(%edi)
  0x01f12a91: call   0x5587a790
  0x01f12a96: push   %eax
  0x01f12a97: mov    %fs:0x0(,%eiz,1),%eax
  0x01f12a9f: mov    -0xc(%eax),%eax
  0x01f12aa2: cmp    %eax,%edi
  0x01f12aa4: je     0x01f12abc
  0x01f12aaa: int3   
  0x01f12aab: push   $0x55cdcc08
  0x01f12ab0: call   0x01f12ab5
  0x01f12ab5: pusha  
  0x01f12ab6: call   0x557bdbf0
  0x01f12abb: hlt    
  0x01f12abc: pop    %eax
  0x01f12abd: movl   $0x0,0x13c(%edi)
  0x01f12ac7: movl   $0x0,0x144(%edi)
  0x01f12ad1: add    $0x8,%esp
  0x01f12ad4: cmpl   $0x0,0x4(%edi)
  0x01f12adb: je     0x01f12ae9
  0x01f12ae1: mov    0x4(%edi),%eax
  0x01f12ae4: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f12ae9: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f12af4: je     0x01f12b0b
  0x01f12afa: push   $0x55cdce30
  0x01f12aff: call   0x01f12b04
  0x01f12b04: pusha  
  0x01f12b05: call   0x557bdbf0
  0x01f12b0a: hlt    
  0x01f12b0b: add    $0xf0,%esp
  0x01f12b11: popa   
  0x01f12b12: mov    %ebp,%esp
  0x01f12b14: pop    %ebp
  0x01f12b15: ret    
  0x01f12b16: nop    
  0x01f12b17: nop    

nop    

MethodHandle::interpreter_entry::_linkToStatic [0x01f0718c, 0x01f0721e[ (146 bytes)
  0x01f0718c: nop    
  0x01f0718d: nop    
  0x01f0718e: nop    
  0x01f0718f: Decoding RuntimeStub - deoptimize Runtime1 stub 0x01f12b48
  0x01f12ba0: push   %ebp
  0x01f12ba1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f12ba3: pusha  
  0x01f12ba4: sub    $0xf0,%esp
  0x01f12baa: movl   $0xfeedbeef,0xec(%esp)
  0x01f12bb5: movsd  %xmm0,(%esp)
  0x01f12bba: movsd  %xmm1,0x8(%esp)
  0x01f12bc0: movsd  %xmm2,0x10(%esp)
  0x01f12bc6: movsd  %xmm3,0x18(%esp)
  0x01f12bcc: movsd  %xmm4,0x20(%esp)
  0x01f12bd2: movsd  %xmm5,0x28(%esp)
  0x01f12bd8: movsd  %xmm6,0x30(%esp)
  0x01f12bde: movsd  %xmm7,0x38(%esp)
  0x01f12be4: mov    %fs:0x0(,%eiz,1),%edi
  0x01f12bec: mov    -0xc(%edi),%edi
  0x01f12bef: push   %edi
  0x01f12bf0: mov    %ebp,0x144(%edi)
  0x01f12bf6: mov    %esp,0x13c(%edi)
  0x01f12bfc: call   0x5587a960
  0x01f12c01: push   %eax
  0x01f12c02: mov    %fs:0x0(,%eiz,1),%eax
  0x01f12c0a: mov    -0xc(%eax),%eax
  0x01f12c0d: cmp    %eax,%edi
  0x01f12c0f: je     0x01f12c27
  0x01f12c15: int3   
  0x01f12c16: push   $0x55cdcc08
  0x01f12c1b: call   0x01f12c20
  0x01f12c20: pusha  
  0x01f12c21: call   0x557bdbf0
  0x01f12c26: hlt    
  0x01f12c27: pop    %eax
  0x01f12c28: movl   $0x0,0x13c(%edi)
  0x01f12c32: movl   $0x0,0x144(%edi)
  0x01f12c3c: add    $0x4,%esp
  0x01f12c3f: cmpl   $0x0,0x4(%edi)
  0x01f12c46: je     0x01f12c54
  0x01f12c4c: mov    0x4(%edi),%eax
  0x01f12c4f: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f12c54: movsd  (%esp),%xmm0
  0x01f12c59: movsd  0x8(%esp),%xmm1
  0x01f12c5f: movsd  0x10(%esp),%xmm2
  0x01f12c65: movsd  0x18(%esp),%xmm3
  0x01f12c6b: movsd  0x20(%esp),%xmm4
  0x01f12c71: movsd  0x28(%esp),%xmm5
  0x01f12c77: movsd  0x30(%esp),%xmm6
  0x01f12c7d: movsd  0x38(%esp),%xmm7
  0x01f12c83: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f12c8e: je     0x01f12ca5
  0x01f12c94: push   $0x55cdce30
  0x01f12c99: call   0x01f12c9e
  0x01f12c9e: pusha  
  0x01f12c9f: call   0x557bdbf0
  0x01f12ca4: hlt    
  0x01f12ca5: add    $0xf0,%esp
  0x01f12cab: popa   
  0x01f12cac: mov    %ebp,%esp
  0x01f12cae: pop    %ebp
  0x01f12caf: jmp    0x01ea409f
  0x01f12cb4: mov    %ebp,%esp
  0x01f12cb6: pop    %ebp
  0x01f12cb7: ret    

ret    

MethodHandle::interpreter_entry::_linkToSpecial [0x01f0721e, 0x01f0734d[ (303 bytes)
  0x01f0721e: nop    
  0x01f0721f: nop    
  ;; verify_intrinsic_id {
  0x01f07220: Decoding RuntimeStub - access_field_patching Runtime1 stub 0x01f12cc8
  0x01f12d40: push   %ebp
  0x01f12d41: mov    %esp,%ebp
  ;; save_live_registers
  0x01f12d43: pusha  
  0x01f12d44: sub    $0xf0,%esp
  0x01f12d4a: movl   $0xfeedbeef,0xec(%esp)
  0x01f12d55: movsd  %xmm0,(%esp)
  0x01f12d5a: movsd  %xmm1,0x8(%esp)
  0x01f12d60: movsd  %xmm2,0x10(%esp)
  0x01f12d66: movsd  %xmm3,0x18(%esp)
  0x01f12d6c: movsd  %xmm4,0x20(%esp)
  0x01f12d72: movsd  %xmm5,0x28(%esp)
  0x01f12d78: movsd  %xmm6,0x30(%esp)
  0x01f12d7e: movsd  %xmm7,0x38(%esp)
  0x01f12d84: push   %eax
  0x01f12d85: mov    %fs:0x0(,%eiz,1),%edi
  0x01f12d8d: mov    -0xc(%edi),%edi
  0x01f12d90: push   %edi
  0x01f12d91: mov    %ebp,0x144(%edi)
  0x01f12d97: mov    %esp,0x13c(%edi)
  0x01f12d9d: call   0x5587ab00
  0x01f12da2: push   %eax
  0x01f12da3: mov    %fs:0x0(,%eiz,1),%eax
  0x01f12dab: mov    -0xc(%eax),%eax
  0x01f12dae: cmp    %eax,%edi
  0x01f12db0: je     0x01f12dc7
  0x01f12db6: push   $0x55cdd05c
  0x01f12dbb: call   0x01f12dc0
  0x01f12dc0: pusha  
  0x01f12dc1: call   0x557bdbf0
  0x01f12dc6: hlt    
  0x01f12dc7: pop    %eax
  0x01f12dc8: movl   $0x0,0x13c(%edi)
  0x01f12dd2: movl   $0x0,0x144(%edi)
  0x01f12ddc: pop    %ecx
  0x01f12ddd: pop    %ecx
  0x01f12dde: cmpl   $0x0,0x4(%edi)
  0x01f12de5: je     0x01f12eb5
  0x01f12deb: test   %eax,%eax
  0x01f12ded: je     0x01f05bf0
  0x01f12df3: mov    0x4(%edi),%eax
  0x01f12df6: movl   $0x0,0x4(%edi)
  0x01f12dfd: mov    0x114(%esp),%edx
  0x01f12e04: cmpl   $0x0,0x1ac(%edi)
  0x01f12e0e: je     0x01f12e25
  0x01f12e14: push   $0x55cdd090
  0x01f12e19: call   0x01f12e1e
  0x01f12e1e: pusha  
  0x01f12e1f: call   0x557bdbf0
  0x01f12e24: hlt    
  0x01f12e25: cmpl   $0x0,0x1b0(%edi)
  0x01f12e2f: je     0x01f12e46
  0x01f12e35: push   $0x55cdd0ac
  0x01f12e3a: call   0x01f12e3f
  0x01f12e3f: pusha  
  0x01f12e40: call   0x557bdbf0
  0x01f12e45: hlt    
  0x01f12e46: mov    %eax,0x1ac(%edi)
  0x01f12e4c: mov    %edx,0x1b0(%edi)
  ;; restore_live_registers
  0x01f12e52: movsd  (%esp),%xmm0
  0x01f12e57: movsd  0x8(%esp),%xmm1
  0x01f12e5d: movsd  0x10(%esp),%xmm2
  0x01f12e63: movsd  0x18(%esp),%xmm3
  0x01f12e69: movsd  0x20(%esp),%xmm4
  0x01f12e6f: movsd  0x28(%esp),%xmm5
  0x01f12e75: movsd  0x30(%esp),%xmm6
  0x01f12e7b: movsd  0x38(%esp),%xmm7
  0x01f12e81: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f12e8c: je     0x01f12ea3
  0x01f12e92: push   $0x55cdce30
  0x01f12e97: call   0x01f12e9c
  0x01f12e9c: pusha  
  0x01f12e9d: call   0x557bdbf0
  0x01f12ea2: hlt    
  0x01f12ea3: add    $0xf0,%esp
  0x01f12ea9: popa   
  0x01f12eaa: mov    %ebp,%esp
  0x01f12eac: pop    %ebp
  0x01f12ead: add    $0x4,%esp
  0x01f12eb0: jmp    0x01ea4155
  0x01f12eb5: test   %eax,%eax
  0x01f12eb7: je     0x01f12f1d
  ;; restore_live_registers
  0x01f12ebd: movsd  (%esp),%xmm0
  0x01f12ec2: movsd  0x8(%esp),%xmm1
  0x01f12ec8: movsd  0x10(%esp),%xmm2
  0x01f12ece: movsd  0x18(%esp),%xmm3
  0x01f12ed4: movsd  0x20(%esp),%xmm4
  0x01f12eda: movsd  0x28(%esp),%xmm5
  0x01f12ee0: movsd  0x30(%esp),%xmm6
  0x01f12ee6: movsd  0x38(%esp),%xmm7
  0x01f12eec: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f12ef7: je     0x01f12f0e
  0x01f12efd: push   $0x55cdce30
  0x01f12f02: call   0x01f12f07
  0x01f12f07: pusha  
  0x01f12f08: call   0x557bdbf0
  0x01f12f0d: hlt    
  0x01f12f0e: add    $0xf0,%esp
  0x01f12f14: popa   
  0x01f12f15: mov    %ebp,%esp
  0x01f12f17: pop    %ebp
  0x01f12f18: jmp    0x01ea409f
  ;; restore_live_registers
  0x01f12f1d: movsd  (%esp),%xmm0
  0x01f12f22: movsd  0x8(%esp),%xmm1
  0x01f12f28: movsd  0x10(%esp),%xmm2
  0x01f12f2e: movsd  0x18(%esp),%xmm3
  0x01f12f34: movsd  0x20(%esp),%xmm4
  0x01f12f3a: movsd  0x28(%esp),%xmm5
  0x01f12f40: movsd  0x30(%esp),%xmm6
  0x01f12f46: movsd  0x38(%esp),%xmm7
  0x01f12f4c: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f12f57: je     0x01f12f6e
  0x01f12f5d: push   $0x55cdce30
  0x01f12f62: call   0x01f12f67
  0x01f12f67: pusha  
  0x01f12f68: call   0x557bdbf0
  0x01f12f6d: hlt    
  0x01f12f6e: add    $0xf0,%esp
  0x01f12f74: popa   
  0x01f12f75: mov    %ebp,%esp
  0x01f12f77: pop    %ebp
  0x01f12f78: ret    
  0x01f12f79: mov    %ebp,%esp
  0x01f12f7b: pop    %ebp
  0x01f12f7c: ret    
  0x01f12f7d: nop    
  0x01f12f7e: nop    
  0x01f12f7f: nop    

nop    

MethodHandle::interpreter_entry::_linkToInterface [0x01f0734d, 0x01f0747d[ (304 bytes)
  0x01f0734d: nop    
  0x01f0734e: nop    
  0x01f0734f: nop    
  ;; Decoding RuntimeStub - load_klass_patching Runtime1 stub 0x01f12f88
  0x01f13000: push   %ebp
  0x01f13001: mov    %esp,%ebp
  ;; save_live_registers
  0x01f13003: pusha  
  0x01f13004: sub    $0xf0,%esp
  0x01f1300a: movl   $0xfeedbeef,0xec(%esp)
  0x01f13015: movsd  %xmm0,(%esp)
  0x01f1301a: movsd  %xmm1,0x8(%esp)
  0x01f13020: movsd  %xmm2,0x10(%esp)
  0x01f13026: movsd  %xmm3,0x18(%esp)
  0x01f1302c: movsd  %xmm4,0x20(%esp)
  0x01f13032: movsd  %xmm5,0x28(%esp)
  0x01f13038: movsd  %xmm6,0x30(%esp)
  0x01f1303e: movsd  %xmm7,0x38(%esp)
  0x01f13044: push   %eax
  0x01f13045: mov    %fs:0x0(,%eiz,1),%edi
  0x01f1304d: mov    -0xc(%edi),%edi
  0x01f13050: push   %edi
  0x01f13051: mov    %ebp,0x144(%edi)
  0x01f13057: mov    %esp,0x13c(%edi)
  0x01f1305d: call   0x5587ab50
  0x01f13062: push   %eax
  0x01f13063: mov    %fs:0x0(,%eiz,1),%eax
  0x01f1306b: mov    -0xc(%eax),%eax
  0x01f1306e: cmp    %eax,%edi
  0x01f13070: je     0x01f13087
  0x01f13076: push   $0x55cdd05c
  0x01f1307b: call   0x01f13080
  0x01f13080: pusha  
  0x01f13081: call   0x557bdbf0
  0x01f13086: hlt    
  0x01f13087: pop    %eax
  0x01f13088: movl   $0x0,0x13c(%edi)
  0x01f13092: movl   $0x0,0x144(%edi)
  0x01f1309c: pop    %ecx
  0x01f1309d: pop    %ecx
  0x01f1309e: cmpl   $0x0,0x4(%edi)
  0x01f130a5: je     0x01f13175
  0x01f130ab: test   %eax,%eax
  0x01f130ad: je     0x01f05bf0
  0x01f130b3: mov    0x4(%edi),%eax
  0x01f130b6: movl   $0x0,0x4(%edi)
  0x01f130bd: mov    0x114(%esp),%edx
  0x01f130c4: cmpl   $0x0,0x1ac(%edi)
  0x01f130ce: je     0x01f130e5
  0x01f130d4: push   $0x55cdd090
  0x01f130d9: call   0x01f130de
  0x01f130de: pusha  
  0x01f130df: call   0x557bdbf0
  0x01f130e4: hlt    
  0x01f130e5: cmpl   $0x0,0x1b0(%edi)
  0x01f130ef: je     0x01f13106
  0x01f130f5: push   $0x55cdd0ac
  0x01f130fa: call   0x01f130ff
  0x01f130ff: pusha  
  0x01f13100: call   0x557bdbf0
  0x01f13105: hlt    
  0x01f13106: mov    %eax,0x1ac(%edi)
  0x01f1310c: mov    %edx,0x1b0(%edi)
  ;; restore_live_registers
  0x01f13112: movsd  (%esp),%xmm0
  0x01f13117: movsd  0x8(%esp),%xmm1
  0x01f1311d: movsd  0x10(%esp),%xmm2
  0x01f13123: movsd  0x18(%esp),%xmm3
  0x01f13129: movsd  0x20(%esp),%xmm4
  0x01f1312f: movsd  0x28(%esp),%xmm5
  0x01f13135: movsd  0x30(%esp),%xmm6
  0x01f1313b: movsd  0x38(%esp),%xmm7
  0x01f13141: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f1314c: je     0x01f13163
  0x01f13152: push   $0x55cdce30
  0x01f13157: call   0x01f1315c
  0x01f1315c: pusha  
  0x01f1315d: call   0x557bdbf0
  0x01f13162: hlt    
  0x01f13163: add    $0xf0,%esp
  0x01f13169: popa   
  0x01f1316a: mov    %ebp,%esp
  0x01f1316c: pop    %ebp
  0x01f1316d: add    $0x4,%esp
  0x01f13170: jmp    0x01ea4155
  0x01f13175: test   %eax,%eax
  0x01f13177: je     0x01f131dd
  ;; restore_live_registers
  0x01f1317d: movsd  (%esp),%xmm0
  0x01f13182: movsd  0x8(%esp),%xmm1
  0x01f13188: movsd  0x10(%esp),%xmm2
  0x01f1318e: movsd  0x18(%esp),%xmm3
  0x01f13194: movsd  0x20(%esp),%xmm4
  0x01f1319a: movsd  0x28(%esp),%xmm5
  0x01f131a0: movsd  0x30(%esp),%xmm6
  0x01f131a6: movsd  0x38(%esp),%xmm7
  0x01f131ac: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f131b7: je     0x01f131ce
  0x01f131bd: push   $0x55cdce30
  0x01f131c2: call   0x01f131c7
  0x01f131c7: pusha  
  0x01f131c8: call   0x557bdbf0
  0x01f131cd: hlt    
  0x01f131ce: add    $0xf0,%esp
  0x01f131d4: popa   
  0x01f131d5: mov    %ebp,%esp
  0x01f131d7: pop    %ebp
  0x01f131d8: jmp    0x01ea409f
  ;; restore_live_registers
  0x01f131dd: movsd  (%esp),%xmm0
  0x01f131e2: movsd  0x8(%esp),%xmm1
  0x01f131e8: movsd  0x10(%esp),%xmm2
  0x01f131ee: movsd  0x18(%esp),%xmm3
  0x01f131f4: movsd  0x20(%esp),%xmm4
  0x01f131fa: movsd  0x28(%esp),%xmm5
  0x01f13200: movsd  0x30(%esp),%xmm6
  0x01f13206: movsd  0x38(%esp),%xmm7
  0x01f1320c: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f13217: je     0x01f1322e
  0x01f1321d: push   $0x55cdce30
  0x01f13222: call   0x01f13227
  0x01f13227: pusha  
  0x01f13228: call   0x557bdbf0
  0x01f1322d: hlt    
  0x01f1322e: add    $0xf0,%esp
  0x01f13234: popa   
  0x01f13235: mov    %ebp,%esp
  0x01f13237: pop    %ebp
  0x01f13238: ret    
  0x01f13239: mov    %ebp,%esp
  0x01f1323b: pop    %ebp
  0x01f1323c: ret    
  0x01f1323d: nop    
  0x01f1323e: nop    
  0x01f1323f: nop    

verify_intrinsic_id {
  0x01f07350: cmpb   $0xb0,0x1e(%ebx)
  0x01f07354: je     0x01f0736b
  ;; bad Method*::intrinsic_id
  0x01f0735a: push   $0x55ce46d0
  0x01f0735f: call   0x01f07364
  0x01f07364: pusha  
  0x01f07365: call   Decoding RuntimeStub - load_mirror_patching Runtime1 stub 0x01f13248
  0x01f132c0: push   %ebp
  0x01f132c1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f132c3: pusha  
  0x01f132c4: sub    $0xf0,%esp
  0x01f132ca: movl   $0xfeedbeef,0xec(%esp)
  0x01f132d5: movsd  %xmm0,(%esp)
  0x01f132da: movsd  %xmm1,0x8(%esp)
  0x01f132e0: movsd  %xmm2,0x10(%esp)
  0x01f132e6: movsd  %xmm3,0x18(%esp)
  0x01f132ec: movsd  %xmm4,0x20(%esp)
  0x01f132f2: movsd  %xmm5,0x28(%esp)
  0x01f132f8: movsd  %xmm6,0x30(%esp)
  0x01f132fe: movsd  %xmm7,0x38(%esp)
  0x01f13304: push   %eax
  0x01f13305: mov    %fs:0x0(,%eiz,1),%edi
  0x01f1330d: mov    -0xc(%edi),%edi
  0x01f13310: push   %edi
  0x01f13311: mov    %ebp,0x144(%edi)
  0x01f13317: mov    %esp,0x13c(%edi)
  0x01f1331d: call   0x5587aba0
  0x01f13322: push   %eax
  0x01f13323: mov    %fs:0x0(,%eiz,1),%eax
  0x01f1332b: mov    -0xc(%eax),%eax
  0x01f1332e: cmp    %eax,%edi
  0x01f13330: je     0x01f13347
  0x01f13336: push   $0x55cdd05c
  0x01f1333b: call   0x01f13340
  0x01f13340: pusha  
  0x01f13341: call   0x557bdbf0
  0x01f13346: hlt    
  0x01f13347: pop    %eax
  0x01f13348: movl   $0x0,0x13c(%edi)
  0x01f13352: movl   $0x0,0x144(%edi)
  0x01f1335c: pop    %ecx
  0x01f1335d: pop    %ecx
  0x01f1335e: cmpl   $0x0,0x4(%edi)
  0x01f13365: je     0x01f13435
  0x01f1336b: test   %eax,%eax
  0x01f1336d: je     0x01f05bf0
  0x01f13373: mov    0x4(%edi),%eax
  0x01f13376: movl   $0x0,0x4(%edi)
  0x01f1337d: mov    0x114(%esp),%edx
  0x01f13384: cmpl   $0x0,0x1ac(%edi)
  0x01f1338e: je     0x01f133a5
  0x01f13394: push   $0x55cdd090
  0x01f13399: call   0x01f1339e
  0x01f1339e: pusha  
  0x01f1339f: call   0x557bdbf0
  0x01f133a4: hlt    
  0x01f133a5: cmpl   $0x0,0x1b0(%edi)
  0x01f133af: je     0x01f133c6
  0x01f133b5: push   $0x55cdd0ac
  0x01f133ba: call   0x01f133bf
  0x01f133bf: pusha  
  0x01f133c0: call   0x557bdbf0
  0x01f133c5: hlt    
  0x01f133c6: mov    %eax,0x1ac(%edi)
  0x01f133cc: mov    %edx,0x1b0(%edi)
  ;; restore_live_registers
  0x01f133d2: movsd  (%esp),%xmm0
  0x01f133d7: movsd  0x8(%esp),%xmm1
  0x01f133dd: movsd  0x10(%esp),%xmm2
  0x01f133e3: movsd  0x18(%esp),%xmm3
  0x01f133e9: movsd  0x20(%esp),%xmm4
  0x01f133ef: movsd  0x28(%esp),%xmm5
  0x01f133f5: movsd  0x30(%esp),%xmm6
  0x01f133fb: movsd  0x38(%esp),%xmm7
  0x01f13401: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f1340c: je     0x01f13423
  0x01f13412: push   $0x55cdce30
  0x01f13417: call   0x01f1341c
  0x01f1341c: pusha  
  0x01f1341d: call   0x557bdbf0
  0x01f13422: hlt    
  0x01f13423: add    $0xf0,%esp
  0x01f13429: popa   
  0x01f1342a: mov    %ebp,%esp
  0x01f1342c: pop    %ebp
  0x01f1342d: add    $0x4,%esp
  0x01f13430: jmp    0x01ea4155
  0x01f13435: test   %eax,%eax
  0x01f13437: je     0x01f1349d
  ;; restore_live_registers
  0x01f1343d: movsd  (%esp),%xmm0
  0x01f13442: movsd  0x8(%esp),%xmm1
  0x01f13448: movsd  0x10(%esp),%xmm2
  0x01f1344e: movsd  0x18(%esp),%xmm3
  0x01f13454: movsd  0x20(%esp),%xmm4
  0x01f1345a: movsd  0x28(%esp),%xmm5
  0x01f13460: movsd  0x30(%esp),%xmm6
  0x01f13466: movsd  0x38(%esp),%xmm7
  0x01f1346c: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f13477: je     0x01f1348e
  0x01f1347d: push   $0x55cdce30
  0x01f13482: call   0x01f13487
  0x01f13487: pusha  
  0x01f13488: call   0x557bdbf0
  0x01f1348d: hlt    
  0x01f1348e: add    $0xf0,%esp
  0x01f13494: popa   
  0x01f13495: mov    %ebp,%esp
  0x01f13497: pop    %ebp
  0x01f13498: jmp    0x01ea409f
  ;; restore_live_registers
  0x01f1349d: movsd  (%esp),%xmm0
  0x01f134a2: movsd  0x8(%esp),%xmm1
  0x01f134a8: movsd  0x10(%esp),%xmm2
  0x01f134ae: movsd  0x18(%esp),%xmm3
  0x01f134b4: movsd  0x20(%esp),%xmm4
  0x01f134ba: movsd  0x28(%esp),%xmm5
  0x01f134c0: movsd  0x30(%esp),%xmm6
  0x01f134c6: movsd  0x38(%esp),%xmm7
  0x01f134cc: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f134d7: je     0x01f134ee
  0x01f134dd: push   $0x55cdce30
  0x01f134e2: call   0x01f134e7
  0x01f134e7: pusha  
  0x01f134e8: call   0x557bdbf0
  0x01f134ed: hlt    
  0x01f134ee: add    $0xf0,%esp
  0x01f134f4: popa   
  0x01f134f5: mov    %ebp,%esp
  0x01f134f7: pop    %ebp
  0x01f134f8: ret    
  0x01f134f9: mov    %ebp,%esp
  0x01f134fb: pop    %ebp
  0x01f134fc: ret    
  0x01f134fd: nop    
  0x01f134fe: nop    
  0x01f134ff: nop    

0x557bdbf0

Decoding RuntimeStub - load_appendix_patching Runtime1 stub 0x01f13508
  0x01f13580: push   %ebp
  0x01f13581: mov    %esp,%ebp
  ;; save_live_registers
  0x01f13583: pusha  
  0x01f13584: sub    $0xf0,%esp
  0x01f1358a: movl   $0xfeedbeef,0xec(%esp)
  0x01f13595: movsd  %xmm0,(%esp)
  0x01f1359a: movsd  %xmm1,0x8(%esp)
  0x01f135a0: movsd  %xmm2,0x10(%esp)
  0x01f135a6: movsd  %xmm3,0x18(%esp)
  0x01f135ac: movsd  %xmm4,0x20(%esp)
  0x01f135b2: movsd  %xmm5,0x28(%esp)
  0x01f135b8: movsd  %xmm6,0x30(%esp)
  0x01f135be: movsd  %xmm7,0x38(%esp)
  0x01f135c4: push   %eax
  0x01f135c5: mov    %fs:0x0(,%eiz,1),%edi
  0x01f135cd: mov    -0xc(%edi),%edi
  0x01f135d0: push   %edi
  0x01f135d1: mov    %ebp,0x144(%edi)
  0x01f135d7: mov    %esp,0x13c(%edi)
  0x01f135dd: call   0x5587abf0
  0x01f135e2: push   %eax
  0x01f135e3: mov    %fs:0x0(,%eiz,1),%eax
  0x01f135eb: mov    -0xc(%eax),%eax
  0x01f135ee: cmp    %eax,%edi
  0x01f135f0: je     0x01f13607
  0x01f135f6: push   $0x55cdd05c
  0x01f135fb: call   0x01f13600
  0x01f13600: pusha  
  0x01f13601: call   0x557bdbf0
  0x01f13606: hlt    
  0x01f13607: pop    %eax
  0x01f13608: movl   $0x0,0x13c(%edi)
  0x01f13612: movl   $0x0,0x144(%edi)
  0x01f1361c: pop    %ecx
  0x01f1361d: pop    %ecx
  0x01f1361e: cmpl   $0x0,0x4(%edi)
  0x01f13625: je     0x01f136f5
  0x01f1362b: test   %eax,%eax
  0x01f1362d: je     0x01f05bf0
  0x01f13633: mov    0x4(%edi),%eax
  0x01f13636: movl   $0x0,0x4(%edi)
  0x01f1363d: mov    0x114(%esp),%edx
  0x01f13644: cmpl   $0x0,0x1ac(%edi)
  0x01f1364e: je     0x01f13665
  0x01f13654: push   $0x55cdd090
  0x01f13659: call   0x01f1365e
  0x01f1365e: pusha  
  0x01f1365f: call   0x557bdbf0
  0x01f13664: hlt    
  0x01f13665: cmpl   $0x0,0x1b0(%edi)
  0x01f1366f: je     0x01f13686
  0x01f13675: push   $0x55cdd0ac
  0x01f1367a: call   0x01f1367f
  0x01f1367f: pusha  
  0x01f13680: call   0x557bdbf0
  0x01f13685: hlt    
  0x01f13686: mov    %eax,0x1ac(%edi)
  0x01f1368c: mov    %edx,0x1b0(%edi)
  ;; restore_live_registers
  0x01f13692: movsd  (%esp),%xmm0
  0x01f13697: movsd  0x8(%esp),%xmm1
  0x01f1369d: movsd  0x10(%esp),%xmm2
  0x01f136a3: movsd  0x18(%esp),%xmm3
  0x01f136a9: movsd  0x20(%esp),%xmm4
  0x01f136af: movsd  0x28(%esp),%xmm5
  0x01f136b5: movsd  0x30(%esp),%xmm6
  0x01f136bb: movsd  0x38(%esp),%xmm7
  0x01f136c1: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f136cc: je     0x01f136e3
  0x01f136d2: push   $0x55cdce30
  0x01f136d7: call   0x01f136dc
  0x01f136dc: pusha  
  0x01f136dd: call   0x557bdbf0
  0x01f136e2: hlt    
  0x01f136e3: add    $0xf0,%esp
  0x01f136e9: popa   
  0x01f136ea: mov    %ebp,%esp
  0x01f136ec: pop    %ebp
  0x01f136ed: add    $0x4,%esp
  0x01f136f0: jmp    0x01ea4155
  0x01f136f5: test   %eax,%eax
  0x01f136f7: je     0x01f1375d
  ;; restore_live_registers
  0x01f136fd: movsd  (%esp),%xmm0
  0x01f13702: movsd  0x8(%esp),%xmm1
  0x01f13708: movsd  0x10(%esp),%xmm2
  0x01f1370e: movsd  0x18(%esp),%xmm3
  0x01f13714: movsd  0x20(%esp),%xmm4
  0x01f1371a: movsd  0x28(%esp),%xmm5
  0x01f13720: movsd  0x30(%esp),%xmm6
  0x01f13726: movsd  0x38(%esp),%xmm7
  0x01f1372c: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f13737: je     0x01f1374e
  0x01f1373d: push   $0x55cdce30
  0x01f13742: call   0x01f13747
  0x01f13747: pusha  
  0x01f13748: call   0x557bdbf0
  0x01f1374d: hlt    
  0x01f1374e: add    $0xf0,%esp
  0x01f13754: popa   
  0x01f13755: mov    %ebp,%esp
  0x01f13757: pop    %ebp
  0x01f13758: jmp    0x01ea409f
  ;; restore_live_registers
  0x01f1375d: movsd  (%esp),%xmm0
  0x01f13762: movsd  0x8(%esp),%xmm1
  0x01f13768: movsd  0x10(%esp),%xmm2
  0x01f1376e: movsd  0x18(%esp),%xmm3
  0x01f13774: movsd  0x20(%esp),%xmm4
  0x01f1377a: movsd  0x28(%esp),%xmm5
  0x01f13780: movsd  0x30(%esp),%xmm6
  0x01f13786: movsd  0x38(%esp),%xmm7
  0x01f1378c: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f13797: je     0x01f137ae
  0x01f1379d: push   $0x55cdce30
  0x01f137a2: call   0x01f137a7
  0x01f137a7: pusha  
  0x01f137a8: call   0x557bdbf0
  0x01f137ad: hlt    
  0x01f137ae: add    $0xf0,%esp
  0x01f137b4: popa   
  0x01f137b5: mov    %ebp,%esp
  0x01f137b7: pop    %ebp
  0x01f137b8: ret    
  0x01f137b9: mov    %ebp,%esp
  0x01f137bb: pop    %ebp
  0x01f137bc: ret    
  0x01f137bd: nop    
  0x01f137be: nop    
  0x01f137bf: nop    

Decoding RuntimeStub - g1_pre_barrier_slow Runtime1 stub 0x01f137c8
  0x01f13820: push   %ebp
  0x01f13821: mov    %esp,%ebp
  0x01f13823: mov    $0x1e,%eax
  0x01f13828: push   %eax
  0x01f13829: mov    %fs:0x0(,%eiz,1),%edi
  0x01f13831: mov    -0xc(%edi),%edi
  0x01f13834: push   %edi
  0x01f13835: mov    %ebp,0x144(%edi)
  0x01f1383b: mov    %esp,0x13c(%edi)
  0x01f13841: call   0x55879b40
  0x01f13846: push   %eax
  0x01f13847: mov    %fs:0x0(,%eiz,1),%eax
  0x01f1384f: mov    -0xc(%eax),%eax
  0x01f13852: cmp    %eax,%edi
  0x01f13854: je     0x01f1386c
  0x01f1385a: int3   
  0x01f1385b: push   $0x55cdcc08
  0x01f13860: call   0x01f13865
  0x01f13865: pusha  
  0x01f13866: call   0x557bdbf0
  0x01f1386b: hlt    
  0x01f1386c: pop    %eax
  0x01f1386d: movl   $0x0,0x13c(%edi)
  0x01f13877: movl   $0x0,0x144(%edi)
  0x01f13881: add    $0x8,%esp
  0x01f13884: cmpl   $0x0,0x4(%edi)
  0x01f1388b: je     0x01f1389c
  0x01f13891: mov    0x4(%edi),%eax
  0x01f13894: mov    %ebp,%esp
  0x01f13896: pop    %ebp
  0x01f13897: jmp    Stub::forward exception
  0x01f1389c: push   $0x55ccd97c
  0x01f138a1: call   0x01f138a6
  0x01f138a6: pusha  
  0x01f138a7: call   0x557bdbf0
  0x01f138ac: hlt    
  0x01f138ad: mov    %ebp,%esp
  0x01f138af: pop    %ebp
  0x01f138b0: ret    
  0x01f138b1: nop    
  0x01f138b2: nop    
  0x01f138b3: nop    

Decoding RuntimeStub - g1_post_barrier_slow Runtime1 stub 0x01f138c8
  0x01f13900: push   %ebp
  0x01f13901: mov    %esp,%ebp
  0x01f13903: push   %eax
  0x01f13904: push   %ecx
  0x01f13905: mov    0x8(%ebp),%ecx
  0x01f13908: shr    $0x9,%ecx
  0x01f1390b: mov    $0x1207000,%eax
  0x01f13910: add    %eax,%ecx
  0x01f13912: mov    %fs:0x0(,%eiz,1),%eax
  0x01f1391a: mov    -0xc(%eax),%eax
  0x01f1391d: cmpb   $0x20,(%ecx)
  0x01f13920: je     0x01f1396f
  0x01f13926: lock addl $0x0,(%esp)
  0x01f1392b: cmpb   $0x0,(%ecx)
  0x01f1392e: je     0x01f1396f
  0x01f13934: movb   $0x0,(%ecx)
  0x01f13937: cmpl   $0x0,0x2fc(%eax)
  0x01f13941: je     0x01f13963
  0x01f13947: subl   $0x4,0x2fc(%eax)
  0x01f1394e: push   %ebx
  0x01f1394f: mov    0x2f8(%eax),%ebx
  0x01f13955: add    0x2fc(%eax),%ebx
  0x01f1395b: mov    %ecx,(%ebx)
  0x01f1395d: pop    %ebx
  0x01f1395e: jmp    0x01f1396f
  0x01f13963: push   %edx
  0x01f13964: push   %eax
  0x01f13965: push   %ecx
  0x01f13966: call   0x55be3c60
  0x01f1396b: add    $0x8,%esp
  0x01f1396e: pop    %edx
  0x01f1396f: pop    %ecx
  0x01f13970: pop    %eax
  0x01f13971: mov    %ebp,%esp
  0x01f13973: pop    %ebp
  0x01f13974: ret    
  0x01f13975: nop    
  0x01f13976: nop    
  0x01f13977: nop    

Decoding RuntimeStub - fpu2long_stub Runtime1 stub 0x01f13988
  0x01f139c0: push   %esi
  0x01f139c1: push   %ecx
  0x01f139c2: sub    $0x20,%esp
  0x01f139c5: fstl   0x4(%esp)
  0x01f139c9: mov    0x8(%esp),%eax
  0x01f139cd: and    $0x7ff00000,%eax
  0x01f139d3: cmp    $0x7ff00000,%eax
  0x01f139d9: jne    0x01f139f3
  0x01f139df: mov    0x8(%esp),%eax
  0x01f139e3: and    $0xfffff,%eax
  0x01f139e9: or     0x4(%esp),%eax
  0x01f139ed: jne    0x01f13a59
  0x01f139f3: fstcw  (%esp)
  0x01f139f7: movzwl (%esp),%eax
  0x01f139fb: or     $0xc00,%eax
  0x01f13a01: mov    %ax,0x2(%esp)
  0x01f13a06: fldcw  0x2(%esp)
  0x01f13a0a: fwait
  0x01f13a0b: fistpll 0xc(%esp)
  0x01f13a0f: fldcw  (%esp)
  0x01f13a12: fwait
  0x01f13a13: mov    0xc(%esp),%eax
  0x01f13a17: mov    0x10(%esp),%edx
  0x01f13a1b: mov    %eax,%ecx
  0x01f13a1d: xor    $0x0,%ecx
  0x01f13a20: mov    $0x80000000,%esi
  0x01f13a25: xor    %edx,%esi
  0x01f13a27: or     %esi,%ecx
  0x01f13a29: jne    0x01f13a61
  0x01f13a2f: fldz   
  0x01f13a31: fcompl 0x4(%esp)
  0x01f13a35: fnstsw %ax
  0x01f13a37: sahf   
  0x01f13a38: ja     0x01f13a4d
  0x01f13a3e: mov    $0x7fffffff,%edx
  0x01f13a43: mov    $0xffffffff,%eax
  0x01f13a48: jmp    0x01f13a61
  0x01f13a4d: mov    $0x80000000,%edx
  0x01f13a52: xor    %eax,%eax
  0x01f13a54: jmp    0x01f13a61
  0x01f13a59: ffree  %st(0)
  0x01f13a5b: fincstp 
  0x01f13a5d: xor    %edx,%edx
  0x01f13a5f: xor    %eax,%eax
  0x01f13a61: add    $0x20,%esp
  0x01f13a64: pop    %ecx
  0x01f13a65: pop    %esi
  0x01f13a66: ret    
  0x01f13a67: nop    

Decoding RuntimeStub - counter_overflow Runtime1 stub 0x01f13a88
  0x01f13ae0: push   %ebp
  0x01f13ae1: mov    %esp,%ebp
  ;; save_live_registers
  0x01f13ae3: pusha  
  0x01f13ae4: sub    $0xf0,%esp
  0x01f13aea: movl   $0xfeedbeef,0xec(%esp)
  0x01f13af5: movsd  %xmm0,(%esp)
  0x01f13afa: movsd  %xmm1,0x8(%esp)
  0x01f13b00: movsd  %xmm2,0x10(%esp)
  0x01f13b06: movsd  %xmm3,0x18(%esp)
  0x01f13b0c: movsd  %xmm4,0x20(%esp)
  0x01f13b12: movsd  %xmm5,0x28(%esp)
  0x01f13b18: movsd  %xmm6,0x30(%esp)
  0x01f13b1e: movsd  %xmm7,0x38(%esp)
  0x01f13b24: mov    0x8(%ebp),%eax
  0x01f13b27: mov    0xc(%ebp),%ebx
  0x01f13b2a: push   %ebx
  0x01f13b2b: push   %eax
  0x01f13b2c: mov    %fs:0x0(,%eiz,1),%edi
  0x01f13b34: mov    -0xc(%edi),%edi
  0x01f13b37: push   %edi
  0x01f13b38: mov    %ebp,0x144(%edi)
  0x01f13b3e: mov    %esp,0x13c(%edi)
  0x01f13b44: call   0x558799e0
  0x01f13b49: push   %eax
  0x01f13b4a: mov    %fs:0x0(,%eiz,1),%eax
  0x01f13b52: mov    -0xc(%eax),%eax
  0x01f13b55: cmp    %eax,%edi
  0x01f13b57: je     0x01f13b6f
  0x01f13b5d: int3   
  0x01f13b5e: push   $0x55cdcc08
  0x01f13b63: call   0x01f13b68
  0x01f13b68: pusha  
  0x01f13b69: call   0x557bdbf0
  0x01f13b6e: hlt    
  0x01f13b6f: pop    %eax
  0x01f13b70: movl   $0x0,0x13c(%edi)
  0x01f13b7a: movl   $0x0,0x144(%edi)
  0x01f13b84: add    $0xc,%esp
  0x01f13b87: cmpl   $0x0,0x4(%edi)
  0x01f13b8e: je     0x01f13b9c
  0x01f13b94: mov    0x4(%edi),%eax
  0x01f13b97: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f13b9c: movsd  (%esp),%xmm0
  0x01f13ba1: movsd  0x8(%esp),%xmm1
  0x01f13ba7: movsd  0x10(%esp),%xmm2
  0x01f13bad: movsd  0x18(%esp),%xmm3
  0x01f13bb3: movsd  0x20(%esp),%xmm4
  0x01f13bb9: movsd  0x28(%esp),%xmm5
  0x01f13bbf: movsd  0x30(%esp),%xmm6
  0x01f13bc5: movsd  0x38(%esp),%xmm7
  0x01f13bcb: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f13bd6: je     0x01f13bed
  0x01f13bdc: push   $0x55cdce30
  0x01f13be1: call   0x01f13be6
  0x01f13be6: pusha  
  0x01f13be7: call   0x557bdbf0
  0x01f13bec: hlt    
  0x01f13bed: add    $0xf0,%esp
  0x01f13bf3: popa   
  0x01f13bf4: mov    %ebp,%esp
  0x01f13bf6: pop    %ebp
  0x01f13bf7: ret    

Decoding RuntimeStub - predicate_failed_trap Runtime1 stub 0x01f13c08
  0x01f13c60: push   %ebp
  0x01f13c61: mov    %esp,%ebp
  ;; save_live_registers
  0x01f13c63: pusha  
  0x01f13c64: sub    $0xf0,%esp
  0x01f13c6a: movl   $0xfeedbeef,0xec(%esp)
  0x01f13c75: movsd  %xmm0,(%esp)
  0x01f13c7a: movsd  %xmm1,0x8(%esp)
  0x01f13c80: movsd  %xmm2,0x10(%esp)
  0x01f13c86: movsd  %xmm3,0x18(%esp)
  0x01f13c8c: movsd  %xmm4,0x20(%esp)
  0x01f13c92: movsd  %xmm5,0x28(%esp)
  0x01f13c98: movsd  %xmm6,0x30(%esp)
  0x01f13c9e: movsd  %xmm7,0x38(%esp)
  0x01f13ca4: mov    %fs:0x0(,%eiz,1),%edi
  0x01f13cac: mov    -0xc(%edi),%edi
  0x01f13caf: push   %edi
  0x01f13cb0: mov    %ebp,0x144(%edi)
  0x01f13cb6: mov    %esp,0x13c(%edi)
  0x01f13cbc: call   0x5587cd20
  0x01f13cc1: push   %eax
  0x01f13cc2: mov    %fs:0x0(,%eiz,1),%eax
  0x01f13cca: mov    -0xc(%eax),%eax
  0x01f13ccd: cmp    %eax,%edi
  0x01f13ccf: je     0x01f13ce7
  0x01f13cd5: int3   
  0x01f13cd6: push   $0x55cdcc08
  0x01f13cdb: call   0x01f13ce0
  0x01f13ce0: pusha  
  0x01f13ce1: call   0x557bdbf0
  0x01f13ce6: hlt    
  0x01f13ce7: pop    %eax
  0x01f13ce8: movl   $0x0,0x13c(%edi)
  0x01f13cf2: movl   $0x0,0x144(%edi)
  0x01f13cfc: add    $0x4,%esp
  0x01f13cff: cmpl   $0x0,0x4(%edi)
  0x01f13d06: je     0x01f13d14
  0x01f13d0c: mov    0x4(%edi),%eax
  0x01f13d0f: jmp    0x01f05bf0
  ;; restore_live_registers
  0x01f13d14: movsd  (%esp),%xmm0
  0x01f13d19: movsd  0x8(%esp),%xmm1
  0x01f13d1f: movsd  0x10(%esp),%xmm2
  0x01f13d25: movsd  0x18(%esp),%xmm3
  0x01f13d2b: movsd  0x20(%esp),%xmm4
  0x01f13d31: movsd  0x28(%esp),%xmm5
  0x01f13d37: movsd  0x30(%esp),%xmm6
  0x01f13d3d: movsd  0x38(%esp),%xmm7
  0x01f13d43: cmpl   $0xfeedbeef,0xec(%esp)
  0x01f13d4e: je     0x01f13d65
  0x01f13d54: push   $0x55cdce30
  0x01f13d59: call   0x01f13d5e
  0x01f13d5e: pusha  
  0x01f13d5f: call   0x557bdbf0
  0x01f13d64: hlt    
  0x01f13d65: add    $0xf0,%esp
  0x01f13d6b: popa   
  0x01f13d6c: mov    %ebp,%esp
  0x01f13d6e: pop    %ebp
  0x01f13d6f: jmp    0x01ea409f
  0x01f13d74: mov    %ebp,%esp
  0x01f13d76: pop    %ebp
  0x01f13d77: ret    

AHE@0x018fa0e8: 0xbebebeaaa0000000 i2c: 0x01f14170 c2i: 0x01f1424d c2iUV: 0x01f1422c
i2c argument handler #67 for: static (JJJ[BII)I (354 bytes generated)
c2i argument handler starts at 01F1424D
  0x01f14170: mov    (%esp),%eax
  ;; verify_i2c { 
  0x01f14173: mov    $0x1dc2940,%edi
  0x01f14178: cmp    %edi,%eax
  0x01f1417a: jbe    0x01f1418d
  0x01f14180: mov    $0x1ea2940,%edi
  0x01f14185: cmp    %edi,%eax
  0x01f14187: jb     0x01f141d2
  0x01f1418d: mov    $0x1dc0340,%edi
  0x01f14192: cmp    %edi,%eax
  0x01f14194: jbe    0x01f141a7
  0x01f1419a: mov    $0x1dc2668,%edi
  0x01f1419f: cmp    %edi,%eax
  0x01f141a1: jb     0x01f141d2
  0x01f141a7: mov    $0x1ead380,%edi
  0x01f141ac: cmp    %edi,%eax
  0x01f141ae: jbe    0x01f141c1
  0x01f141b4: mov    $0x1eb2970,%edi
  0x01f141b9: cmp    %edi,%eax
  0x01f141bb: jb     0x01f141d2
  ;; i2c adapter must return to an interpreter frame
  0x01f141c1: push   $0x55ce723c
  0x01f141c6: call   0x01f141cb
  0x01f141cb: pusha  
  0x01f141cc: call   0x557bdbf0
  0x01f141d1: hlt    
  ;; } verify_i2ce 
  0x01f141d2: mov    %esp,%edi
  0x01f141d4: sub    $0x20,%esp
  0x01f141d7: and    $0xfffffff0,%esp
  0x01f141da: push   %eax
  0x01f141db: mov    %edi,%eax
  0x01f141dd: mov    0x2c(%ebx),%edi
  0x01f141e0: mov    0x20(%eax),%esi
  0x01f141e3: mov    %esi,0x4(%esp)
  0x01f141e7: mov    0x24(%eax),%esi
  0x01f141ea: mov    %esi,0x8(%esp)
  0x01f141ee: mov    0x18(%eax),%esi
  0x01f141f1: mov    %esi,0xc(%esp)
  0x01f141f5: mov    0x1c(%eax),%esi
  0x01f141f8: mov    %esi,0x10(%esp)
  0x01f141fc: mov    0x10(%eax),%esi
  0x01f141ff: mov    %esi,0x14(%esp)
  0x01f14203: mov    0x14(%eax),%esi
  0x01f14206: mov    %esi,0x18(%esp)
  0x01f1420a: mov    0xc(%eax),%ecx
  0x01f1420d: mov    0x8(%eax),%edx
  0x01f14210: mov    0x4(%eax),%esi
  0x01f14213: mov    %esi,0x1c(%esp)
  0x01f14217: mov    %fs:0x0(,%eiz,1),%eax
  0x01f1421f: mov    -0xc(%eax),%eax
  0x01f14222: mov    %ebx,0x168(%eax)
  0x01f14228: mov    %ebx,%eax
  0x01f1422a: jmp    *%edi
  0x01f1422c: mov    0x4(%ecx),%ebx
  0x01f1422f: cmp    0x8(%eax),%ebx
  0x01f14232: mov    0x4(%eax),%ebx
  0x01f14235: jne    0x01f14248
  0x01f1423b: cmpl   $0x0,0x30(%ebx)
  0x01f14242: je     0x01f14287
  0x01f14248: jmp    0x01ea32d0
  0x01f1424d: cmpl   $0x0,0x30(%ebx)
  0x01f14254: je     0x01f14287
  0x01f1425a: mov    (%esp),%eax
  0x01f1425d: pusha  
  0x01f1425e: pushf  
  0x01f1425f: sub    $0x10,%esp
  0x01f14262: movsd  %xmm0,(%esp)
  0x01f14267: movsd  %xmm1,0x8(%esp)
  0x01f1426d: push   %eax
  0x01f1426e: push   %ebx
  0x01f1426f: call   0x55be79d0
  0x01f14274: add    $0x8,%esp
  0x01f14277: movsd  (%esp),%xmm0
  0x01f1427c: movsd  0x8(%esp),%xmm1
  0x01f14282: add    $0x10,%esp
  0x01f14285: popf   
  0x01f14286: popa   
  0x01f14287: pop    %eax
  0x01f14288: mov    %esp,%esi
  0x01f1428a: sub    $0x24,%esp
  0x01f1428d: mov    0x24(%esp),%edi
  0x01f14291: mov    %edi,0x1c(%esp)
  0x01f14295: mov    0x28(%esp),%edi
  0x01f14299: mov    %edi,0x20(%esp)
  0x01f1429d: mov    0x2c(%esp),%edi
  0x01f142a1: mov    %edi,0x14(%esp)
  0x01f142a5: mov    0x30(%esp),%edi
  0x01f142a9: mov    %edi,0x18(%esp)
  0x01f142ad: mov    0x34(%esp),%edi
  0x01f142b1: mov    %edi,0xc(%esp)
  0x01f142b5: mov    0x38(%esp),%edi
  0x01f142b9: mov    %edi,0x10(%esp)
  0x01f142bd: mov    %ecx,0x8(%esp)
  0x01f142c1: mov    %edx,0x4(%esp)
  0x01f142c5: mov    0x3c(%esp),%edi
  0x01f142c9: mov    %edi,(%esp)
  0x01f142cc: mov    0x24(%ebx),%ecx
  0x01f142cf: push   %eax
  0x01f142d0: jmp    *%ecx
