----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01/13/2024 01:23:57 PM
-- Design Name: 
-- Module Name: mux2X1 - Behavioral
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;
-- E. Jagadeeswar Patro -2241016309
entity mux2X1 is
    Port ( A, B, S : in STD_LOGIC;
           Y : out STD_LOGIC);
end mux2X1;

architecture Behavioral of mux2X1 is
begin
process(A, B, S)
begin
if S = '0' then
    Y <= A;
else
    Y <= B;
end if;
end process;
end Behavioral;
